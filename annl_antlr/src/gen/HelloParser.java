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
		T__9=10, WS=11, Type=12, READ=13, WRITE=14, WHILE=15, BREAK=16, FOR=17, 
		IF=18, ID=19, Relation=20, DOUBLE=21, NEWLINE=22, BOOL=23, INT=24, CHAR=25, 
		SL_COMMENT=26, Semi=27, Equal=28, Comma=29, Lbracket=30, Rbracket=31, 
		MUL_COMMENT=32;
	public static final int
		RULE_program = 0, RULE_stmts = 1, RULE_varDecl = 2, RULE_stmtBlock = 3, 
		RULE_ifStmt = 4, RULE_expr = 5, RULE_eExpr = 6, RULE_whileStmt = 7, RULE_forStmt = 8, 
		RULE_breakStmt = 9, RULE_readStmt = 10, RULE_writeStmt = 11, RULE_assignStmt = 12, 
		RULE_list_var = 13, RULE_value = 14, RULE_arrayValue = 15, RULE_eLSE = 16;
	public static final String[] ruleNames = {
		"program", "stmts", "varDecl", "stmtBlock", "ifStmt", "expr", "eExpr", 
		"whileStmt", "forStmt", "breakStmt", "readStmt", "writeStmt", "assignStmt", 
		"list_var", "value", "arrayValue", "eLSE"
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
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					stmts();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(43);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(39);
				match(T__0);
				setState(40);
				stmts();
				setState(41);
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
			setState(56);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				varDecl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				ifStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(47);
				assignStmt();
				setState(48);
				match(Semi);
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				whileStmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				breakStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				forStmt();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				readStmt();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				writeStmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				stmtBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
		public List<TerminalNode> Equal() { return getTokens(HelloParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(HelloParser.Equal, i);
		}
		public List<TerminalNode> Comma() { return getTokens(HelloParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(HelloParser.Comma, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(58);
			match(Type);
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(59);
				value();
				}
				break;
			case 2:
				{
				setState(60);
				list_var();
				}
				break;
			}
			setState(78);
			_la = _input.LA(1);
			if (_la==Equal) {
				{
				setState(63);
				match(Equal);
				setState(76);
				switch (_input.LA(1)) {
				case T__2:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case ID:
				case DOUBLE:
				case BOOL:
				case INT:
				case CHAR:
					{
					setState(64);
					expr();
					}
					break;
				case T__0:
					{
					setState(65);
					match(T__0);
					setState(66);
					expr();
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(67);
						match(Comma);
						setState(68);
						expr();
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(74);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(80);
				match(Comma);
				setState(81);
				value();
				setState(97);
				_la = _input.LA(1);
				if (_la==Equal) {
					{
					setState(82);
					match(Equal);
					setState(95);
					switch (_input.LA(1)) {
					case T__2:
					case T__5:
					case T__6:
					case T__7:
					case T__8:
					case ID:
					case DOUBLE:
					case BOOL:
					case INT:
					case CHAR:
						{
						setState(83);
						expr();
						}
						break;
					case T__0:
						{
						setState(84);
						match(T__0);
						setState(85);
						expr();
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(86);
							match(Comma);
							setState(87);
							expr();
							}
							}
							setState(92);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(93);
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
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
		enterRule(_localctx, 6, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__0);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Type) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << BREAK) | (1L << FOR) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(107);
				stmts();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 8, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IF);
			setState(116);
			match(T__2);
			setState(117);
			expr();
			setState(118);
			match(T__3);
			setState(119);
			stmtBlock();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(120);
				match(T__4);
				setState(121);
				match(T__2);
				setState(122);
				expr();
				setState(123);
				match(T__3);
				setState(124);
				stmtBlock();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(131);
				eLSE();
				setState(132);
				stmtBlock();
				}
				}
				setState(138);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<EExprContext> eExpr() {
			return getRuleContexts(EExprContext.class);
		}
		public EExprContext eExpr(int i) {
			return getRuleContext(EExprContext.class,i);
		}
		public TerminalNode Relation() { return getToken(HelloParser.Relation, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case ID:
				case DOUBLE:
				case BOOL:
				case INT:
				case CHAR:
					{
					setState(147);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(140);
						_la = _input.LA(1);
						if (_la==T__5 || _la==T__6) {
							{
							setState(139);
							_la = _input.LA(1);
							if ( !(_la==T__5 || _la==T__6) ) {
							_errHandler.recoverInline(this);
							} else {
								consume();
							}
							}
						}

						setState(142);
						value();
						}
						break;
					case 2:
						{
						setState(144);
						_la = _input.LA(1);
						if (_la==T__5 || _la==T__6) {
							{
							setState(143);
							_la = _input.LA(1);
							if ( !(_la==T__5 || _la==T__6) ) {
							_errHandler.recoverInline(this);
							} else {
								consume();
							}
							}
						}

						setState(146);
						eExpr();
						}
						break;
					}
					{
					setState(157);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(149);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(155);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(150);
							expr();
							}
							break;
						case 2:
							{
							{
							setState(151);
							match(T__2);
							setState(152);
							expr();
							setState(153);
							match(T__3);
							}
							}
							break;
						}
						}
						break;
					}
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(159);
						match(Relation);
						{
						setState(160);
						expr();
						}
						}
						break;
					}
					}
					}
					break;
				case T__2:
					{
					setState(163);
					match(T__2);
					setState(172);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(165);
						_la = _input.LA(1);
						if (_la==T__5 || _la==T__6) {
							{
							setState(164);
							_la = _input.LA(1);
							if ( !(_la==T__5 || _la==T__6) ) {
							_errHandler.recoverInline(this);
							} else {
								consume();
							}
							}
						}

						setState(167);
						value();
						}
						break;
					case 2:
						{
						setState(169);
						_la = _input.LA(1);
						if (_la==T__5 || _la==T__6) {
							{
							setState(168);
							_la = _input.LA(1);
							if ( !(_la==T__5 || _la==T__6) ) {
							_errHandler.recoverInline(this);
							} else {
								consume();
							}
							}
						}

						setState(171);
						eExpr();
						}
						break;
					}
					setState(179);
					_la = _input.LA(1);
					if (_la==Relation) {
						{
						setState(174);
						match(Relation);
						setState(177);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(175);
							value();
							}
							break;
						case 2:
							{
							setState(176);
							eExpr();
							}
							break;
						}
						}
					}

					setState(181);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(186);
						expr();
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(198);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(193);
					expr();
					}
					break;
				case 2:
					{
					{
					setState(194);
					match(T__2);
					setState(195);
					expr();
					setState(196);
					match(T__3);
					}
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(201);
					_la = _input.LA(1);
					if (_la==T__5 || _la==T__6) {
						{
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(203);
					value();
					}
					break;
				case 2:
					{
					setState(205);
					_la = _input.LA(1);
					if (_la==T__5 || _la==T__6) {
						{
						setState(204);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
					}

					setState(207);
					eExpr();
					}
					break;
				}
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

	public static class EExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HelloParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(HelloParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public TerminalNode DOUBLE() { return getToken(HelloParser.DOUBLE, 0); }
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
		public EExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitEExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EExprContext eExpr() throws RecognitionException {
		EExprContext _localctx = new EExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(212);
				match(INT);
				}
				break;
			case CHAR:
				{
				setState(213);
				match(CHAR);
				}
				break;
			case BOOL:
				{
				setState(214);
				match(BOOL);
				}
				break;
			case DOUBLE:
				{
				setState(215);
				match(DOUBLE);
				}
				break;
			case ID:
				{
				setState(216);
				list_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 14, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(WHILE);
			setState(220);
			match(T__2);
			setState(221);
			expr();
			setState(222);
			match(T__3);
			setState(223);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 16, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FOR);
			setState(226);
			match(T__2);
			setState(229);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(227);
				assignStmt();
				}
				break;
			case Type:
				{
				setState(228);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			expr();
			setState(232);
			match(Semi);
			setState(233);
			assignStmt();
			setState(234);
			match(T__3);
			setState(235);
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
		enterRule(_localctx, 18, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(BREAK);
			setState(238);
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
		enterRule(_localctx, 20, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(READ);
			setState(241);
			match(T__2);
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(242);
				match(ID);
				}
				break;
			case 2:
				{
				setState(243);
				match(ID);
				setState(244);
				match(Lbracket);
				setState(245);
				expr();
				setState(246);
				match(Rbracket);
				}
				break;
			}
			setState(250);
			match(T__3);
			setState(251);
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
		enterRule(_localctx, 22, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WRITE);
			setState(254);
			match(T__2);
			setState(255);
			expr();
			setState(256);
			match(T__3);
			setState(257);
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
		enterRule(_localctx, 24, RULE_assignStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			value();
			setState(260);
			match(Equal);
			setState(273);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case ID:
			case DOUBLE:
			case BOOL:
			case INT:
			case CHAR:
				{
				setState(261);
				expr();
				}
				break;
			case T__0:
				{
				setState(262);
				match(T__0);
				setState(263);
				expr();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(264);
					match(Comma);
					setState(265);
					expr();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 26, RULE_list_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			value();
			setState(278); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(276);
					match(Comma);
					setState(277);
					value();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		public ArrayValueContext arrayValue() {
			return getRuleContext(ArrayValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				arrayValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Rbracket() { return getToken(HelloParser.Rbracket, 0); }
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
		enterRule(_localctx, 30, RULE_arrayValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(287);
			match(Lbracket);
			setState(288);
			expr();
			setState(289);
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
		enterRule(_localctx, 32, RULE_eLSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__9);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\5\4O\n\4\5\4Q\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\5\4b\n\4\5\4d\n\4"+
		"\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6"+
		"\u0084\13\6\3\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c\13\6\3\7\5\7\u008f"+
		"\n\7\3\7\3\7\5\7\u0093\n\7\3\7\5\7\u0096\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u009e\n\7\5\7\u00a0\n\7\3\7\3\7\5\7\u00a4\n\7\3\7\3\7\5\7\u00a8\n\7"+
		"\3\7\3\7\5\7\u00ac\n\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\5\7\u00b4\n\7\5\7"+
		"\u00b6\n\7\3\7\3\7\5\7\u00ba\n\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\7\5\7\u00cc\n\7\3\7\3\7"+
		"\5\7\u00d0\n\7\3\7\5\7\u00d3\n\7\5\7\u00d5\n\7\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00dc\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00e8\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00fb\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u010d\n\16\f\16\16\16\u0110\13\16\3\16\3\16\5\16\u0114"+
		"\n\16\3\17\3\17\3\17\6\17\u0119\n\17\r\17\16\17\u011a\3\20\3\20\5\20\u011f"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\4\3\2\b\t\3\2\b\13\u0148\2%\3\2\2\2\4:\3\2"+
		"\2\2\6<\3\2\2\2\bl\3\2\2\2\nu\3\2\2\2\f\u00d4\3\2\2\2\16\u00db\3\2\2\2"+
		"\20\u00dd\3\2\2\2\22\u00e3\3\2\2\2\24\u00ef\3\2\2\2\26\u00f2\3\2\2\2\30"+
		"\u00ff\3\2\2\2\32\u0105\3\2\2\2\34\u0115\3\2\2\2\36\u011e\3\2\2\2 \u0120"+
		"\3\2\2\2\"\u0125\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'("+
		"\3\2\2\2(-\3\2\2\2)*\7\3\2\2*+\5\4\3\2+,\7\4\2\2,.\3\2\2\2-)\3\2\2\2-"+
		".\3\2\2\2.\3\3\2\2\2/;\5\6\4\2\60;\5\n\6\2\61\62\5\32\16\2\62\63\7\35"+
		"\2\2\63;\3\2\2\2\64;\5\20\t\2\65;\5\24\13\2\66;\5\22\n\2\67;\5\26\f\2"+
		"8;\5\30\r\29;\5\b\5\2:/\3\2\2\2:\60\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2:\65"+
		"\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<?\7\16"+
		"\2\2=@\5\36\20\2>@\5\34\17\2?=\3\2\2\2?>\3\2\2\2@P\3\2\2\2AN\7\36\2\2"+
		"BO\5\f\7\2CD\7\3\2\2DI\5\f\7\2EF\7\37\2\2FH\5\f\7\2GE\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\4\2\2MO\3\2\2\2NB\3\2\2"+
		"\2NC\3\2\2\2OQ\3\2\2\2PA\3\2\2\2PQ\3\2\2\2Qg\3\2\2\2RS\7\37\2\2Sc\5\36"+
		"\20\2Ta\7\36\2\2Ub\5\f\7\2VW\7\3\2\2W\\\5\f\7\2XY\7\37\2\2Y[\5\f\7\2Z"+
		"X\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\4\2"+
		"\2`b\3\2\2\2aU\3\2\2\2aV\3\2\2\2bd\3\2\2\2cT\3\2\2\2cd\3\2\2\2df\3\2\2"+
		"\2eR\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\35"+
		"\2\2k\7\3\2\2\2lp\7\3\2\2mo\5\4\3\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3"+
		"\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\4\2\2t\t\3\2\2\2uv\7\24\2\2vw\7\5\2\2w"+
		"x\5\f\7\2xy\7\6\2\2y\u0082\5\b\5\2z{\7\7\2\2{|\7\5\2\2|}\5\f\7\2}~\7\6"+
		"\2\2~\177\5\b\5\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0081\u0084\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008a\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0086\5\"\22\2\u0086\u0087\5\b\5\2\u0087\u0089\3\2\2\2"+
		"\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\13\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\t\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0096\5\36"+
		"\20\2\u0091\u0093\t\2\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\5\16\b\2\u0095\u008e\3\2\2\2\u0095\u0092\3"+
		"\2\2\2\u0096\u009f\3\2\2\2\u0097\u009d\t\3\2\2\u0098\u009e\5\f\7\2\u0099"+
		"\u009a\7\5\2\2\u009a\u009b\5\f\7\2\u009b\u009c\7\6\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\7\26"+
		"\2\2\u00a2\u00a4\5\f\7\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00ba\3\2\2\2\u00a5\u00ae\7\5\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00af\5\36\20\2\u00aa"+
		"\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\5\16\b\2\u00ae\u00a7\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b5\3\2\2\2\u00b0\u00b3\7\26\2\2\u00b1\u00b4\5\36\20\2\u00b2\u00b4"+
		"\5\16\b\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3\2\2\2"+
		"\u00b5\u00b0\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\7\6\2\2\u00b8\u00ba\3\2\2\2\u00b9\u0095\3\2\2\2\u00b9\u00a5\3\2\2\2\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\u00be\5\f\7\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00d5\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c8\t\3\2\2\u00c3\u00c9\5\f"+
		"\7\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\7\6\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00d5\3\2"+
		"\2\2\u00ca\u00cc\t\2\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d3\5\36\20\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\5\16\b\2\u00d2"+
		"\u00cb\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00b9\3\2"+
		"\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\r\3\2\2\2\u00d6\u00dc"+
		"\7\32\2\2\u00d7\u00dc\7\33\2\2\u00d8\u00dc\7\31\2\2\u00d9\u00dc\7\27\2"+
		"\2\u00da\u00dc\5\34\17\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\17\3\2\2"+
		"\2\u00dd\u00de\7\21\2\2\u00de\u00df\7\5\2\2\u00df\u00e0\5\f\7\2\u00e0"+
		"\u00e1\7\6\2\2\u00e1\u00e2\5\b\5\2\u00e2\21\3\2\2\2\u00e3\u00e4\7\23\2"+
		"\2\u00e4\u00e7\7\5\2\2\u00e5\u00e8\5\32\16\2\u00e6\u00e8\5\6\4\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\5\f"+
		"\7\2\u00ea\u00eb\7\35\2\2\u00eb\u00ec\5\32\16\2\u00ec\u00ed\7\6\2\2\u00ed"+
		"\u00ee\5\b\5\2\u00ee\23\3\2\2\2\u00ef\u00f0\7\22\2\2\u00f0\u00f1\7\35"+
		"\2\2\u00f1\25\3\2\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00fa\7\5\2\2\u00f4\u00fb"+
		"\7\25\2\2\u00f5\u00f6\7\25\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\5\f\7\2"+
		"\u00f8\u00f9\7!\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7\35\2\2"+
		"\u00fe\27\3\2\2\2\u00ff\u0100\7\20\2\2\u0100\u0101\7\5\2\2\u0101\u0102"+
		"\5\f\7\2\u0102\u0103\7\6\2\2\u0103\u0104\7\35\2\2\u0104\31\3\2\2\2\u0105"+
		"\u0106\5\36\20\2\u0106\u0113\7\36\2\2\u0107\u0114\5\f\7\2\u0108\u0109"+
		"\7\3\2\2\u0109\u010e\5\f\7\2\u010a\u010b\7\37\2\2\u010b\u010d\5\f\7\2"+
		"\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\4\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u0108\3\2\2\2\u0114\33\3\2\2"+
		"\2\u0115\u0118\5\36\20\2\u0116\u0117\7\37\2\2\u0117\u0119\5\36\20\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\35\3\2\2\2\u011c\u011f\5 \21\2\u011d\u011f\7\25\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f\37\3\2\2\2\u0120\u0121\7\25\2\2\u0121"+
		"\u0122\7 \2\2\u0122\u0123\5\f\7\2\u0123\u0124\7!\2\2\u0124!\3\2\2\2\u0125"+
		"\u0126\7\f\2\2\u0126#\3\2\2\2)\'-:?INP\\acgp\u0082\u008a\u008e\u0092\u0095"+
		"\u009d\u009f\u00a3\u00a7\u00ab\u00ae\u00b3\u00b5\u00b9\u00bf\u00c8\u00cb"+
		"\u00cf\u00d2\u00d4\u00db\u00e7\u00fa\u010e\u0113\u011a\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}