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
            main_method.setReturnValue($return_value.ex);//change
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
            $methoddecobj.setReturnValue($return_value.ex);
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
            $conditionalobj = new Conditional($condition.ex, $consequencebody.stmtobj);
        }
         ('else' alternativebody = statement {$conditional.setAlternativeBody($alternativebody.stmtobj);})?
    ;
    statementLoop returns [While whileobj]:
        'while' '(' condition = expression ')' body = statement
        {
            $whileobj = new While($condition.ex, $body.stmtobj);
        }
    ;
    statementWrite returns [Write writelnobj]:
        'writeln(' arg = expression ')' ';'
        {
            $writelnobj = new Write($arg.ex);
        }
    ;
    statementAssignment returns [Assign asgnobj]:
        exp = expression ';'
        {
            if($exp.leftsidenull){
                $asgn = new Assign($exp.ex.getLeft(), $exp.ex.getRight());
            }
            else
            {
                $asgn = new Assign(null, $exp.ex.getRight());
            }
        }
    ;

    expression returns [Expression ex,Boolean leftsidenull]:
		expasgn = expressionAssignment
		{
		    $ex = $expasgn.ex;
		    $leftsidenull=!$expasgn.twosided
		}
	;

    expressionAssignment returns [Expression ex, Boolean twosided]://binary operation still needs to be handled
		expleft = expressionOr '=' expright = expressionAssignment
		{
		    $ex = new BinaryExpression($expleft.expor, $expright.ex, BinaryOperator.assign);
		    $twosided=True;
		}
	    |	exp = expressionOr
	    {
	        $ex = $exp.expor;
	        $twosided=False;
	    }
	;

    expressionOr returns [Expression expor]:
		expleft = expressionAnd ex = expressionOrTemp[$expleft.expand]{$expor = $ex.ex;}
	;

    expressionOrTemp[Expression leftside] returns [Expression ex]:
		'||' expright = expressionAnd//binary operation still needs to be handled
		{
		    Expression expleft = new BinaryExpression($leftside,$expright.expand,BinaryOperator.or;)
		}
		exp = expressionOrTemp[expleft]
		{
		    $ex=$exp.ex;
		}
	    |   {$ex = $leftside;}
	;

    expressionAnd returns[Expression expand]:
		expleft = expressionEq ex = expressionAndTemp[$expleft.expeq]{$expand = $ex.ex;}
	;

    expressionAndTemp [Expression leftside] returns [Expression ex]:
		'&&' expright = expressionEq//binary operation still needs to be handled
		 {
            Expression expleft = new BinaryExpression($leftside,$expright.expeq,BinaryOperator.and;)
         }
		 exp = expressionAndTemp[expleft]
		 {
            $ex=$exp.ex;
         }
	     |   {$ex = $leftside;}
	;

    expressionEq returns [Expression expeq]:
		expleft = expressionCmp ex = expressionEqTemp[$expleft.expcmp]{$expeq = $ex.ex;}
	;

    expressionEqTemp [Expression leftside] returns [Expression ex]:
		(op = '==' | op = '<>') expright = expressionCmp//binary operation still needs to be handled
		{
		    if($op=='==')
		    {
		        Expression expleft = new BinaryExpression($leftside,$expright.expcmp,BinaryOperator.eq);
		    }
		    else
		    {
		        Expression expleft = new BinaryExpression($leftside,$expright.expcmp,BinaryOperator.neq);
		    }

		}
		exp = expressionEqTemp[expleft]
		{
		    $ex=$exp.ex;
		}
	    |   {$ex = $leftside;}
	;

    expressionCmp returns [Expression expcmp]:
		expleft = expressionAdd ex = expressionCmpTemp[$expleft.expadd]{$expcmp = $ex.ex;}
	;

    expressionCmpTemp [Expression leftside] returns [Expression ex]:
		(op = '<' | op = '>') expright = expressionAdd//binary operation still needs to be handled
		{
		    if($op=='<')
                {
                    Expression expleft = new BinaryExpression($leftside,$expright.expadd,BinaryOperator.lt);
                }
                else
                {
                    Expression expleft = new BinaryExpression($leftside,$expright.expadd,BinaryOperator.gt);
                }
		}
		exp = expressionCmpTemp[expleft]
		{
            $ex=$exp.ex;
        }
	    |   {$ex = $leftside;}
	;

    expressionAdd returns [Expression expadd]:
		expleft = expressionMult ex = expressionAddTemp[$expleft.expmult]{$expadd = $ex.ex;}
	;

    expressionAddTemp [Expression leftside] returns [Expression ex]:
		(op = '+' | op = '-') expright = expressionMult//binary operation still needs to be handled
		{
		    if($op=='+')
                {
                    Expression expleft = new BinaryExpression($leftside,$expright.expmult,BinaryOperator.add);
                }
                else
                {
                    Expression expleft = new BinaryExpression($leftside,$expright.expmult,BinaryOperator.sub);
                }
		}
		exp = expressionAddTemp[expleft]
		{
		    $ex=$exp.ex;
		}
	    |   {$ex = $leftside;}
	;

    expressionMult returns [Expression expmult]:
        expleft = expressionUnary ex = expressionMultTemp[$expleft.expun]{$expmult = $ex.ex;}
	;

    expressionMultTemp[Expression leftside] returns [Expression ex]:
		(op = '*' | op = '/') expright = expressionUnary
		{
		    if($op=='*')
                {
                    Expression expleft = new BinaryExpression($leftside,$expright.expun,BinaryOperator.mult);
                }
                else
                {
                    Expression expleft = new BinaryExpression($leftside,$expright.expun,BinaryOperator.div);
                }
		}
		exp = expressionMultTemp[expleft]
		{
		    $ex=$exp.ex;
        }
	    |   {$ex = $leftside;}
	;

    expressionUnary returns [Expression expun]:
		(op = '!' | op = '-') exp1 = expressionUnary
		{
		    if(op=='!'){
		        $expun = new UnaryExpression(UnaryOperator.not, $exp1.expun);
		    }
		    else
		    {
		        $expun = new UnaryExpression(UnaryOperator.minus, $exp1.expun);
		    }
		}
	    |	exp2 = expressionMem {$expun = $exp2.expmem ;}
	;

    expressionMem returns[Expression expmem]:
		exp1 = expressionMethods exp2 = expressionMemTemp[$exp1.expmeth]{$expmem = $exp2.ex;}
	;

    expressionMemTemp [Expression instance] returns[Expression ex]:
		'[' exp = expression ']' {$ex = new ArrayCall($instance, $exp.ex);}
	    |{$ex = $instance;}
	;
	expressionMethods returns[Expression expmeth]:
	    exp1 = expressionOther exp2 = expressionMethodsTemp[$exp1.expotherobj]{$expmeth = $exp2.ex;}
	;
	expressionMethodsTemp [Expression instance] returns [Expression ex]:
	    {ArrayList args = new ArrayList<Expression>;}
	    '.'
	    (
	    id1=ID '(' ')'
	    {
	        MethodCall nextInstance = new MethodCall($instance, new Identifier(id1.getText()));
	    }
	    |
	    id2=ID '(' (exp = expression{args.add($exp.ex);} (',' exp = expression {args.add($exp.ex);})*) ')'
	    {
	        MethodCall nextInstance = new MethodCall($instance, new Identifier(id2.getText()));
	        for (int counter = 0; counter < args.size(); counter++) {
                            nextInstance.addArg(args.get(counter));
            }
	    }
	    |
	    'length'
	    {
	        //roo chi call mikone in
	    }
	    )
	    methodcall = expressionMethodsTemp[nextInstance]{$ex = $methodcall.ex; }
	    |{$ex = $instance;}
	;
    expressionOther returns [Expression expotherobj]:
		CONST_NUM
        |	CONST_STR
        |   'new ' 'int' '[' CONST_NUM ']' {$expotherobj = new NewArray();}
        |   'new ' instance_name = ID '(' ')' {$expotherobj = new NewClass(new Identifier($instance_name.getText()));}
        |   'this' {$expotherobj = new This();}
        |   'true'
        |   'false'
        |	identifier = ID {$expotherobj = new Identifier($identifier.getText());}
        |   array_instance_name = ID '[' array_index = expression ']'
        {$expotherobj = new ArrayCall(new Identifier($array_instance_name.getText()),$array_index.ex);}
        |	'(' exp = expression ')' {$expotherobj = $exp.ex;}
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