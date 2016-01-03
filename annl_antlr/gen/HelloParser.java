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
		T__9=10, T__10=11, T__11=12, WS=13, Type=14, READ=15, WRITE=16, WHILE=17, 
		BREAK=18, FOR=19, IF=20, ID=21, Relation=22, DOUBLE=23, NEWLINE=24, INT=25, 
		CHAR=26, SL_COMMENT=27, Semi=28, Equal=29, Comma=30, Lbracket=31, Rbracket=32, 
		MUL_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_stmts = 1, RULE_varDecl = 2, RULE_listVar = 3, 
		RULE_stmtBlock = 4, RULE_ifStmt = 5, RULE_expr = 6, RULE_compare = 7, 
		RULE_whileStmt = 8, RULE_forStmt = 9, RULE_breakStmt = 10, RULE_readStmt = 11, 
		RULE_writeStmt = 12, RULE_assignStmt = 13, RULE_list_var = 14, RULE_value = 15, 
		RULE_arrayValue = 16, RULE_bool = 17, RULE_eLSE = 18;
	public static final String[] ruleNames = {
		"program", "stmts", "varDecl", "listVar", "stmtBlock", "ifStmt", "expr", 
		"compare", "whileStmt", "forStmt", "breakStmt", "readStmt", "writeStmt", 
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
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					stmts();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(47);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(43);
				match(T__0);
				setState(44);
				stmts();
				setState(45);
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
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				listVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(52);
				assignStmt();
				setState(53);
				match(Semi);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				forStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				readStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(59);
				writeStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(60);
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
			setState(63);
			match(Type);
			{
			setState(64);
			value();
			}
			setState(81);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(65);
				match(Equal);
				setState(79);
				switch (_input.LA(1)) {
				case T__2:
				case T__8:
				case ID:
				case DOUBLE:
				case INT:
				case CHAR:
					{
					setState(66);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(67);
					match(T__0);
					setState(76);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
						{
						setState(68);
						expr(0);
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(69);
							match(Comma);
							setState(70);
							expr(0);
							}
							}
							setState(75);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(78);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(83);
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
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
		public TerminalNode Semi() { return getToken(HelloParser.Semi, 0); }
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
			setState(85);
			match(Type);
			setState(86);
			list_var();
			setState(124);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(87);
				match(Equal);
				setState(101);
				switch (_input.LA(1)) {
				case T__2:
				case T__8:
				case ID:
				case DOUBLE:
				case INT:
				case CHAR:
					{
					setState(88);
					expr(0);
					}
					break;
				case T__0:
					{
					setState(89);
					match(T__0);
					setState(98);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
						{
						setState(90);
						expr(0);
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(91);
							match(Comma);
							setState(92);
							expr(0);
							}
							}
							setState(97);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(100);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(103);
					match(Comma);
					setState(117);
					switch (_input.LA(1)) {
					case T__2:
					case T__8:
					case ID:
					case DOUBLE:
					case INT:
					case CHAR:
						{
						setState(104);
						expr(0);
						}
						break;
					case T__0:
						{
						setState(105);
						match(T__0);
						setState(114);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
							{
							setState(106);
							expr(0);
							setState(111);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(107);
								match(Comma);
								setState(108);
								expr(0);
								}
								}
								setState(113);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(116);
						match(T__1);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(126);
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
		enterRule(_localctx, 8, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__0);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Type) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(129);
				stmts();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IF);
			setState(138);
			match(T__2);
			setState(139);
			compare();
			setState(140);
			match(T__3);
			setState(141);
			stmtBlock();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(142);
				match(T__4);
				setState(143);
				match(T__2);
				setState(144);
				compare();
				setState(145);
				match(T__3);
				setState(146);
				stmtBlock();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(153);
				eLSE();
				setState(154);
				stmtBlock();
				}
				}
				setState(160);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(163);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(162);
					match(T__8);
					}
				}

				setState(165);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(166);
					match(T__8);
					}
				}

				setState(169);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(CHAR);
				}
				break;
			case 4:
				{
				_localctx = new ExpValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				value();
				}
				break;
			case 5:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__2);
				setState(173);
				expr(0);
				setState(174);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(179);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(180);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(182);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(183);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 14, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expr(0);
			setState(192);
			_la = _input.LA(1);
			if (_la==Relation) {
				{
				setState(190);
				match(Relation);
				setState(191);
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
		enterRule(_localctx, 16, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WHILE);
			setState(195);
			match(T__2);
			setState(196);
			compare();
			setState(197);
			match(T__3);
			setState(198);
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
		enterRule(_localctx, 18, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(FOR);
			setState(201);
			match(T__2);
			setState(204);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(202);
				assignStmt();
				}
				break;
			case Type:
				{
				setState(203);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			compare();
			setState(207);
			match(Semi);
			setState(208);
			assignStmt();
			setState(209);
			match(T__3);
			setState(210);
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
		enterRule(_localctx, 20, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(BREAK);
			setState(213);
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
		enterRule(_localctx, 22, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(READ);
			setState(216);
			match(T__2);
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(217);
				match(ID);
				}
				break;
			case 2:
				{
				setState(218);
				match(ID);
				setState(219);
				match(Lbracket);
				setState(220);
				expr(0);
				setState(221);
				match(Rbracket);
				}
				break;
			}
			setState(225);
			match(T__3);
			setState(226);
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
		enterRule(_localctx, 24, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(WRITE);
			setState(229);
			match(T__2);
			setState(230);
			expr(0);
			setState(231);
			match(T__3);
			setState(232);
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
		enterRule(_localctx, 26, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(234);
				value();
				}
				break;
			case 2:
				{
				setState(235);
				list_var();
				}
				break;
			}
			setState(238);
			match(Equal);
			setState(252);
			switch (_input.LA(1)) {
			case T__2:
			case T__8:
			case ID:
			case DOUBLE:
			case INT:
			case CHAR:
				{
				setState(239);
				expr(0);
				}
				break;
			case T__0:
				{
				setState(240);
				match(T__0);
				setState(249);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
					{
					setState(241);
					expr(0);
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(242);
						match(Comma);
						setState(243);
						expr(0);
						}
						}
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(251);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(254);
				match(Comma);
				setState(255);
				value();
				setState(272);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(256);
					match(Equal);
					setState(270);
					switch (_input.LA(1)) {
					case T__2:
					case T__8:
					case ID:
					case DOUBLE:
					case INT:
					case CHAR:
						{
						setState(257);
						expr(0);
						}
						break;
					case T__0:
						{
						setState(258);
						match(T__0);
						setState(267);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
							{
							setState(259);
							expr(0);
							setState(264);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(260);
								match(Comma);
								setState(261);
								expr(0);
								}
								}
								setState(266);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(269);
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
				setState(278);
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
		enterRule(_localctx, 28, RULE_list_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			value();
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				match(Comma);
				setState(281);
				value();
				}
				}
				setState(284); 
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new ValAVContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				arrayValue();
				}
				break;
			case 2:
				_localctx = new ValIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
		enterRule(_localctx, 32, RULE_arrayValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(291);
			match(Lbracket);
			setState(293);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << ID) | (1L << DOUBLE) | (1L << INT) | (1L << CHAR))) != 0)) {
				{
				setState(292);
				expr(0);
				}
			}

			setState(295);
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
		enterRule(_localctx, 34, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 36, RULE_eLSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		case 6:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\2\3\2\5\2\62\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3\4\5\4R\n\4\5\4"+
		"T\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5`\n\5\f\5\16\5c\13\5"+
		"\5\5e\n\5\3\5\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13\5"+
		"\5\5u\n\5\3\5\5\5x\n\5\7\5z\n\5\f\5\16\5}\13\5\5\5\177\n\5\3\5\3\5\3\6"+
		"\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\7\3\7\3\7\7\7"+
		"\u009f\n\7\f\7\16\7\u00a2\13\7\3\b\3\b\5\b\u00a6\n\b\3\b\3\b\5\b\u00aa"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00bb\n\b\f\b\16\b\u00be\13\b\3\t\3\t\3\t\5\t\u00c3\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00cf\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e2\n\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00ef\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00f7\n\17\f\17\16\17\u00fa\13\17\5\17"+
		"\u00fc\n\17\3\17\5\17\u00ff\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\5\17\u010e\n\17\3\17\5\17\u0111"+
		"\n\17\5\17\u0113\n\17\7\17\u0115\n\17\f\17\16\17\u0118\13\17\3\20\3\20"+
		"\3\20\6\20\u011d\n\20\r\20\16\20\u011e\3\21\3\21\5\21\u0123\n\21\3\22"+
		"\3\22\3\22\5\22\u0128\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\3\16\25"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\5\3\2\b\t\3\2\n\13\3\2"+
		"\f\r\u014d\2)\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bW\3\2\2\2\n\u0082\3\2\2\2"+
		"\f\u008b\3\2\2\2\16\u00b2\3\2\2\2\20\u00bf\3\2\2\2\22\u00c4\3\2\2\2\24"+
		"\u00ca\3\2\2\2\26\u00d6\3\2\2\2\30\u00d9\3\2\2\2\32\u00e6\3\2\2\2\34\u00ee"+
		"\3\2\2\2\36\u0119\3\2\2\2 \u0122\3\2\2\2\"\u0124\3\2\2\2$\u012b\3\2\2"+
		"\2&\u012d\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61"+
		"\3\2\2\2-.\7\3\2\2./\5\4\3\2/\60\7\4\2\2\60\62\3\2\2\2\61-\3\2\2\2\61"+
		"\62\3\2\2\2\62\3\3\2\2\2\63@\5\b\5\2\64@\5\6\4\2\65@\5\f\7\2\66\67\5\34"+
		"\17\2\678\7\36\2\28@\3\2\2\29@\5\22\n\2:@\5\26\f\2;@\5\24\13\2<@\5\30"+
		"\r\2=@\5\32\16\2>@\5\n\6\2?\63\3\2\2\2?\64\3\2\2\2?\65\3\2\2\2?\66\3\2"+
		"\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3"+
		"\2\2\2AB\7\20\2\2BS\5 \21\2CQ\7\37\2\2DR\5\16\b\2EN\7\3\2\2FK\5\16\b\2"+
		"GH\7 \2\2HJ\5\16\b\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7\4\2\2QD\3\2\2\2QE\3\2\2\2"+
		"RT\3\2\2\2SC\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\36\2\2V\7\3\2\2\2WX\7\20"+
		"\2\2X~\5\36\20\2Yg\7\37\2\2Zh\5\16\b\2[d\7\3\2\2\\a\5\16\b\2]^\7 \2\2"+
		"^`\5\16\b\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2"+
		"\2d\\\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7\4\2\2gZ\3\2\2\2g[\3\2\2\2h{\3\2"+
		"\2\2iw\7 \2\2jx\5\16\b\2kt\7\3\2\2lq\5\16\b\2mn\7 \2\2np\5\16\b\2om\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3"+
		"\2\2\2uv\3\2\2\2vx\7\4\2\2wj\3\2\2\2wk\3\2\2\2xz\3\2\2\2yi\3\2\2\2z}\3"+
		"\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~Y\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\7\36\2\2\u0081\t\3\2\2\2\u0082\u0086"+
		"\7\3\2\2\u0083\u0085\5\4\3\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008a\7\4\2\2\u008a\13\3\2\2\2\u008b\u008c\7\26\2\2\u008c\u008d"+
		"\7\5\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\6\2\2\u008f\u0098\5\n\6\2"+
		"\u0090\u0091\7\7\2\2\u0091\u0092\7\5\2\2\u0092\u0093\5\20\t\2\u0093\u0094"+
		"\7\6\2\2\u0094\u0095\5\n\6\2\u0095\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a0\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5&\24\2\u009c\u009d\5\n\6\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5"+
		"\b\b\1\2\u00a4\u00a6\7\13\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00b3\7\33\2\2\u00a8\u00aa\7\13\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b3\7\31\2\2"+
		"\u00ac\u00b3\7\34\2\2\u00ad\u00b3\5 \21\2\u00ae\u00af\7\5\2\2\u00af\u00b0"+
		"\5\16\b\2\u00b0\u00b1\7\6\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a3\3\2\2\2"+
		"\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b3\u00bc\3\2\2\2\u00b4\u00b5\f\t\2\2\u00b5\u00b6\t\2\2\2\u00b6"+
		"\u00bb\5\16\b\n\u00b7\u00b8\f\b\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00bb\5"+
		"\16\b\t\u00ba\u00b4\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c2\5\16\b\2\u00c0\u00c1\7\30\2\2\u00c1\u00c3\5\16\b\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\21\3\2\2\2\u00c4\u00c5\7\23\2"+
		"\2\u00c5\u00c6\7\5\2\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\7\6\2\2\u00c8"+
		"\u00c9\5\n\6\2\u00c9\23\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00ce\7\5\2"+
		"\2\u00cc\u00cf\5\34\17\2\u00cd\u00cf\5\6\4\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d2\7"+
		"\36\2\2\u00d2\u00d3\5\34\17\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5\n\6\2"+
		"\u00d5\25\3\2\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\7\36\2\2\u00d8\27\3"+
		"\2\2\2\u00d9\u00da\7\21\2\2\u00da\u00e1\7\5\2\2\u00db\u00e2\7\27\2\2\u00dc"+
		"\u00dd\7\27\2\2\u00dd\u00de\7!\2\2\u00de\u00df\5\16\b\2\u00df\u00e0\7"+
		"\"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\7\36\2\2\u00e5\31\3\2\2"+
		"\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9\5\16\b\2\u00e9"+
		"\u00ea\7\6\2\2\u00ea\u00eb\7\36\2\2\u00eb\33\3\2\2\2\u00ec\u00ef\5 \21"+
		"\2\u00ed\u00ef\5\36\20\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00fe\7\37\2\2\u00f1\u00ff\5\16\b\2\u00f2\u00fb\7"+
		"\3\2\2\u00f3\u00f8\5\16\b\2\u00f4\u00f5\7 \2\2\u00f5\u00f7\5\16\b\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\7\4\2\2\u00fe\u00f1\3\2"+
		"\2\2\u00fe\u00f2\3\2\2\2\u00ff\u0116\3\2\2\2\u0100\u0101\7 \2\2\u0101"+
		"\u0112\5 \21\2\u0102\u0110\7\37\2\2\u0103\u0111\5\16\b\2\u0104\u010d\7"+
		"\3\2\2\u0105\u010a\5\16\b\2\u0106\u0107\7 \2\2\u0107\u0109\5\16\b\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0105\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7\4\2\2\u0110\u0103\3\2"+
		"\2\2\u0110\u0104\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0102\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0100\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\35\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011c\5 \21\2\u011a\u011b\7 \2\2\u011b\u011d\5 \21\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\37\3\2\2\2\u0120\u0123\5\"\22\2\u0121\u0123\7\27\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123!\3\2\2\2\u0124\u0125\7\27\2\2"+
		"\u0125\u0127\7!\2\2\u0126\u0128\5\16\b\2\u0127\u0126\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\"\2\2\u012a#\3\2\2\2\u012b"+
		"\u012c\t\4\2\2\u012c%\3\2\2\2\u012d\u012e\7\16\2\2\u012e\'\3\2\2\2(+\61"+
		"?KNQSadgqtw{~\u0086\u0098\u00a0\u00a5\u00a9\u00b2\u00ba\u00bc\u00c2\u00ce"+
		"\u00e1\u00ee\u00f8\u00fb\u00fe\u010a\u010d\u0110\u0112\u0116\u011e\u0122"+
		"\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}