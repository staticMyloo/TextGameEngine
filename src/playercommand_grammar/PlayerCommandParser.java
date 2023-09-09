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
		OPEN=9, HELP=10, ATTACK=11, STRING=12, INT=13, WS=14, NEWLINE=15;
	public static final int
		RULE_command = 0, RULE_exploreCommand = 1, RULE_battleCommand = 2, RULE_item = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "exploreCommand", "battleCommand", "item"
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
			"WIELD", "OPEN", "HELP", "ATTACK", "STRING", "INT", "WS", "NEWLINE"
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
			setState(10);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				battleCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
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
		public List<TerminalNode> DOOR() { return getTokens(PlayerCommandParser.DOOR); }
		public TerminalNode DOOR(int i) {
			return getToken(PlayerCommandParser.DOOR, i);
		}
		public TerminalNode INT() { return getToken(PlayerCommandParser.INT, 0); }
		public TerminalNode PICKUP() { return getToken(PlayerCommandParser.PICKUP, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(DOOR);
				setState(13);
				match(DOOR);
				setState(14);
				match(INT);
				}
				break;
			case PICKUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(PICKUP);
				setState(16);
				item();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(EXIT);
				}
				break;
			case DESCRIBE:
				enterOuterAlt(_localctx, 4);
				{
				setState(18);
				match(DESCRIBE);
				}
				break;
			case ADMIRE:
				enterOuterAlt(_localctx, 5);
				{
				setState(19);
				match(ADMIRE);
				}
				break;
			case EAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(20);
				match(EAT);
				}
				break;
			case STATS:
				enterOuterAlt(_localctx, 7);
				{
				setState(21);
				match(STATS);
				}
				break;
			case WIELD:
				enterOuterAlt(_localctx, 8);
				{
				setState(22);
				match(WIELD);
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 9);
				{
				setState(23);
				match(OPEN);
				setState(24);
				item();
				}
				break;
			case HELP:
				enterOuterAlt(_localctx, 10);
				{
				setState(25);
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
			setState(28);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(PlayerCommandParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PlayerCommandParser.STRING, i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(STRING);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		"\u0004\u0001\u000f$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u000b\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0004\u0003 \b\u0003\u000b\u0003\f\u0003"+
		"!\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0002"+
		"\u0000\b\b\n\u000b*\u0000\n\u0001\u0000\u0000\u0000\u0002\u001a\u0001"+
		"\u0000\u0000\u0000\u0004\u001c\u0001\u0000\u0000\u0000\u0006\u001f\u0001"+
		"\u0000\u0000\u0000\b\u000b\u0003\u0004\u0002\u0000\t\u000b\u0003\u0002"+
		"\u0001\u0000\n\b\u0001\u0000\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e\u0005"+
		"\u0001\u0000\u0000\u000e\u001b\u0005\r\u0000\u0000\u000f\u0010\u0005\u0002"+
		"\u0000\u0000\u0010\u001b\u0003\u0006\u0003\u0000\u0011\u001b\u0005\u0003"+
		"\u0000\u0000\u0012\u001b\u0005\u0004\u0000\u0000\u0013\u001b\u0005\u0005"+
		"\u0000\u0000\u0014\u001b\u0005\u0006\u0000\u0000\u0015\u001b\u0005\u0007"+
		"\u0000\u0000\u0016\u001b\u0005\b\u0000\u0000\u0017\u0018\u0005\t\u0000"+
		"\u0000\u0018\u001b\u0003\u0006\u0003\u0000\u0019\u001b\u0005\n\u0000\u0000"+
		"\u001a\f\u0001\u0000\u0000\u0000\u001a\u000f\u0001\u0000\u0000\u0000\u001a"+
		"\u0011\u0001\u0000\u0000\u0000\u001a\u0012\u0001\u0000\u0000\u0000\u001a"+
		"\u0013\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000\u0000\u0000\u001a"+
		"\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b"+
		"\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d"+
		"\u0005\u0001\u0000\u0000\u0000\u001e \u0005\f\u0000\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0007\u0001\u0000\u0000\u0000"+
		"\u0003\n\u001a!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}