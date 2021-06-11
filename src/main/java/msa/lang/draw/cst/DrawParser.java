// Generated from D:/Library/Repos/DrawDSL/grammar\Draw.g4 by ANTLR 4.9.1
package msa.lang.draw.cst;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STRING_LITERAL=2, PAPER=3, PEN=4, UP=5, DOWN=6, GO=7, MOVE=8, 
		COLOR=9, REPEAT=10, TURN=11, RIGHT=12, LEFT=13, FORWARD=14, IF=15, ELSE=16, 
		DEPICT=17, WHILE=18, DOT=19, DOTDOT=20, ASSIGN=21, LCURLY=22, RCURLY=23, 
		LBRACKET=24, RBRACKET=25, COMMA=26, COLON=27, LPAR=28, RPAR=29, BOOLEAN_LITERAL=30, 
		TRUE=31, FALSE=32, OPERATOR_ADD=33, OPERATOR_SUB=34, OPERATOR_MUL=35, 
		OPERATOR_EXP=36, OPERATOR_DIV=37, OPERATOR_AND=38, OPERATOR_OR=39, OPERATOR_XOR=40, 
		OPERATOR_EQ=41, OPERATOR_NEQ=42, OPERATOR_GT=43, OPERATOR_LT=44, OPERATOR_GTEQ=45, 
		OPERATOR_LTEQ=46, OPERATOR_SCOPE=47, OPERATOR_IN=48, INTEGER=49, REAL=50, 
		COLOR_LITERAL=51, HEX=52, ID=53, COMMENT=54, LINE_COMMENT=55, WS=56;
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
			null, "'?'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'.'", "'..'", "'='", "'{'", 
			"'}'", "'['", "']'", "','", "':'", "'('", "')'", null, null, null, "'+'", 
			"'-'", "'*'", "'**'", "'/'", "'&&'", "'||'", "'^'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'::'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STRING_LITERAL", "PAPER", "PEN", "UP", "DOWN", "GO", "MOVE", 
			"COLOR", "REPEAT", "TURN", "RIGHT", "LEFT", "FORWARD", "IF", "ELSE", 
			"DEPICT", "WHILE", "DOT", "DOTDOT", "ASSIGN", "LCURLY", "RCURLY", "LBRACKET", 
			"RBRACKET", "COMMA", "COLON", "LPAR", "RPAR", "BOOLEAN_LITERAL", "TRUE", 
			"FALSE", "OPERATOR_ADD", "OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_EXP", 
			"OPERATOR_DIV", "OPERATOR_AND", "OPERATOR_OR", "OPERATOR_XOR", "OPERATOR_EQ", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAPER) | (1L << PEN) | (1L << GO) | (1L << MOVE) | (1L << REPEAT) | (1L << TURN) | (1L << FORWARD) | (1L << IF) | (1L << DEPICT) | (1L << WHILE) | (1L << LCURLY) | (1L << ID))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAPER) | (1L << PEN) | (1L << GO) | (1L << MOVE) | (1L << REPEAT) | (1L << TURN) | (1L << FORWARD) | (1L << IF) | (1L << DEPICT) | (1L << WHILE) | (1L << LCURLY) | (1L << ID))) != 0)) {
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
			setState(173);
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
			case OPERATOR_ADD:
			case OPERATOR_SUB:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
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
				setState(170);
				expression(10);
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
				setState(171);
				((NumberExpressionContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << INTEGER) | (1L << REAL) | (1L << COLOR_LITERAL) | (1L << HEX))) != 0)) ) {
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
				setState(172);
				reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_XOR);
						setState(177);
						((InfixExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_EXP);
						setState(180);
						((InfixExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_MUL || _la==OPERATOR_DIV) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						((InfixExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 4:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(185);
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
						setState(186);
						((InfixExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 5:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(188);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_EQ) | (1L << OPERATOR_NEQ) | (1L << OPERATOR_GT) | (1L << OPERATOR_LT) | (1L << OPERATOR_GTEQ) | (1L << OPERATOR_LTEQ))) != 0)) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						((InfixExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 6:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(191);
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
						setState(192);
						((InfixExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(194);
						match(T__0);
						setState(195);
						((ConditionalExpressionContext)_localctx).first = expression(0);
						setState(196);
						match(COLON);
						setState(197);
						((ConditionalExpressionContext)_localctx).second = expression(4);
						}
						break;
					}
					} 
				}
				setState(203);
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13\3\13\7\13s\n\13\f\13"+
		"\16\13v\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f\3\r\3\r\7\r\u0083"+
		"\n\r\f\r\16\r\u0086\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u00b0\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u00ca\n\26\f\26\16\26\u00cd\13\26\3\26\2\3*\27\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\b\3\2\7\b\3\2#$\4\2  \63\66\4"+
		"\2%%\'\'\3\2+\60\3\2()\2\u00d5\2/\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bI\3\2"+
		"\2\2\nN\3\2\2\2\fS\3\2\2\2\16X\3\2\2\2\20_\3\2\2\2\22j\3\2\2\2\24t\3\2"+
		"\2\2\26y\3\2\2\2\30\u0080\3\2\2\2\32\u0089\3\2\2\2\34\u008d\3\2\2\2\36"+
		"\u0092\3\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u009e\3\2\2\2&\u00a2\3"+
		"\2\2\2(\u00a4\3\2\2\2*\u00af\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/"+
		"-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2"+
		"\2\2\64C\5\6\4\2\65C\5\b\5\2\66C\5\n\6\2\67C\5\f\7\28C\5\32\16\29C\5\34"+
		"\17\2:C\5\36\20\2;C\5 \21\2<C\5\"\22\2=C\5$\23\2>C\5\26\f\2?C\5\16\b\2"+
		"@C\5\20\t\2AC\5\30\r\2B\64\3\2\2\2B\65\3\2\2\2B\66\3\2\2\2B\67\3\2\2\2"+
		"B8\3\2\2\2B9\3\2\2\2B:\3\2\2\2B;\3\2\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2"+
		"B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\5\3\2\2\2DE\7\5\2\2EF\5*\26\2FG\5*\26"+
		"\2GH\7\25\2\2H\7\3\2\2\2IJ\5(\25\2JK\7\27\2\2KL\5*\26\2LM\7\25\2\2M\t"+
		"\3\2\2\2NO\7\t\2\2OP\5*\26\2PQ\5*\26\2QR\7\25\2\2R\13\3\2\2\2ST\7\n\2"+
		"\2TU\5*\26\2UV\5*\26\2VW\7\25\2\2W\r\3\2\2\2XY\7\23\2\2YZ\5(\25\2Z[\7"+
		"\36\2\2[\\\5\22\n\2\\]\7\37\2\2]^\5\30\r\2^\17\3\2\2\2_`\5&\24\2`a\7\36"+
		"\2\2ab\5\24\13\2bc\7\37\2\2cd\7\25\2\2d\21\3\2\2\2ef\5(\25\2fg\7\34\2"+
		"\2gi\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2"+
		"\2mn\5(\25\2n\23\3\2\2\2op\5*\26\2pq\7\34\2\2qs\3\2\2\2ro\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\5*\26\2x\25\3\2\2\2y"+
		"z\7\21\2\2z{\5*\26\2{~\5\4\3\2|}\7\22\2\2}\177\5\4\3\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\27\3\2\2\2\u0080\u0084\7\30\2\2\u0081\u0083\5\4\3\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\31\2\2\u0088"+
		"\31\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008b\t\2\2\2\u008b\u008c\7\25\2"+
		"\2\u008c\33\3\2\2\2\u008d\u008e\7\6\2\2\u008e\u008f\7\13\2\2\u008f\u0090"+
		"\5*\26\2\u0090\u0091\7\25\2\2\u0091\35\3\2\2\2\u0092\u0093\7\f\2\2\u0093"+
		"\u0094\5*\26\2\u0094\u0095\5\30\r\2\u0095\37\3\2\2\2\u0096\u0097\7\24"+
		"\2\2\u0097\u0098\5*\26\2\u0098\u0099\5\30\r\2\u0099!\3\2\2\2\u009a\u009b"+
		"\7\r\2\2\u009b\u009c\5*\26\2\u009c\u009d\7\25\2\2\u009d#\3\2\2\2\u009e"+
		"\u009f\7\20\2\2\u009f\u00a0\5*\26\2\u00a0\u00a1\7\25\2\2\u00a1%\3\2\2"+
		"\2\u00a2\u00a3\7\67\2\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\67\2\2\u00a5)\3"+
		"\2\2\2\u00a6\u00a7\b\26\1\2\u00a7\u00a8\7\36\2\2\u00a8\u00a9\5*\26\2\u00a9"+
		"\u00aa\7\37\2\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac\u00b0\5"+
		"*\26\f\u00ad\u00b0\t\4\2\2\u00ae\u00b0\5&\24\2\u00af\u00a6\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00cb\3\2"+
		"\2\2\u00b1\u00b2\f\13\2\2\u00b2\u00b3\7*\2\2\u00b3\u00ca\5*\26\f\u00b4"+
		"\u00b5\f\n\2\2\u00b5\u00b6\7&\2\2\u00b6\u00ca\5*\26\13\u00b7\u00b8\f\t"+
		"\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00ca\5*\26\n\u00ba\u00bb\f\b\2\2\u00bb"+
		"\u00bc\t\3\2\2\u00bc\u00ca\5*\26\t\u00bd\u00be\f\7\2\2\u00be\u00bf\t\6"+
		"\2\2\u00bf\u00ca\5*\26\b\u00c0\u00c1\f\6\2\2\u00c1\u00c2\t\7\2\2\u00c2"+
		"\u00ca\5*\26\7\u00c3\u00c4\f\5\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\5*"+
		"\26\2\u00c6\u00c7\7\35\2\2\u00c7\u00c8\5*\26\6\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00b1\3\2\2\2\u00c9\u00b4\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00ba\3\2"+
		"\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc+\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\13/Bjt~\u0084\u00af\u00c9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}