// Generated from /Users/bohaohan/Documents/workspace/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, Type=12, READ=13, WRITE=14, WHILE=15, BREAK=16, FOR=17, 
		IF=18, ID=19, Relation=20, DOUBLE=21, NEWLINE=22, BOOL=23, INT=24, CHAR=25, 
		SL_COMMENT=26, Semi=27, Equal=28, Comma=29, Lbracket=30, Rbracket=31, 
		MUL_COMMENT=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "WS", "Type", "READ", "WRITE", "WHILE", "BREAK", "FOR", "IF", 
		"ID", "Operator", "Relation", "NUM", "DOUBLE", "LETTER", "NEWLINE", "BOOL", 
		"INT", "CHAR", "SL_COMMENT", "Semi", "Equal", "Comma", "Lbracket", "Rbracket", 
		"MUL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'elif'", "'+'", "'-'", "'*'", "'/'", 
		"'else'", null, null, "'read'", "'write'", "'while'", "'break'", "'for'", 
		"'if'", null, null, null, null, null, null, null, null, "';'", "'='", 
		"','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WS", 
		"Type", "READ", "WRITE", "WHILE", "BREAK", "FOR", "IF", "ID", "Relation", 
		"DOUBLE", "NEWLINE", "BOOL", "INT", "CHAR", "SL_COMMENT", "Semi", "Equal", 
		"Comma", "Lbracket", "Rbracket", "MUL_COMMENT"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\6"+
		"\fe\n\f\r\f\16\ff\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\7\24\u00c7\n\24\f\24\16\24\u00ca\13\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3\27"+
		"\6\27\u00dc\n\27\r\27\16\27\u00dd\3\30\3\30\3\30\5\30\u00e3\n\30\3\31"+
		"\3\31\3\32\5\32\u00e8\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u00f5\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\7\36\u0101\n\36\f\36\16\36\u0104\13\36\3\36\5\36\u0107\n\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\7$\u0119\n$\f$\16"+
		"$\u011c\13$\3$\3$\3$\3$\3$\4\u0102\u011a\2%\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26"+
		"-\2/\27\61\2\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"\3\2\n\5\2\13"+
		"\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\6\2\'\',-//\61\61\4\2>>@@\3\2\62"+
		";\4\2C\\c|\3\3\f\f\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2/\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2"+
		"\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rV\3\2\2\2\17X\3\2\2\2\21"+
		"Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27d\3\2\2\2\31\u00a4\3\2\2\2\33\u00a6"+
		"\3\2\2\2\35\u00ab\3\2\2\2\37\u00b1\3\2\2\2!\u00b7\3\2\2\2#\u00bd\3\2\2"+
		"\2%\u00c1\3\2\2\2\'\u00c4\3\2\2\2)\u00cb\3\2\2\2+\u00d8\3\2\2\2-\u00db"+
		"\3\2\2\2/\u00df\3\2\2\2\61\u00e4\3\2\2\2\63\u00e7\3\2\2\2\65\u00f4\3\2"+
		"\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fc\3\2\2\2=\u010a\3\2\2\2?\u010c"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I"+
		"J\7}\2\2J\4\3\2\2\2KL\7\177\2\2L\6\3\2\2\2MN\7*\2\2N\b\3\2\2\2OP\7+\2"+
		"\2P\n\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7k\2\2TU\7h\2\2U\f\3\2\2\2VW\7-\2\2"+
		"W\16\3\2\2\2XY\7/\2\2Y\20\3\2\2\2Z[\7,\2\2[\22\3\2\2\2\\]\7\61\2\2]\24"+
		"\3\2\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\26\3\2\2\2ce\t\2\2\2dc\3"+
		"\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\b\f\2\2i\30\3\2\2\2j"+
		"k\7t\2\2kl\7g\2\2lm\7c\2\2m\u00a5\7n\2\2no\7k\2\2op\7p\2\2p\u00a5\7v\2"+
		"\2qr\7f\2\2rs\7q\2\2st\7w\2\2tu\7d\2\2uv\7n\2\2v\u00a5\7g\2\2wx\7d\2\2"+
		"xy\7q\2\2yz\7q\2\2z\u00a5\7n\2\2{|\7e\2\2|}\7j\2\2}~\7c\2\2~\u00a5\7t"+
		"\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\7]\2\2\u0084\u0085\5\67\34\2\u0085\u0086\7_\2\2\u0086"+
		"\u00a5\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7q\2\2\u0089\u008a\7w\2"+
		"\2\u008a\u008b\7d\2\2\u008b\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\7]\2\2\u008f\u0090\5\67\34\2\u0090\u0091\7_\2\2\u0091"+
		"\u00a5\3\2\2\2\u0092\u0093\7d\2\2\u0093\u0094\7q\2\2\u0094\u0095\7q\2"+
		"\2\u0095\u0096\7n\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7]\2\2\u0098\u0099"+
		"\5\67\34\2\u0099\u009a\7_\2\2\u009a\u00a5\3\2\2\2\u009b\u009c\7e\2\2\u009c"+
		"\u009d\7j\2\2\u009d\u009e\7c\2\2\u009e\u009f\7t\2\2\u009f\u00a0\3\2\2"+
		"\2\u00a0\u00a1\7]\2\2\u00a1\u00a2\5\67\34\2\u00a2\u00a3\7_\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4j\3\2\2\2\u00a4n\3\2\2\2\u00a4q\3\2\2\2\u00a4w\3\2\2\2\u00a4"+
		"{\3\2\2\2\u00a4\177\3\2\2\2\u00a4\u0087\3\2\2\2\u00a4\u0092\3\2\2\2\u00a4"+
		"\u009b\3\2\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7c\2\2\u00a9\u00aa\7f\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7"+
		"y\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7v\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6 \3\2\2\2\u00b7\u00b8"+
		"\7d\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb"+
		"\u00bc\7m\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c8\t\3\2\2\u00c5\u00c7\t\4\2\2\u00c6\u00c5\3\2\2\2"+
		"\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9(\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\t\5\2\2\u00cc*\3\2\2\2\u00cd\u00d9"+
		"\t\6\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d9\7?\2\2\u00d0\u00d1\7>\2\2\u00d1"+
		"\u00d9\7?\2\2\u00d2\u00d3\7?\2\2\u00d3\u00d9\7?\2\2\u00d4\u00d5\7#\2\2"+
		"\u00d5\u00d9\7?\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d9\7@\2\2\u00d8\u00cd"+
		"\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9,\3\2\2\2\u00da\u00dc\t\7\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de.\3\2\2\2\u00df\u00e2\5-\27\2\u00e0\u00e1\7\60\2\2\u00e1"+
		"\u00e3\5-\27\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\60\3\2\2"+
		"\2\u00e4\u00e5\t\b\2\2\u00e5\62\3\2\2\2\u00e6\u00e8\7\17\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\f\2\2\u00ea"+
		"\64\3\2\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00f5\7g\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2"+
		"\u00f2\u00f3\7u\2\2\u00f3\u00f5\7g\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ef"+
		"\3\2\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\5-\27\2\u00f78\3\2\2\2\u00f8\u00f9"+
		"\7)\2\2\u00f9\u00fa\5\61\31\2\u00fa\u00fb\7)\2\2\u00fb:\3\2\2\2\u00fc"+
		"\u00fd\7\61\2\2\u00fd\u00fe\7\61\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\13"+
		"\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\t\t"+
		"\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\36\2\2\u0109"+
		"<\3\2\2\2\u010a\u010b\7=\2\2\u010b>\3\2\2\2\u010c\u010d\7?\2\2\u010d@"+
		"\3\2\2\2\u010e\u010f\7.\2\2\u010fB\3\2\2\2\u0110\u0111\7]\2\2\u0111D\3"+
		"\2\2\2\u0112\u0113\7_\2\2\u0113F\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116"+
		"\7,\2\2\u0116\u011a\3\2\2\2\u0117\u0119\13\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7,\2\2\u011e\u011f\7\61\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\b$\2\2\u0121H\3\2\2\2\16\2f\u00a4\u00c8\u00d8"+
		"\u00dd\u00e2\u00e7\u00f4\u0102\u0106\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}