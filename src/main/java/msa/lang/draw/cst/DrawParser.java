// Generated from Draw.g4 by ANTLR 4.13.2
package msa.lang.draw.cst;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, STRING_LITERAL=19, PAPER=20, PEN=21, UP=22, DOWN=23, GO=24, 
		MOVE=25, COLOR=26, REPEAT=27, TURN=28, RIGHT=29, LEFT=30, FORWARD=31, 
		IF=32, ELSE=33, DEPICT=34, WHILE=35, DOT=36, DOTDOT=37, ASSIGN=38, LCURLY=39, 
		RCURLY=40, LBRACKET=41, RBRACKET=42, COMMA=43, COLON=44, LPAR=45, RPAR=46, 
		BOOLEAN_LITERAL=47, TRUE=48, FALSE=49, OPERATOR_ADD=50, OPERATOR_SUB=51, 
		OPERATOR_MUL=52, OPERATOR_EXP=53, OPERATOR_DIV=54, OPERATOR_MOD=55, OPERATOR_AND=56, 
		OPERATOR_BITWISE_AND=57, OPERATOR_OR=58, OPERATOR_XOR=59, OPERATOR_EQ=60, 
		OPERATOR_NEQ=61, OPERATOR_GT=62, OPERATOR_LT=63, OPERATOR_GTEQ=64, OPERATOR_LTEQ=65, 
		OPERATOR_SCOPE=66, OPERATOR_IN=67, INTEGER=68, REAL=69, COLOR_LITERAL=70, 
		HEX=71, ID=72, COMMENT=73, LINE_COMMENT=74, WS=75;
	public static final int
		RULE_compilationUnit = 0, RULE_statement = 1, RULE_paperDeclaration = 2, 
		RULE_assignment = 3, RULE_goToStatement = 4, RULE_moveStatement = 5, RULE_depictDeclaration = 6, 
		RULE_depictCall = 7, RULE_parameterList = 8, RULE_actualParameterList = 9, 
		RULE_ifStatement = 10, RULE_statementBlock = 11, RULE_penStateStatement = 12, 
		RULE_penColorStatement = 13, RULE_repeatStatement = 14, RULE_whileStatement = 15, 
		RULE_turnStatement = 16, RULE_forwardStatement = 17, RULE_reference = 18, 
		RULE_identifier = 19, RULE_expression = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "statement", "paperDeclaration", "assignment", "goToStatement", 
			"moveStatement", "depictDeclaration", "depictCall", "parameterList", 
			"actualParameterList", "ifStatement", "statementBlock", "penStateStatement", 
			"penColorStatement", "repeatStatement", "whileStatement", "turnStatement", 
			"forwardStatement", "reference", "identifier", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sin'", "'cos'", "'tan'", "'cot'", "'asin'", "'acos'", "'atan'", 
			"'sinh'", "'cosh'", "'tanh'", "'sqrt'", "'abs'", "'floor'", "'ceil'", 
			"'exp'", "'log'", "'log10'", "'?'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'.'", 
			"'..'", "'='", "'{'", "'}'", "'['", "']'", "','", "':'", "'('", "')'", 
			null, null, null, "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'&&'", 
			"'&'", "'||'", "'^'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'::'", 
			"'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING_LITERAL", "PAPER", 
			"PEN", "UP", "DOWN", "GO", "MOVE", "COLOR", "REPEAT", "TURN", "RIGHT", 
			"LEFT", "FORWARD", "IF", "ELSE", "DEPICT", "WHILE", "DOT", "DOTDOT", 
			"ASSIGN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "COMMA", "COLON", 
			"LPAR", "RPAR", "BOOLEAN_LITERAL", "TRUE", "FALSE", "OPERATOR_ADD", "OPERATOR_SUB", 
			"OPERATOR_MUL", "OPERATOR_EXP", "OPERATOR_DIV", "OPERATOR_MOD", "OPERATOR_AND", 
			"OPERATOR_BITWISE_AND", "OPERATOR_OR", "OPERATOR_XOR", "OPERATOR_EQ", 
			"OPERATOR_NEQ", "OPERATOR_GT", "OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", 
			"OPERATOR_SCOPE", "OPERATOR_IN", "INTEGER", "REAL", "COLOR_LITERAL", 
			"HEX", "ID", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Draw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DrawParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 4503599627950515L) != 0)) {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public PaperDeclarationContext paperDeclaration() {
			return getRuleContext(PaperDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public GoToStatementContext goToStatement() {
			return getRuleContext(GoToStatementContext.class,0);
		}
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public PenStateStatementContext penStateStatement() {
			return getRuleContext(PenStateStatementContext.class,0);
		}
		public PenColorStatementContext penColorStatement() {
			return getRuleContext(PenColorStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TurnStatementContext turnStatement() {
			return getRuleContext(TurnStatementContext.class,0);
		}
		public ForwardStatementContext forwardStatement() {
			return getRuleContext(ForwardStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DepictDeclarationContext depictDeclaration() {
			return getRuleContext(DepictDeclarationContext.class,0);
		}
		public DepictCallContext depictCall() {
			return getRuleContext(DepictCallContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				paperDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				goToStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				moveStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				penStateStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				penColorStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				repeatStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				whileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				turnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				forwardStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(60);
				ifStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61);
				depictDeclaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(62);
				depictCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(63);
				statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PaperDeclarationContext extends ParserRuleContext {
		public ExpressionContext width;
		public ExpressionContext height;
		public TerminalNode PAPER() { return getToken(DrawParser.PAPER, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PaperDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paperDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPaperDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPaperDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPaperDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaperDeclarationContext paperDeclaration() throws RecognitionException {
		PaperDeclarationContext _localctx = new PaperDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paperDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PAPER);
			setState(67);
			((PaperDeclarationContext)_localctx).width = expression(0);
			setState(68);
			((PaperDeclarationContext)_localctx).height = expression(0);
			setState(69);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DrawParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			identifier();
			setState(72);
			match(ASSIGN);
			setState(73);
			expression(0);
			setState(74);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GoToStatementContext extends ParserRuleContext {
		public ExpressionContext x;
		public ExpressionContext y;
		public TerminalNode GO() { return getToken(DrawParser.GO, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GoToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterGoToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitGoToStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitGoToStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoToStatementContext goToStatement() throws RecognitionException {
		GoToStatementContext _localctx = new GoToStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_goToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(GO);
			setState(77);
			((GoToStatementContext)_localctx).x = expression(0);
			setState(78);
			((GoToStatementContext)_localctx).y = expression(0);
			setState(79);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveStatementContext extends ParserRuleContext {
		public ExpressionContext dx;
		public ExpressionContext dy;
		public TerminalNode MOVE() { return getToken(DrawParser.MOVE, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterMoveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitMoveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitMoveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveStatementContext moveStatement() throws RecognitionException {
		MoveStatementContext _localctx = new MoveStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MOVE);
			setState(82);
			((MoveStatementContext)_localctx).dx = expression(0);
			setState(83);
			((MoveStatementContext)_localctx).dy = expression(0);
			setState(84);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DepictDeclarationContext extends ParserRuleContext {
		public TerminalNode DEPICT() { return getToken(DrawParser.DEPICT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(DrawParser.LPAR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(DrawParser.RPAR, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public DepictDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depictDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterDepictDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitDepictDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitDepictDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepictDeclarationContext depictDeclaration() throws RecognitionException {
		DepictDeclarationContext _localctx = new DepictDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_depictDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(DEPICT);
			setState(87);
			identifier();
			setState(88);
			match(LPAR);
			setState(89);
			parameterList();
			setState(90);
			match(RPAR);
			setState(91);
			statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DepictCallContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(DrawParser.LPAR, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(DrawParser.RPAR, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public DepictCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depictCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterDepictCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitDepictCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitDepictCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepictCallContext depictCall() throws RecognitionException {
		DepictCallContext _localctx = new DepictCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_depictCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			reference();
			setState(94);
			match(LPAR);
			setState(95);
			actualParameterList();
			setState(96);
			match(RPAR);
			setState(97);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DrawParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DrawParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					identifier();
					setState(100);
					match(COMMA);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(107);
			identifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActualParameterListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DrawParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DrawParser.COMMA, i);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitActualParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitActualParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actualParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					expression(0);
					setState(110);
					match(COMMA);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(117);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext primary;
		public StatementContext secondary;
		public TerminalNode IF() { return getToken(DrawParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DrawParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(120);
			expression(0);
			setState(121);
			((IfStatementContext)_localctx).primary = statement();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(122);
				match(ELSE);
				setState(123);
				((IfStatementContext)_localctx).secondary = statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DrawParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DrawParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LCURLY);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 4503599627950515L) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PenStateStatementContext extends ParserRuleContext {
		public Token state;
		public TerminalNode PEN() { return getToken(DrawParser.PEN, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public TerminalNode UP() { return getToken(DrawParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(DrawParser.DOWN, 0); }
		public PenStateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penStateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPenStateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPenStateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPenStateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenStateStatementContext penStateStatement() throws RecognitionException {
		PenStateStatementContext _localctx = new PenStateStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_penStateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PEN);
			setState(136);
			((PenStateStatementContext)_localctx).state = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UP || _la==DOWN) ) {
				((PenStateStatementContext)_localctx).state = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PenColorStatementContext extends ParserRuleContext {
		public ExpressionContext color;
		public TerminalNode PEN() { return getToken(DrawParser.PEN, 0); }
		public TerminalNode COLOR() { return getToken(DrawParser.COLOR, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PenColorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penColorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterPenColorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitPenColorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitPenColorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenColorStatementContext penColorStatement() throws RecognitionException {
		PenColorStatementContext _localctx = new PenColorStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_penColorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(PEN);
			setState(140);
			match(COLOR);
			setState(141);
			((PenColorStatementContext)_localctx).color = expression(0);
			setState(142);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends ParserRuleContext {
		public ExpressionContext times;
		public TerminalNode REPEAT() { return getToken(DrawParser.REPEAT, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(REPEAT);
			setState(145);
			((RepeatStatementContext)_localctx).times = expression(0);
			setState(146);
			statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DrawParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHILE);
			setState(149);
			expression(0);
			setState(150);
			statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TurnStatementContext extends ParserRuleContext {
		public TerminalNode TURN() { return getToken(DrawParser.TURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public TurnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterTurnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitTurnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitTurnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnStatementContext turnStatement() throws RecognitionException {
		TurnStatementContext _localctx = new TurnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_turnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(TURN);
			setState(153);
			expression(0);
			setState(154);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForwardStatementContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(DrawParser.FORWARD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public ForwardStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterForwardStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitForwardStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitForwardStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForwardStatementContext forwardStatement() throws RecognitionException {
		ForwardStatementContext _localctx = new ForwardStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forwardStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(FORWARD);
			setState(157);
			expression(0);
			setState(158);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawParser.ID, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceExpressionContext extends ExpressionContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfixExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operation;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR_XOR() { return getToken(DrawParser.OPERATOR_XOR, 0); }
		public TerminalNode OPERATOR_EXP() { return getToken(DrawParser.OPERATOR_EXP, 0); }
		public TerminalNode OPERATOR_MUL() { return getToken(DrawParser.OPERATOR_MUL, 0); }
		public TerminalNode OPERATOR_DIV() { return getToken(DrawParser.OPERATOR_DIV, 0); }
		public TerminalNode OPERATOR_MOD() { return getToken(DrawParser.OPERATOR_MOD, 0); }
		public TerminalNode OPERATOR_ADD() { return getToken(DrawParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUB() { return getToken(DrawParser.OPERATOR_SUB, 0); }
		public TerminalNode OPERATOR_EQ() { return getToken(DrawParser.OPERATOR_EQ, 0); }
		public TerminalNode OPERATOR_NEQ() { return getToken(DrawParser.OPERATOR_NEQ, 0); }
		public TerminalNode OPERATOR_GT() { return getToken(DrawParser.OPERATOR_GT, 0); }
		public TerminalNode OPERATOR_LT() { return getToken(DrawParser.OPERATOR_LT, 0); }
		public TerminalNode OPERATOR_GTEQ() { return getToken(DrawParser.OPERATOR_GTEQ, 0); }
		public TerminalNode OPERATOR_LTEQ() { return getToken(DrawParser.OPERATOR_LTEQ, 0); }
		public TerminalNode OPERATOR_AND() { return getToken(DrawParser.OPERATOR_AND, 0); }
		public TerminalNode OPERATOR_OR() { return getToken(DrawParser.OPERATOR_OR, 0); }
		public TerminalNode OPERATOR_BITWISE_AND() { return getToken(DrawParser.OPERATOR_BITWISE_AND, 0); }
		public InfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterInfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitInfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathFunctionCallExpressionContext extends ExpressionContext {
		public Token function;
		public TerminalNode LPAR() { return getToken(DrawParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(DrawParser.RPAR, 0); }
		public MathFunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterMathFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitMathFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitMathFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExpressionContext {
		public Token value;
		public TerminalNode INTEGER() { return getToken(DrawParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(DrawParser.REAL, 0); }
		public TerminalNode HEX() { return getToken(DrawParser.HEX, 0); }
		public TerminalNode COLOR_LITERAL() { return getToken(DrawParser.COLOR_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(DrawParser.BOOLEAN_LITERAL, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext check;
		public ExpressionContext first;
		public ExpressionContext second;
		public TerminalNode COLON() { return getToken(DrawParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public TerminalNode LPAR() { return getToken(DrawParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(DrawParser.RPAR, 0); }
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token operation;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPERATOR_ADD() { return getToken(DrawParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUB() { return getToken(DrawParser.OPERATOR_SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165);
				match(LPAR);
				setState(166);
				expression(0);
				setState(167);
				match(RPAR);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				{
				_localctx = new MathFunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				((MathFunctionCallExpressionContext)_localctx).function = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 262142L) != 0)) ) {
					((MathFunctionCallExpressionContext)_localctx).function = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				match(LPAR);
				setState(171);
				expression(0);
				setState(172);
				match(RPAR);
				}
				break;
			case OPERATOR_ADD:
			case OPERATOR_SUB:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				((UnaryExpressionContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPERATOR_ADD || _la==OPERATOR_SUB) ) {
					((UnaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				expression(11);
				}
				break;
			case BOOLEAN_LITERAL:
			case INTEGER:
			case REAL:
			case COLOR_LITERAL:
			case HEX:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				((NumberExpressionContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 31457281L) != 0)) ) {
					((NumberExpressionContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(181);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_XOR);
						setState(182);
						((InfixExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_EXP);
						setState(185);
						((InfixExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58546795155816448L) != 0)) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						((InfixExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_ADD || _la==OPERATOR_SUB) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(191);
						((InfixExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(193);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 63L) != 0)) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						((InfixExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 6:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(196);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_AND || _la==OPERATOR_OR) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						((InfixExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 7:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_BITWISE_AND);
						setState(200);
						((InfixExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 8:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(202);
						match(T__17);
						setState(203);
						((ConditionalExpressionContext)_localctx).first = expression(0);
						setState(204);
						match(COLON);
						setState(205);
						((ConditionalExpressionContext)_localctx).second = expression(4);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001K\u00d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\bg\b\b\n\b\f\bj\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\tq\b\t\n\t\f\tt\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n}\b\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0081\b\u000b\n\u000b\f\u000b\u0084\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b3\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d0\b\u0014\n\u0014"+
		"\f\u0014\u00d3\t\u0014\u0001\u0014\u0000\u0001(\u0015\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(\u0000\u0007\u0001\u0000\u0016\u0017\u0001\u0000\u0001\u0011\u0001"+
		"\u000023\u0002\u0000//DG\u0002\u00004467\u0001\u0000<A\u0002\u000088:"+
		":\u00dd\u0000-\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000"+
		"\u0004B\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000"+
		"\u000e]\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000\u0012r"+
		"\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016~\u0001\u0000"+
		"\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008b\u0001\u0000"+
		"\u0000\u0000\u001c\u0090\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000"+
		"\u0000\u0000 \u0098\u0001\u0000\u0000\u0000\"\u009c\u0001\u0000\u0000"+
		"\u0000$\u00a0\u0001\u0000\u0000\u0000&\u00a2\u0001\u0000\u0000\u0000("+
		"\u00b2\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"01\u0005\u0000\u0000\u00011\u0001\u0001\u0000\u0000\u00002A\u0003\u0004"+
		"\u0002\u00003A\u0003\u0006\u0003\u00004A\u0003\b\u0004\u00005A\u0003\n"+
		"\u0005\u00006A\u0003\u0018\f\u00007A\u0003\u001a\r\u00008A\u0003\u001c"+
		"\u000e\u00009A\u0003\u001e\u000f\u0000:A\u0003 \u0010\u0000;A\u0003\""+
		"\u0011\u0000<A\u0003\u0014\n\u0000=A\u0003\f\u0006\u0000>A\u0003\u000e"+
		"\u0007\u0000?A\u0003\u0016\u000b\u0000@2\u0001\u0000\u0000\u0000@3\u0001"+
		"\u0000\u0000\u0000@4\u0001\u0000\u0000\u0000@5\u0001\u0000\u0000\u0000"+
		"@6\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000@8\u0001\u0000\u0000"+
		"\u0000@9\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000"+
		"\u0000BC\u0005\u0014\u0000\u0000CD\u0003(\u0014\u0000DE\u0003(\u0014\u0000"+
		"EF\u0005$\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0003&\u0013\u0000"+
		"HI\u0005&\u0000\u0000IJ\u0003(\u0014\u0000JK\u0005$\u0000\u0000K\u0007"+
		"\u0001\u0000\u0000\u0000LM\u0005\u0018\u0000\u0000MN\u0003(\u0014\u0000"+
		"NO\u0003(\u0014\u0000OP\u0005$\u0000\u0000P\t\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0019\u0000\u0000RS\u0003(\u0014\u0000ST\u0003(\u0014\u0000T"+
		"U\u0005$\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0005\"\u0000\u0000"+
		"WX\u0003&\u0013\u0000XY\u0005-\u0000\u0000YZ\u0003\u0010\b\u0000Z[\u0005"+
		".\u0000\u0000[\\\u0003\u0016\u000b\u0000\\\r\u0001\u0000\u0000\u0000]"+
		"^\u0003$\u0012\u0000^_\u0005-\u0000\u0000_`\u0003\u0012\t\u0000`a\u0005"+
		".\u0000\u0000ab\u0005$\u0000\u0000b\u000f\u0001\u0000\u0000\u0000cd\u0003"+
		"&\u0013\u0000de\u0005+\u0000\u0000eg\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"kl\u0003&\u0013\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0003(\u0014\u0000"+
		"no\u0005+\u0000\u0000oq\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0003(\u0014"+
		"\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005 \u0000\u0000xy\u0003(\u0014"+
		"\u0000y|\u0003\u0002\u0001\u0000z{\u0005!\u0000\u0000{}\u0003\u0002\u0001"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0015\u0001"+
		"\u0000\u0000\u0000~\u0082\u0005\'\u0000\u0000\u007f\u0081\u0003\u0002"+
		"\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086\u0017\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\u0015\u0000\u0000\u0088\u0089\u0007\u0000\u0000"+
		"\u0000\u0089\u008a\u0005$\u0000\u0000\u008a\u0019\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0005\u0015\u0000\u0000\u008c\u008d\u0005\u001a\u0000\u0000"+
		"\u008d\u008e\u0003(\u0014\u0000\u008e\u008f\u0005$\u0000\u0000\u008f\u001b"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0092"+
		"\u0003(\u0014\u0000\u0092\u0093\u0003\u0016\u000b\u0000\u0093\u001d\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005#\u0000\u0000\u0095\u0096\u0003(\u0014"+
		"\u0000\u0096\u0097\u0003\u0016\u000b\u0000\u0097\u001f\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0005\u001c\u0000\u0000\u0099\u009a\u0003(\u0014\u0000"+
		"\u009a\u009b\u0005$\u0000\u0000\u009b!\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u001f\u0000\u0000\u009d\u009e\u0003(\u0014\u0000\u009e\u009f\u0005"+
		"$\u0000\u0000\u009f#\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005H\u0000"+
		"\u0000\u00a1%\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005H\u0000\u0000\u00a3"+
		"\'\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\u0014\uffff\uffff\u0000\u00a5"+
		"\u00a6\u0005-\u0000\u0000\u00a6\u00a7\u0003(\u0014\u0000\u00a7\u00a8\u0005"+
		".\u0000\u0000\u00a8\u00b3\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0001"+
		"\u0000\u0000\u00aa\u00ab\u0005-\u0000\u0000\u00ab\u00ac\u0003(\u0014\u0000"+
		"\u00ac\u00ad\u0005.\u0000\u0000\u00ad\u00b3\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0007\u0002\u0000\u0000\u00af\u00b3\u0003(\u0014\u000b\u00b0\u00b3"+
		"\u0007\u0003\u0000\u0000\u00b1\u00b3\u0003$\u0012\u0000\u00b2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00d1\u0001\u0000\u0000\u0000\u00b4\u00b5\n\n"+
		"\u0000\u0000\u00b5\u00b6\u0005;\u0000\u0000\u00b6\u00d0\u0003(\u0014\u000b"+
		"\u00b7\u00b8\n\t\u0000\u0000\u00b8\u00b9\u00055\u0000\u0000\u00b9\u00d0"+
		"\u0003(\u0014\n\u00ba\u00bb\n\b\u0000\u0000\u00bb\u00bc\u0007\u0004\u0000"+
		"\u0000\u00bc\u00d0\u0003(\u0014\t\u00bd\u00be\n\u0007\u0000\u0000\u00be"+
		"\u00bf\u0007\u0002\u0000\u0000\u00bf\u00d0\u0003(\u0014\b\u00c0\u00c1"+
		"\n\u0006\u0000\u0000\u00c1\u00c2\u0007\u0005\u0000\u0000\u00c2\u00d0\u0003"+
		"(\u0014\u0007\u00c3\u00c4\n\u0005\u0000\u0000\u00c4\u00c5\u0007\u0006"+
		"\u0000\u0000\u00c5\u00d0\u0003(\u0014\u0006\u00c6\u00c7\n\u0004\u0000"+
		"\u0000\u00c7\u00c8\u00059\u0000\u0000\u00c8\u00d0\u0003(\u0014\u0005\u00c9"+
		"\u00ca\n\u0003\u0000\u0000\u00ca\u00cb\u0005\u0012\u0000\u0000\u00cb\u00cc"+
		"\u0003(\u0014\u0000\u00cc\u00cd\u0005,\u0000\u0000\u00cd\u00ce\u0003("+
		"\u0014\u0004\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00b4\u0001\u0000"+
		"\u0000\u0000\u00cf\u00b7\u0001\u0000\u0000\u0000\u00cf\u00ba\u0001\u0000"+
		"\u0000\u0000\u00cf\u00bd\u0001\u0000\u0000\u0000\u00cf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c3\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2)\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\t-@hr|\u0082\u00b2\u00cf\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}