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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, WS=17, 
		Type=18, READ=19, WRITE=20, WHILE=21, BREAK=22, FOR=23, IF=24, ID=25, 
		Relation=26, DOUBLE=27, NEWLINE=28, STRING=29, INT=30, CHAR=31, SL_COMMENT=32, 
		Semi=33, Equal=34, Comma=35, Lbracket=36, Rbracket=37, MUL_COMMENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "WS", "Type", 
		"READ", "WRITE", "WHILE", "BREAK", "FOR", "IF", "ID", "Operator", "Relation", 
		"NUM", "DOUBLE", "LETTER", "NEWLINE", "STRING", "ESC", "INT", "CHAR", 
		"SL_COMMENT", "Semi", "Equal", "Comma", "Lbracket", "Rbracket", "MUL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'elif'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'not'", "'||'", "'&&'", "'true'", "'false'", "'else'", null, null, 
		"'read'", "'write'", "'while'", "'break'", "'for'", "'if'", null, null, 
		null, null, null, null, null, null, "';'", "'='", "','", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "WS", "Type", "READ", "WRITE", "WHILE", 
		"BREAK", "FOR", "IF", "ID", "Relation", "DOUBLE", "NEWLINE", "STRING", 
		"INT", "CHAR", "SL_COMMENT", "Semi", "Equal", "Comma", "Lbracket", "Rbracket", 
		"MUL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\6\22\u008a\n\22\r\22\16\22\u008b\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00a1\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\7\32\u00c3\n\32\f\32\16\32\u00c6\13"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u00d5\n\34\3\35\6\35\u00d8\n\35\r\35\16\35\u00d9\3\36\5\36\u00dd\n"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \5 \u00e6\n \3 \3 \3!\3!\3!\7!\u00ed"+
		"\n!\f!\16!\u00f0\13!\3!\3!\3\"\3\"\3\"\5\"\u00f7\n\"\3#\3#\3$\3$\3$\5"+
		"$\u00fe\n$\3$\3$\3%\3%\3%\3%\7%\u0106\n%\f%\16%\u0109\13%\3%\5%\u010c"+
		"\n%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\7+\u011e\n+\f+\16"+
		"+\u0121\13+\3+\3+\3+\3+\3+\5\u00ee\u0107\u011f\2,\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\2\67\349\2;\35=\2?\36A\37C\2E G!I\"K#"+
		"M$O%Q&S\'U(\3\2\f\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\6\2\'\'"+
		",-//\61\61\4\2>>@@\3\2\62;\4\2--//\4\2C\\c|\b\2$$^^ddppttvv\3\3\f\f\u0135"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]"+
		"\3\2\2\2\13_\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25"+
		"l\3\2\2\2\27n\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35x\3\2\2\2\37}\3\2\2\2"+
		"!\u0083\3\2\2\2#\u0089\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00ad\3\2\2\2-\u00b3\3\2\2\2/\u00b9\3\2\2\2\61\u00bd\3\2\2\2\63"+
		"\u00c0\3\2\2\2\65\u00c7\3\2\2\2\67\u00d4\3\2\2\29\u00d7\3\2\2\2;\u00dc"+
		"\3\2\2\2=\u00e2\3\2\2\2?\u00e5\3\2\2\2A\u00e9\3\2\2\2C\u00f6\3\2\2\2E"+
		"\u00f8\3\2\2\2G\u00fa\3\2\2\2I\u0101\3\2\2\2K\u010f\3\2\2\2M\u0111\3\2"+
		"\2\2O\u0113\3\2\2\2Q\u0115\3\2\2\2S\u0117\3\2\2\2U\u0119\3\2\2\2WX\7}"+
		"\2\2X\4\3\2\2\2YZ\7\177\2\2Z\6\3\2\2\2[\\\7*\2\2\\\b\3\2\2\2]^\7+\2\2"+
		"^\n\3\2\2\2_`\7g\2\2`a\7n\2\2ab\7k\2\2bc\7h\2\2c\f\3\2\2\2de\7,\2\2e\16"+
		"\3\2\2\2fg\7\61\2\2g\20\3\2\2\2hi\7\'\2\2i\22\3\2\2\2jk\7-\2\2k\24\3\2"+
		"\2\2lm\7/\2\2m\26\3\2\2\2no\7p\2\2op\7q\2\2pq\7v\2\2q\30\3\2\2\2rs\7~"+
		"\2\2st\7~\2\2t\32\3\2\2\2uv\7(\2\2vw\7(\2\2w\34\3\2\2\2xy\7v\2\2yz\7t"+
		"\2\2z{\7w\2\2{|\7g\2\2|\36\3\2\2\2}~\7h\2\2~\177\7c\2\2\177\u0080\7n\2"+
		"\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082 \3\2\2\2\u0083\u0084\7"+
		"g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\""+
		"\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\22"+
		"\2\2\u008e$\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u00a1"+
		"\7v\2\2\u0092\u0093\7f\2\2\u0093\u0094\7q\2\2\u0094\u0095\7w\2\2\u0095"+
		"\u0096\7d\2\2\u0096\u0097\7n\2\2\u0097\u00a1\7g\2\2\u0098\u0099\7d\2\2"+
		"\u0099\u009a\7q\2\2\u009a\u009b\7q\2\2\u009b\u00a1\7n\2\2\u009c\u009d"+
		"\7e\2\2\u009d\u009e\7j\2\2\u009e\u009f\7c\2\2\u009f\u00a1\7t\2\2\u00a0"+
		"\u008f\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009c\3\2"+
		"\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7f\2\2\u00a6(\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"*\3\2\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1\u00b2\7g\2\2\u00b2,\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4"+
		"\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7m\2\2"+
		"\u00b8.\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2"+
		"\2\u00bc\60\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bf\62\3\2"+
		"\2\2\u00c0\u00c4\t\3\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\64\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8\66\3\2\2\2\u00c9\u00d5"+
		"\t\6\2\2\u00ca\u00cb\7@\2\2\u00cb\u00d5\7?\2\2\u00cc\u00cd\7>\2\2\u00cd"+
		"\u00d5\7?\2\2\u00ce\u00cf\7?\2\2\u00cf\u00d5\7?\2\2\u00d0\u00d1\7#\2\2"+
		"\u00d1\u00d5\7?\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d5\7@\2\2\u00d4\u00c9"+
		"\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d58\3\2\2\2\u00d6\u00d8\t\7\2\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da:\3\2\2\2\u00db\u00dd\t\b\2\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\59\35\2\u00df\u00e0\7\60"+
		"\2\2\u00e0\u00e1\59\35\2\u00e1<\3\2\2\2\u00e2\u00e3\t\t\2\2\u00e3>\3\2"+
		"\2\2\u00e4\u00e6\7\17\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8@\3\2\2\2\u00e9\u00ee\7$\2\2\u00ea"+
		"\u00ed\5C\"\2\u00eb\u00ed\13\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2B\3\2\2\2\u00f3"+
		"\u00f7\7$\2\2\u00f4\u00f5\7^\2\2\u00f5\u00f7\t\n\2\2\u00f6\u00f3\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f7D\3\2\2\2\u00f8\u00f9\59\35\2\u00f9F\3\2\2"+
		"\2\u00fa\u00fd\7)\2\2\u00fb\u00fe\5=\37\2\u00fc\u00fe\59\35\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7)\2\2\u0100"+
		"H\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7\61\2\2\u0103\u0107\3\2\2"+
		"\2\u0104\u0106\13\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010c\t\13\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\b%\2\2\u010eJ\3\2\2\2\u010f\u0110\7=\2\2\u0110L\3\2\2\2\u0111\u0112"+
		"\7?\2\2\u0112N\3\2\2\2\u0113\u0114\7.\2\2\u0114P\3\2\2\2\u0115\u0116\7"+
		"]\2\2\u0116R\3\2\2\2\u0117\u0118\7_\2\2\u0118T\3\2\2\2\u0119\u011a\7\61"+
		"\2\2\u011a\u011b\7,\2\2\u011b\u011f\3\2\2\2\u011c\u011e\13\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7,\2\2\u0123"+
		"\u0124\7\61\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b+\2\2\u0126V\3\2\2\2"+
		"\21\2\u008b\u00a0\u00c4\u00d4\u00d9\u00dc\u00e5\u00ec\u00ee\u00f6\u00fd"+
		"\u0107\u010b\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}