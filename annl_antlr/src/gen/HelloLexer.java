package gen;// Generated from /Users/qm/IdeaProjects/CMM/antlr_interpreter/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, WS=15, Type=16, READ=17, 
		WRITE=18, WHILE=19, BREAK=20, FOR=21, IF=22, ID=23, Relation=24, DOUBLE=25, 
		NEWLINE=26, INT=27, CHAR=28, SL_COMMENT=29, Semi=30, Equal=31, Comma=32, 
		Lbracket=33, Rbracket=34, MUL_COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "WS", "Type", "READ", "WRITE", 
		"WHILE", "BREAK", "FOR", "IF", "ID", "Operator", "Relation", "NUM", "DOUBLE", 
		"LETTER", "NEWLINE", "INT", "CHAR", "SL_COMMENT", "Semi", "Equal", "Comma", 
		"Lbracket", "Rbracket", "MUL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'elif'", "'*'", "'/'", "'+'", "'-'", 
		"'true'", "'false'", "'\"'", "'\\'", "'else'", null, null, "'read'", "'write'", 
		"'while'", "'break'", "'for'", "'if'", null, null, null, null, null, null, 
		null, "';'", "'='", "','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "WS", "Type", "READ", "WRITE", "WHILE", "BREAK", "FOR", 
		"IF", "ID", "Relation", "DOUBLE", "NEWLINE", "INT", "CHAR", "SL_COMMENT", 
		"Semi", "Equal", "Comma", "Lbracket", "Rbracket", "MUL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\6\20z\n\20\r\20\16\20{\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u00b7\n\30\f\30"+
		"\16\30\u00ba\13\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u00c9\n\32\3\33\6\33\u00cc\n\33\r\33\16\33\u00cd\3"+
		"\34\5\34\u00d1\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\5\36\u00da\n\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \5 \u00e3\n \3 \3 \3!\3!\3!\3!\7!\u00eb\n"+
		"!\f!\16!\u00ee\13!\3!\5!\u00f1\n!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\3\'\7\'\u0103\n\'\f\'\16\'\u0106\13\'\3\'\3\'\3\'\3\'\3"+
		"\'\4\u00ec\u0104\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\32\65"+
		"\2\67\339\2;\34=\35?\36A\37C E!G\"I#K$M%\3\2\13\5\2\13\f\17\17\"\"\5\2"+
		"C\\aac|\6\2\62;C\\aac|\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\4\2--//\4\2C"+
		"\\c|\3\3\f\f\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2"+
		"\r\\\3\2\2\2\17^\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27i\3\2\2"+
		"\2\31o\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2\37y\3\2\2\2!\u0094\3\2\2\2#\u0096"+
		"\3\2\2\2%\u009b\3\2\2\2\'\u00a1\3\2\2\2)\u00a7\3\2\2\2+\u00ad\3\2\2\2"+
		"-\u00b1\3\2\2\2/\u00b4\3\2\2\2\61\u00bb\3\2\2\2\63\u00c8\3\2\2\2\65\u00cb"+
		"\3\2\2\2\67\u00d0\3\2\2\29\u00d6\3\2\2\2;\u00d9\3\2\2\2=\u00dd\3\2\2\2"+
		"?\u00df\3\2\2\2A\u00e6\3\2\2\2C\u00f4\3\2\2\2E\u00f6\3\2\2\2G\u00f8\3"+
		"\2\2\2I\u00fa\3\2\2\2K\u00fc\3\2\2\2M\u00fe\3\2\2\2OP\7}\2\2P\4\3\2\2"+
		"\2QR\7\177\2\2R\6\3\2\2\2ST\7*\2\2T\b\3\2\2\2UV\7+\2\2V\n\3\2\2\2WX\7"+
		"g\2\2XY\7n\2\2YZ\7k\2\2Z[\7h\2\2[\f\3\2\2\2\\]\7,\2\2]\16\3\2\2\2^_\7"+
		"\61\2\2_\20\3\2\2\2`a\7-\2\2a\22\3\2\2\2bc\7/\2\2c\24\3\2\2\2de\7v\2\2"+
		"ef\7t\2\2fg\7w\2\2gh\7g\2\2h\26\3\2\2\2ij\7h\2\2jk\7c\2\2kl\7n\2\2lm\7"+
		"u\2\2mn\7g\2\2n\30\3\2\2\2op\7$\2\2p\32\3\2\2\2qr\7^\2\2r\34\3\2\2\2s"+
		"t\7g\2\2tu\7n\2\2uv\7u\2\2vw\7g\2\2w\36\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{"+
		"\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u0095\7n\2\2\u0083"+
		"\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0095\7v\2\2\u0086\u0087\7f\2\2"+
		"\u0087\u0088\7q\2\2\u0088\u0089\7w\2\2\u0089\u008a\7d\2\2\u008a\u008b"+
		"\7n\2\2\u008b\u0095\7g\2\2\u008c\u008d\7d\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0095\7n\2\2\u0090\u0091\7e\2\2\u0091\u0092\7j\2\2"+
		"\u0092\u0093\7c\2\2\u0093\u0095\7t\2\2\u0094\177\3\2\2\2\u0094\u0083\3"+
		"\2\2\2\u0094\u0086\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
		"\"\3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7f\2\2\u009a$\3\2\2\2\u009b\u009c\7y\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0&\3\2\2\2\u00a1"+
		"\u00a2\7y\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7n\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7t\2"+
		"\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7m\2\2\u00ac*\3\2"+
		"\2\2\u00ad\u00ae\7h\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0,\3"+
		"\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3.\3\2\2\2\u00b4\u00b8"+
		"\t\3\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\60\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00bb\u00bc\t\5\2\2\u00bc\62\3\2\2\2\u00bd\u00c9\t\6\2\2\u00be\u00bf"+
		"\7@\2\2\u00bf\u00c9\7?\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c9\7?\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3\u00c9\7?\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c9\7?\2\2"+
		"\u00c6\u00c7\7>\2\2\u00c7\u00c9\7@\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00be"+
		"\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\64\3\2\2\2\u00ca\u00cc\t\7\2\2\u00cb\u00ca\3\2\2"+
		"\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\66"+
		"\3\2\2\2\u00cf\u00d1\t\b\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\5\65\33\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5"+
		"\5\65\33\2\u00d58\3\2\2\2\u00d6\u00d7\t\t\2\2\u00d7:\3\2\2\2\u00d8\u00da"+
		"\7\17\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\7\f\2\2\u00dc<\3\2\2\2\u00dd\u00de\5\65\33\2\u00de>\3\2\2"+
		"\2\u00df\u00e2\7)\2\2\u00e0\u00e3\59\35\2\u00e1\u00e3\5\65\33\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7)"+
		"\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ec"+
		"\3\2\2\2\u00e9\u00eb\13\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f1\t\n\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\b!\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7=\2\2\u00f5D\3\2\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7F\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7"+
		"]\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\7_\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7\61"+
		"\2\2\u00ff\u0100\7,\2\2\u0100\u0104\3\2\2\2\u0101\u0103\13\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7,\2\2\u0108"+
		"\u0109\7\61\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b\'\2\2\u010bN\3\2\2\2"+
		"\16\2{\u0094\u00b8\u00c8\u00cd\u00d0\u00d9\u00e2\u00ec\u00f0\u0104\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}