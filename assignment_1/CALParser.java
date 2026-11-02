// Generated from ./cal.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Constant=2, Return=3, Integer=4, Boolean=5, Void=6, Main=7, 
		If=8, Else=9, True=10, False=11, While=12, Begin=13, End=14, Is=15, Skip=16, 
		ASSIGN=17, SEMI=18, COMMA=19, COLON=20, LBR=21, RBR=22, PLUS=23, MINUS=24, 
		NEG=25, OR=26, AND=27, EQUAL=28, NONEQ=29, LESS=30, LE=31, GREATER=32, 
		GE=33, ID=34, WS=35, LineComment=36, Comment=37;
	public static final int
		RULE_prog = 0, RULE_dec_list = 1, RULE_dec = 2, RULE_var_dec = 3, RULE_const_dec = 4, 
		RULE_func_list = 5, RULE_func = 6, RULE_type = 7, RULE_param_list = 8, 
		RULE_nemp_param_list = 9, RULE_main = 10, RULE_statement_block = 11, RULE_statement = 12, 
		RULE_expr = 13, RULE_bin_arith_op = 14, RULE_frag = 15, RULE_condition = 16, 
		RULE_comp_op = 17, RULE_arg_list = 18, RULE_nemp_arg_list = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec_list", "dec", "var_dec", "const_dec", "func_list", "func", 
			"type", "param_list", "nemp_param_list", "main", "statement_block", "statement", 
			"expr", "bin_arith_op", "frag", "condition", "comp_op", "arg_list", "nemp_arg_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "':='", "';'", "','", "':'", "'('", "')'", 
			"'+'", "'-'", "'~'", "'|'", "'&'", "'='", "'!='", "'<'", "'<='", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Constant", "Return", "Integer", "Boolean", "Void", 
			"Main", "If", "Else", "True", "False", "While", "Begin", "End", "Is", 
			"Skip", "ASSIGN", "SEMI", "COMMA", "COLON", "LBR", "RBR", "PLUS", "MINUS", 
			"NEG", "OR", "AND", "EQUAL", "NONEQ", "LESS", "LE", "GREATER", "GE", 
			"ID", "WS", "LineComment", "Comment"
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

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Dec_listContext dec_list() {
			return getRuleContext(Dec_listContext.class,0);
		}
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			dec_list();
			setState(41);
			func_list();
			setState(42);
			main();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_listContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(calParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(calParser.SEMI, i);
		}
		public Dec_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDec_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDec_list(this);
		}
	}

	public final Dec_listContext dec_list() throws RecognitionException {
		Dec_listContext _localctx = new Dec_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Variable || _la==Constant) {
				{
				{
				setState(44);
				dec();
				setState(45);
				match(SEMI);
				}
				}
				setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Const_decContext const_dec() {
			return getRuleContext(Const_decContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				var_dec();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				const_dec();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_decContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(calParser.Variable, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitVar_dec(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(Variable);
			setState(57);
			match(ID);
			setState(58);
			match(COLON);
			setState(59);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_decContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(calParser.Constant, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Const_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterConst_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitConst_dec(this);
		}
	}

	public final Const_decContext const_dec() throws RecognitionException {
		Const_decContext _localctx = new Const_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Constant);
			setState(62);
			match(ID);
			setState(63);
			match(COLON);
			setState(64);
			type();
			setState(65);
			match(ASSIGN);
			setState(66);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_listContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public Func_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunc_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunc_list(this);
		}
	}

	public final Func_listContext func_list() throws RecognitionException {
		Func_listContext _localctx = new Func_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
				{
				{
				setState(68);
				func();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public List<TerminalNode> LBR() { return getTokens(calParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(calParser.LBR, i);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public List<TerminalNode> RBR() { return getTokens(calParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(calParser.RBR, i);
		}
		public TerminalNode Is() { return getToken(calParser.Is, 0); }
		public Dec_listContext dec_list() {
			return getRuleContext(Dec_listContext.class,0);
		}
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode Return() { return getToken(calParser.Return, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			match(ID);
			setState(76);
			match(LBR);
			setState(77);
			param_list();
			setState(78);
			match(RBR);
			setState(79);
			match(Is);
			setState(80);
			dec_list();
			setState(81);
			match(Begin);
			setState(82);
			statement_block();
			setState(83);
			match(Return);
			setState(84);
			match(LBR);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17198746624L) != 0)) {
				{
				{
				setState(85);
				expr();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(91);
			match(RBR);
			setState(92);
			match(COLON);
			setState(93);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(calParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(calParser.Boolean, 0); }
		public TerminalNode Void() { return getToken(calParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Param_listContext extends ParserRuleContext {
		public List<Nemp_param_listContext> nemp_param_list() {
			return getRuleContexts(Nemp_param_listContext.class);
		}
		public Nemp_param_listContext nemp_param_list(int i) {
			return getRuleContext(Nemp_param_listContext.class,i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitParam_list(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(97);
				nemp_param_list();
				}
				}
				setState(102);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_param_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_param_listContext nemp_param_list() {
			return getRuleContext(Nemp_param_listContext.class,0);
		}
		public Nemp_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_param_list(this);
		}
	}

	public final Nemp_param_listContext nemp_param_list() throws RecognitionException {
		Nemp_param_listContext _localctx = new Nemp_param_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_param_list);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(ID);
				setState(104);
				match(COLON);
				setState(105);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				setState(107);
				match(COLON);
				setState(108);
				type();
				setState(109);
				match(COMMA);
				setState(110);
				nemp_param_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(calParser.Main, 0); }
		public TerminalNode Begin() { return getToken(calParser.Begin, 0); }
		public Dec_listContext dec_list() {
			return getRuleContext(Dec_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode End() { return getToken(calParser.End, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Main);
			setState(115);
			match(Begin);
			setState(116);
			dec_list();
			setState(117);
			statement_block();
			setState(118);
			match(End);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17179947264L) != 0)) {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public List<TerminalNode> Begin() { return getTokens(calParser.Begin); }
		public TerminalNode Begin(int i) {
			return getToken(calParser.Begin, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> End() { return getTokens(calParser.End); }
		public TerminalNode End(int i) {
			return getToken(calParser.End, i);
		}
		public TerminalNode If() { return getToken(calParser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode Else() { return getToken(calParser.Else, 0); }
		public TerminalNode While() { return getToken(calParser.While, 0); }
		public TerminalNode Skip() { return getToken(calParser.Skip, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(ID);
				setState(127);
				match(ASSIGN);
				setState(128);
				expr();
				setState(129);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(ID);
				setState(132);
				match(LBR);
				setState(133);
				arg_list();
				setState(134);
				match(RBR);
				setState(135);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(Begin);
				setState(138);
				statement_block();
				setState(139);
				match(End);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(If);
				setState(142);
				condition(0);
				setState(143);
				match(Begin);
				setState(144);
				statement_block();
				setState(145);
				match(End);
				setState(146);
				match(Else);
				setState(147);
				match(Begin);
				setState(148);
				statement_block();
				setState(149);
				match(End);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(While);
				setState(152);
				condition(0);
				setState(153);
				match(Begin);
				setState(154);
				statement_block();
				setState(155);
				match(End);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				match(Skip);
				setState(158);
				match(COLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<FragContext> frag() {
			return getRuleContexts(FragContext.class);
		}
		public FragContext frag(int i) {
			return getRuleContext(FragContext.class,i);
		}
		public Bin_arith_opContext bin_arith_op() {
			return getRuleContext(Bin_arith_opContext.class,0);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				frag();
				setState(162);
				bin_arith_op();
				setState(163);
				frag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(LBR);
				setState(166);
				expr();
				setState(167);
				match(RBR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(ID);
				setState(170);
				match(LBR);
				setState(171);
				arg_list();
				setState(172);
				match(RBR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(LBR);
				setState(175);
				frag();
				setState(176);
				match(RBR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bin_arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(calParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public Bin_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterBin_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitBin_arith_op(this);
		}
	}

	public final Bin_arith_opContext bin_arith_op() throws RecognitionException {
		Bin_arith_opContext _localctx = new Bin_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bin_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FragContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public TerminalNode True() { return getToken(calParser.True, 0); }
		public TerminalNode False() { return getToken(calParser.False, 0); }
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFrag(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_frag);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(ID);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(MINUS);
				setState(184);
				match(ID);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(False);
				}
				break;
			case LBR:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(LBR);
				setState(188);
				expr();
				setState(189);
				match(RBR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(calParser.NEG, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LBR() { return getToken(calParser.LBR, 0); }
		public TerminalNode RBR() { return getToken(calParser.RBR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode True() { return getToken(calParser.True, 0); }
		public TerminalNode False() { return getToken(calParser.False, 0); }
		public TerminalNode AND() { return getToken(calParser.AND, 0); }
		public TerminalNode OR() { return getToken(calParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(194);
				match(NEG);
				setState(195);
				condition(6);
				}
				break;
			case 2:
				{
				setState(196);
				match(LBR);
				setState(197);
				condition(0);
				setState(198);
				match(RBR);
				}
				break;
			case 3:
				{
				setState(200);
				expr();
				setState(201);
				comp_op();
				setState(202);
				expr();
				}
				break;
			case 4:
				{
				setState(204);
				match(True);
				}
				break;
			case 5:
				{
				setState(205);
				match(False);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(208);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(209);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(210);
					condition(4);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(calParser.EQUAL, 0); }
		public TerminalNode NONEQ() { return getToken(calParser.NONEQ, 0); }
		public TerminalNode LESS() { return getToken(calParser.LESS, 0); }
		public TerminalNode LE() { return getToken(calParser.LE, 0); }
		public TerminalNode GREATER() { return getToken(calParser.GREATER, 0); }
		public TerminalNode GE() { return getToken(calParser.GE, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public List<Nemp_arg_listContext> nemp_arg_list() {
			return getRuleContexts(Nemp_arg_listContext.class);
		}
		public Nemp_arg_listContext nemp_arg_list(int i) {
			return getRuleContext(Nemp_arg_listContext.class,i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(218);
				nemp_arg_list();
				}
				}
				setState(223);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_arg_list(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(ID);
				setState(226);
				match(COMMA);
				setState(227);
				nemp_arg_list();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005"+
		"\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006\n\u0006"+
		"\f\u0006Z\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0005\bc\b\b\n\b\f\bf\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tq\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0005\u000bz\b"+
		"\u000b\n\u000b\f\u000b}\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a0\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00b3\b\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c0\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00cf\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d4\b"+
		"\u0010\n\u0010\f\u0010\u00d7\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0005\u0012\u00dc\b\u0012\n\u0012\f\u0012\u00df\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e5\b\u0013\u0001\u0013\u0000"+
		"\u0001 \u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0004\u0001\u0000\u0004\u0006\u0001"+
		"\u0000\u0017\u0018\u0001\u0000\u001a\u001b\u0001\u0000\u001c!\u00ec\u0000"+
		"(\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00046\u0001"+
		"\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000"+
		"\u0000\nG\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000e_\u0001"+
		"\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014r\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000\u0000\u0018"+
		"\u009f\u0001\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c"+
		"\u00b4\u0001\u0000\u0000\u0000\u001e\u00bf\u0001\u0000\u0000\u0000 \u00ce"+
		"\u0001\u0000\u0000\u0000\"\u00d8\u0001\u0000\u0000\u0000$\u00dd\u0001"+
		"\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000()\u0003\u0002\u0001"+
		"\u0000)*\u0003\n\u0005\u0000*+\u0003\u0014\n\u0000+\u0001\u0001\u0000"+
		"\u0000\u0000,-\u0003\u0004\u0002\u0000-.\u0005\u0012\u0000\u0000.0\u0001"+
		"\u0000\u0000\u0000/,\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0003\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000047\u0003\u0006\u0003\u000057\u0003"+
		"\b\u0004\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0005"+
		"\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u00009:\u0005\"\u0000\u0000"+
		":;\u0005\u0014\u0000\u0000;<\u0003\u000e\u0007\u0000<\u0007\u0001\u0000"+
		"\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005\"\u0000\u0000?@\u0005\u0014"+
		"\u0000\u0000@A\u0003\u000e\u0007\u0000AB\u0005\u0011\u0000\u0000BC\u0003"+
		"\u001a\r\u0000C\t\u0001\u0000\u0000\u0000DF\u0003\f\u0006\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u000b\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JK\u0003\u000e\u0007\u0000KL\u0005\"\u0000\u0000LM\u0005\u0015"+
		"\u0000\u0000MN\u0003\u0010\b\u0000NO\u0005\u0016\u0000\u0000OP\u0005\u000f"+
		"\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0005\r\u0000\u0000RS\u0003\u0016"+
		"\u000b\u0000ST\u0005\u0003\u0000\u0000TX\u0005\u0015\u0000\u0000UW\u0003"+
		"\u001a\r\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0005\u0016\u0000\u0000\\]\u0005\u0014\u0000"+
		"\u0000]^\u0005\u000e\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0007\u0000"+
		"\u0000\u0000`\u000f\u0001\u0000\u0000\u0000ac\u0003\u0012\t\u0000ba\u0001"+
		"\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gh\u0005\"\u0000\u0000hi\u0005\u0014\u0000\u0000iq\u0003\u000e"+
		"\u0007\u0000jk\u0005\"\u0000\u0000kl\u0005\u0014\u0000\u0000lm\u0003\u000e"+
		"\u0007\u0000mn\u0005\u0013\u0000\u0000no\u0003\u0012\t\u0000oq\u0001\u0000"+
		"\u0000\u0000pg\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000q\u0013"+
		"\u0001\u0000\u0000\u0000rs\u0005\u0007\u0000\u0000st\u0005\r\u0000\u0000"+
		"tu\u0003\u0002\u0001\u0000uv\u0003\u0016\u000b\u0000vw\u0005\u000e\u0000"+
		"\u0000w\u0015\u0001\u0000\u0000\u0000xz\u0003\u0018\f\u0000yx\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u0017\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\"\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000"+
		"\u0080\u0081\u0003\u001a\r\u0000\u0081\u0082\u0005\u0014\u0000\u0000\u0082"+
		"\u00a0\u0001\u0000\u0000\u0000\u0083\u0084\u0005\"\u0000\u0000\u0084\u0085"+
		"\u0005\u0015\u0000\u0000\u0085\u0086\u0003$\u0012\u0000\u0086\u0087\u0005"+
		"\u0016\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088\u00a0\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\r\u0000\u0000\u008a\u008b\u0003\u0016"+
		"\u000b\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u00a0\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0005\b\u0000\u0000\u008e\u008f\u0003 \u0010"+
		"\u0000\u008f\u0090\u0005\r\u0000\u0000\u0090\u0091\u0003\u0016\u000b\u0000"+
		"\u0091\u0092\u0005\u000e\u0000\u0000\u0092\u0093\u0005\t\u0000\u0000\u0093"+
		"\u0094\u0005\r\u0000\u0000\u0094\u0095\u0003\u0016\u000b\u0000\u0095\u0096"+
		"\u0005\u000e\u0000\u0000\u0096\u00a0\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\f\u0000\u0000\u0098\u0099\u0003 \u0010\u0000\u0099\u009a\u0005"+
		"\r\u0000\u0000\u009a\u009b\u0003\u0016\u000b\u0000\u009b\u009c\u0005\u000e"+
		"\u0000\u0000\u009c\u00a0\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0010"+
		"\u0000\u0000\u009e\u00a0\u0005\u0014\u0000\u0000\u009f~\u0001\u0000\u0000"+
		"\u0000\u009f\u0083\u0001\u0000\u0000\u0000\u009f\u0089\u0001\u0000\u0000"+
		"\u0000\u009f\u008d\u0001\u0000\u0000\u0000\u009f\u0097\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0019\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3\u0003\u001c\u000e"+
		"\u0000\u00a3\u00a4\u0003\u001e\u000f\u0000\u00a4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a7\u0003\u001a\r\u0000"+
		"\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8\u00b3\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\"\u0000\u0000\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab"+
		"\u00ac\u0003$\u0012\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00b3"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u00b0"+
		"\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005\u0016\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00a1\u0001\u0000\u0000\u0000\u00b2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0007\u0001\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000\u00b6\u00c0"+
		"\u0005\"\u0000\u0000\u00b7\u00b8\u0005\u0018\u0000\u0000\u00b8\u00c0\u0005"+
		"\"\u0000\u0000\u00b9\u00c0\u0005\n\u0000\u0000\u00ba\u00c0\u0005\u000b"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bd\u0003\u001a"+
		"\r\u0000\u00bd\u00be\u0005\u0016\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00c0\u001f\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0006\u0010\uffff\uffff\u0000\u00c2\u00c3\u0005\u0019"+
		"\u0000\u0000\u00c3\u00cf\u0003 \u0010\u0006\u00c4\u00c5\u0005\u0015\u0000"+
		"\u0000\u00c5\u00c6\u0003 \u0010\u0000\u00c6\u00c7\u0005\u0016\u0000\u0000"+
		"\u00c7\u00cf\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003\u001a\r\u0000\u00c9"+
		"\u00ca\u0003\"\u0011\u0000\u00ca\u00cb\u0003\u001a\r\u0000\u00cb\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0005\n\u0000\u0000\u00cd\u00cf\u0005"+
		"\u000b\u0000\u0000\u00ce\u00c1\u0001\u0000\u0000\u0000\u00ce\u00c4\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\n\u0003\u0000\u0000\u00d1\u00d2\u0007\u0002"+
		"\u0000\u0000\u00d2\u00d4\u0003 \u0010\u0004\u00d3\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6!\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0007\u0003\u0000\u0000"+
		"\u00d9#\u0001\u0000\u0000\u0000\u00da\u00dc\u0003&\u0013\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de%\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5\u0005"+
		"\"\u0000\u0000\u00e1\u00e2\u0005\"\u0000\u0000\u00e2\u00e3\u0005\u0013"+
		"\u0000\u0000\u00e3\u00e5\u0003&\u0013\u0000\u00e4\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e5\'\u0001\u0000\u0000\u0000"+
		"\u000e16GXdp{\u009f\u00b2\u00bf\u00ce\u00d5\u00dd\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}