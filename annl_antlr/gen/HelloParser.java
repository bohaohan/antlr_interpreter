// Generated from /Users/qm/IdeaProjects/CMM/antlr_interpreter/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_stmts = 1, RULE_varDecl = 2, RULE_listVar = 3, 
		RULE_sub_var = 4, RULE_stmtBlock = 5, RULE_ifStmt = 6, RULE_expr = 7, 
		RULE_compare = 8, RULE_whileStmt = 9, RULE_forStmt = 10, RULE_breakStmt = 11, 
		RULE_readStmt = 12, RULE_writeStmt = 13, RULE_assignStmt = 14, RULE_list_var = 15, 
		RULE_value = 16, RULE_arrayValue = 17, RULE_bool = 18, RULE_string = 19, 
		RULE_eLSE = 20;
	public static final String[] ruleNames = {
		"program", "stmts", "varDecl", "listVar", "sub_var", "stmtBlock", "ifStmt", 
		"expr", "compare", "whileStmt", "forStmt", "breakStmt", "readStmt", "writeStmt", 
		"assignStmt", "list_var", "value", "arrayValue", "bool", "string", "eLSE"
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

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(42);
					stmts();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(51);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(47);
				match(T__0);
				setState(48);
				stmts();
				setState(49);
				match(T__1);
				}
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

	public static class StmtsContext extends ParserRuleContext {
		public ListVarContext listVar() {
			return getRuleContext(ListVarContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		try {
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				listVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(56);
				assignStmt();
				setState(57);
				match(Semi);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				readStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				writeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				stmtBlock();
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(HelloParser.Type, 0); }
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Equal() { return getToken(HelloParser.Equal, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HelloParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HelloParser.Comma, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(Type);
			{
			setState(68);
			value();
			}
			setState(85);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(69);
				match(Equal);
				setState(83);
				switch (_input.LA(1)) {
				case T__2:
				case T__9:
				case T__13:
				case T__14:
				case ID:
				case DOUBLE:
				case INT:
				case CHAR:
					{
					setState(70);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(71);
					match(T__0);
					setState(80);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
						{
						setState(72);
						expr(0);
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(73);
							match(Comma);
							setState(74);
							expr(0);
							}
							}
							setState(79);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(82);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(87);
			match(Semi);
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

	public static class ListVarContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(HelloParser.Type, 0); }
		public List<Sub_varContext> sub_var() {
			return getRuleContexts(Sub_varContext.class);
		}
		public Sub_varContext sub_var(int i) {
			return getRuleContext(Sub_varContext.class,i);
		}
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
		public List<TerminalNode> Comma() { return getTokens(HelloParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HelloParser.Comma, i);
		}
		public ListVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterListVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitListVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitListVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListVarContext listVar() throws RecognitionException {
		ListVarContext _localctx = new ListVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(Type);
			setState(90);
			sub_var();
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(Comma);
				setState(92);
				sub_var();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			setState(97);
			match(Semi);
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

	public static class Sub_varContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Equal() { return getToken(HelloParser.Equal, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HelloParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HelloParser.Comma, i);
		}
		public Sub_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSub_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSub_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSub_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_varContext sub_var() throws RecognitionException {
		Sub_varContext _localctx = new Sub_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sub_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			value();
			}
			setState(116);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(100);
				match(Equal);
				setState(114);
				switch (_input.LA(1)) {
				case T__2:
				case T__9:
				case T__13:
				case T__14:
				case ID:
				case DOUBLE:
				case INT:
				case CHAR:
					{
					setState(101);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(102);
					match(T__0);
					setState(111);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
						{
						setState(103);
						expr(0);
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(104);
							match(Comma);
							setState(105);
							expr(0);
							}
							}
							setState(110);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(113);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	public static class StmtBlockContext extends ParserRuleContext {
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__0);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Type) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(119);
				stmts();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__1);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public List<StmtBlockContext> stmtBlock() {
			return getRuleContexts(StmtBlockContext.class);
		}
		public StmtBlockContext stmtBlock(int i) {
			return getRuleContext(StmtBlockContext.class,i);
		}
		public List<ELSEContext> eLSE() {
			return getRuleContexts(ELSEContext.class);
		}
		public ELSEContext eLSE(int i) {
			return getRuleContext(ELSEContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(IF);
			setState(128);
			match(T__2);
			setState(129);
			compare(0);
			setState(130);
			match(T__3);
			setState(131);
			stmtBlock();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(132);
				match(T__4);
				setState(133);
				match(T__2);
				setState(134);
				compare(0);
				setState(135);
				match(T__3);
				setState(136);
				stmtBlock();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(143);
				eLSE();
				setState(144);
				stmtBlock();
				}
				}
				setState(150);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpBoolContext extends ExprContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ExpBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(HelloParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpValueContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(152);
					match(T__9);
					}
				}

				setState(155);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(156);
					match(T__9);
					}
				}

				setState(159);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(CHAR);
				}
				break;
			case 4:
				{
				_localctx = new ExpBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				bool();
				}
				break;
			case 5:
				{
				_localctx = new ExpValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				value();
				}
				break;
			case 6:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__2);
				setState(164);
				expr(0);
				setState(165);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(170);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(171);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(173);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(174);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	 
		public CompareContext() { }
		public void copyFrom(CompareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends CompareContext {
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public OrContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends CompareContext {
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public AndContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCompContext extends CompareContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public NotCompContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNotComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNotComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNotComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensCompContext extends CompareContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public ParensCompContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParensComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParensComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitParensComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompContext extends CompareContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Relation() { return getToken(HelloParser.Relation, 0); }
		public CompContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		return compare(0);
	}

	private CompareContext compare(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompareContext _localctx = new CompareContext(_ctx, _parentState);
		CompareContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_compare, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new NotCompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				match(T__10);
				setState(182);
				compare(5);
				}
				break;
			case 2:
				{
				_localctx = new CompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				expr(0);
				setState(186);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(184);
					match(Relation);
					setState(185);
					expr(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensCompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__2);
				setState(189);
				compare(0);
				setState(190);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new OrContext(new CompareContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(T__11);
						setState(196);
						compare(5);
						}
						break;
					case 2:
						{
						_localctx = new AndContext(new CompareContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_compare);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(T__12);
						setState(199);
						compare(4);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(WHILE);
			setState(206);
			match(T__2);
			setState(207);
			compare(0);
			setState(208);
			match(T__3);
			setState(209);
			stmtBlock();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(HelloParser.FOR, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(HelloParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(HelloParser.Semi, i);
		}
		public List<AssignStmtContext> assignStmt() {
			return getRuleContexts(AssignStmtContext.class);
		}
		public AssignStmtContext assignStmt(int i) {
			return getRuleContext(AssignStmtContext.class,i);
		}
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FOR);
			setState(212);
			match(T__2);
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				{
				setState(213);
				assignStmt();
				setState(214);
				match(Semi);
				}
				}
				break;
			case 2:
				{
				setState(216);
				varDecl();
				}
				break;
			case 3:
				{
				setState(217);
				expr(0);
				setState(218);
				match(Semi);
				}
				break;
			}
			setState(222);
			compare(0);
			setState(223);
			match(Semi);
			setState(224);
			assignStmt();
			setState(225);
			match(T__3);
			setState(226);
			stmtBlock();
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(HelloParser.BREAK, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BREAK);
			setState(229);
			match(Semi);
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

	public static class ReadStmtContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(HelloParser.READ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(READ);
			setState(232);
			match(T__2);
			setState(233);
			expr(0);
			setState(234);
			match(T__3);
			setState(235);
			match(Semi);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(HelloParser.WRITE, 0); }
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(WRITE);
			setState(238);
			match(T__2);
			setState(241);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(239);
				string();
				}
				break;
			case T__2:
			case T__9:
			case T__13:
			case T__14:
			case ID:
			case DOUBLE:
			case INT:
			case CHAR:
				{
				setState(240);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			match(T__3);
			setState(244);
			match(Semi);
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

	public static class AssignStmtContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(HelloParser.Equal, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			value();
			}
			setState(247);
			match(Equal);
			{
			setState(248);
			expr(0);
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

	public static class List_varContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(HelloParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HelloParser.Comma, i);
		}
		public List_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterList_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitList_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitList_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_varContext list_var() throws RecognitionException {
		List_varContext _localctx = new List_varContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			value();
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				match(Comma);
				setState(252);
				value();
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValIDContext extends ValueContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ValIDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitValID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValAVContext extends ValueContext {
		public ArrayValueContext arrayValue() {
			return getRuleContext(ArrayValueContext.class,0);
		}
		public ValAVContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValAV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValAV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitValAV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ValAVContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				arrayValue();
				}
				break;
			case 2:
				_localctx = new ValIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(ID);
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

	public static class ArrayValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode Lbracket() { return getToken(HelloParser.Lbracket, 0); }
		public TerminalNode Rbracket() { return getToken(HelloParser.Rbracket, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayValueContext arrayValue() throws RecognitionException {
		ArrayValueContext _localctx = new ArrayValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(Lbracket);
			setState(264);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
				{
				setState(263);
				expr(0);
				}
			}

			setState(266);
			match(Rbracket);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(STRING);
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

	public static class ELSEContext extends ParserRuleContext {
		public ELSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eLSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitELSE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitELSE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ELSEContext eLSE() throws RecognitionException {
		ELSEContext _localctx = new ELSEContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eLSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__15);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 8:
			return compare_sempred((CompareContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean compare_sempred(CompareContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\2\3"+
		"\2\3\2\3\2\5\2\66\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\5\4"+
		"S\n\4\3\4\5\4V\n\4\5\4X\n\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5`\n\5\r\5\16\5"+
		"a\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\5\6r\n\6"+
		"\3\6\5\6u\n\6\5\6w\n\6\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090\13\b"+
		"\3\b\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\t\3\t\5\t\u009c\n\t\3"+
		"\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00bd\n\n\3\n\3\n\3\n\3\n\5\n\u00c3\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00cb\n\n\f\n\16\n\u00ce\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00df\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00f4\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\6\21\u0100"+
		"\n\21\r\21\16\21\u0101\3\22\3\22\5\22\u0106\n\22\3\23\3\23\3\23\5\23\u010b"+
		"\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\4\20\22\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\b\n\3\2\13\f\3\2\20\21"+
		"\u012a\2-\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\b[\3\2\2\2\ne\3\2\2\2\fx\3\2\2"+
		"\2\16\u0081\3\2\2\2\20\u00a9\3\2\2\2\22\u00c2\3\2\2\2\24\u00cf\3\2\2\2"+
		"\26\u00d5\3\2\2\2\30\u00e6\3\2\2\2\32\u00e9\3\2\2\2\34\u00ef\3\2\2\2\36"+
		"\u00f8\3\2\2\2 \u00fc\3\2\2\2\"\u0105\3\2\2\2$\u0107\3\2\2\2&\u010e\3"+
		"\2\2\2(\u0110\3\2\2\2*\u0112\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\65\3\2\2\2\61\62\7\3\2\2\62\63\5\4\3\2\63\64\7\4"+
		"\2\2\64\66\3\2\2\2\65\61\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67D\5\b\5"+
		"\28D\5\6\4\29D\5\16\b\2:;\5\36\20\2;<\7#\2\2<D\3\2\2\2=D\5\24\13\2>D\5"+
		"\30\r\2?D\5\26\f\2@D\5\32\16\2AD\5\34\17\2BD\5\f\7\2C\67\3\2\2\2C8\3\2"+
		"\2\2C9\3\2\2\2C:\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2"+
		"\2\2CB\3\2\2\2D\5\3\2\2\2EF\7\24\2\2FW\5\"\22\2GU\7$\2\2HV\5\20\t\2IR"+
		"\7\3\2\2JO\5\20\t\2KL\7%\2\2LN\5\20\t\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RJ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\4\2\2"+
		"UH\3\2\2\2UI\3\2\2\2VX\3\2\2\2WG\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7#\2\2"+
		"Z\7\3\2\2\2[\\\7\24\2\2\\_\5\n\6\2]^\7%\2\2^`\5\n\6\2_]\3\2\2\2`a\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7#\2\2d\t\3\2\2\2ev\5\"\22\2ft\7"+
		"$\2\2gu\5\20\t\2hq\7\3\2\2in\5\20\t\2jk\7%\2\2km\5\20\t\2lj\3\2\2\2mp"+
		"\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2qr\3\2\2\2r"+
		"s\3\2\2\2su\7\4\2\2tg\3\2\2\2th\3\2\2\2uw\3\2\2\2vf\3\2\2\2vw\3\2\2\2"+
		"w\13\3\2\2\2x|\7\3\2\2y{\5\4\3\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\4\2\2\u0080\r\3\2\2\2\u0081\u0082"+
		"\7\32\2\2\u0082\u0083\7\5\2\2\u0083\u0084\5\22\n\2\u0084\u0085\7\6\2\2"+
		"\u0085\u008e\5\f\7\2\u0086\u0087\7\7\2\2\u0087\u0088\7\5\2\2\u0088\u0089"+
		"\5\22\n\2\u0089\u008a\7\6\2\2\u008a\u008b\5\f\7\2\u008b\u008d\3\2\2\2"+
		"\u008c\u0086\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0096\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5*\26\2\u0092"+
		"\u0093\5\f\7\2\u0093\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\17\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009b\b\t\1\2\u009a\u009c\7\f\2\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00aa\7 \2\2\u009e\u00a0\7\f"+
		"\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00aa\7\35\2\2\u00a2\u00aa\7!\2\2\u00a3\u00aa\5&\24\2\u00a4\u00aa\5\""+
		"\22\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\6\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a2\3\2"+
		"\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa"+
		"\u00b3\3\2\2\2\u00ab\u00ac\f\n\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00b2\5\20"+
		"\t\13\u00ae\u00af\f\t\2\2\u00af\u00b0\t\3\2\2\u00b0\u00b2\5\20\t\n\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\b\n\1\2\u00b7\u00b8\7\r\2\2\u00b8\u00c3\5\22\n\7\u00b9\u00bc\5\20\t\2"+
		"\u00ba\u00bb\7\34\2\2\u00bb\u00bd\5\20\t\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf\u00c0\5\22\n\2"+
		"\u00c0\u00c1\7\6\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b9"+
		"\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00cc\3\2\2\2\u00c4\u00c5\f\6\2\2\u00c5"+
		"\u00c6\7\16\2\2\u00c6\u00cb\5\22\n\7\u00c7\u00c8\f\5\2\2\u00c8\u00c9\7"+
		"\17\2\2\u00c9\u00cb\5\22\n\6\u00ca\u00c4\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\23\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\27\2\2\u00d0\u00d1\7\5\2\2\u00d1"+
		"\u00d2\5\22\n\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\5\f\7\2\u00d4\25\3\2\2"+
		"\2\u00d5\u00d6\7\31\2\2\u00d6\u00de\7\5\2\2\u00d7\u00d8\5\36\20\2\u00d8"+
		"\u00d9\7#\2\2\u00d9\u00df\3\2\2\2\u00da\u00df\5\6\4\2\u00db\u00dc\5\20"+
		"\t\2\u00dc\u00dd\7#\2\2\u00dd\u00df\3\2\2\2\u00de\u00d7\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\5\22"+
		"\n\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7\6\2\2\u00e4"+
		"\u00e5\5\f\7\2\u00e5\27\3\2\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\7#\2"+
		"\2\u00e8\31\3\2\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec"+
		"\5\20\t\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\7#\2\2\u00ee\33\3\2\2\2\u00ef"+
		"\u00f0\7\26\2\2\u00f0\u00f3\7\5\2\2\u00f1\u00f4\5(\25\2\u00f2\u00f4\5"+
		"\20\t\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\7\6\2\2\u00f6\u00f7\7#\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\5\"\22"+
		"\2\u00f9\u00fa\7$\2\2\u00fa\u00fb\5\20\t\2\u00fb\37\3\2\2\2\u00fc\u00ff"+
		"\5\"\22\2\u00fd\u00fe\7%\2\2\u00fe\u0100\5\"\22\2\u00ff\u00fd\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102!\3"+
		"\2\2\2\u0103\u0106\5$\23\2\u0104\u0106\7\33\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u0106#\3\2\2\2\u0107\u0108\7\33\2\2\u0108\u010a\7&\2\2"+
		"\u0109\u010b\5\20\t\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010d\7\'\2\2\u010d%\3\2\2\2\u010e\u010f\t\4\2\2\u010f"+
		"\'\3\2\2\2\u0110\u0111\7\37\2\2\u0111)\3\2\2\2\u0112\u0113\7\22\2\2\u0113"+
		"+\3\2\2\2\37/\65CORUWanqtv|\u008e\u0096\u009b\u009f\u00a9\u00b1\u00b3"+
		"\u00bc\u00c2\u00ca\u00cc\u00de\u00f3\u0101\u0105\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}