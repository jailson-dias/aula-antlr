// Generated from Antlr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class AntlrParser extends Parser {
	public static final int
		T__1=1, T__0=2, NUMBER=3, WS=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "NUMBER", "WS"
	};
	public static final int
		RULE_goal = 0, RULE_op = 1;
	public static final String[] ruleNames = {
		"goal", "op"
	};

	@Override
	public String getGrammarFileName() { return "Antlr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	public AntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN);
	}
	public static class GoalContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(AntlrParser.NUMBER, i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<? extends TerminalNode> NUMBER() { return getTokens(AntlrParser.NUMBER); }
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitGoal(this);
		}
	}

	@RuleVersion(0)
	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); match(NUMBER);
			setState(5); op();
			setState(6); match(NUMBER);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrListener ) ((AntlrListener)listener).exitOp(this);
		}
	}

	@RuleVersion(0)
	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__0) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uaf6f\u8320\u479d\ub75c\u4880\u1605\u191c\uab37\3\6\r\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\3\3\3\3\3\2\2\2\4\2\2\4\2\2\3\3\2\3\4\n\2\6\3\2\2"+
		"\2\4\n\3\2\2\2\6\7\7\5\2\2\7\b\5\4\3\2\b\t\7\5\2\2\t\3\3\2\2\2\n\13\t"+
		"\2\2\2\13\5\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}