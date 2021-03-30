// Generated from D:/Library/Repos/DrawDSL/grammar\Draw.g4 by ANTLR 4.9.1
package msa.lang.draw.cst;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "STRING_LITERAL", "ESC", "PAPER", "PEN", "UP", "DOWN", 
			"LET", "GO", "TO", "MOVE", "COLOR", "REPEAT", "TURN", "RIGHT", "LEFT", 
			"FORWARD", "DOT", "DOTDOT", "ASSIGN", "LCURLY", "RCURLY", "LBRACKET", 
			"RBRACKET", "COMMA", "COLON", "BOOLEAN_LITERAL", "TRUE", "FALSE", "OPERATOR_ADD", 
			"OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_EXP", "OPERATOR_DIV", "OPERATOR_AND", 
			"OPERATOR_OR", "OPERATOR_XOR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "OPERATOR_SCOPE", "OPERATOR_IN", 
			"INTEGER", "REAL", "COLOR_LITERAL", "HEX", "ID", "COMMENT", "LINE_COMMENT", 
			"WS"
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


	public DrawLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Draw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4w\n"+
		"\4\f\4\16\4z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u00df"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00e9\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f5\n\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\6\60\u0121\n\60\r\60"+
		"\16\60\u0122\3\61\6\61\u0126\n\61\r\61\16\61\u0127\3\61\3\61\6\61\u012c"+
		"\n\61\r\61\16\61\u012d\5\61\u0130\n\61\3\61\3\61\5\61\u0134\n\61\3\61"+
		"\6\61\u0137\n\61\r\61\16\61\u0138\5\61\u013b\n\61\3\62\3\62\6\62\u013f"+
		"\n\62\r\62\16\62\u0140\3\63\3\63\3\63\3\63\6\63\u0147\n\63\r\63\16\63"+
		"\u0148\3\64\6\64\u014c\n\64\r\64\16\64\u014d\3\65\3\65\3\65\3\65\7\65"+
		"\u0154\n\65\f\65\16\65\u0157\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\7\66\u0162\n\66\f\66\16\66\u0165\13\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\u0155\28\3\3\5\4\7\5\t\2\13\6\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67\3\2\33\6\2\f\f\17\17$$^^\4\2RRrr\4\2CCcc\4\2GGgg"+
		"\4\2TTtt\4\2PPpp\4\2WWww\4\2FFff\4\2QQqq\4\2YYyy\4\2NNnn\4\2VVvv\4\2I"+
		"Iii\4\2OOoo\4\2XXxx\4\2EEee\4\2KKkk\4\2JJjj\4\2HHhh\3\2\62;\4\2--//\6"+
		"\2\62;CHaach\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u017c\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5"+
		"q\3\2\2\2\7s\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0089\3\2\2\2"+
		"\17\u008d\3\2\2\2\21\u0090\3\2\2\2\23\u0095\3\2\2\2\25\u0099\3\2\2\2\27"+
		"\u009c\3\2\2\2\31\u009f\3\2\2\2\33\u00a4\3\2\2\2\35\u00aa\3\2\2\2\37\u00b1"+
		"\3\2\2\2!\u00b6\3\2\2\2#\u00bc\3\2\2\2%\u00c1\3\2\2\2\'\u00c9\3\2\2\2"+
		")\u00cb\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2/\u00d2\3\2\2\2\61\u00d4"+
		"\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67\u00da\3\2\2\29\u00de\3\2"+
		"\2\2;\u00e8\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa"+
		"\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2I\u0101\3\2\2\2K\u0104\3\2\2\2M"+
		"\u0107\3\2\2\2O\u0109\3\2\2\2Q\u010c\3\2\2\2S\u010f\3\2\2\2U\u0111\3\2"+
		"\2\2W\u0113\3\2\2\2Y\u0116\3\2\2\2[\u0119\3\2\2\2]\u011c\3\2\2\2_\u0120"+
		"\3\2\2\2a\u0125\3\2\2\2c\u013c\3\2\2\2e\u0142\3\2\2\2g\u014b\3\2\2\2i"+
		"\u014f\3\2\2\2k\u015d\3\2\2\2m\u0168\3\2\2\2op\7*\2\2p\4\3\2\2\2qr\7+"+
		"\2\2r\6\3\2\2\2sx\7$\2\2tw\5\t\5\2uw\n\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|\b\3\2\2\2}~\7^"+
		"\2\2~\u0082\7$\2\2\177\u0080\7^\2\2\u0080\u0082\7^\2\2\u0081}\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\n\3\2\2\2\u0083\u0084\t\3\2\2\u0084\u0085\t\4"+
		"\2\2\u0085\u0086\t\3\2\2\u0086\u0087\t\5\2\2\u0087\u0088\t\6\2\2\u0088"+
		"\f\3\2\2\2\u0089\u008a\t\3\2\2\u008a\u008b\t\5\2\2\u008b\u008c\t\7\2\2"+
		"\u008c\16\3\2\2\2\u008d\u008e\t\b\2\2\u008e\u008f\t\3\2\2\u008f\20\3\2"+
		"\2\2\u0090\u0091\t\t\2\2\u0091\u0092\t\n\2\2\u0092\u0093\t\13\2\2\u0093"+
		"\u0094\t\7\2\2\u0094\22\3\2\2\2\u0095\u0096\t\f\2\2\u0096\u0097\t\5\2"+
		"\2\u0097\u0098\t\r\2\2\u0098\24\3\2\2\2\u0099\u009a\t\16\2\2\u009a\u009b"+
		"\t\n\2\2\u009b\26\3\2\2\2\u009c\u009d\t\r\2\2\u009d\u009e\t\n\2\2\u009e"+
		"\30\3\2\2\2\u009f\u00a0\t\17\2\2\u00a0\u00a1\t\n\2\2\u00a1\u00a2\t\20"+
		"\2\2\u00a2\u00a3\t\5\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\t\21\2\2\u00a5\u00a6"+
		"\t\n\2\2\u00a6\u00a7\t\f\2\2\u00a7\u00a8\t\n\2\2\u00a8\u00a9\t\6\2\2\u00a9"+
		"\34\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\t\3\2"+
		"\2\u00ad\u00ae\t\5\2\2\u00ae\u00af\t\4\2\2\u00af\u00b0\t\r\2\2\u00b0\36"+
		"\3\2\2\2\u00b1\u00b2\t\r\2\2\u00b2\u00b3\t\b\2\2\u00b3\u00b4\t\6\2\2\u00b4"+
		"\u00b5\t\7\2\2\u00b5 \3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7\u00b8\t\22\2\2"+
		"\u00b8\u00b9\t\16\2\2\u00b9\u00ba\t\23\2\2\u00ba\u00bb\t\r\2\2\u00bb\""+
		"\3\2\2\2\u00bc\u00bd\t\f\2\2\u00bd\u00be\t\5\2\2\u00be\u00bf\t\24\2\2"+
		"\u00bf\u00c0\t\r\2\2\u00c0$\3\2\2\2\u00c1\u00c2\t\24\2\2\u00c2\u00c3\t"+
		"\n\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00c5\t\13\2\2\u00c5\u00c6\t\4\2\2\u00c6"+
		"\u00c7\t\6\2\2\u00c7\u00c8\t\t\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7\60\2\2"+
		"\u00ca(\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00cd\7\60\2\2\u00cd*\3\2\2"+
		"\2\u00ce\u00cf\7?\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7}\2\2\u00d1.\3\2\2\2"+
		"\u00d2\u00d3\7\177\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7]\2\2\u00d5\62\3"+
		"\2\2\2\u00d6\u00d7\7_\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\66"+
		"\3\2\2\2\u00da\u00db\7<\2\2\u00db8\3\2\2\2\u00dc\u00df\5;\36\2\u00dd\u00df"+
		"\5=\37\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df:\3\2\2\2\u00e0"+
		"\u00e1\7V\2\2\u00e1\u00e2\7T\2\2\u00e2\u00e3\7W\2\2\u00e3\u00e9\7G\2\2"+
		"\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e9"+
		"\7g\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9<\3\2\2\2\u00ea\u00eb"+
		"\7H\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee\7U\2\2\u00ee"+
		"\u00f5\7G\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2"+
		"\u00f2\u00f3\7u\2\2\u00f3\u00f5\7g\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00ef"+
		"\3\2\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7@\3\2\2\2\u00f8\u00f9"+
		"\7/\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7,\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7"+
		",\2\2\u00fd\u00fe\7,\2\2\u00feF\3\2\2\2\u00ff\u0100\7\61\2\2\u0100H\3"+
		"\2\2\2\u0101\u0102\7(\2\2\u0102\u0103\7(\2\2\u0103J\3\2\2\2\u0104\u0105"+
		"\7~\2\2\u0105\u0106\7~\2\2\u0106L\3\2\2\2\u0107\u0108\7`\2\2\u0108N\3"+
		"\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\7?\2\2\u010bP\3\2\2\2\u010c\u010d"+
		"\7#\2\2\u010d\u010e\7?\2\2\u010eR\3\2\2\2\u010f\u0110\7@\2\2\u0110T\3"+
		"\2\2\2\u0111\u0112\7>\2\2\u0112V\3\2\2\2\u0113\u0114\7@\2\2\u0114\u0115"+
		"\7?\2\2\u0115X\3\2\2\2\u0116\u0117\7>\2\2\u0117\u0118\7?\2\2\u0118Z\3"+
		"\2\2\2\u0119\u011a\7<\2\2\u011a\u011b\7<\2\2\u011b\\\3\2\2\2\u011c\u011d"+
		"\7>\2\2\u011d\u011e\7>\2\2\u011e^\3\2\2\2\u011f\u0121\t\25\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"`\3\2\2\2\u0124\u0126\t\25\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012f\3\2\2\2\u0129\u012b"+
		"\7\60\2\2\u012a\u012c\t\25\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0129"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u013a\3\2\2\2\u0131\u0133\t\5\2\2\u0132"+
		"\u0134\t\26\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3"+
		"\2\2\2\u0135\u0137\t\25\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0131\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013bb\3\2\2\2\u013c\u013e\7e\2\2\u013d\u013f"+
		"\t\27\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141d\3\2\2\2\u0142\u0143\7\62\2\2\u0143\u0144\7"+
		"z\2\2\u0144\u0146\3\2\2\2\u0145\u0147\t\27\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149f\3\2\2\2"+
		"\u014a\u014c\t\30\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014eh\3\2\2\2\u014f\u0150\7\61\2\2\u0150"+
		"\u0151\7,\2\2\u0151\u0155\3\2\2\2\u0152\u0154\13\2\2\2\u0153\u0152\3\2"+
		"\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7,\2\2\u0159\u015a\7\61"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\65\2\2\u015cj\3\2\2\2\u015d\u015e"+
		"\7\61\2\2\u015e\u015f\7\61\2\2\u015f\u0163\3\2\2\2\u0160\u0162\n\31\2"+
		"\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\b\66\2\2"+
		"\u0167l\3\2\2\2\u0168\u0169\t\32\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b"+
		"\67\3\2\u016bn\3\2\2\2\25\2vx\u0081\u00de\u00e8\u00f4\u0122\u0127\u012d"+
		"\u012f\u0133\u0138\u013a\u0140\u0148\u014d\u0155\u0163\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}