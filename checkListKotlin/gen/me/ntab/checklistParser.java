// Generated from F:/Git/Sandbox/checkListKotlin/src\checklist.g4 by ANTLR 4.7
package me.ntab;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class checklistParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, CHAR=24, INT=25, 
		SPACE=26, COMMA=27, DOT=28, NEWLINE=29;
	public static final int
		RULE_main = 0, RULE_title = 1, RULE_body = 2, RULE_sentence = 3, RULE_subtitle = 4, 
		RULE_input = 5, RULE_expr = 6, RULE_func_def = 7, RULE_func_call = 8, 
		RULE_subst = 9, RULE_condition = 10, RULE_logical_expr = 11, RULE_binary_op = 12, 
		RULE_comp_op = 13, RULE_logical_op = 14, RULE_word = 15, RULE_name = 16, 
		RULE_number = 17;
	public static final String[] ruleNames = {
		"main", "title", "body", "sentence", "subtitle", "input", "expr", "func_def", 
		"func_call", "subst", "condition", "logical_expr", "binary_op", "comp_op", 
		"logical_op", "word", "name", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'##'", "'#'", "'?'", "'->'", "':'", "'${'", "'}'", "'$$'", "'('", 
		"')'", "'$'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", "'<='", 
		"'>'", "'>='", "'&&'", "'||'", null, null, "' '", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"CHAR", "INT", "SPACE", "COMMA", "DOT", "NEWLINE"
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
	public String getGrammarFileName() { return "checklist.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public checklistParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			title();
			setState(37);
			body();
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

	public static class TitleContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(checklistParser.NEWLINE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			sentence();
			setState(41);
			match(NEWLINE);
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

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(checklistParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(checklistParser.NEWLINE, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<SubtitleContext> subtitle() {
			return getRuleContexts(SubtitleContext.class);
		}
		public SubtitleContext subtitle(int i) {
			return getRuleContext(SubtitleContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__7) | (1L << T__10) | (1L << CHAR) | (1L << SPACE))) != 0)) {
				{
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(43);
					sentence();
					}
					break;
				case 2:
					{
					setState(44);
					subtitle();
					}
					break;
				case 3:
					{
					setState(45);
					input();
					}
					break;
				case 4:
					{
					setState(46);
					func_def();
					}
					break;
				case 5:
					{
					setState(47);
					condition();
					}
					break;
				}
				setState(50);
				match(NEWLINE);
				}
				}
				setState(56);
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

	public static class SentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(checklistParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(checklistParser.SPACE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(checklistParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(checklistParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(checklistParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(checklistParser.COMMA, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case SPACE:
				{
				setState(57);
				word();
				}
				break;
			case T__5:
			case T__10:
				{
				setState(58);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==COMMA) {
				{
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61);
					match(COMMA);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(SPACE);
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case SPACE:
					{
					setState(68);
					word();
					}
					break;
				case T__5:
				case T__10:
					{
					setState(69);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(77);
				match(DOT);
				}
				}
				setState(82);
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

	public static class SubtitleContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public SubtitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterSubtitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitSubtitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitSubtitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtitleContext subtitle() throws RecognitionException {
		SubtitleContext _localctx = new SubtitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subtitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			sentence();
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

	public static class InputContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			sentence();
			setState(88);
			match(T__4);
			setState(89);
			word();
			setState(90);
			match(T__4);
			setState(91);
			word();
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
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public SubstContext subst() {
			return getRuleContext(SubstContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(93);
				match(T__5);
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case SPACE:
					{
					setState(94);
					word();
					}
					break;
				case INT:
					{
					setState(95);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98);
				binary_op();
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case SPACE:
					{
					setState(99);
					word();
					}
					break;
				case INT:
					{
					setState(100);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103);
				match(T__6);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				subst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				func_call();
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

	public static class Func_defContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(checklistParser.NEWLINE, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__7);
			setState(110);
			name();
			setState(111);
			match(T__8);
			setState(112);
			name();
			setState(113);
			match(T__9);
			setState(114);
			match(NEWLINE);
			setState(115);
			sentence();
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

	public static class Func_callContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__10);
			setState(118);
			name();
			setState(119);
			match(T__8);
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				{
				setState(120);
				name();
				}
				break;
			case INT:
				{
				setState(121);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
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

	public static class SubstContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SubstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterSubst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitSubst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitSubst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstContext subst() throws RecognitionException {
		SubstContext _localctx = new SubstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__10);
			setState(127);
			name();
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

	public static class ConditionContext extends ParserRuleContext {
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(checklistParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(checklistParser.NEWLINE, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__5);
			setState(130);
			logical_expr(0);
			setState(131);
			match(T__6);
			setState(132);
			match(NEWLINE);
			setState(133);
			sentence();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(NEWLINE);
					setState(135);
					sentence();
					}
					} 
				}
				setState(140);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_exprContext extends ParserRuleContext {
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public Logical_opContext logical_op() {
			return getRuleContext(Logical_opContext.class,0);
		}
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterLogical_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitLogical_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitLogical_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case SPACE:
				{
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case SPACE:
					{
					setState(142);
					word();
					}
					break;
				case INT:
					{
					setState(143);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146);
				comp_op();
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case SPACE:
					{
					setState(147);
					word();
					}
					break;
				case INT:
					{
					setState(148);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__8:
				{
				setState(151);
				match(T__8);
				setState(152);
				logical_expr(0);
				setState(153);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
					setState(157);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(158);
					logical_op();
					setState(159);
					logical_expr(4);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Binary_opContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(checklistParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(checklistParser.SPACE, i);
		}
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitBinary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitBinary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binary_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(166);
				match(SPACE);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(SPACE);
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Comp_opContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(checklistParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(checklistParser.SPACE, i);
		}
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comp_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(179);
				match(SPACE);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(SPACE);
					}
					} 
				}
				setState(191);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_opContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(checklistParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(checklistParser.SPACE, i);
		}
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitLogical_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitLogical_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logical_op);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(192);
				match(SPACE);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(SPACE);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class WordContext extends ParserRuleContext {
		public List<TerminalNode> SPACE() { return getTokens(checklistParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(checklistParser.SPACE, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(checklistParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(checklistParser.CHAR, i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_word);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(205);
				match(SPACE);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(211);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(SPACE);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(checklistParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(checklistParser.CHAR, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(222);
				match(CHAR);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(checklistParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof checklistListener ) ((checklistListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof checklistVisitor ) return ((checklistVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(INT);
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
		case 11:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00e8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4"+
		"\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\5\5>\n\5\3\5\7\5A\n\5\f\5\16"+
		"\5D\13\5\3\5\3\5\3\5\5\5I\n\5\7\5K\n\5\f\5\16\5N\13\5\3\5\7\5Q\n\5\f\5"+
		"\16\5T\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bc\n"+
		"\b\3\b\3\b\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n}\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e\13\f\3\r\3\r\3\r\5\r"+
		"\u0093\n\r\3\r\3\r\3\r\5\r\u0098\n\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3\16\7\16\u00aa\n\16\f"+
		"\16\16\16\u00ad\13\16\3\16\3\16\7\16\u00b1\n\16\f\16\16\16\u00b4\13\16"+
		"\3\17\7\17\u00b7\n\17\f\17\16\17\u00ba\13\17\3\17\3\17\7\17\u00be\n\17"+
		"\f\17\16\17\u00c1\13\17\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3"+
		"\20\3\20\7\20\u00cb\n\20\f\20\16\20\u00ce\13\20\3\21\7\21\u00d1\n\21\f"+
		"\21\16\21\u00d4\13\21\3\21\6\21\u00d7\n\21\r\21\16\21\u00d8\3\21\7\21"+
		"\u00dc\n\21\f\21\16\21\u00df\13\21\3\22\6\22\u00e2\n\22\r\22\16\22\u00e3"+
		"\3\23\3\23\3\23\2\3\30\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2"+
		"\6\3\2\5\6\3\2\16\21\3\2\22\27\3\2\30\31\2\u00f3\2&\3\2\2\2\4)\3\2\2\2"+
		"\68\3\2\2\2\b=\3\2\2\2\nU\3\2\2\2\fX\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22"+
		"w\3\2\2\2\24\u0080\3\2\2\2\26\u0083\3\2\2\2\30\u009d\3\2\2\2\32\u00ab"+
		"\3\2\2\2\34\u00b8\3\2\2\2\36\u00c5\3\2\2\2 \u00d2\3\2\2\2\"\u00e1\3\2"+
		"\2\2$\u00e5\3\2\2\2&\'\5\4\3\2\'(\5\6\4\2(\3\3\2\2\2)*\7\3\2\2*+\5\b\5"+
		"\2+,\7\37\2\2,\5\3\2\2\2-\63\5\b\5\2.\63\5\n\6\2/\63\5\f\7\2\60\63\5\20"+
		"\t\2\61\63\5\26\f\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2"+
		"\62\61\3\2\2\2\63\64\3\2\2\2\64\65\7\37\2\2\65\67\3\2\2\2\66\62\3\2\2"+
		"\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;>\5 \21\2<>"+
		"\5\16\b\2=;\3\2\2\2=<\3\2\2\2>L\3\2\2\2?A\7\35\2\2@?\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EH\7\34\2\2FI\5 \21\2GI\5\16\b"+
		"\2HF\3\2\2\2HG\3\2\2\2IK\3\2\2\2JB\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MR\3\2\2\2NL\3\2\2\2OQ\7\36\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2S\t\3\2\2\2TR\3\2\2\2UV\7\4\2\2VW\5\b\5\2W\13\3\2\2\2XY\t\2\2\2YZ"+
		"\5\b\5\2Z[\7\7\2\2[\\\5 \21\2\\]\7\7\2\2]^\5 \21\2^\r\3\2\2\2_b\7\b\2"+
		"\2`c\5 \21\2ac\5$\23\2b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2dg\5\32\16\2eh\5 "+
		"\21\2fh\5$\23\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\7\t\2\2jn\3\2\2\2kn\5"+
		"\24\13\2ln\5\22\n\2m_\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\17\3\2\2\2op\7\n\2"+
		"\2pq\5\"\22\2qr\7\13\2\2rs\5\"\22\2st\7\f\2\2tu\7\37\2\2uv\5\b\5\2v\21"+
		"\3\2\2\2wx\7\r\2\2xy\5\"\22\2y|\7\13\2\2z}\5\"\22\2{}\5$\23\2|z\3\2\2"+
		"\2|{\3\2\2\2}~\3\2\2\2~\177\7\f\2\2\177\23\3\2\2\2\u0080\u0081\7\r\2\2"+
		"\u0081\u0082\5\"\22\2\u0082\25\3\2\2\2\u0083\u0084\7\b\2\2\u0084\u0085"+
		"\5\30\r\2\u0085\u0086\7\t\2\2\u0086\u0087\7\37\2\2\u0087\u008c\5\b\5\2"+
		"\u0088\u0089\7\37\2\2\u0089\u008b\5\b\5\2\u008a\u0088\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0092\b\r\1\2\u0090\u0093\5 \21\2\u0091\u0093\5$"+
		"\23\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0097\5\34\17\2\u0095\u0098\5 \21\2\u0096\u0098\5$\23\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0096\3\2\2\2\u0098\u009e\3\2\2\2\u0099\u009a\7\13\2\2\u009a"+
		"\u009b\5\30\r\2\u009b\u009c\7\f\2\2\u009c\u009e\3\2\2\2\u009d\u008f\3"+
		"\2\2\2\u009d\u0099\3\2\2\2\u009e\u00a5\3\2\2\2\u009f\u00a0\f\5\2\2\u00a0"+
		"\u00a1\5\36\20\2\u00a1\u00a2\5\30\r\6\u00a2\u00a4\3\2\2\2\u00a3\u009f"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\31\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\34\2\2\u00a9\u00a8\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\t\3\2\2\u00af\u00b1\7\34\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\34\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\t\4\2\2\u00bc"+
		"\u00be\7\34\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c4\7\34\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cc\t\5\2\2\u00c9\u00cb\7\34\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\37\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\7\34\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d7\7\32\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da"+
		"\u00dc\7\34\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de!\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2"+
		"\7\32\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6%\3\2\2"+
		"\2\34\628=BHLRbgm|\u008c\u0092\u0097\u009d\u00a5\u00ab\u00b2\u00b8\u00bf"+
		"\u00c5\u00cc\u00d2\u00d8\u00dd\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}