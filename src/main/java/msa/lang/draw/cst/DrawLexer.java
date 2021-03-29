// Generated from D:/Library/Repos/DrawDSL/grammar\Draw.g4 by ANTLR 4.9.1
package msa.lang.draw.cst;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

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
		OPERATOR_IN=45, NUM=46, COLOR_LITERAL=47, HEX=48, ID=49, COMMENT=50, LINE_COMMENT=51, 
		WS=52;
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
			"NUM", "COLOR_LITERAL", "HEX", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
			"NUM", "COLOR_LITERAL", "HEX", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4u\n\4\f\4\16"+
		"\4x\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u00dd\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00e7\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f3\n\37\3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\6\60\u011f\n\60\r\60\16"+
		"\60\u0120\3\60\3\60\6\60\u0125\n\60\r\60\16\60\u0126\5\60\u0129\n\60\3"+
		"\60\3\60\5\60\u012d\n\60\3\60\6\60\u0130\n\60\r\60\16\60\u0131\5\60\u0134"+
		"\n\60\3\61\3\61\6\61\u0138\n\61\r\61\16\61\u0139\3\62\3\62\3\62\3\62\6"+
		"\62\u0140\n\62\r\62\16\62\u0141\3\63\6\63\u0145\n\63\r\63\16\63\u0146"+
		"\3\64\3\64\3\64\3\64\7\64\u014d\n\64\f\64\16\64\u0150\13\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u015b\n\65\f\65\16\65\u015e\13"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\u014e\2\67\3\3\5\4\7\5\t\2\13\6\r"+
		"\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)"+
		"\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66\3\2\32\6\2\f\f\17\17$$^^"+
		"\4\2RRrr\4\2CCcc\4\2GGgg\4\2TTtt\4\2PPpp\4\2WWww\4\2FFff\4\2QQqq\4\2Y"+
		"Yyy\4\2NNnn\4\2VVvv\4\2IIii\4\2OOoo\4\2XXxx\4\2EEee\4\2KKkk\4\2JJjj\4"+
		"\2HHhh\3\2\62;\4\2--//\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\2\u0174\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5"+
		"o\3\2\2\2\7q\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0087\3\2\2\2\17"+
		"\u008b\3\2\2\2\21\u008e\3\2\2\2\23\u0093\3\2\2\2\25\u0097\3\2\2\2\27\u009a"+
		"\3\2\2\2\31\u009d\3\2\2\2\33\u00a2\3\2\2\2\35\u00a8\3\2\2\2\37\u00af\3"+
		"\2\2\2!\u00b4\3\2\2\2#\u00ba\3\2\2\2%\u00bf\3\2\2\2\'\u00c7\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00cc\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61\u00d2\3\2\2\2"+
		"\63\u00d4\3\2\2\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2\29\u00dc\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f8\3\2\2\2E"+
		"\u00fa\3\2\2\2G\u00fd\3\2\2\2I\u00ff\3\2\2\2K\u0102\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0107\3\2\2\2Q\u010a\3\2\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u0117\3\2\2\2]\u011a\3\2\2\2_\u011e\3\2\2\2a"+
		"\u0135\3\2\2\2c\u013b\3\2\2\2e\u0144\3\2\2\2g\u0148\3\2\2\2i\u0156\3\2"+
		"\2\2k\u0161\3\2\2\2mn\7*\2\2n\4\3\2\2\2op\7+\2\2p\6\3\2\2\2qv\7$\2\2r"+
		"u\5\t\5\2su\n\2\2\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wy\3\2\2\2xv\3\2\2\2yz\7$\2\2z\b\3\2\2\2{|\7^\2\2|\u0080\7$\2\2}~\7^\2"+
		"\2~\u0080\7^\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\t\3\2\2\u0082\u0083\t\4\2\2\u0083\u0084\t\3\2\2\u0084\u0085\t\5\2\2\u0085"+
		"\u0086\t\6\2\2\u0086\f\3\2\2\2\u0087\u0088\t\3\2\2\u0088\u0089\t\5\2\2"+
		"\u0089\u008a\t\7\2\2\u008a\16\3\2\2\2\u008b\u008c\t\b\2\2\u008c\u008d"+
		"\t\3\2\2\u008d\20\3\2\2\2\u008e\u008f\t\t\2\2\u008f\u0090\t\n\2\2\u0090"+
		"\u0091\t\13\2\2\u0091\u0092\t\7\2\2\u0092\22\3\2\2\2\u0093\u0094\t\f\2"+
		"\2\u0094\u0095\t\5\2\2\u0095\u0096\t\r\2\2\u0096\24\3\2\2\2\u0097\u0098"+
		"\t\16\2\2\u0098\u0099\t\n\2\2\u0099\26\3\2\2\2\u009a\u009b\t\r\2\2\u009b"+
		"\u009c\t\n\2\2\u009c\30\3\2\2\2\u009d\u009e\t\17\2\2\u009e\u009f\t\n\2"+
		"\2\u009f\u00a0\t\20\2\2\u00a0\u00a1\t\5\2\2\u00a1\32\3\2\2\2\u00a2\u00a3"+
		"\t\21\2\2\u00a3\u00a4\t\n\2\2\u00a4\u00a5\t\f\2\2\u00a5\u00a6\t\n\2\2"+
		"\u00a6\u00a7\t\6\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\t\6\2\2\u00a9\u00aa"+
		"\t\5\2\2\u00aa\u00ab\t\3\2\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\t\4\2\2\u00ad"+
		"\u00ae\t\r\2\2\u00ae\36\3\2\2\2\u00af\u00b0\t\r\2\2\u00b0\u00b1\t\b\2"+
		"\2\u00b1\u00b2\t\6\2\2\u00b2\u00b3\t\7\2\2\u00b3 \3\2\2\2\u00b4\u00b5"+
		"\t\6\2\2\u00b5\u00b6\t\22\2\2\u00b6\u00b7\t\16\2\2\u00b7\u00b8\t\23\2"+
		"\2\u00b8\u00b9\t\r\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\t\f\2\2\u00bb\u00bc"+
		"\t\5\2\2\u00bc\u00bd\t\24\2\2\u00bd\u00be\t\r\2\2\u00be$\3\2\2\2\u00bf"+
		"\u00c0\t\24\2\2\u00c0\u00c1\t\n\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00c3\t"+
		"\13\2\2\u00c3\u00c4\t\4\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00c6\t\t\2\2\u00c6"+
		"&\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca"+
		"\u00cb\7\60\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd,\3\2\2\2\u00ce"+
		"\u00cf\7}\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7\177\2\2\u00d1\60\3\2\2\2\u00d2"+
		"\u00d3\7]\2\2\u00d3\62\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5\64\3\2\2\2\u00d6"+
		"\u00d7\7.\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7<\2\2\u00d98\3\2\2\2\u00da"+
		"\u00dd\5;\36\2\u00db\u00dd\5=\37\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd:\3\2\2\2\u00de\u00df\7V\2\2\u00df\u00e0\7T\2\2\u00e0\u00e1"+
		"\7W\2\2\u00e1\u00e7\7G\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7w\2\2\u00e5\u00e7\7g\2\2\u00e6\u00de\3\2\2\2\u00e6\u00e2\3\2\2"+
		"\2\u00e7<\3\2\2\2\u00e8\u00e9\7H\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7"+
		"N\2\2\u00eb\u00ec\7U\2\2\u00ec\u00f3\7G\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f3\7g\2\2\u00f2"+
		"\u00e8\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5"+
		"@\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9D"+
		"\3\2\2\2\u00fa\u00fb\7,\2\2\u00fb\u00fc\7,\2\2\u00fcF\3\2\2\2\u00fd\u00fe"+
		"\7\61\2\2\u00feH\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7(\2\2\u0101J"+
		"\3\2\2\2\u0102\u0103\7~\2\2\u0103\u0104\7~\2\2\u0104L\3\2\2\2\u0105\u0106"+
		"\7`\2\2\u0106N\3\2\2\2\u0107\u0108\7?\2\2\u0108\u0109\7?\2\2\u0109P\3"+
		"\2\2\2\u010a\u010b\7#\2\2\u010b\u010c\7?\2\2\u010cR\3\2\2\2\u010d\u010e"+
		"\7@\2\2\u010eT\3\2\2\2\u010f\u0110\7>\2\2\u0110V\3\2\2\2\u0111\u0112\7"+
		"@\2\2\u0112\u0113\7?\2\2\u0113X\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116"+
		"\7?\2\2\u0116Z\3\2\2\2\u0117\u0118\7<\2\2\u0118\u0119\7<\2\2\u0119\\\3"+
		"\2\2\2\u011a\u011b\7>\2\2\u011b\u011c\7>\2\2\u011c^\3\2\2\2\u011d\u011f"+
		"\t\25\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\u0128\3\2\2\2\u0122\u0124\7\60\2\2\u0123\u0125"+
		"\t\25\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0133\3\2\2\2\u012a\u012c\t\5\2\2\u012b\u012d\t\26\2\2"+
		"\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0130"+
		"\t\25\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134`\3\2\2\2\u0135\u0137\7e\2\2\u0136\u0138\t\25\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013ab\3\2\2\2\u013b\u013c\7\62\2\2\u013c\u013d\7z\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u0140\t\25\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142d\3\2\2\2\u0143\u0145\t"+
		"\27\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147f\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a\7,\2\2"+
		"\u014a\u014e\3\2\2\2\u014b\u014d\13\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0152\7,\2\2\u0152\u0153\7\61\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\b\64\2\2\u0155h\3\2\2\2\u0156\u0157\7\61\2\2\u0157\u0158"+
		"\7\61\2\2\u0158\u015c\3\2\2\2\u0159\u015b\n\30\2\2\u015a\u0159\3\2\2\2"+
		"\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\b\65\2\2\u0160j\3\2\2\2\u0161"+
		"\u0162\t\31\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b\66\3\2\u0164l\3\2\2"+
		"\2\24\2tv\177\u00dc\u00e6\u00f2\u0120\u0126\u0128\u012c\u0131\u0133\u0139"+
		"\u0141\u0146\u014e\u015c\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}