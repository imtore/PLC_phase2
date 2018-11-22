grammar Smoola;

@members{
    Program prog = new Program();
    void print(Object obj){
            System.out.println(obj);
     }
}

    program:
        mc = mainClass (cd = classDeclaration{prog.addClass($cd.classdec);})* EOF
        {
            prog.setMainClass($mc.mainclass);
            //make symboltable
        }
    ;
    mainClass returns [ClassDeclaration mainclass]:
        // name should be checked later
        'class' name = ID '{' 'def' method_name = ID '(' ')' ':' 'int'
        {
            MethodDeclaration mainmethod = new MethodDeclaration($method_name.getText());
            mainmethod.setReturnType(new IntType());
        }
         '{'  stmts = statements 'return' returnvalue = expression ';' '}' '}'
        {
            for (int counter = 0; counter < stmts.list.size(); counter++) {
                mainmethod.addStatement($stmts.list.get(counter));
            }
            mainmethod.setReturnValue($returnvalue.ex);
            $mainclass = new ClassDeclaration($name.getText(),null);
            $mainclass.addMethodDeclaration(mainmethod);
        }
    ;
    classDeclaration returns [ClassDeclaration classdec]:
        'class' name = ID ('extends' parent_name = ID)? '{' (varDeclaration)* (methodDeclaration)* '}' {$classdec = new ClassDeclaration($name,$parent_name);}
    ;
    varDeclaration:
        'var' ID ':' type ';'
    ;
    methodDeclaration:
        'def' ID ('(' ')' | ('(' ID ':' type (',' ID ':' type)* ')')) ':' type '{'  varDeclaration* statements 'return' expression ';' '}'
    ;
    statements returns[ArrayList<Statement> list]:
        { $list = new ArrayList<Statement>(); } (stmt = statement {$list.add($stmt.stmt);} )*
    ;
    statement returns [Statement stmt]:
        stmtb = statementBlock { $stmt = $stmtb.block; }|
        stmtc = statementCondition { $stmt = $stmtc.conditional; }|
        stmtl = statementLoop { $stmt = $stmtl.while; }|
        stmtw = statementWrite { $stmt = $stmtw.writeln; }|
        stmta = statementAssignment { $stmt = $stmta; }
    ;
    statementBlock returns [Block block]:
        '{'  body = statements '}'
         {
            $block = new Block();
            for (int counter = 0; counter < body.size(); counter++) {
                $block.addStatement($body.get(counter));
            }
         }
    ;
    statementCondition returns [Conditional conditional]:
        'if' '('condition = expression')' 'then' consequencebody = statement
        {
            $conditional = new Conditional($condition.ex, $consequencebody.stmt);
        }
         ('else' alternativebody = statement {$conditional.setAlternativeBody(alternativebody);})?
    ;
    statementLoop returns [While while]:
        'while' '(' condition = expression ')' body = statement
        {
            $while = new While($condition.ex, $body.stmt);
        }
    ;
    statementWrite returns [Write writeln]:
        'writeln(' arg = expression ')' ';'
        {
            $writeln = new Write($arg.ex);
        }
    ;
    statementAssignment returns [Expression ]:
        exp = expression ';'
    ;

    expression returns[Expression ex]:
		expressionAssignment
	;

    expressionAssignment:
		expressionOr '=' expressionAssignment
	    |	expressionOr
	;

    expressionOr:
		expressionAnd expressionOrTemp
	;

    expressionOrTemp:
		'||' expressionAnd expressionOrTemp
	    |
	;

    expressionAnd:
		expressionEq expressionAndTemp
	;

    expressionAndTemp:
		'&&' expressionEq expressionAndTemp
	    |
	;

    expressionEq:
		expressionCmp expressionEqTemp
	;

    expressionEqTemp:
		('==' | '<>') expressionCmp expressionEqTemp
	    |
	;

    expressionCmp:
		expressionAdd expressionCmpTemp
	;

    expressionCmpTemp:
		('<' | '>') expressionAdd expressionCmpTemp
	    |
	;

    expressionAdd:
		expressionMult expressionAddTemp
	;

    expressionAddTemp:
		('+' | '-') expressionMult expressionAddTemp
	    |
	;

        expressionMult:
		expressionUnary expressionMultTemp
	;

    expressionMultTemp:
		('*' | '/') expressionUnary expressionMultTemp
	    |
	;

    expressionUnary:
		('!' | '-') expressionUnary
	    |	expressionMem
	;

    expressionMem:
		expressionMethods expressionMemTemp
	;

    expressionMemTemp:
		'[' expression ']'
	    |
	;
	expressionMethods:
	    expressionOther expressionMethodsTemp
	;
	expressionMethodsTemp:
	    '.' (ID '(' ')' | ID '(' (expression (',' expression)*) ')' | 'length') expressionMethodsTemp
	    |
	;
    expressionOther:
		CONST_NUM
        |	CONST_STR
        |   'new ' 'int' '[' CONST_NUM ']'
        |   'new ' ID '(' ')'
        |   'this'
        |   'true'
        |   'false'
        |	ID
        |   ID '[' expression ']'
        |	'(' expression ')'
	;
	type:
	    'int' |
	    'boolean' |
	    'string' |
	    'int' '[' ']' |
	    ID
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