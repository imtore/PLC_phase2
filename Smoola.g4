grammar Smoola;

    @members{
        void print(Object obj){
                System.out.println(obj);
         }
    }

    program:
        {
            Program prog = new Program();
        }
        mc = mainClass (cd = classDeclaration{prog.addClass($cd.classdecobj);})* EOF
        {
            prog.setMainClass($mc.mainclassobj);
        }
    ;
    mainClass returns [ClassDeclaration mainclassobj]:
        // name should be checked later
        'class' class_name = ID '{' 'def' method_name = ID '(' ')' ':' 'int'
        {
            MethodDeclaration main_method = new MethodDeclaration(new Identifier($method_name.getText()));
            main_method.setReturnType(new IntType());
        }
        '{'  body = statements 'return' return_value = expression ';' '}' '}'
        {
            for (int counter = 0; counter < $body.stmtlist.size(); counter++) {
                mainmethod.addStatement($body.stmtlist.get(counter));
            }
            main_method.setReturnValue($return_value.expobj);
            $mainclassobj = new ClassDeclaration(new Identifier($class_name.getText()),null);
            $mainclassobj.addMethodDeclaration(main_method);
        }
    ;
    classDeclaration returns [ClassDeclaration classdecobj]:
        'class' class_name = ID ('extends' parent_name = ID)? '{'
        {
            $classdecobj = new ClassDeclaration(new Identifier($class_name.getText()), new Identifier($parent_name.getText()));
        }
        (var = varDeclaration {$classdecobj.addVarDeclaration($var.vardecobj);})*
        (method = methodDeclaration{$classdecobj.addMethodDeclaration($method.methoddecobj);})* '}'
    ;
    varDeclaration returns [VarDeclaration vardecobj]:
        'var' id = ID ':' vartype = type ';'
        {
            $vardecobj = new VarDeclaration(Identifier(id.getText()), $vartype.typeobj);
        }
    ;
    methodDeclaration returns [MethodDecalaration methoddecobj]:
        'def' method_name = ID {$methoddecobj = new methodDeclaration(new Identifier($method_name.getText()));}
        ('(' ')'
        |
        (
        '(' arg_name = ID ':' arg_type = type
        {
            $methoddecobj.addArg(new VarDeclaration(new Identifier($arg_name.getText()), $argtype.typeobj));
        }
        (',' arg_name = ID ':' argtype = type
        {
            $methoddecobj.addArg(new VarDeclaration(new Identifier($arg_name.getText()), $argtype.typeobj));
        })*
        ')')) ':' return_type = type
        {
            $methoddecobj.setReturnType($return_type.typeobj)
        }
        '{' (localvar = varDeclaration
        {
            $methoddecobj.addLocalVar(new VarDeclaration(new Identifier($arg_name.getText()), $argtype.typeobj));
        })*
        body = statements 'return' return_value = expression ';' '}'
        {
            for (int counter = 0; counter < $body.stmtlist.size(); counter++) {
                $methoddecobj.addStatement($body.stmtlist.get(counter));
            }
            $methoddecobj.setReturnValue($return_value.expobj);
        }
    ;
    statements returns[ArrayList<Statement> stmtlist]:
        { $stmtlist = new ArrayList<Statement>(); } (stmt = statement {$stmtlist.add($stmt.stmtobj);} )*
    ;
    statement returns [Statement stmtobj]:
        stmtb = statementBlock { $stmtobj = $stmtb.blockobj; }
        |   stmtc = statementCondition { $stmtobj = $stmtc.conditionalobj; }
        |   stmtl = statementLoop { $stmtobj = $stmtl.whileobj; }
        |   stmtw = statementWrite { $stmtobj = $stmtw.writelnobj; }
        |   stmta = statementAssignment { $stmtobj = $stmta.asgnobj; }
    ;
    statementBlock returns [Block blockobj]:
        '{'  body = statements '}'
         {
            $blockobj = new Block();
            for (int counter = 0; counter < $body.stmtlist.size(); counter++) {
                $blockobj.addStatement($body.stmtlist.get(counter));
            }
         }
    ;
    statementCondition returns [Conditional conditionalobj]:
        'if' '('condition = expression')' 'then' consequencebody = statement
        {
            $conditionalobj = new Conditional($condition.expobj, $consequencebody.stmtobj);
        }
         ('else' alternativebody = statement {$conditionalobj.setAlternativeBody($alternativebody.stmtobj);})?
    ;
    statementLoop returns [While whileobj]:
        'while' '(' condition = expression ')' body = statement
        {
            $whileobj = new While($condition.expobj, $body.stmtobj);
        }
    ;
    statementWrite returns [Write writelnobj]:
        'writeln(' arg = expression ')' ';'
        {
            $writelnobj = new Write($arg.expobj);
        }
    ;
    statementAssignment returns [Assign asgnobj]:
        exp = expression ';'
        {
            if($exp.isAssignStatement){
                $asgnobj = new Assign($exp.expobj.getLeft(), $exp.expobj.getRight());
            }
            else
            {
                $asgnobj = new Assign(null, $exp.expobj.getRight());
            }
        }
    ;

    expression returns [Expression expobj,Boolean isAssignStatement]:
		exp = expressionAssignment
		{
		    $expobj = $exp.expasgn;
		    $isAssignStatement = !$exp.isAssignExp
		}
	;

    expressionAssignment returns [Expression expasgn, Boolean isAssignExp]://binary operation still needs to be handled
		expleft = expressionOr '=' expright = expressionAssignment
		{
		    $expasgn = new BinaryExpression($expleft.expor, $expright.expasgn, BinaryOperator.assign);
		    $isAssignExp = True;
		}
	    |	exp = expressionOr
	    {
	        $expasgn = $exp.expor;
	        $isAssignExp = False;
	    }
	;

    expressionOr returns [Expression expor]:
		expleft = expressionAnd rest = expressionOrTemp[$expleft.expand]{$expor = $rest.fullexp;}
	;

    expressionOrTemp[Expression leftside] returns [Expression fullexp]:
		'||' expright = expressionAnd
		{
		    Expression leftmostexp = new BinaryExpression($leftside, $expright.expand, BinaryOperator.or);
		}
		exp = expressionOrTemp[leftmostexp]
		{
		    $fullexp = $exp.fullexp;
		}
	    |   {$fullexp = $leftside;}
	;

    expressionAnd returns[Expression expand]:
		expleft = expressionEq rest = expressionAndTemp[$expleft.expeq]{$expand = $rest.fullexp;}
	;

    expressionAndTemp [Expression leftside] returns [Expression fullexp]:
		'&&' expright = expressionEq
		 {
            Expression leftmostexp = new BinaryExpression($leftside, $expright.expeq, BinaryOperator.and);
         }
		 exp = expressionAndTemp[leftmostexp]
		 {
            $fullexp = $exp.fullexp;
         }
	     |   {$fullexp = $leftside;}
	;

    expressionEq returns [Expression expeq]:
		expleft = expressionCmp rest = expressionEqTemp[$expleft.expcmp]{$expeq = $rest.fullexp;}
	;

    expressionEqTemp [Expression leftside] returns [Expression fullexp]:
		(op = '==' | op = '<>') expright = expressionCmp
		{
		    if($op == '==')
		    {
		        Expression leftmostexp = new BinaryExpression($leftside, $expright.expcmp, BinaryOperator.eq);
		    }
		    else
		    {
		        Expression leftmostexp = new BinaryExpression($leftside, $expright.expcmp, BinaryOperator.neq);
		    }

		}
		exp = expressionEqTemp[leftmostexp]
		{
		    $fullexp = $exp.fullexp;
		}
	    |   {$fullexp = $leftside;}
	;

    expressionCmp returns [Expression expcmp]:
		expleft = expressionAdd rest = expressionCmpTemp[$expleft.expadd]{$expcmp = $rest.fullexp;}
	;

    expressionCmpTemp [Expression leftside] returns [Expression fullexp]:
		(op = '<' | op = '>') expright = expressionAdd
		{
		    if($op == '<')
            {
                Expression leftmostexp = new BinaryExpression($leftside, $expright.expadd, BinaryOperator.lt);
            }
            else
            {
                Expression leftmostexp = new BinaryExpression($leftside, $expright.expadd, BinaryOperator.gt);
            }
		}
		exp = expressionCmpTemp[leftmostexp]
		{
            $fullexp = $exp.fullexp;
        }
	    |   {$fullexp = $leftside;}
	;

    expressionAdd returns [Expression expadd]:
		expleft = expressionMult rest = expressionAddTemp[$expleft.expmult]{$expadd = $rest.fullexp;}
	;

    expressionAddTemp [Expression leftside] returns [Expression fullexp]:
		(op = '+' | op = '-') expright = expressionMult
		{
		    if($op == '+')
            {
                Expression leftmostexp = new BinaryExpression($leftside, $expright.expmult, BinaryOperator.add);
            }
            else
            {
                Expression leftmostexp = new BinaryExpression($leftside, $expright.expmult, BinaryOperator.sub);
            }
		}
		exp = expressionAddTemp[leftmostexp]
		{
		    $fullexp = $exp.fullexp;
		}
	    |   {$fullexp = $leftside;}
	;

    expressionMult returns [Expression expmult]:
        expleft = expressionUnary rest = expressionMultTemp[$expleft.expun]{$expmult = $rest.fullexp;}
	;

    expressionMultTemp[Expression leftside] returns [Expression fullexp]:
		(op = '*' | op = '/') expright = expressionUnary
		{
		    if($op == '*')
                {
                    Expression leftmostexp = new BinaryExpression($leftside, $expright.expun, BinaryOperator.mult);
                }
                else
                {
                    Expression leftmostexp = new BinaryExpression($leftside, $expright.expun, BinaryOperator.div);
                }
		}
		exp = expressionMultTemp[leftmostexp]
		{
		    $fullexp = $exp.fullexp;
        }
	    |   {$fullexp = $leftside;}
	;

    expressionUnary returns [Expression expun]:
		(op = '!' | op = '-') exp1 = expressionUnary
		{
		    if(op == '!'){
		        $expun = new UnaryExpression(UnaryOperator.not, $exp1.expun);
		    }
		    else
		    {
		        $expun = new UnaryExpression(UnaryOperator.minus, $exp1.expun);
		    }
		}
	    |	exp2 = expressionMem {$expun = $exp2.expmem;}
	;

    expressionMem returns[Expression expmem]:
		instance = expressionMethods access = expressionMemTemp [$instance.expmeth] {$expmem = $access.fullexp;}
	;

    expressionMemTemp [Expression instance] returns[Expression fullexp]:
		'[' index = expression ']' {$fullexp = new ArrayCall($instance, $index.expobj);}
	    |{$fullexp = $instance;}
	;
	expressionMethods returns[Expression expmeth]:
	    instance = expressionOther call = expressionMethodsTemp[$instance.expotherobj]{$expmeth = $call.fullexp;}
	;
	expressionMethodsTemp [Expression instance] returns [Expression fullexp]:
	    {ArrayList args = new ArrayList<Expression>;}
	    '.'
	    (
	    method_name = ID '(' ')'
	    {
	        Expression next_instance = new MethodCall($instance, new Identifier(method_name.getText()));
	    }
	    |
	    method_name = ID
	    {
	        Expression next_instance = new MethodCall($instance, new Identifier(method_name.getText()));
	    }
	    '(' (arg = expression{next_instance.addArg($arg.expobj);} (',' arg = expression {next_instance.addArg($arg.expobj);})*) ')'
	    |
	    'length'
	    {
	        Expression next_instance = new Length($instance);
	    }
	    )
	    call = expressionMethodsTemp[next_instance]{$fullexp = $call.fullexp; }
	    |{$fullexp = $instance;}
	;
    expressionOther returns [Expression expotherobj]:
		const_int = CONST_NUM { $expotherobj = new IntValue($const_int, IntType());}
        |	const_string = CONST_STR { $expotherobj = new StingValue($const_string.getText(), StringType());}
        |   'new ' 'int' '[' size = CONST_NUM ']' { $expotherobj = new NewArray(); $expotherobj.setExpression(new IntValue($size, IntType()));}
        |   'new ' instance_name = ID '(' ')' { $expotherobj = new NewClass(new Identifier($instance_name.getText()));}
        |   'this' { $expotherobj = new This();}
        |   'true' { $expotherobj = new BooleanValue(True, BooleanType());}
        |   'false' { $expotherobj = new BooleanValue(False, BooleanType());}
        |	identifier = ID { $expotherobj = new Identifier($identifier.getText());}
        |   array_instance_name = ID '[' array_index = expression ']'
        { $expotherobj = new ArrayCall(new Identifier($array_instance_name.getText()), $array_index.expobj);}
        |	'(' exp = expression ')' {$expotherobj = $exp.expobj;}
	;
	type returns [Type typeobj]:
	    'int' {$typeobj = new IntType();}
	    |   'boolean'  {$typeobj = new BooleanType();}
	    |   'string'  {$typeobj = new StringType();}
	    |   'int' '[' ']'  {$typeobj = new ArrayType();}
	    |   id = ID
	    {
	        $typeobj = new UserdefinedType();
	        $typeobj.setName(Identifier(id.getText()));
	    }
	;
    CONST_NUM:
		[0-9]+
	;

    CONST_STR:
		'"' ~('\r' | '\n' | '"')* '"'
	;
    NL:
		'\r'? '\n' -> skip
	;

    ID:
		[a-zA-Z_][a-zA-Z0-9_]*
	;

    COMMENT:
		'#'(~[\r\n])* -> skip
	;

    WS:
    	[ \t] -> skip
    ;