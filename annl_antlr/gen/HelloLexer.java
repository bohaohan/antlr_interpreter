// Generated from /Users/qm/IdeaProjects/CMM/antlr_interpreter/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
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
		T__9=10, T__10=11, T__11=12, WS=13, Type=14, READ=15, WRITE=16, WHILE=17, 
		BREAK=18, FOR=19, IF=20, ID=21, Relation=22, DOUBLE=23, NEWLINE=24, INT=25, 
		CHAR=26, SL_COMMENT=27, Semi=28, Equal=29, Comma=30, Lbracket=31, Rbracket=32, 
		MUL_COMMENT=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "WS", "Type", "READ", "WRITE", "WHILE", "BREAK", 
		"FOR", "IF", "ID", "Operator", "Relation", "NUM", "DOUBLE", "LETTER", 
		"NEWLINE", "INT", "CHAR", "SL_COMMENT", "Semi", "Equal", "Comma", "Lbracket", 
		"Rbracket", "MUL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'elif'", "'*'", "'/'", "'+'", "'-'", 
		"'true'", "'false'", "'else'", null, null, "'read'", "'write'", "'while'", 
		"'break'", "'for'", "'if'", null, null, null, null, null, null, null, 
		"';'", "'='", "','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "Type", "READ", "WRITE", "WHILE", "BREAK", "FOR", "IF", "ID", 
		"Relation", "DOUBLE", "NEWLINE", "INT", "CHAR", "SL_COMMENT", "Semi", 
		"Equal", "Comma", "Lbracket", "Rbracket", "MUL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16r\n\16\r\16\16\16"+
		"s\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008d\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c1\n\30\3\31\6\31"+
		"\u00c4\n\31\r\31\16\31\u00c5\3\32\5\32\u00c9\n\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\5\34\u00d2\n\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36"+
		"\u00db\n\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00e3\n\37\f\37\16\37\u00e6"+
		"\13\37\3\37\5\37\u00e9\n\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3%\3%\7%\u00fb\n%\f%\16%\u00fe\13%\3%\3%\3%\3%\3%\4\u00e4\u00fc"+
		"\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\30\61\2\63\31\65\2\67\329\33;\34"+
		"=\35?\36A\37C E!G\"I#\3\2\13\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\"+
		"aac|\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\4\2--//\4\2C\\c|\3\3\f\f\u0111"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2\63\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7"+
		"O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23"+
		"^\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33q\3\2\2\2\35\u008c\3\2"+
		"\2\2\37\u008e\3\2\2\2!\u0093\3\2\2\2#\u0099\3\2\2\2%\u009f\3\2\2\2\'\u00a5"+
		"\3\2\2\2)\u00a9\3\2\2\2+\u00ac\3\2\2\2-\u00b3\3\2\2\2/\u00c0\3\2\2\2\61"+
		"\u00c3\3\2\2\2\63\u00c8\3\2\2\2\65\u00ce\3\2\2\2\67\u00d1\3\2\2\29\u00d5"+
		"\3\2\2\2;\u00d7\3\2\2\2=\u00de\3\2\2\2?\u00ec\3\2\2\2A\u00ee\3\2\2\2C"+
		"\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I\u00f6\3\2\2\2KL\7}\2\2L"+
		"\4\3\2\2\2MN\7\177\2\2N\6\3\2\2\2OP\7*\2\2P\b\3\2\2\2QR\7+\2\2R\n\3\2"+
		"\2\2ST\7g\2\2TU\7n\2\2UV\7k\2\2VW\7h\2\2W\f\3\2\2\2XY\7,\2\2Y\16\3\2\2"+
		"\2Z[\7\61\2\2[\20\3\2\2\2\\]\7-\2\2]\22\3\2\2\2^_\7/\2\2_\24\3\2\2\2`"+
		"a\7v\2\2ab\7t\2\2bc\7w\2\2cd\7g\2\2d\26\3\2\2\2ef\7h\2\2fg\7c\2\2gh\7"+
		"n\2\2hi\7u\2\2ij\7g\2\2j\30\3\2\2\2kl\7g\2\2lm\7n\2\2mn\7u\2\2no\7g\2"+
		"\2o\32\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2"+
		"\2\2uv\b\16\2\2v\34\3\2\2\2wx\7t\2\2xy\7g\2\2yz\7c\2\2z\u008d\7n\2\2{"+
		"|\7k\2\2|}\7p\2\2}\u008d\7v\2\2~\177\7f\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7w\2\2\u0081\u0082\7d\2\2\u0082\u0083\7n\2\2\u0083\u008d\7g\2\2\u0084"+
		"\u0085\7d\2\2\u0085\u0086\7q\2\2\u0086\u0087\7q\2\2\u0087\u008d\7n\2\2"+
		"\u0088\u0089\7e\2\2\u0089\u008a\7j\2\2\u008a\u008b\7c\2\2\u008b\u008d"+
		"\7t\2\2\u008cw\3\2\2\2\u008c{\3\2\2\2\u008c~\3\2\2\2\u008c\u0084\3\2\2"+
		"\2\u008c\u0088\3\2\2\2\u008d\36\3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7c\2\2\u0091\u0092\7f\2\2\u0092 \3\2\2\2\u0093\u0094"+
		"\7y\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096\u0097\7v\2\2\u0097"+
		"\u0098\7g\2\2\u0098\"\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b\7j\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e$\3\2\2\2\u009f"+
		"\u00a0\7d\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\u00a4\7m\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7q\2"+
		"\2\u00a7\u00a8\7t\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7"+
		"h\2\2\u00ab*\3\2\2\2\u00ac\u00b0\t\3\2\2\u00ad\u00af\t\4\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		",\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4.\3\2\2\2\u00b5"+
		"\u00c1\t\6\2\2\u00b6\u00b7\7@\2\2\u00b7\u00c1\7?\2\2\u00b8\u00b9\7>\2"+
		"\2\u00b9\u00c1\7?\2\2\u00ba\u00bb\7?\2\2\u00bb\u00c1\7?\2\2\u00bc\u00bd"+
		"\7#\2\2\u00bd\u00c1\7?\2\2\u00be\u00bf\7>\2\2\u00bf\u00c1\7@\2\2\u00c0"+
		"\u00b5\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00ba\3\2"+
		"\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\60\3\2\2\2\u00c2\u00c4"+
		"\t\7\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\62\3\2\2\2\u00c7\u00c9\t\b\2\2\u00c8\u00c7\3\2\2"+
		"\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5\61\31\2\u00cb"+
		"\u00cc\7\60\2\2\u00cc\u00cd\5\61\31\2\u00cd\64\3\2\2\2\u00ce\u00cf\t\t"+
		"\2\2\u00cf\66\3\2\2\2\u00d0\u00d2\7\17\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d48\3\2\2\2\u00d5"+
		"\u00d6\5\61\31\2\u00d6:\3\2\2\2\u00d7\u00da\7)\2\2\u00d8\u00db\5\65\33"+
		"\2\u00d9\u00db\5\61\31\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd<\3\2\2\2\u00de\u00df\7\61\2\2"+
		"\u00df\u00e0\7\61\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\13\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\t\n\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\37\2\2\u00eb>\3\2\2\2\u00ec\u00ed"+
		"\7=\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7?\2\2\u00efB\3\2\2\2\u00f0\u00f1\7"+
		".\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7]\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7_"+
		"\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\7,\2\2\u00f8\u00fc"+
		"\3\2\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0100\7,\2\2\u0100\u0101\7\61\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\b%\2\2\u0103J\3\2\2\2\16\2s\u008c\u00b0\u00c0\u00c5\u00c8\u00d1"+
		"\u00da\u00e4\u00e8\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}