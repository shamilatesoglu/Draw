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
		T__0=1, T__1=2, STRING_LITERAL=3, PAPER=4, PEN=5, UP=6, DOWN=7, LET=8, 
		GO=9, TO=10, MOVE=11, COLOR=12, REPEAT=13, TURN=14, RIGHT=15, LEFT=16, 
		FORWARD=17, DOT=18, DOTDOT=19, ASSIGN=20, LCURLY=21, RCURLY=22, LBRACKET=23, 
		RBRACKET=24, COMMA=25, COLON=26, BOOLEAN_LITERAL=27, TRUE=28, FALSE=29, 
		OPERATOR_ADD=30, OPERATOR_SUB=31, OPERATOR_MUL=32, OPERATOR_EXP=33, OPERATOR_DIV=34, 
		OPERATOR_AND=35, OPERATOR_OR=36, OPERATOR_XOR=37, OPERATOR_EQ=38, OPERATOR_NEQ=39, 
		OPERATOR_GT=40, OPERATOR_LT=41, OPERATOR_GTEQ=42, OPERATOR_LTEQ=43, OPERATOR_SCOPE=44, 
		OPERATOR_IN=45, INTEGER=46, REAL=47, COLOR_LITERAL=48, HEX=49, ID=50, 
		COMMENT=51, LINE_COMMENT=52, WS=53;
	public static final int
		RULE_compilationUnit = 0, RULE_statement = 1, RULE_paperDeclaration = 2, 
		RULE_variableDefinition = 3, RULE_assignment = 4, RULE_goToStatement = 5, 
		RULE_moveStatement = 6, RULE_penStateStatement = 7, RULE_penColorStatement = 8, 
		RULE_repeatStatement = 9, RULE_turnStatement = 10, RULE_forwardStatement = 11, 
		RULE_reference = 12, RULE_expression = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "statement", "paperDeclaration", "variableDefinition", 
			"assignment", "goToStatement", "moveStatement", "penStateStatement", 
			"penColorStatement", "repeatStatement", "turnStatement", "forwardStatement", 
			"reference", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'.'", "'..'", "'='", "'{'", "'}'", 
			"'['", "']'", "','", "':'", null, null, null, "'+'", "'-'", "'*'", "'**'", 
			"'/'", "'&&'", "'||'", "'^'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'::'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "STRING_LITERAL", "PAPER", "PEN", "UP", "DOWN", "LET", 
			"GO", "TO", "MOVE", "COLOR", "REPEAT", "TURN", "RIGHT", "LEFT", "FORWARD", 
			"DOT", "DOTDOT", "ASSIGN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", 
			"COMMA", "COLON", "BOOLEAN_LITERAL", "TRUE", "FALSE", "OPERATOR_ADD", 
			"OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_EXP", "OPERATOR_DIV", "OPERATOR_AND", 
			"OPERATOR_OR", "OPERATOR_XOR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "OPERATOR_SCOPE", "OPERATOR_IN", 
			"INTEGER", "REAL", "COLOR_LITERAL", "HEX", "ID", "COMMENT", "LINE_COMMENT", 
			"WS"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAPER) | (1L << PEN) | (1L << LET) | (1L << GO) | (1L << MOVE) | (1L << REPEAT) | (1L << TURN) | (1L << FORWARD) | (1L << ID))) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
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
		public TurnStatementContext turnStatement() {
			return getRuleContext(TurnStatementContext.class,0);
		}
		public ForwardStatementContext forwardStatement() {
			return getRuleContext(ForwardStatementContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				paperDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				variableDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				goToStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				moveStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				penStateStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				penColorStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				repeatStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(44);
				turnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(45);
				forwardStatement();
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
			setState(48);
			match(PAPER);
			setState(49);
			((PaperDeclarationContext)_localctx).width = expression(0);
			setState(50);
			((PaperDeclarationContext)_localctx).height = expression(0);
			setState(51);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode LET() { return getToken(DrawParser.LET, 0); }
		public TerminalNode ASSIGN() { return getToken(DrawParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public TerminalNode ID() { return getToken(DrawParser.ID, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawListener ) ((DrawListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawVisitor ) return ((DrawVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LET);
			setState(54);
			((VariableDefinitionContext)_localctx).identifier = match(ID);
			setState(55);
			match(ASSIGN);
			setState(56);
			expression(0);
			setState(57);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
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
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			reference();
			setState(60);
			match(ASSIGN);
			setState(61);
			expression(0);
			setState(62);
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
		public TerminalNode TO() { return getToken(DrawParser.TO, 0); }
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
		enterRule(_localctx, 10, RULE_goToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(GO);
			setState(65);
			match(TO);
			setState(66);
			((GoToStatementContext)_localctx).x = expression(0);
			setState(67);
			((GoToStatementContext)_localctx).y = expression(0);
			setState(68);
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
		enterRule(_localctx, 12, RULE_moveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(MOVE);
			setState(71);
			((MoveStatementContext)_localctx).dx = expression(0);
			setState(72);
			((MoveStatementContext)_localctx).dy = expression(0);
			setState(73);
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
		enterRule(_localctx, 14, RULE_penStateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PEN);
			setState(76);
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
			setState(77);
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
		enterRule(_localctx, 16, RULE_penColorStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(PEN);
			setState(80);
			match(COLOR);
			setState(81);
			((PenColorStatementContext)_localctx).color = expression(0);
			setState(82);
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
		public TerminalNode LCURLY() { return getToken(DrawParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DrawParser.RCURLY, 0); }
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 18, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(REPEAT);
			setState(85);
			((RepeatStatementContext)_localctx).times = expression(0);
			setState(86);
			match(LCURLY);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAPER) | (1L << PEN) | (1L << LET) | (1L << GO) | (1L << MOVE) | (1L << REPEAT) | (1L << TURN) | (1L << FORWARD) | (1L << ID))) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(RCURLY);
			setState(94);
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

	public static class TurnStatementContext extends ParserRuleContext {
		public Token direction;
		public TerminalNode TURN() { return getToken(DrawParser.TURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DrawParser.DOT, 0); }
		public TerminalNode RIGHT() { return getToken(DrawParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(DrawParser.LEFT, 0); }
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
		enterRule(_localctx, 20, RULE_turnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(TURN);
			setState(97);
			((TurnStatementContext)_localctx).direction = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==RIGHT || _la==LEFT) ) {
				((TurnStatementContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(98);
			expression(0);
			setState(99);
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
		enterRule(_localctx, 22, RULE_forwardStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(FORWARD);
			setState(102);
			expression(0);
			setState(103);
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
		enterRule(_localctx, 24, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(T__0);
				setState(109);
				expression(0);
				setState(110);
				match(T__1);
				}
				break;
			case OPERATOR_ADD:
			case OPERATOR_SUB:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
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
				setState(113);
				expression(7);
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
				setState(114);
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
				setState(115);
				reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(119);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_XOR);
						setState(120);
						((InfixExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(122);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_EXP);
						setState(123);
						((InfixExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
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
						setState(126);
						((InfixExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
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
						setState(129);
						((InfixExpressionContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17w\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088\13\17\3\17\2\3\34\20\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\b\t\3\2\21\22\3\2 !\4\2\35\35\60"+
		"\63\4\2\"\"$$\2\u008d\2!\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b\67\3\2\2"+
		"\2\n=\3\2\2\2\fB\3\2\2\2\16H\3\2\2\2\20M\3\2\2\2\22Q\3\2\2\2\24V\3\2\2"+
		"\2\26b\3\2\2\2\30g\3\2\2\2\32k\3\2\2\2\34v\3\2\2\2\36 \5\4\3\2\37\36\3"+
		"\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3"+
		"%\3\3\2\2\2&\61\5\6\4\2\'\61\5\b\5\2(\61\5\n\6\2)\61\5\f\7\2*\61\5\16"+
		"\b\2+\61\5\20\t\2,\61\5\22\n\2-\61\5\24\13\2.\61\5\26\f\2/\61\5\30\r\2"+
		"\60&\3\2\2\2\60\'\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2"+
		"\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63"+
		"\7\6\2\2\63\64\5\34\17\2\64\65\5\34\17\2\65\66\7\24\2\2\66\7\3\2\2\2\67"+
		"8\7\n\2\289\7\64\2\29:\7\26\2\2:;\5\34\17\2;<\7\24\2\2<\t\3\2\2\2=>\5"+
		"\32\16\2>?\7\26\2\2?@\5\34\17\2@A\7\24\2\2A\13\3\2\2\2BC\7\13\2\2CD\7"+
		"\f\2\2DE\5\34\17\2EF\5\34\17\2FG\7\24\2\2G\r\3\2\2\2HI\7\r\2\2IJ\5\34"+
		"\17\2JK\5\34\17\2KL\7\24\2\2L\17\3\2\2\2MN\7\7\2\2NO\t\2\2\2OP\7\24\2"+
		"\2P\21\3\2\2\2QR\7\7\2\2RS\7\16\2\2ST\5\34\17\2TU\7\24\2\2U\23\3\2\2\2"+
		"VW\7\17\2\2WX\5\34\17\2X\\\7\27\2\2Y[\5\4\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\30\2\2`a\7\24\2\2a\25\3\2\2"+
		"\2bc\7\20\2\2cd\t\3\2\2de\5\34\17\2ef\7\24\2\2f\27\3\2\2\2gh\7\23\2\2"+
		"hi\5\34\17\2ij\7\24\2\2j\31\3\2\2\2kl\7\64\2\2l\33\3\2\2\2mn\b\17\1\2"+
		"no\7\3\2\2op\5\34\17\2pq\7\4\2\2qw\3\2\2\2rs\t\4\2\2sw\5\34\17\ttw\t\5"+
		"\2\2uw\5\32\16\2vm\3\2\2\2vr\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\u0086\3\2\2"+
		"\2xy\f\b\2\2yz\7\'\2\2z\u0085\5\34\17\t{|\f\7\2\2|}\7#\2\2}\u0085\5\34"+
		"\17\b~\177\f\6\2\2\177\u0080\t\6\2\2\u0080\u0085\5\34\17\7\u0081\u0082"+
		"\f\5\2\2\u0082\u0083\t\4\2\2\u0083\u0085\5\34\17\6\u0084x\3\2\2\2\u0084"+
		"{\3\2\2\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\35\3\2\2\2\u0088\u0086\3\2\2"+
		"\2\b!\60\\v\u0084\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}