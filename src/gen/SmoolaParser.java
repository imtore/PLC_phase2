// Generated from /Users/imtore/Desktop/compilerphase2/compilerFall97/Smoola.g4 by ANTLR 4.7

        import ast.node.declaration.*;
        import ast.node.statement.*;
        import ast.node.expression.*;
        import ast.node.expression.Value.*;
        import ast.Type.ArrayType.*;
        import ast.Type.PrimitiveType.*;
        import ast.Type.UserDefinedType.*;
        import ast.Type.Type;
        import ast.node.Node;
        import ast.node.Program;
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmoolaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, CONST_NUM=41, CONST_STR=42, NL=43, ID=44, COMMENT=45, 
		WS=46;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_statements = 5, RULE_statement = 6, RULE_statementBlock = 7, 
		RULE_statementCondition = 8, RULE_statementLoop = 9, RULE_statementWrite = 10, 
		RULE_statementAssignment = 11, RULE_expression = 12, RULE_expressionAssignment = 13, 
		RULE_expressionOr = 14, RULE_expressionOrTemp = 15, RULE_expressionAnd = 16, 
		RULE_expressionAndTemp = 17, RULE_expressionEq = 18, RULE_expressionEqTemp = 19, 
		RULE_expressionCmp = 20, RULE_expressionCmpTemp = 21, RULE_expressionAdd = 22, 
		RULE_expressionAddTemp = 23, RULE_expressionMult = 24, RULE_expressionMultTemp = 25, 
		RULE_expressionUnary = 26, RULE_expressionMem = 27, RULE_expressionMemTemp = 28, 
		RULE_expressionMethods = 29, RULE_expressionMethodsTemp = 30, RULE_expressionOther = 31, 
		RULE_type = 32;
	public static final String[] ruleNames = {
		"program", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"statements", "statement", "statementBlock", "statementCondition", "statementLoop", 
		"statementWrite", "statementAssignment", "expression", "expressionAssignment", 
		"expressionOr", "expressionOrTemp", "expressionAnd", "expressionAndTemp", 
		"expressionEq", "expressionEqTemp", "expressionCmp", "expressionCmpTemp", 
		"expressionAdd", "expressionAddTemp", "expressionMult", "expressionMultTemp", 
		"expressionUnary", "expressionMem", "expressionMemTemp", "expressionMethods", 
		"expressionMethodsTemp", "expressionOther", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'def'", "'('", "')'", "':'", "'int'", "'return'", 
		"';'", "'}'", "'extends'", "'var'", "','", "'if'", "'then'", "'else'", 
		"'while'", "'writeln('", "'='", "'||'", "'&&'", "'=='", "'<>'", "'<'", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "'!'", "'['", "']'", "'.'", "'length'", 
		"'new '", "'this'", "'true'", "'false'", "'boolean'", "'string'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "CONST_NUM", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Smoola.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	        void print(Object obj){
	                System.out.println(obj);
	         }
	    
	public SmoolaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mc;
		public ClassDeclarationContext cd;
		public TerminalNode EOF() { return getToken(SmoolaParser.EOF, 0); }
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            Program prog = new Program();
			        
			setState(67);
			((ProgramContext)_localctx).mc = mainClass();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(68);
				((ProgramContext)_localctx).cd = classDeclaration();
				prog.addClass(((ProgramContext)_localctx).cd.classdecobj);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(EOF);

			            prog.setMainClass(((ProgramContext)_localctx).mc.mainclassobj);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public ClassDeclaration mainclassobj;
		public Token class_name;
		public Token method_name;
		public StatementsContext body;
		public ExpressionContext return_value;
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			((MainClassContext)_localctx).class_name = match(ID);
			setState(81);
			match(T__1);
			setState(82);
			match(T__2);
			setState(83);
			((MainClassContext)_localctx).method_name = match(ID);
			setState(84);
			match(T__3);
			setState(85);
			match(T__4);
			setState(86);
			match(T__5);
			setState(87);
			match(T__6);

			            MethodDeclaration main_method = new MethodDeclaration(new Identifier(((MainClassContext)_localctx).method_name.getText()));
			            main_method.setReturnType(new IntType());
			        
			setState(89);
			match(T__1);
			setState(90);
			((MainClassContext)_localctx).body = statements();
			setState(91);
			match(T__7);
			setState(92);
			((MainClassContext)_localctx).return_value = expression();
			setState(93);
			match(T__8);
			setState(94);
			match(T__9);
			setState(95);
			match(T__9);

			            for (int counter = 0; counter < ((MainClassContext)_localctx).body.stmtlist.size(); counter++) {
			                main_method.addStatement(((MainClassContext)_localctx).body.stmtlist.get(counter));
			            }
			            main_method.setReturnValue(((MainClassContext)_localctx).return_value.expobj);
			            ((MainClassContext)_localctx).mainclassobj =  new ClassDeclaration(new Identifier(((MainClassContext)_localctx).class_name.getText()),new Identifier(""));
			            _localctx.mainclassobj.addMethodDeclaration(main_method);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclaration classdecobj;
		public Token class_name;
		public Token parent_name;
		public VarDeclarationContext var;
		public MethodDeclarationContext method;
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            Boolean has_parent = false;
			        
			setState(99);
			match(T__0);
			setState(100);
			((ClassDeclarationContext)_localctx).class_name = match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(101);
				match(T__10);
				setState(102);
				((ClassDeclarationContext)_localctx).parent_name = match(ID);
				has_parent = true;
				}
			}

			setState(106);
			match(T__1);

			            if(has_parent){
			                ((ClassDeclarationContext)_localctx).classdecobj =  new ClassDeclaration(new Identifier(((ClassDeclarationContext)_localctx).class_name.getText()), new Identifier(((ClassDeclarationContext)_localctx).parent_name.getText()));
			            }
			            else
			            {
			                ((ClassDeclarationContext)_localctx).classdecobj =  new ClassDeclaration(new Identifier(((ClassDeclarationContext)_localctx).class_name.getText()), new Identifier(""));
			            }
			        
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(108);
				((ClassDeclarationContext)_localctx).var = varDeclaration();
				_localctx.classdecobj.addVarDeclaration(((ClassDeclarationContext)_localctx).var.vardecobj);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(116);
				((ClassDeclarationContext)_localctx).method = methodDeclaration();
				_localctx.classdecobj.addMethodDeclaration(((ClassDeclarationContext)_localctx).method.methoddecobj);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration vardecobj;
		public Token name;
		public TypeContext vartype;
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__11);
			setState(127);
			((VarDeclarationContext)_localctx).name = match(ID);
			setState(128);
			match(T__5);
			setState(129);
			((VarDeclarationContext)_localctx).vartype = type();
			setState(130);
			match(T__8);

			            ((VarDeclarationContext)_localctx).vardecobj =  new VarDeclaration(new Identifier(((VarDeclarationContext)_localctx).name.getText()), ((VarDeclarationContext)_localctx).vartype.typeobj);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclaration methoddecobj;
		public Token method_name;
		public Token arg_name;
		public TypeContext argtype;
		public TypeContext return_type;
		public VarDeclarationContext localvar;
		public StatementsContext body;
		public ExpressionContext return_value;
		public List<TerminalNode> ID() { return getTokens(SmoolaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SmoolaParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__2);
			setState(134);
			((MethodDeclarationContext)_localctx).method_name = match(ID);

			            ((MethodDeclarationContext)_localctx).methoddecobj =  new MethodDeclaration(new Identifier(((MethodDeclarationContext)_localctx).method_name.getText()));
			        
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(136);
				match(T__3);
				setState(137);
				match(T__4);
				}
				break;
			case 2:
				{
				{
				setState(138);
				match(T__3);
				setState(139);
				((MethodDeclarationContext)_localctx).arg_name = match(ID);
				setState(140);
				match(T__5);
				setState(141);
				((MethodDeclarationContext)_localctx).argtype = type();

				            _localctx.methoddecobj.addArg(new VarDeclaration( new Identifier(((MethodDeclarationContext)_localctx).arg_name.getText()) , ((MethodDeclarationContext)_localctx).argtype.typeobj));
				        
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(143);
					match(T__12);
					setState(144);
					((MethodDeclarationContext)_localctx).arg_name = match(ID);
					setState(145);
					match(T__5);
					setState(146);
					((MethodDeclarationContext)_localctx).argtype = type();

					            _localctx.methoddecobj.addArg(new VarDeclaration(new Identifier(((MethodDeclarationContext)_localctx).arg_name.getText()), ((MethodDeclarationContext)_localctx).argtype.typeobj));
					        
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__4);
				}
				}
				break;
			}
			setState(158);
			match(T__5);
			setState(159);
			((MethodDeclarationContext)_localctx).return_type = type();

			            _localctx.methoddecobj.setReturnType(((MethodDeclarationContext)_localctx).return_type.typeobj);
			        
			setState(161);
			match(T__1);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(162);
				((MethodDeclarationContext)_localctx).localvar = varDeclaration();

				            _localctx.methoddecobj.addLocalVar(new VarDeclaration(new Identifier(((MethodDeclarationContext)_localctx).arg_name.getText()), ((MethodDeclarationContext)_localctx).argtype.typeobj));
				        
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			((MethodDeclarationContext)_localctx).body = statements();
			setState(171);
			match(T__7);
			setState(172);
			((MethodDeclarationContext)_localctx).return_value = expression();
			setState(173);
			match(T__8);
			setState(174);
			match(T__9);

			            for (int counter = 0; counter < ((MethodDeclarationContext)_localctx).body.stmtlist.size(); counter++) {
			                _localctx.methoddecobj.addStatement(((MethodDeclarationContext)_localctx).body.stmtlist.get(counter));
			            }
			            _localctx.methoddecobj.setReturnValue(((MethodDeclarationContext)_localctx).return_value.expobj);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public ArrayList<Statement> stmtlist;
		public StatementContext stmt;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((StatementsContext)_localctx).stmtlist =  new ArrayList<Statement>(); 
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << CONST_NUM) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				{
				setState(178);
				((StatementsContext)_localctx).stmt = statement();
				_localctx.stmtlist.add(((StatementsContext)_localctx).stmt.stmtobj);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement stmtobj;
		public StatementBlockContext stmtb;
		public StatementConditionContext stmtc;
		public StatementLoopContext stmtl;
		public StatementWriteContext stmtw;
		public StatementAssignmentContext stmta;
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementConditionContext statementCondition() {
			return getRuleContext(StatementConditionContext.class,0);
		}
		public StatementLoopContext statementLoop() {
			return getRuleContext(StatementLoopContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementAssignmentContext statementAssignment() {
			return getRuleContext(StatementAssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((StatementContext)_localctx).stmtb = statementBlock();
				 ((StatementContext)_localctx).stmtobj =  ((StatementContext)_localctx).stmtb.blockobj; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((StatementContext)_localctx).stmtc = statementCondition();
				 ((StatementContext)_localctx).stmtobj =  ((StatementContext)_localctx).stmtc.conditionalobj; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				((StatementContext)_localctx).stmtl = statementLoop();
				 ((StatementContext)_localctx).stmtobj =  ((StatementContext)_localctx).stmtl.whileobj; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				((StatementContext)_localctx).stmtw = statementWrite();
				 ((StatementContext)_localctx).stmtobj =  ((StatementContext)_localctx).stmtw.writelnobj; 
				}
				break;
			case T__3:
			case T__26:
			case T__29:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				((StatementContext)_localctx).stmta = statementAssignment();
				 ((StatementContext)_localctx).stmtobj =  ((StatementContext)_localctx).stmta.asgnobj; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public Block blockobj;
		public StatementsContext body;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementBlock(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__1);
			setState(204);
			((StatementBlockContext)_localctx).body = statements();
			setState(205);
			match(T__9);

			            ((StatementBlockContext)_localctx).blockobj =  new Block();
			            for (int counter = 0; counter < ((StatementBlockContext)_localctx).body.stmtlist.size(); counter++) {
			                _localctx.blockobj.addStatement(((StatementBlockContext)_localctx).body.stmtlist.get(counter));
			            }
			         
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementConditionContext extends ParserRuleContext {
		public Conditional conditionalobj;
		public ExpressionContext condition;
		public StatementContext consequencebody;
		public StatementContext alternativebody;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementCondition(this);
		}
	}

	public final StatementConditionContext statementCondition() throws RecognitionException {
		StatementConditionContext _localctx = new StatementConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__13);
			setState(209);
			match(T__3);
			setState(210);
			((StatementConditionContext)_localctx).condition = expression();
			setState(211);
			match(T__4);
			setState(212);
			match(T__14);
			setState(213);
			((StatementConditionContext)_localctx).consequencebody = statement();

			            ((StatementConditionContext)_localctx).conditionalobj =  new Conditional(((StatementConditionContext)_localctx).condition.expobj, ((StatementConditionContext)_localctx).consequencebody.stmtobj);
			        
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(215);
				match(T__15);
				setState(216);
				((StatementConditionContext)_localctx).alternativebody = statement();
				_localctx.conditionalobj.setAlternativeBody(((StatementConditionContext)_localctx).alternativebody.stmtobj);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementLoopContext extends ParserRuleContext {
		public While whileobj;
		public ExpressionContext condition;
		public StatementContext body;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementLoop(this);
		}
	}

	public final StatementLoopContext statementLoop() throws RecognitionException {
		StatementLoopContext _localctx = new StatementLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__16);
			setState(222);
			match(T__3);
			setState(223);
			((StatementLoopContext)_localctx).condition = expression();
			setState(224);
			match(T__4);
			setState(225);
			((StatementLoopContext)_localctx).body = statement();

			            ((StatementLoopContext)_localctx).whileobj =  new While(((StatementLoopContext)_localctx).condition.expobj, ((StatementLoopContext)_localctx).body.stmtobj);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWriteContext extends ParserRuleContext {
		public Write writelnobj;
		public ExpressionContext arg;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementWrite(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__17);
			setState(229);
			((StatementWriteContext)_localctx).arg = expression();
			setState(230);
			match(T__4);
			setState(231);
			match(T__8);

			            ((StatementWriteContext)_localctx).writelnobj =  new Write(((StatementWriteContext)_localctx).arg.expobj);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignmentContext extends ParserRuleContext {
		public Assign asgnobj;
		public ExpressionContext exp;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitStatementAssignment(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			((StatementAssignmentContext)_localctx).exp = expression();
			setState(235);
			match(T__8);

			            if(((StatementAssignmentContext)_localctx).exp.isAssignStatement){
			                ((StatementAssignmentContext)_localctx).asgnobj =  new Assign(((BinaryExpression)((StatementAssignmentContext)_localctx).exp.expobj).getLeft(), ((BinaryExpression)((StatementAssignmentContext)_localctx).exp.expobj).getRight());
			            }
			            else
			            {
			                ((StatementAssignmentContext)_localctx).asgnobj =  new Assign(null, ((BinaryExpression)((StatementAssignmentContext)_localctx).exp.expobj).getRight());
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression expobj;
		public Boolean isAssignStatement;
		public ExpressionAssignmentContext exp;
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((ExpressionContext)_localctx).exp = expressionAssignment();

					    ((ExpressionContext)_localctx).expobj =  ((ExpressionContext)_localctx).exp.expasgn;
					    ((ExpressionContext)_localctx).isAssignStatement =  !((ExpressionContext)_localctx).exp.isAssignExp;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAssignmentContext extends ParserRuleContext {
		public Expression expasgn;
		public Boolean isAssignExp;
		public ExpressionOrContext expleft;
		public ExpressionAssignmentContext expright;
		public ExpressionOrContext exp;
		public ExpressionOrContext expressionOr() {
			return getRuleContext(ExpressionOrContext.class,0);
		}
		public ExpressionAssignmentContext expressionAssignment() {
			return getRuleContext(ExpressionAssignmentContext.class,0);
		}
		public ExpressionAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAssignment(this);
		}
	}

	public final ExpressionAssignmentContext expressionAssignment() throws RecognitionException {
		ExpressionAssignmentContext _localctx = new ExpressionAssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionAssignment);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((ExpressionAssignmentContext)_localctx).expleft = expressionOr();
				setState(242);
				match(T__18);
				setState(243);
				((ExpressionAssignmentContext)_localctx).expright = expressionAssignment();

						    ((ExpressionAssignmentContext)_localctx).expasgn =  new BinaryExpression(((ExpressionAssignmentContext)_localctx).expleft.expor, ((ExpressionAssignmentContext)_localctx).expright.expasgn, BinaryOperator.assign);
						    ((ExpressionAssignmentContext)_localctx).isAssignExp =  true;
						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((ExpressionAssignmentContext)_localctx).exp = expressionOr();

					        ((ExpressionAssignmentContext)_localctx).expasgn =  ((ExpressionAssignmentContext)_localctx).exp.expor;
					        ((ExpressionAssignmentContext)_localctx).isAssignExp =  false;
					    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOrContext extends ParserRuleContext {
		public Expression expor;
		public ExpressionAndContext expleft;
		public ExpressionOrTempContext rest;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOr(this);
		}
	}

	public final ExpressionOrContext expressionOr() throws RecognitionException {
		ExpressionOrContext _localctx = new ExpressionOrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			((ExpressionOrContext)_localctx).expleft = expressionAnd();
			setState(252);
			((ExpressionOrContext)_localctx).rest = expressionOrTemp(((ExpressionOrContext)_localctx).expleft.expand);
			((ExpressionOrContext)_localctx).expor =  ((ExpressionOrContext)_localctx).rest.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOrTempContext extends ParserRuleContext {
		public Expression leftside;
		public Expression fullexp;
		public ExpressionAndContext expright;
		public ExpressionOrTempContext exp;
		public ExpressionAndContext expressionAnd() {
			return getRuleContext(ExpressionAndContext.class,0);
		}
		public ExpressionOrTempContext expressionOrTemp() {
			return getRuleContext(ExpressionOrTempContext.class,0);
		}
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionOrTempContext(ParserRuleContext parent, int invokingState, Expression leftside) {
			super(parent, invokingState);
			this.leftside = leftside;
		}
		@Override public int getRuleIndex() { return RULE_expressionOrTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOrTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOrTemp(this);
		}
	}

	public final ExpressionOrTempContext expressionOrTemp(Expression leftside) throws RecognitionException {
		ExpressionOrTempContext _localctx = new ExpressionOrTempContext(_ctx, getState(), leftside);
		enterRule(_localctx, 30, RULE_expressionOrTemp);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__19);
				setState(256);
				((ExpressionOrTempContext)_localctx).expright = expressionAnd();

						    Expression leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionOrTempContext)_localctx).expright.expand, BinaryOperator.or);
						
				setState(258);
				((ExpressionOrTempContext)_localctx).exp = expressionOrTemp(leftmostexp);

						    ((ExpressionOrTempContext)_localctx).fullexp =  ((ExpressionOrTempContext)_localctx).exp.fullexp;
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionOrTempContext)_localctx).fullexp =  _localctx.leftside;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAndContext extends ParserRuleContext {
		public Expression expand;
		public ExpressionEqContext expleft;
		public ExpressionAndTempContext rest;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAnd(this);
		}
	}

	public final ExpressionAndContext expressionAnd() throws RecognitionException {
		ExpressionAndContext _localctx = new ExpressionAndContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((ExpressionAndContext)_localctx).expleft = expressionEq();
			setState(265);
			((ExpressionAndContext)_localctx).rest = expressionAndTemp(((ExpressionAndContext)_localctx).expleft.expeq);
			((ExpressionAndContext)_localctx).expand =  ((ExpressionAndContext)_localctx).rest.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAndTempContext extends ParserRuleContext {
		public Expression leftside;
		public Expression fullexp;
		public ExpressionEqContext expright;
		public ExpressionAndTempContext exp;
		public ExpressionEqContext expressionEq() {
			return getRuleContext(ExpressionEqContext.class,0);
		}
		public ExpressionAndTempContext expressionAndTemp() {
			return getRuleContext(ExpressionAndTempContext.class,0);
		}
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAndTempContext(ParserRuleContext parent, int invokingState, Expression leftside) {
			super(parent, invokingState);
			this.leftside = leftside;
		}
		@Override public int getRuleIndex() { return RULE_expressionAndTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAndTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAndTemp(this);
		}
	}

	public final ExpressionAndTempContext expressionAndTemp(Expression leftside) throws RecognitionException {
		ExpressionAndTempContext _localctx = new ExpressionAndTempContext(_ctx, getState(), leftside);
		enterRule(_localctx, 34, RULE_expressionAndTemp);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__20);
				setState(269);
				((ExpressionAndTempContext)_localctx).expright = expressionEq();

				            Expression leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionAndTempContext)_localctx).expright.expeq, BinaryOperator.and);
				         
				setState(271);
				((ExpressionAndTempContext)_localctx).exp = expressionAndTemp(leftmostexp);

				            ((ExpressionAndTempContext)_localctx).fullexp =  ((ExpressionAndTempContext)_localctx).exp.fullexp;
				         
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionAndTempContext)_localctx).fullexp =  _localctx.leftside;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionEqContext extends ParserRuleContext {
		public Expression expeq;
		public ExpressionCmpContext expleft;
		public ExpressionEqTempContext rest;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionEq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionEq(this);
		}
	}

	public final ExpressionEqContext expressionEq() throws RecognitionException {
		ExpressionEqContext _localctx = new ExpressionEqContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionEq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((ExpressionEqContext)_localctx).expleft = expressionCmp();
			setState(278);
			((ExpressionEqContext)_localctx).rest = expressionEqTemp(((ExpressionEqContext)_localctx).expleft.expcmp);
			((ExpressionEqContext)_localctx).expeq =  ((ExpressionEqContext)_localctx).rest.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionEqTempContext extends ParserRuleContext {
		public Expression leftside;
		public Expression fullexp;
		public ExpressionCmpContext expright;
		public ExpressionEqTempContext exp;
		public ExpressionCmpContext expressionCmp() {
			return getRuleContext(ExpressionCmpContext.class,0);
		}
		public ExpressionEqTempContext expressionEqTemp() {
			return getRuleContext(ExpressionEqTempContext.class,0);
		}
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionEqTempContext(ParserRuleContext parent, int invokingState, Expression leftside) {
			super(parent, invokingState);
			this.leftside = leftside;
		}
		@Override public int getRuleIndex() { return RULE_expressionEqTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionEqTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionEqTemp(this);
		}
	}

	public final ExpressionEqTempContext expressionEqTemp(Expression leftside) throws RecognitionException {
		ExpressionEqTempContext _localctx = new ExpressionEqTempContext(_ctx, getState(), leftside);
		enterRule(_localctx, 38, RULE_expressionEqTemp);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 1);
				{

				            Boolean eq;
				            Expression leftmostexp;
				        
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(282);
					match(T__21);
					eq = true;
					}
					break;
				case T__22:
					{
					setState(284);
					match(T__22);
					eq = false;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(288);
				((ExpressionEqTempContext)_localctx).expright = expressionCmp();

						    if(eq)
						    {
						        leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionEqTempContext)_localctx).expright.expcmp, BinaryOperator.eq);
						    }
						    else
						    {
						        leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionEqTempContext)_localctx).expright.expcmp, BinaryOperator.neq);
						    }

						
				setState(290);
				((ExpressionEqTempContext)_localctx).exp = expressionEqTemp(leftmostexp);

						    ((ExpressionEqTempContext)_localctx).fullexp =  ((ExpressionEqTempContext)_localctx).exp.fullexp;
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionEqTempContext)_localctx).fullexp =  _localctx.leftside;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionCmpContext extends ParserRuleContext {
		public Expression expcmp;
		public ExpressionAddContext expleft;
		public ExpressionCmpTempContext rest;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionCmp(this);
		}
	}

	public final ExpressionCmpContext expressionCmp() throws RecognitionException {
		ExpressionCmpContext _localctx = new ExpressionCmpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionCmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((ExpressionCmpContext)_localctx).expleft = expressionAdd();
			setState(297);
			((ExpressionCmpContext)_localctx).rest = expressionCmpTemp(((ExpressionCmpContext)_localctx).expleft.expadd);
			((ExpressionCmpContext)_localctx).expcmp =  ((ExpressionCmpContext)_localctx).rest.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionCmpTempContext extends ParserRuleContext {
		public Expression leftside;
		public Expression fullexp;
		public ExpressionAddContext expright;
		public ExpressionCmpTempContext exp;
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionCmpTempContext expressionCmpTemp() {
			return getRuleContext(ExpressionCmpTempContext.class,0);
		}
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionCmpTempContext(ParserRuleContext parent, int invokingState, Expression leftside) {
			super(parent, invokingState);
			this.leftside = leftside;
		}
		@Override public int getRuleIndex() { return RULE_expressionCmpTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionCmpTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionCmpTemp(this);
		}
	}

	public final ExpressionCmpTempContext expressionCmpTemp(Expression leftside) throws RecognitionException {
		ExpressionCmpTempContext _localctx = new ExpressionCmpTempContext(_ctx, getState(), leftside);
		enterRule(_localctx, 42, RULE_expressionCmpTemp);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{

				            Expression leftmostexp;
				            Boolean lt;
				        
				setState(305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__23:
					{
					setState(301);
					match(T__23);
					lt = true;
					}
					break;
				case T__24:
					{
					setState(303);
					match(T__24);
					lt = false;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307);
				((ExpressionCmpTempContext)_localctx).expright = expressionAdd();

						    if(lt)
				            {
				                leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionCmpTempContext)_localctx).expright.expadd, BinaryOperator.lt);
				            }
				            else
				            {
				                leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionCmpTempContext)_localctx).expright.expadd, BinaryOperator.gt);
				            }
						
				setState(309);
				((ExpressionCmpTempContext)_localctx).exp = expressionCmpTemp(leftmostexp);

				            ((ExpressionCmpTempContext)_localctx).fullexp =  ((ExpressionCmpTempContext)_localctx).exp.fullexp;
				        
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionCmpTempContext)_localctx).fullexp =  _localctx.leftside;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAddContext extends ParserRuleContext {
		public Expression expadd;
		public ExpressionMultContext expleft;
		public ExpressionAddTempContext rest;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAdd(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((ExpressionAddContext)_localctx).expleft = expressionMult();
			setState(316);
			((ExpressionAddContext)_localctx).rest = expressionAddTemp(((ExpressionAddContext)_localctx).expleft.expmult);
			((ExpressionAddContext)_localctx).expadd =  ((ExpressionAddContext)_localctx).rest.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionAddTempContext extends ParserRuleContext {
		public Expression leftside;
		public Expression fullexp;
		public ExpressionMultContext expright;
		public ExpressionAddTempContext exp;
		public ExpressionMultContext expressionMult() {
			return getRuleContext(ExpressionMultContext.class,0);
		}
		public ExpressionAddTempContext expressionAddTemp() {
			return getRuleContext(ExpressionAddTempContext.class,0);
		}
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionAddTempContext(ParserRuleContext parent, int invokingState, Expression leftside) {
			super(parent, invokingState);
			this.leftside = leftside;
		}
		@Override public int getRuleIndex() { return RULE_expressionAddTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionAddTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionAddTemp(this);
		}
	}

	public final ExpressionAddTempContext expressionAddTemp(Expression leftside) throws RecognitionException {
		ExpressionAddTempContext _localctx = new ExpressionAddTempContext(_ctx, getState(), leftside);
		enterRule(_localctx, 46, RULE_expressionAddTemp);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{

				            Expression leftmostexp;
				            Boolean add;
				        
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(320);
					match(T__25);
					add = true;
					}
					break;
				case T__26:
					{
					setState(322);
					match(T__26);
					add = false;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				((ExpressionAddTempContext)_localctx).expright = expressionMult();

						    if(add)
				            {
				                leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionAddTempContext)_localctx).expright.expmult, BinaryOperator.add);
				            }
				            else
				            {
				                leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionAddTempContext)_localctx).expright.expmult, BinaryOperator.sub);
				            }
						
				setState(328);
				((ExpressionAddTempContext)_localctx).exp = expressionAddTemp(leftmostexp);

						    ((ExpressionAddTempContext)_localctx).fullexp =  ((ExpressionAddTempContext)_localctx).exp.fullexp;
						
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionAddTempContext)_localctx).fullexp =  _localctx.leftside;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMultContext extends ParserRuleContext {
		public Expression expmult;
		public ExpressionUnaryContext expleft;
		public ExpressionMultTempContext rest;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultTempContext expressionMultTemp() {
			return getRuleContext(ExpressionMultTempContext.class,0);
		}
		public ExpressionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMult(this);
		}
	}

	public final ExpressionMultContext expressionMult() throws RecognitionException {
		ExpressionMultContext _localctx = new ExpressionMultContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressionMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((ExpressionMultContext)_localctx).expleft = expressionUnary();
			setState(335);
			((ExpressionMultContext)_localctx).rest = expressionMultTemp(((ExpressionMultContext)_localctx).expleft.expun);
			((ExpressionMultContext)_localctx).expmult =  ((ExpressionMultContext)_localctx).rest.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMultTempContext extends ParserRuleContext {
		public Expression leftside;
		public Expression fullexp;
		public ExpressionUnaryContext expright;
		public ExpressionMultTempContext exp;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMultTempContext expressionMultTemp() {
			return getRuleContext(ExpressionMultTempContext.class,0);
		}
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMultTempContext(ParserRuleContext parent, int invokingState, Expression leftside) {
			super(parent, invokingState);
			this.leftside = leftside;
		}
		@Override public int getRuleIndex() { return RULE_expressionMultTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMultTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMultTemp(this);
		}
	}

	public final ExpressionMultTempContext expressionMultTemp(Expression leftside) throws RecognitionException {
		ExpressionMultTempContext _localctx = new ExpressionMultTempContext(_ctx, getState(), leftside);
		enterRule(_localctx, 50, RULE_expressionMultTemp);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{

				            Expression leftmostexp;
				            Boolean mult;
				        
				setState(343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(339);
					match(T__27);
					mult = true;
					}
					break;
				case T__28:
					{
					setState(341);
					match(T__28);
					mult = false;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(345);
				((ExpressionMultTempContext)_localctx).expright = expressionUnary();

						    if(mult)
				            {
				                leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionMultTempContext)_localctx).expright.expun, BinaryOperator.mult);
				            }
				            else
				            {
				                leftmostexp = new BinaryExpression(_localctx.leftside, ((ExpressionMultTempContext)_localctx).expright.expun, BinaryOperator.div);
				            }
						
				setState(347);
				((ExpressionMultTempContext)_localctx).exp = expressionMultTemp(leftmostexp);

						    ((ExpressionMultTempContext)_localctx).fullexp =  ((ExpressionMultTempContext)_localctx).exp.fullexp;
				        
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMultTempContext)_localctx).fullexp =  _localctx.leftside;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionUnaryContext extends ParserRuleContext {
		public Expression expun;
		public ExpressionUnaryContext exp1;
		public ExpressionMemContext exp2;
		public ExpressionUnaryContext expressionUnary() {
			return getRuleContext(ExpressionUnaryContext.class,0);
		}
		public ExpressionMemContext expressionMem() {
			return getRuleContext(ExpressionMemContext.class,0);
		}
		public ExpressionUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionUnary(this);
		}
	}

	public final ExpressionUnaryContext expressionUnary() throws RecognitionException {
		ExpressionUnaryContext _localctx = new ExpressionUnaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionUnary);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{

				            Boolean not;
				        
				setState(358);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(354);
					match(T__29);
					not = true;
					}
					break;
				case T__26:
					{
					setState(356);
					match(T__26);
					not = false;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(360);
				((ExpressionUnaryContext)_localctx).exp1 = expressionUnary();

						    if(not){
						        ((ExpressionUnaryContext)_localctx).expun =  new UnaryExpression(UnaryOperator.not, ((ExpressionUnaryContext)_localctx).exp1.expun);
						    }
						    else
						    {
						        ((ExpressionUnaryContext)_localctx).expun =  new UnaryExpression(UnaryOperator.minus, ((ExpressionUnaryContext)_localctx).exp1.expun);
						    }
						
				}
				break;
			case T__3:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case CONST_NUM:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				((ExpressionUnaryContext)_localctx).exp2 = expressionMem();
				((ExpressionUnaryContext)_localctx).expun =  ((ExpressionUnaryContext)_localctx).exp2.expmem;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMemContext extends ParserRuleContext {
		public Expression expmem;
		public ExpressionMethodsContext instance;
		public ExpressionMemTempContext access;
		public ExpressionMethodsContext expressionMethods() {
			return getRuleContext(ExpressionMethodsContext.class,0);
		}
		public ExpressionMemTempContext expressionMemTemp() {
			return getRuleContext(ExpressionMemTempContext.class,0);
		}
		public ExpressionMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMem(this);
		}
	}

	public final ExpressionMemContext expressionMem() throws RecognitionException {
		ExpressionMemContext _localctx = new ExpressionMemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((ExpressionMemContext)_localctx).instance = expressionMethods();
			setState(369);
			((ExpressionMemContext)_localctx).access = expressionMemTemp(((ExpressionMemContext)_localctx).instance.expmeth);
			((ExpressionMemContext)_localctx).expmem =  ((ExpressionMemContext)_localctx).access.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMemTempContext extends ParserRuleContext {
		public Expression instance;
		public Expression fullexp;
		public ExpressionContext index;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionMemTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMemTempContext(ParserRuleContext parent, int invokingState, Expression instance) {
			super(parent, invokingState);
			this.instance = instance;
		}
		@Override public int getRuleIndex() { return RULE_expressionMemTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMemTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMemTemp(this);
		}
	}

	public final ExpressionMemTempContext expressionMemTemp(Expression instance) throws RecognitionException {
		ExpressionMemTempContext _localctx = new ExpressionMemTempContext(_ctx, getState(), instance);
		enterRule(_localctx, 56, RULE_expressionMemTemp);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__30);
				setState(373);
				((ExpressionMemTempContext)_localctx).index = expression();
				setState(374);
				match(T__31);
				((ExpressionMemTempContext)_localctx).fullexp =  new ArrayCall(_localctx.instance, ((ExpressionMemTempContext)_localctx).index.expobj);
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMemTempContext)_localctx).fullexp =  _localctx.instance;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMethodsContext extends ParserRuleContext {
		public Expression expmeth;
		public ExpressionOtherContext instance;
		public ExpressionMethodsTempContext call;
		public ExpressionOtherContext expressionOther() {
			return getRuleContext(ExpressionOtherContext.class,0);
		}
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public ExpressionMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMethods(this);
		}
	}

	public final ExpressionMethodsContext expressionMethods() throws RecognitionException {
		ExpressionMethodsContext _localctx = new ExpressionMethodsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			((ExpressionMethodsContext)_localctx).instance = expressionOther();
			setState(381);
			((ExpressionMethodsContext)_localctx).call = expressionMethodsTemp(((ExpressionMethodsContext)_localctx).instance.expotherobj);
			((ExpressionMethodsContext)_localctx).expmeth =  ((ExpressionMethodsContext)_localctx).call.fullexp;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionMethodsTempContext extends ParserRuleContext {
		public Expression instance;
		public Expression fullexp;
		public Token method_name;
		public ExpressionContext first_arg;
		public ExpressionContext arg;
		public ExpressionMethodsTempContext call;
		public ExpressionMethodsTempContext expressionMethodsTemp() {
			return getRuleContext(ExpressionMethodsTempContext.class,0);
		}
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionMethodsTempContext(ParserRuleContext parent, int invokingState, Expression instance) {
			super(parent, invokingState);
			this.instance = instance;
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodsTemp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionMethodsTemp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionMethodsTemp(this);
		}
	}

	public final ExpressionMethodsTempContext expressionMethodsTemp(Expression instance) throws RecognitionException {
		ExpressionMethodsTempContext _localctx = new ExpressionMethodsTempContext(_ctx, getState(), instance);
		enterRule(_localctx, 60, RULE_expressionMethodsTemp);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{

					        Expression next_instance = null;
					    
				setState(385);
				match(T__32);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(386);
					((ExpressionMethodsTempContext)_localctx).method_name = match(ID);

					            next_instance = new MethodCall(_localctx.instance, new Identifier(((ExpressionMethodsTempContext)_localctx).method_name.getText()));
					        
					setState(388);
					match(T__3);
					setState(389);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(390);
					((ExpressionMethodsTempContext)_localctx).method_name = match(ID);

						        next_instance = new MethodCall(_localctx.instance, new Identifier(((ExpressionMethodsTempContext)_localctx).method_name.getText()));
						    
					setState(392);
					match(T__3);
					{
					setState(393);
					((ExpressionMethodsTempContext)_localctx).first_arg = expression();
					((MethodCall)next_instance).addArg(((ExpressionMethodsTempContext)_localctx).first_arg.expobj);
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(395);
						match(T__12);
						setState(396);
						((ExpressionMethodsTempContext)_localctx).arg = expression();
						((MethodCall)next_instance).addArg(((ExpressionMethodsTempContext)_localctx).arg.expobj);
						}
						}
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(404);
					match(T__4);
					}
					break;
				case 3:
					{
					setState(406);
					match(T__33);

						        next_instance = new Length(_localctx.instance);
						    
					}
					break;
				}
				setState(410);
				((ExpressionMethodsTempContext)_localctx).call = expressionMethodsTemp(next_instance);
				((ExpressionMethodsTempContext)_localctx).fullexp =  ((ExpressionMethodsTempContext)_localctx).call.fullexp; 
				}
				break;
			case T__4:
			case T__8:
			case T__12:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				((ExpressionMethodsTempContext)_localctx).fullexp =  _localctx.instance;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionOtherContext extends ParserRuleContext {
		public Expression expotherobj;
		public Token const_int;
		public Token const_string;
		public Token size;
		public Token instance_name;
		public Token identifier;
		public Token array_instance_name;
		public ExpressionContext array_index;
		public ExpressionContext exp;
		public TerminalNode CONST_NUM() { return getToken(SmoolaParser.CONST_NUM, 0); }
		public TerminalNode CONST_STR() { return getToken(SmoolaParser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterExpressionOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitExpressionOther(this);
		}
	}

	public final ExpressionOtherContext expressionOther() throws RecognitionException {
		ExpressionOtherContext _localctx = new ExpressionOtherContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionOther);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				((ExpressionOtherContext)_localctx).const_int = match(CONST_NUM);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new IntValue(Integer.parseInt(((ExpressionOtherContext)_localctx).const_int.getText()), new IntType());
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				((ExpressionOtherContext)_localctx).const_string = match(CONST_STR);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new StringValue(((ExpressionOtherContext)_localctx).const_string.getText(), new StringType());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(T__34);
				setState(421);
				match(T__6);
				setState(422);
				match(T__30);
				setState(423);
				((ExpressionOtherContext)_localctx).size = match(CONST_NUM);
				setState(424);
				match(T__31);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new NewArray(); ((NewArray)_localctx.expotherobj).setExpression(new IntValue(Integer.parseInt(((ExpressionOtherContext)_localctx).size.getText()),new IntType()));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				match(T__34);
				setState(427);
				((ExpressionOtherContext)_localctx).instance_name = match(ID);
				setState(428);
				match(T__3);
				setState(429);
				match(T__4);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new NewClass(new Identifier(((ExpressionOtherContext)_localctx).instance_name.getText()));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				match(T__35);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new This();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				match(T__36);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new BooleanValue(true, new BooleanType());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				match(T__37);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new BooleanValue(false, new BooleanType());
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				((ExpressionOtherContext)_localctx).identifier = match(ID);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new Identifier(((ExpressionOtherContext)_localctx).identifier.getText());
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(439);
				((ExpressionOtherContext)_localctx).array_instance_name = match(ID);
				setState(440);
				match(T__30);
				setState(441);
				((ExpressionOtherContext)_localctx).array_index = expression();
				setState(442);
				match(T__31);
				 ((ExpressionOtherContext)_localctx).expotherobj =  new ArrayCall(new Identifier(((ExpressionOtherContext)_localctx).array_instance_name.getText()), ((ExpressionOtherContext)_localctx).array_index.expobj);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				match(T__3);
				setState(446);
				((ExpressionOtherContext)_localctx).exp = expression();
				setState(447);
				match(T__4);
				((ExpressionOtherContext)_localctx).expotherobj =  ((ExpressionOtherContext)_localctx).exp.expobj;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type typeobj;
		public Token id;
		public TerminalNode ID() { return getToken(SmoolaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmoolaListener ) ((SmoolaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(T__6);
				((TypeContext)_localctx).typeobj =  new IntType(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(T__38);
				((TypeContext)_localctx).typeobj =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(T__39);
				((TypeContext)_localctx).typeobj =  new StringType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				match(T__6);
				setState(459);
				match(T__30);
				setState(460);
				match(T__31);
				((TypeContext)_localctx).typeobj =  new ArrayType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				((TypeContext)_localctx).id = match(ID);

					        ((TypeContext)_localctx).typeobj =  new UserDefinedType();
					        ((UserDefinedType)_localctx.typeobj).setName(new Identifier(((TypeContext)_localctx).id.getText()));
					    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4"+
		"\16\4u\13\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\3\6\5\6\u009f\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00b8\n\7\f\7\16\7\u00bb\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cc\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00de"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00fc\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0109\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0116\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0121\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0134\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u013c\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0147"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014f\n\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u015a\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0162\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0169\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\5\34\u0171\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u017d\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0192\n \f \16 \u0195\13 \3 \3 \3 \3 \5"+
		" \u019b\n \3 \3 \3 \3 \5 \u01a1\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u01c5\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01d3\n"+
		"\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@B\2\2\2\u01df\2D\3\2\2\2\4Q\3\2\2\2\6d\3\2\2\2\b\u0080\3\2\2\2\n"+
		"\u0087\3\2\2\2\f\u00b3\3\2\2\2\16\u00cb\3\2\2\2\20\u00cd\3\2\2\2\22\u00d2"+
		"\3\2\2\2\24\u00df\3\2\2\2\26\u00e6\3\2\2\2\30\u00ec\3\2\2\2\32\u00f0\3"+
		"\2\2\2\34\u00fb\3\2\2\2\36\u00fd\3\2\2\2 \u0108\3\2\2\2\"\u010a\3\2\2"+
		"\2$\u0115\3\2\2\2&\u0117\3\2\2\2(\u0128\3\2\2\2*\u012a\3\2\2\2,\u013b"+
		"\3\2\2\2.\u013d\3\2\2\2\60\u014e\3\2\2\2\62\u0150\3\2\2\2\64\u0161\3\2"+
		"\2\2\66\u0170\3\2\2\28\u0172\3\2\2\2:\u017c\3\2\2\2<\u017e\3\2\2\2>\u01a0"+
		"\3\2\2\2@\u01c4\3\2\2\2B\u01d2\3\2\2\2DE\b\2\1\2EK\5\4\3\2FG\5\6\4\2G"+
		"H\b\2\1\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2"+
		"MK\3\2\2\2NO\7\2\2\3OP\b\2\1\2P\3\3\2\2\2QR\7\3\2\2RS\7.\2\2ST\7\4\2\2"+
		"TU\7\5\2\2UV\7.\2\2VW\7\6\2\2WX\7\7\2\2XY\7\b\2\2YZ\7\t\2\2Z[\b\3\1\2"+
		"[\\\7\4\2\2\\]\5\f\7\2]^\7\n\2\2^_\5\32\16\2_`\7\13\2\2`a\7\f\2\2ab\7"+
		"\f\2\2bc\b\3\1\2c\5\3\2\2\2de\b\4\1\2ef\7\3\2\2fj\7.\2\2gh\7\r\2\2hi\7"+
		".\2\2ik\b\4\1\2jg\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\4\2\2ms\b\4\1\2no\5"+
		"\b\5\2op\b\4\1\2pr\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t{\3"+
		"\2\2\2us\3\2\2\2vw\5\n\6\2wx\b\4\1\2xz\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\f\2\2\177\7\3\2\2\2\u0080"+
		"\u0081\7\16\2\2\u0081\u0082\7.\2\2\u0082\u0083\7\b\2\2\u0083\u0084\5B"+
		"\"\2\u0084\u0085\7\13\2\2\u0085\u0086\b\5\1\2\u0086\t\3\2\2\2\u0087\u0088"+
		"\7\5\2\2\u0088\u0089\7.\2\2\u0089\u009e\b\6\1\2\u008a\u008b\7\6\2\2\u008b"+
		"\u009f\7\7\2\2\u008c\u008d\7\6\2\2\u008d\u008e\7.\2\2\u008e\u008f\7\b"+
		"\2\2\u008f\u0090\5B\"\2\u0090\u0099\b\6\1\2\u0091\u0092\7\17\2\2\u0092"+
		"\u0093\7.\2\2\u0093\u0094\7\b\2\2\u0094\u0095\5B\"\2\u0095\u0096\b\6\1"+
		"\2\u0096\u0098\3\2\2\2\u0097\u0091\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7\7\2\2\u009d\u009f\3\2\2\2\u009e\u008a\3\2\2\2\u009e\u008c\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\5B\"\2\u00a2"+
		"\u00a3\b\6\1\2\u00a3\u00a9\7\4\2\2\u00a4\u00a5\5\b\5\2\u00a5\u00a6\b\6"+
		"\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\b\6\1\2\u00b2\13\3\2\2"+
		"\2\u00b3\u00b9\b\7\1\2\u00b4\u00b5\5\16\b\2\u00b5\u00b6\b\7\1\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\r\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\5\20\t\2\u00bd\u00be\b\b\1\2\u00be\u00cc\3\2\2\2\u00bf\u00c0\5\22\n\2"+
		"\u00c0\u00c1\b\b\1\2\u00c1\u00cc\3\2\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4"+
		"\b\b\1\2\u00c4\u00cc\3\2\2\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\b\b\1\2"+
		"\u00c7\u00cc\3\2\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\b\b\1\2\u00ca\u00cc"+
		"\3\2\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb"+
		"\u00c5\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\17\3\2\2\2\u00cd\u00ce\7\4\2"+
		"\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\b\t\1\2\u00d1\21"+
		"\3\2\2\2\u00d2\u00d3\7\20\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5\32\16"+
		"\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\5\16\b\2\u00d8"+
		"\u00dd\b\n\1\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\16\b\2\u00db\u00dc\b"+
		"\n\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\23\3\2\2\2\u00df\u00e0\7\23\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\5\32"+
		"\16\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\5\16\b\2\u00e4\u00e5\b\13\1\2\u00e5"+
		"\25\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7\7"+
		"\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\b\f\1\2\u00eb\27\3\2\2\2\u00ec\u00ed"+
		"\5\32\16\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\b\r\1\2\u00ef\31\3\2\2\2\u00f0"+
		"\u00f1\5\34\17\2\u00f1\u00f2\b\16\1\2\u00f2\33\3\2\2\2\u00f3\u00f4\5\36"+
		"\20\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\b\17\1\2"+
		"\u00f7\u00fc\3\2\2\2\u00f8\u00f9\5\36\20\2\u00f9\u00fa\b\17\1\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fc\35\3\2\2"+
		"\2\u00fd\u00fe\5\"\22\2\u00fe\u00ff\5 \21\2\u00ff\u0100\b\20\1\2\u0100"+
		"\37\3\2\2\2\u0101\u0102\7\26\2\2\u0102\u0103\5\"\22\2\u0103\u0104\b\21"+
		"\1\2\u0104\u0105\5 \21\2\u0105\u0106\b\21\1\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0109\b\21\1\2\u0108\u0101\3\2\2\2\u0108\u0107\3\2\2\2\u0109!\3\2\2\2"+
		"\u010a\u010b\5&\24\2\u010b\u010c\5$\23\2\u010c\u010d\b\22\1\2\u010d#\3"+
		"\2\2\2\u010e\u010f\7\27\2\2\u010f\u0110\5&\24\2\u0110\u0111\b\23\1\2\u0111"+
		"\u0112\5$\23\2\u0112\u0113\b\23\1\2\u0113\u0116\3\2\2\2\u0114\u0116\b"+
		"\23\1\2\u0115\u010e\3\2\2\2\u0115\u0114\3\2\2\2\u0116%\3\2\2\2\u0117\u0118"+
		"\5*\26\2\u0118\u0119\5(\25\2\u0119\u011a\b\24\1\2\u011a\'\3\2\2\2\u011b"+
		"\u0120\b\25\1\2\u011c\u011d\7\30\2\2\u011d\u0121\b\25\1\2\u011e\u011f"+
		"\7\31\2\2\u011f\u0121\b\25\1\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0123\5*\26\2\u0123\u0124\b\25\1\2\u0124\u0125"+
		"\5(\25\2\u0125\u0126\b\25\1\2\u0126\u0129\3\2\2\2\u0127\u0129\b\25\1\2"+
		"\u0128\u011b\3\2\2\2\u0128\u0127\3\2\2\2\u0129)\3\2\2\2\u012a\u012b\5"+
		".\30\2\u012b\u012c\5,\27\2\u012c\u012d\b\26\1\2\u012d+\3\2\2\2\u012e\u0133"+
		"\b\27\1\2\u012f\u0130\7\32\2\2\u0130\u0134\b\27\1\2\u0131\u0132\7\33\2"+
		"\2\u0132\u0134\b\27\1\2\u0133\u012f\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\5.\30\2\u0136\u0137\b\27\1\2\u0137\u0138\5"+
		",\27\2\u0138\u0139\b\27\1\2\u0139\u013c\3\2\2\2\u013a\u013c\b\27\1\2\u013b"+
		"\u012e\3\2\2\2\u013b\u013a\3\2\2\2\u013c-\3\2\2\2\u013d\u013e\5\62\32"+
		"\2\u013e\u013f\5\60\31\2\u013f\u0140\b\30\1\2\u0140/\3\2\2\2\u0141\u0146"+
		"\b\31\1\2\u0142\u0143\7\34\2\2\u0143\u0147\b\31\1\2\u0144\u0145\7\35\2"+
		"\2\u0145\u0147\b\31\1\2\u0146\u0142\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\5\62\32\2\u0149\u014a\b\31\1\2\u014a\u014b"+
		"\5\60\31\2\u014b\u014c\b\31\1\2\u014c\u014f\3\2\2\2\u014d\u014f\b\31\1"+
		"\2\u014e\u0141\3\2\2\2\u014e\u014d\3\2\2\2\u014f\61\3\2\2\2\u0150\u0151"+
		"\5\66\34\2\u0151\u0152\5\64\33\2\u0152\u0153\b\32\1\2\u0153\63\3\2\2\2"+
		"\u0154\u0159\b\33\1\2\u0155\u0156\7\36\2\2\u0156\u015a\b\33\1\2\u0157"+
		"\u0158\7\37\2\2\u0158\u015a\b\33\1\2\u0159\u0155\3\2\2\2\u0159\u0157\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5\66\34\2\u015c\u015d\b\33\1\2"+
		"\u015d\u015e\5\64\33\2\u015e\u015f\b\33\1\2\u015f\u0162\3\2\2\2\u0160"+
		"\u0162\b\33\1\2\u0161\u0154\3\2\2\2\u0161\u0160\3\2\2\2\u0162\65\3\2\2"+
		"\2\u0163\u0168\b\34\1\2\u0164\u0165\7 \2\2\u0165\u0169\b\34\1\2\u0166"+
		"\u0167\7\35\2\2\u0167\u0169\b\34\1\2\u0168\u0164\3\2\2\2\u0168\u0166\3"+
		"\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\66\34\2\u016b\u016c\b\34\1\2"+
		"\u016c\u0171\3\2\2\2\u016d\u016e\58\35\2\u016e\u016f\b\34\1\2\u016f\u0171"+
		"\3\2\2\2\u0170\u0163\3\2\2\2\u0170\u016d\3\2\2\2\u0171\67\3\2\2\2\u0172"+
		"\u0173\5<\37\2\u0173\u0174\5:\36\2\u0174\u0175\b\35\1\2\u01759\3\2\2\2"+
		"\u0176\u0177\7!\2\2\u0177\u0178\5\32\16\2\u0178\u0179\7\"\2\2\u0179\u017a"+
		"\b\36\1\2\u017a\u017d\3\2\2\2\u017b\u017d\b\36\1\2\u017c\u0176\3\2\2\2"+
		"\u017c\u017b\3\2\2\2\u017d;\3\2\2\2\u017e\u017f\5@!\2\u017f\u0180\5> "+
		"\2\u0180\u0181\b\37\1\2\u0181=\3\2\2\2\u0182\u0183\b \1\2\u0183\u019a"+
		"\7#\2\2\u0184\u0185\7.\2\2\u0185\u0186\b \1\2\u0186\u0187\7\6\2\2\u0187"+
		"\u019b\7\7\2\2\u0188\u0189\7.\2\2\u0189\u018a\b \1\2\u018a\u018b\7\6\2"+
		"\2\u018b\u018c\5\32\16\2\u018c\u0193\b \1\2\u018d\u018e\7\17\2\2\u018e"+
		"\u018f\5\32\16\2\u018f\u0190\b \1\2\u0190\u0192\3\2\2\2\u0191\u018d\3"+
		"\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\7\2\2\u0197\u019b\3\2"+
		"\2\2\u0198\u0199\7$\2\2\u0199\u019b\b \1\2\u019a\u0184\3\2\2\2\u019a\u0188"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5> \2\u019d"+
		"\u019e\b \1\2\u019e\u01a1\3\2\2\2\u019f\u01a1\b \1\2\u01a0\u0182\3\2\2"+
		"\2\u01a0\u019f\3\2\2\2\u01a1?\3\2\2\2\u01a2\u01a3\7+\2\2\u01a3\u01c5\b"+
		"!\1\2\u01a4\u01a5\7,\2\2\u01a5\u01c5\b!\1\2\u01a6\u01a7\7%\2\2\u01a7\u01a8"+
		"\7\t\2\2\u01a8\u01a9\7!\2\2\u01a9\u01aa\7+\2\2\u01aa\u01ab\7\"\2\2\u01ab"+
		"\u01c5\b!\1\2\u01ac\u01ad\7%\2\2\u01ad\u01ae\7.\2\2\u01ae\u01af\7\6\2"+
		"\2\u01af\u01b0\7\7\2\2\u01b0\u01c5\b!\1\2\u01b1\u01b2\7&\2\2\u01b2\u01c5"+
		"\b!\1\2\u01b3\u01b4\7\'\2\2\u01b4\u01c5\b!\1\2\u01b5\u01b6\7(\2\2\u01b6"+
		"\u01c5\b!\1\2\u01b7\u01b8\7.\2\2\u01b8\u01c5\b!\1\2\u01b9\u01ba\7.\2\2"+
		"\u01ba\u01bb\7!\2\2\u01bb\u01bc\5\32\16\2\u01bc\u01bd\7\"\2\2\u01bd\u01be"+
		"\b!\1\2\u01be\u01c5\3\2\2\2\u01bf\u01c0\7\6\2\2\u01c0\u01c1\5\32\16\2"+
		"\u01c1\u01c2\7\7\2\2\u01c2\u01c3\b!\1\2\u01c3\u01c5\3\2\2\2\u01c4\u01a2"+
		"\3\2\2\2\u01c4\u01a4\3\2\2\2\u01c4\u01a6\3\2\2\2\u01c4\u01ac\3\2\2\2\u01c4"+
		"\u01b1\3\2\2\2\u01c4\u01b3\3\2\2\2\u01c4\u01b5\3\2\2\2\u01c4\u01b7\3\2"+
		"\2\2\u01c4\u01b9\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c5A\3\2\2\2\u01c6\u01c7"+
		"\7\t\2\2\u01c7\u01d3\b\"\1\2\u01c8\u01c9\7)\2\2\u01c9\u01d3\b\"\1\2\u01ca"+
		"\u01cb\7*\2\2\u01cb\u01d3\b\"\1\2\u01cc\u01cd\7\t\2\2\u01cd\u01ce\7!\2"+
		"\2\u01ce\u01cf\7\"\2\2\u01cf\u01d3\b\"\1\2\u01d0\u01d1\7.\2\2\u01d1\u01d3"+
		"\b\"\1\2\u01d2\u01c6\3\2\2\2\u01d2\u01c8\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2"+
		"\u01cc\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3C\3\2\2\2\37Kjs{\u0099\u009e\u00a9"+
		"\u00b9\u00cb\u00dd\u00fb\u0108\u0115\u0120\u0128\u0133\u013b\u0146\u014e"+
		"\u0159\u0161\u0168\u0170\u017c\u0193\u019a\u01a0\u01c4\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}