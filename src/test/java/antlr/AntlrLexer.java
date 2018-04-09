// Generated from Antlr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

public class AntlrLexer extends Lexer {
	public static final int
		T__1=1, T__0=2, NUMBER=3, WS=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "NUMBER", "WS"
	};


	public AntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN);
	}

	@Override
	public String getGrammarFileName() { return "Antlr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	public static final String _serializedATN =
		"\3\uaf6f\u8320\u479d\ub75c\u4880\u1605\u191c\uab37\2\6\30\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\4\6\4\21\n\4\r\4\16\4\22\3"+
		"\5\3\5\3\5\3\5\2\2\2\6\3\2\3\5\2\4\7\2\5\t\2\6\3\2\4\3\2\62;\5\2\13\f"+
		"\17\17\"\"\30\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2"+
		"\2\2\5\r\3\2\2\2\7\20\3\2\2\2\t\24\3\2\2\2\13\f\7-\2\2\f\4\3\2\2\2\r\16"+
		"\7/\2\2\16\6\3\2\2\2\17\21\t\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3"+
		"\2\2\2\22\23\3\2\2\2\23\b\3\2\2\2\24\25\t\3\2\2\25\26\3\2\2\2\26\27\b"+
		"\5\2\2\27\n\3\2\2\2\4\2\22\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}