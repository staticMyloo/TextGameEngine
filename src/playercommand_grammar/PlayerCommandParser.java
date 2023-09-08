// Generated from C:/Users/myles/Desktop/TextGameEngine/src\PlayerCommand.g4 by ANTLR 4.12.0
package playercommand_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOOR=1, PICKUP=2, EXIT=3, DESCRIBE=4, ADMIRE=5, EAT=6, STATS=7, WIELD=8, 
		OPEN=9, HELP=10, ATTACK=11, INT=12, WS=13, NEWLINE=14;
	public static final int
		RULE_command = 0, RULE_exploreCommand = 1, RULE_battleCommand = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "exploreCommand", "battleCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'door'", "'pickup'", "'exit'", "'describe'", "'admire'", "'eat'", 
			"'stats'", "'wield'", "'open'", "'help'", "'attack'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOOR", "PICKUP", "EXIT", "DESCRIBE", "ADMIRE", "EAT", "STATS", 
			"WIELD", "OPEN", "HELP", "ATTACK", "INT", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayerCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public BattleCommandContext battleCommand() {
			return getRuleContext(BattleCommandContext.class,0);
		}
		public ExploreCommandContext exploreCommand() {
			return getRuleContext(ExploreCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(8);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				battleCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				exploreCommand();
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
	public static class ExploreCommandContext extends ParserRuleContext {
		public TerminalNode DOOR() { return getToken(PlayerCommandParser.DOOR, 0); }
		public TerminalNode INT() { return getToken(PlayerCommandParser.INT, 0); }
		public TerminalNode PICKUP() { return getToken(PlayerCommandParser.PICKUP, 0); }
		public TerminalNode EXIT() { return getToken(PlayerCommandParser.EXIT, 0); }
		public TerminalNode DESCRIBE() { return getToken(PlayerCommandParser.DESCRIBE, 0); }
		public TerminalNode ADMIRE() { return getToken(PlayerCommandParser.ADMIRE, 0); }
		public TerminalNode EAT() { return getToken(PlayerCommandParser.EAT, 0); }
		public TerminalNode STATS() { return getToken(PlayerCommandParser.STATS, 0); }
		public TerminalNode WIELD() { return getToken(PlayerCommandParser.WIELD, 0); }
		public TerminalNode OPEN() { return getToken(PlayerCommandParser.OPEN, 0); }
		public TerminalNode HELP() { return getToken(PlayerCommandParser.HELP, 0); }
		public ExploreCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exploreCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterExploreCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitExploreCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitExploreCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExploreCommandContext exploreCommand() throws RecognitionException {
		ExploreCommandContext _localctx = new ExploreCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exploreCommand);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(DOOR);
				setState(11);
				match(INT);
				}
				break;
			case PICKUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(PICKUP);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(EXIT);
				}
				break;
			case DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(14);
				match(DESCRIBE);
				}
				break;
			case ADMIRE:
				enterOuterAlt(_localctx, 5);
				{
				setState(15);
				match(ADMIRE);
				}
				break;
			case EAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(16);
				match(EAT);
				}
				break;
			case STATS:
				enterOuterAlt(_localctx, 7);
				{
				setState(17);
				match(STATS);
				}
				break;
			case WIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(18);
				match(WIELD);
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 9);
				{
				setState(19);
				match(OPEN);
				}
				break;
			case HELP:
				enterOuterAlt(_localctx, 10);
				{
				setState(20);
				match(HELP);
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
	public static class BattleCommandContext extends ParserRuleContext {
		public TerminalNode ATTACK() { return getToken(PlayerCommandParser.ATTACK, 0); }
		public TerminalNode WIELD() { return getToken(PlayerCommandParser.WIELD, 0); }
		public TerminalNode HELP() { return getToken(PlayerCommandParser.HELP, 0); }
		public BattleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_battleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterBattleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitBattleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitBattleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BattleCommandContext battleCommand() throws RecognitionException {
		BattleCommandContext _localctx = new BattleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_battleCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3328L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0003\u0000\t\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000"+
		"\u0002\u0004\u0000\u0001\u0002\u0000\b\b\n\u000b \u0000\b\u0001\u0000"+
		"\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000"+
		"\u0000\u0000\u0006\t\u0003\u0004\u0002\u0000\u0007\t\u0003\u0002\u0001"+
		"\u0000\b\u0006\u0001\u0000\u0000\u0000\b\u0007\u0001\u0000\u0000\u0000"+
		"\t\u0001\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b"+
		"\u0016\u0005\f\u0000\u0000\f\u0016\u0005\u0002\u0000\u0000\r\u0016\u0005"+
		"\u0003\u0000\u0000\u000e\u0016\u0005\u0004\u0000\u0000\u000f\u0016\u0005"+
		"\u0005\u0000\u0000\u0010\u0016\u0005\u0006\u0000\u0000\u0011\u0016\u0005"+
		"\u0007\u0000\u0000\u0012\u0016\u0005\b\u0000\u0000\u0013\u0016\u0005\t"+
		"\u0000\u0000\u0014\u0016\u0005\n\u0000\u0000\u0015\n\u0001\u0000\u0000"+
		"\u0000\u0015\f\u0001\u0000\u0000\u0000\u0015\r\u0001\u0000\u0000\u0000"+
		"\u0015\u000e\u0001\u0000\u0000\u0000\u0015\u000f\u0001\u0000\u0000\u0000"+
		"\u0015\u0010\u0001\u0000\u0000\u0000\u0015\u0011\u0001\u0000\u0000\u0000"+
		"\u0015\u0012\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0005\u0001\u0000\u0000\u0000"+
		"\u0002\b\u0015";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}