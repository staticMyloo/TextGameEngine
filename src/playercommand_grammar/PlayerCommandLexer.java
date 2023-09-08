// Generated from C:/Users/myles/Desktop/TextGameEngine/src\PlayerCommand.g4 by ANTLR 4.12.0
package playercommand_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOOR=1, PICKUP=2, EXIT=3, DESCRIBE=4, ADMIRE=5, EAT=6, STATS=7, WIELD=8, 
		OPEN=9, HELP=10, ATTACK=11, INT=12, WS=13, NEWLINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOOR", "PICKUP", "EXIT", "DESCRIBE", "ADMIRE", "EAT", "STATS", "WIELD", 
			"OPEN", "HELP", "ATTACK", "INT", "WS", "NEWLINE"
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


	public PlayerCommandLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000ep\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b"+
		"a\b\u000b\u000b\u000b\f\u000bb\u0001\f\u0004\ff\b\f\u000b\f\f\fg\u0001"+
		"\f\u0001\f\u0001\r\u0003\rm\b\r\u0001\r\u0001\r\u0000\u0000\u000e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001"+
		"\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  r\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000"+
		"\u0003\"\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007"+
		".\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b>\u0001\u0000"+
		"\u0000\u0000\rB\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000"+
		"\u0011N\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000\u0015X"+
		"\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019e\u0001\u0000"+
		"\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001d\u001e\u0005d\u0000\u0000"+
		"\u001e\u001f\u0005o\u0000\u0000\u001f \u0005o\u0000\u0000 !\u0005r\u0000"+
		"\u0000!\u0002\u0001\u0000\u0000\u0000\"#\u0005p\u0000\u0000#$\u0005i\u0000"+
		"\u0000$%\u0005c\u0000\u0000%&\u0005k\u0000\u0000&\'\u0005u\u0000\u0000"+
		"\'(\u0005p\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005e\u0000\u0000"+
		"*+\u0005x\u0000\u0000+,\u0005i\u0000\u0000,-\u0005t\u0000\u0000-\u0006"+
		"\u0001\u0000\u0000\u0000./\u0005d\u0000\u0000/0\u0005e\u0000\u000001\u0005"+
		"s\u0000\u000012\u0005c\u0000\u000023\u0005r\u0000\u000034\u0005i\u0000"+
		"\u000045\u0005b\u0000\u000056\u0005e\u0000\u00006\b\u0001\u0000\u0000"+
		"\u000078\u0005a\u0000\u000089\u0005d\u0000\u00009:\u0005m\u0000\u0000"+
		":;\u0005i\u0000\u0000;<\u0005r\u0000\u0000<=\u0005e\u0000\u0000=\n\u0001"+
		"\u0000\u0000\u0000>?\u0005e\u0000\u0000?@\u0005a\u0000\u0000@A\u0005t"+
		"\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005s\u0000\u0000CD\u0005t"+
		"\u0000\u0000DE\u0005a\u0000\u0000EF\u0005t\u0000\u0000FG\u0005s\u0000"+
		"\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005w\u0000\u0000IJ\u0005i\u0000"+
		"\u0000JK\u0005e\u0000\u0000KL\u0005l\u0000\u0000LM\u0005d\u0000\u0000"+
		"M\u0010\u0001\u0000\u0000\u0000NO\u0005o\u0000\u0000OP\u0005p\u0000\u0000"+
		"PQ\u0005e\u0000\u0000QR\u0005n\u0000\u0000R\u0012\u0001\u0000\u0000\u0000"+
		"ST\u0005h\u0000\u0000TU\u0005e\u0000\u0000UV\u0005l\u0000\u0000VW\u0005"+
		"p\u0000\u0000W\u0014\u0001\u0000\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005"+
		"t\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005c\u0000"+
		"\u0000]^\u0005k\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_a\u0007\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0018\u0001\u0000\u0000"+
		"\u0000df\u0007\u0001\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0006\f\u0000\u0000j\u001a\u0001\u0000\u0000\u0000"+
		"km\u0005\r\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o\u001c\u0001\u0000\u0000"+
		"\u0000\u0004\u0000bgl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}