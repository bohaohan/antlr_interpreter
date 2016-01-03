package gen;// Generated from /Users/bohaohan/Documents/workspace/annl_antlr/src/Hello.g4 by ANTLR 4.5.1
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
		T__9=10, T__10=11, T__11=12, WS=13, Type=14, READ=15, WRITE=16, WHILE=17, 
		BREAK=18, FOR=19, IF=20, ID=21, Relation=22, DOUBLE=23, NEWLINE=24, INT=25, 
		CHAR=26, SL_COMMENT=27, Semi=28, Equal=29, Comma=30, Lbracket=31, Rbracket=32, 
		MUL_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_stmts = 1, RULE_varDecl = 2, RULE_listVar = 3, 
		RULE_sub_var = 4, RULE_stmtBlock = 5, RULE_ifStmt = 6, RULE_expr = 7, 
		RULE_compare = 8, RULE_whileStmt = 9, RULE_forStmt = 10, RULE_breakStmt = 11, 
		RULE_readStmt = 12, RULE_writeStmt = 13, RULE_assignStmt = 14, RULE_list_var = 15, 
		RULE_value = 16, RULE_arrayValue = 17, RULE_bool = 18, RULE_eLSE = 19;
	public static final String[] ruleNames = {
		"program", "stmts", "varDecl", "listVar", "sub_var", "stmtBlock", "ifStmt", 
		"expr", "compare", "whileStmt", "forStmt", "breakStmt", "readStmt", "writeStmt", 
		"assignStmt", "list_var", "value", "arrayValue", "bool", "eLSE"
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
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					stmts();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(49);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(45);
				match(T__0);
				setState(46);
				stmts();
				setState(47);
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
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				listVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(54);
				assignStmt();
				setState(55);
				match(Semi);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				readStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				writeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
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
			setState(65);
			match(Type);
			{
			setState(66);
			value();
			}
			setState(83);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(67);
				match(Equal);
				setState(81);
				switch (_input.LA(1)) {
				case T__2:
				case T__8:
				case ID:
				case DOUBLE:
				case INT:
				case CHAR:
					{
					setState(68);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(69);
					match(T__0);
					setState(78);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
						{
						setState(70);
						expr(0);
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(71);
							match(Comma);
							setState(72);
							expr(0);
							}
							}
							setState(77);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(80);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(85);
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
			setState(87);
			match(Type);
			setState(88);
			sub_var();
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				match(Comma);
				setState(90);
				sub_var();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			setState(95);
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
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				list_var();
				}
				break;
			case 2:
				{
				setState(98);
				value();
				}
				break;
			}
			setState(117);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(101);
				match(Equal);
				setState(115);
				switch (_input.LA(1)) {
				case T__2:
				case T__8:
				case ID:
				case DOUBLE:
				case INT:
				case CHAR:
					{
					setState(102);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(103);
					match(T__0);
					setState(112);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
						{
						setState(104);
						expr(0);
						setState(109);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(105);
							match(Comma);
							setState(106);
							expr(0);
							}
							}
							setState(111);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(114);
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
			setState(119);
			match(T__0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Type) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(120);
				stmts();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
			setState(128);
			match(IF);
			setState(129);
			match(T__2);
			setState(130);
			compare();
			setState(131);
			match(T__3);
			setState(132);
			stmtBlock();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(133);
				match(T__4);
				setState(134);
				match(T__2);
				setState(135);
				compare();
				setState(136);
				match(T__3);
				setState(137);
				stmtBlock();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(144);
				eLSE();
				setState(145);
				stmtBlock();
				}
				}
				setState(151);
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
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(154);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(153);
					match(T__8);
					}
				}

				setState(156);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(157);
					match(T__8);
					}
				}

				setState(160);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(CHAR);
				}
				break;
			case 4:
				{
				_localctx = new ExpValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				value();
				}
				break;
			case 5:
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
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(170);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(171);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(173);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(174);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Relation() { return getToken(HelloParser.Relation, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			expr(0);
			setState(183);
			_la = _input.LA(1);
			if (_la==Relation) {
				{
				setState(181);
				match(Relation);
				setState(182);
				expr(0);
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
			setState(185);
			match(WHILE);
			setState(186);
			match(T__2);
			setState(187);
			compare();
			setState(188);
			match(T__3);
			setState(189);
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
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
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
			setState(191);
			match(FOR);
			setState(192);
			match(T__2);
			setState(195);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(193);
				assignStmt();
				}
				break;
			case Type:
				{
				setState(194);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			compare();
			setState(198);
			match(Semi);
			setState(199);
			assignStmt();
			setState(200);
			match(T__3);
			setState(201);
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
			setState(203);
			match(BREAK);
			setState(204);
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
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(206);
			match(READ);
			setState(207);
			match(T__2);
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(208);
				match(ID);
				}
				break;
			case 2:
				{
				setState(209);
				match(ID);
				setState(210);
				match(Lbracket);
				setState(211);
				expr(0);
				setState(212);
				match(Rbracket);
				}
				break;
			}
			setState(216);
			match(T__3);
			setState(217);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
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
			setState(219);
			match(WRITE);
			setState(220);
			match(T__2);
			setState(221);
			expr(0);
			setState(222);
			match(T__3);
			setState(223);
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
		public List<TerminalNode> Equal() { return getTokens(HelloParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(HelloParser.Equal, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(225);
				value();
				}
				break;
			case 2:
				{
				setState(226);
				list_var();
				}
				break;
			}
			setState(229);
			match(Equal);
			setState(243);
			switch (_input.LA(1)) {
			case T__2:
			case T__8:
			case ID:
			case DOUBLE:
			case INT:
			case CHAR:
				{
				setState(230);
				expr(0);
				}
				break;
			case T__0:
				{
				setState(231);
				match(T__0);
				setState(240);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
					{
					setState(232);
					expr(0);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(233);
						match(Comma);
						setState(234);
						expr(0);
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(242);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(245);
				match(Comma);
				setState(246);
				value();
				setState(263);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(247);
					match(Equal);
					setState(261);
					switch (_input.LA(1)) {
					case T__2:
					case T__8:
					case ID:
					case DOUBLE:
					case INT:
					case CHAR:
						{
						setState(248);
						expr(0);
						}
						break;
					case T__0:
						{
						setState(249);
						match(T__0);
						setState(258);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
							{
							setState(250);
							expr(0);
							setState(255);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(251);
								match(Comma);
								setState(252);
								expr(0);
								}
								}
								setState(257);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(260);
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
				setState(269);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			value();
			setState(273); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(271);
					match(Comma);
					setState(272);
					value();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(275); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ValAVContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				arrayValue();
				}
				break;
			case 2:
				_localctx = new ValIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
			setState(281);
			match(ID);
			setState(282);
			match(Lbracket);
			setState(284);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
				{
				setState(283);
				expr(0);
				}
			}

			setState(286);
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
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		enterRule(_localctx, 38, RULE_eLSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__11);
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
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\2\3\2"+
		"\5\2\64\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\5\4Q\n\4\3\4\5"+
		"\4T\n\4\5\4V\n\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5^\n\5\r\5\16\5_\3\5\3\5\3"+
		"\6\3\6\5\6f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\5\6s\n"+
		"\6\3\6\5\6v\n\6\5\6x\n\6\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091"+
		"\13\b\3\b\3\b\3\b\7\b\u0096\n\b\f\b\16\b\u0099\13\b\3\t\3\t\5\t\u009d"+
		"\n\t\3\t\3\t\5\t\u00a1\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\3\n\3\n\5"+
		"\n\u00ba\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00c6\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00d9\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20\u00e6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ee\n"+
		"\20\f\20\16\20\u00f1\13\20\5\20\u00f3\n\20\3\20\5\20\u00f6\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0100\n\20\f\20\16\20\u0103\13"+
		"\20\5\20\u0105\n\20\3\20\5\20\u0108\n\20\5\20\u010a\n\20\7\20\u010c\n"+
		"\20\f\20\16\20\u010f\13\20\3\21\3\21\3\21\6\21\u0114\n\21\r\21\16\21\u0115"+
		"\3\22\3\22\5\22\u011a\n\22\3\23\3\23\3\23\5\23\u011f\n\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\2\3\20\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\5\3\2\b\t\3\2\n\13\3\2\f\r\u0141\2+\3\2\2\2\4A\3\2\2\2\6C"+
		"\3\2\2\2\bY\3\2\2\2\ne\3\2\2\2\fy\3\2\2\2\16\u0082\3\2\2\2\20\u00a9\3"+
		"\2\2\2\22\u00b6\3\2\2\2\24\u00bb\3\2\2\2\26\u00c1\3\2\2\2\30\u00cd\3\2"+
		"\2\2\32\u00d0\3\2\2\2\34\u00dd\3\2\2\2\36\u00e5\3\2\2\2 \u0110\3\2\2\2"+
		"\"\u0119\3\2\2\2$\u011b\3\2\2\2&\u0122\3\2\2\2(\u0124\3\2\2\2*,\5\4\3"+
		"\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/\60\7\3\2\2\60"+
		"\61\5\4\3\2\61\62\7\4\2\2\62\64\3\2\2\2\63/\3\2\2\2\63\64\3\2\2\2\64\3"+
		"\3\2\2\2\65B\5\b\5\2\66B\5\6\4\2\67B\5\16\b\289\5\36\20\29:\7\36\2\2:"+
		"B\3\2\2\2;B\5\24\13\2<B\5\30\r\2=B\5\26\f\2>B\5\32\16\2?B\5\34\17\2@B"+
		"\5\f\7\2A\65\3\2\2\2A\66\3\2\2\2A\67\3\2\2\2A8\3\2\2\2A;\3\2\2\2A<\3\2"+
		"\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD\7\20\2\2DU\5"+
		"\"\22\2ES\7\37\2\2FT\5\20\t\2GP\7\3\2\2HM\5\20\t\2IJ\7 \2\2JL\5\20\t\2"+
		"KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PH\3\2\2\2"+
		"PQ\3\2\2\2QR\3\2\2\2RT\7\4\2\2SF\3\2\2\2SG\3\2\2\2TV\3\2\2\2UE\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\7\36\2\2X\7\3\2\2\2YZ\7\20\2\2Z]\5\n\6\2[\\\7 "+
		"\2\2\\^\5\n\6\2][\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7"+
		"\36\2\2b\t\3\2\2\2cf\5 \21\2df\5\"\22\2ec\3\2\2\2ed\3\2\2\2fw\3\2\2\2"+
		"gu\7\37\2\2hv\5\20\t\2ir\7\3\2\2jo\5\20\t\2kl\7 \2\2ln\5\20\t\2mk\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rj\3\2\2\2rs\3\2"+
		"\2\2st\3\2\2\2tv\7\4\2\2uh\3\2\2\2ui\3\2\2\2vx\3\2\2\2wg\3\2\2\2wx\3\2"+
		"\2\2x\13\3\2\2\2y}\7\3\2\2z|\5\4\3\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\4\2\2\u0081\r\3\2"+
		"\2\2\u0082\u0083\7\26\2\2\u0083\u0084\7\5\2\2\u0084\u0085\5\22\n\2\u0085"+
		"\u0086\7\6\2\2\u0086\u008f\5\f\7\2\u0087\u0088\7\7\2\2\u0088\u0089\7\5"+
		"\2\2\u0089\u008a\5\22\n\2\u008a\u008b\7\6\2\2\u008b\u008c\5\f\7\2\u008c"+
		"\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\5(\25\2\u0093\u0094\5\f\7\2\u0094\u0096\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\17\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\b\t\1\2\u009b\u009d\7\13\2"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00aa"+
		"\7\33\2\2\u009f\u00a1\7\13\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00aa\7\31\2\2\u00a3\u00aa\7\34\2\2\u00a4\u00aa"+
		"\5\"\22\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\6\2\2"+
		"\u00a8\u00aa\3\2\2\2\u00a9\u009a\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3"+
		"\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00b3\3\2\2\2\u00ab"+
		"\u00ac\f\t\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00b2\5\20\t\n\u00ae\u00af\f"+
		"\b\2\2\u00af\u00b0\t\3\2\2\u00b0\u00b2\5\20\t\t\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\5\20\t\2\u00b7\u00b8"+
		"\7\30\2\2\u00b8\u00ba\5\20\t\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\23\3\2\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00be"+
		"\5\22\n\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\5\f\7\2\u00c0\25\3\2\2\2\u00c1"+
		"\u00c2\7\25\2\2\u00c2\u00c5\7\5\2\2\u00c3\u00c6\5\36\20\2\u00c4\u00c6"+
		"\5\6\4\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\5\22\n\2\u00c8\u00c9\7\36\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb"+
		"\7\6\2\2\u00cb\u00cc\5\f\7\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\24\2\2\u00ce"+
		"\u00cf\7\36\2\2\u00cf\31\3\2\2\2\u00d0\u00d1\7\21\2\2\u00d1\u00d8\7\5"+
		"\2\2\u00d2\u00d9\7\27\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5\7!\2\2\u00d5"+
		"\u00d6\5\20\t\2\u00d6\u00d7\7\"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d2\3"+
		"\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\6\2\2\u00db"+
		"\u00dc\7\36\2\2\u00dc\33\3\2\2\2\u00dd\u00de\7\22\2\2\u00de\u00df\7\5"+
		"\2\2\u00df\u00e0\5\20\t\2\u00e0\u00e1\7\6\2\2\u00e1\u00e2\7\36\2\2\u00e2"+
		"\35\3\2\2\2\u00e3\u00e6\5\"\22\2\u00e4\u00e6\5 \21\2\u00e5\u00e3\3\2\2"+
		"\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f5\7\37\2\2\u00e8"+
		"\u00f6\5\20\t\2\u00e9\u00f2\7\3\2\2\u00ea\u00ef\5\20\t\2\u00eb\u00ec\7"+
		" \2\2\u00ec\u00ee\5\20\t\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\7\4\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f6\u010d\3\2"+
		"\2\2\u00f7\u00f8\7 \2\2\u00f8\u0109\5\"\22\2\u00f9\u0107\7\37\2\2\u00fa"+
		"\u0108\5\20\t\2\u00fb\u0104\7\3\2\2\u00fc\u0101\5\20\t\2\u00fd\u00fe\7"+
		" \2\2\u00fe\u0100\5\20\t\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u00fc\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\7\4\2\2\u0107\u00fa\3\2\2\2\u0107\u00fb\3\2\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u00f9\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u00f7\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\37\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\5\"\22\2\u0111\u0112"+
		"\7 \2\2\u0112\u0114\5\"\22\2\u0113\u0111\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116!\3\2\2\2\u0117\u011a\5$\23\2"+
		"\u0118\u011a\7\27\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a#\3"+
		"\2\2\2\u011b\u011c\7\27\2\2\u011c\u011e\7!\2\2\u011d\u011f\5\20\t\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\""+
		"\2\2\u0121%\3\2\2\2\u0122\u0123\t\4\2\2\u0123\'\3\2\2\2\u0124\u0125\7"+
		"\16\2\2\u0125)\3\2\2\2&-\63AMPSU_eoruw}\u008f\u0097\u009c\u00a0\u00a9"+
		"\u00b1\u00b3\u00b9\u00c5\u00d8\u00e5\u00ef\u00f2\u00f5\u0101\u0104\u0107"+
		"\u0109\u010d\u0115\u0119\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}