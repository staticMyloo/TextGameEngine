// Generated from C:/Users/myles/GitHub/TextGameEngine/src\GameMap.g4 by ANTLR 4.12.0
package gamemap_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		CHEST=18, FOOD=19, WAR_ITEM=20, TREASURE_ITEM=21, STRING=22, END_ROOM=23, 
		ID=24, WS=25, NEWLINE=26;
	public static final int
		RULE_gamemap = 0, RULE_roomList = 1, RULE_edgeList = 2, RULE_room = 3, 
<<<<<<< Updated upstream
		RULE_edge = 4, RULE_wieldable = 5, RULE_treasureItem = 6, RULE_description = 7, 
		RULE_roomName = 8, RULE_pickup = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "roomList", "edgeList", "room", "edge", "wieldable", "treasureItem", 
			"description", "roomName", "pickup"
=======
		RULE_edge = 4, RULE_wieldable = 5, RULE_treasureItem = 6, RULE_roomName = 7, 
		RULE_roomItems = 8, RULE_pickup = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "roomList", "edgeList", "room", "edge", "wieldable", "treasureItem", 
			"roomName", "roomItems", "pickup"
>>>>>>> Stashed changes
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MAP'", "'['", "']'", "'ROOMS'", "'EDGES'", "'ROOM'", "'ID'", 
			"'='", "','", "'DESC'", "'ROOM_ITEMS'", "'TREASURE_CHEST'", "'WAR_CHEST'", 
			"'END_ROOM'", "'EDGE'", "'START'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "CHEST", "FOOD", "WAR_ITEM", "TREASURE_ITEM", 
			"STRING", "END_ROOM", "ID", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GamemapContext extends ParserRuleContext {
		public RoomListContext roomList() {
			return getRuleContext(RoomListContext.class,0);
		}
		public EdgeListContext edgeList() {
			return getRuleContext(EdgeListContext.class,0);
		}
		public GamemapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamemap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGamemap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGamemap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGamemap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GamemapContext gamemap() throws RecognitionException {
		GamemapContext _localctx = new GamemapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gamemap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(T__1);
			setState(22);
			roomList();
			setState(23);
			edgeList();
			setState(24);
			match(T__2);
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
	public static class RoomListContext extends ParserRuleContext {
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public RoomListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomListContext roomList() throws RecognitionException {
		RoomListContext _localctx = new RoomListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_roomList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__3);
			setState(27);
			match(T__1);
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				room();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(33);
			match(T__2);
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
	public static class EdgeListContext extends ParserRuleContext {
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public EdgeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterEdgeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitEdgeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitEdgeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeListContext edgeList() throws RecognitionException {
		EdgeListContext _localctx = new EdgeListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_edgeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__4);
			setState(36);
			match(T__1);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				edge();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
<<<<<<< Updated upstream
			} while ( _la==T__14 );
=======
			} while ( _la==T__13 );
>>>>>>> Stashed changes
			setState(42);
			match(T__2);
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
	public static class RoomContext extends ParserRuleContext {
		public RoomNameContext roomName() {
			return getRuleContext(RoomNameContext.class,0);
		}
<<<<<<< Updated upstream
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public PickupContext pickup() {
			return getRuleContext(PickupContext.class,0);
=======
		public RoomItemsContext roomItems() {
			return getRuleContext(RoomItemsContext.class,0);
>>>>>>> Stashed changes
		}
		public TreasureItemContext treasureItem() {
			return getRuleContext(TreasureItemContext.class,0);
		}
		public WieldableContext wieldable() {
			return getRuleContext(WieldableContext.class,0);
		}
		public TerminalNode END_ROOM() { return getToken(GameMapParser.END_ROOM, 0); }
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_room);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__5);
			setState(45);
			match(T__1);
			setState(46);
			match(T__6);
			setState(47);
			match(T__7);
			setState(48);
			roomName();
<<<<<<< Updated upstream
			setState(49);
			match(T__8);
			setState(50);
			match(T__9);
			setState(51);
			match(T__7);
			setState(52);
			description();
			setState(60);
=======
			setState(56);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
<<<<<<< Updated upstream
				setState(53);
				match(T__8);
				setState(54);
				match(T__10);
				setState(55);
				match(T__7);
				setState(56);
				match(T__1);
				setState(57);
				pickup();
				setState(58);
=======
				setState(49);
				match(T__8);
				setState(50);
				match(T__9);
				setState(51);
				match(T__7);
				setState(52);
				match(T__1);
				setState(53);
				roomItems();
				setState(54);
>>>>>>> Stashed changes
				match(T__2);
				}
				break;
			}
<<<<<<< Updated upstream
			setState(69);
=======
			setState(65);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
<<<<<<< Updated upstream
				setState(62);
				match(T__8);
				setState(63);
				match(T__11);
				setState(64);
				match(T__7);
				setState(65);
				match(T__1);
				setState(66);
				treasureItem();
				setState(67);
=======
				setState(58);
				match(T__8);
				setState(59);
				match(T__10);
				setState(60);
				match(T__7);
				setState(61);
				match(T__1);
				setState(62);
				treasureItem();
				setState(63);
				match(T__2);
				}
				break;
			}
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(67);
				match(T__8);
				setState(68);
				match(T__11);
				setState(69);
				match(T__7);
				setState(70);
				match(T__1);
				setState(71);
				wieldable();
				setState(72);
>>>>>>> Stashed changes
				match(T__2);
				}
				break;
			}
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(71);
				match(T__8);
				setState(72);
				match(T__12);
				setState(73);
				match(T__7);
				setState(74);
				match(T__1);
				setState(75);
				wieldable();
				setState(76);
				match(T__2);
				}
				break;
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
<<<<<<< Updated upstream
				setState(80);
				match(T__8);
				setState(81);
				match(T__13);
				setState(82);
				match(T__7);
				setState(83);
=======
				setState(76);
				match(T__8);
				setState(77);
				match(T__12);
				setState(78);
				match(T__7);
				setState(79);
>>>>>>> Stashed changes
				match(END_ROOM);
				}
			}

<<<<<<< Updated upstream
			setState(86);
=======
			setState(82);
>>>>>>> Stashed changes
			match(T__2);
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
	public static class EdgeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(88);
			match(T__14);
			setState(89);
			match(T__1);
			setState(90);
			match(T__6);
=======
			setState(84);
			match(T__13);
			setState(85);
			match(T__1);
			setState(86);
			match(T__14);
			setState(87);
			match(T__7);
			setState(88);
			match(ID);
			setState(89);
			match(T__8);
			setState(90);
			match(T__15);
>>>>>>> Stashed changes
			setState(91);
			match(T__7);
			setState(92);
			match(ID);
			setState(93);
			match(T__8);
			setState(94);
<<<<<<< Updated upstream
			match(T__15);
=======
			match(T__16);
>>>>>>> Stashed changes
			setState(95);
			match(T__7);
			setState(96);
			match(ID);
			setState(97);
<<<<<<< Updated upstream
			match(T__8);
			setState(98);
			match(T__16);
			setState(99);
			match(T__7);
			setState(100);
			match(ID);
			setState(101);
=======
>>>>>>> Stashed changes
			match(T__2);
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
	public static class WieldableContext extends ParserRuleContext {
		public List<PickupContext> pickup() {
			return getRuleContexts(PickupContext.class);
		}
		public PickupContext pickup(int i) {
			return getRuleContext(PickupContext.class,i);
		}
		public WieldableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wieldable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterWieldable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitWieldable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitWieldable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WieldableContext wieldable() throws RecognitionException {
		WieldableContext _localctx = new WieldableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wieldable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(106);
=======
			setState(102);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				{
<<<<<<< Updated upstream
				setState(103);
				pickup();
				}
				}
				setState(108);
=======
				setState(99);
				pickup();
				}
				}
				setState(104);
>>>>>>> Stashed changes
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
	public static class TreasureItemContext extends ParserRuleContext {
		public List<PickupContext> pickup() {
			return getRuleContexts(PickupContext.class);
		}
		public PickupContext pickup(int i) {
			return getRuleContext(PickupContext.class,i);
		}
		public TreasureItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treasureItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterTreasureItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitTreasureItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitTreasureItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TreasureItemContext treasureItem() throws RecognitionException {
		TreasureItemContext _localctx = new TreasureItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_treasureItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(112);
=======
			setState(108);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				{
<<<<<<< Updated upstream
				setState(109);
				pickup();
				}
				}
				setState(114);
=======
				setState(105);
				pickup();
				}
				}
				setState(110);
>>>>>>> Stashed changes
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
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GameMapParser.STRING, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(STRING);
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
	public static class RoomNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RoomNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomNameContext roomName() throws RecognitionException {
		RoomNameContext _localctx = new RoomNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_roomName);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(117);
=======
			setState(111);
>>>>>>> Stashed changes
			match(ID);
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
	public static class RoomItemsContext extends ParserRuleContext {
		public List<PickupContext> pickup() {
			return getRuleContexts(PickupContext.class);
		}
		public PickupContext pickup(int i) {
			return getRuleContext(PickupContext.class,i);
		}
		public RoomItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomItemsContext roomItems() throws RecognitionException {
		RoomItemsContext _localctx = new RoomItemsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_roomItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			pickup();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(114);
				match(T__8);
				setState(115);
				pickup();
				}
				}
				setState(120);
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
	public static class PickupContext extends ParserRuleContext {
		public TerminalNode TREASURE_ITEM() { return getToken(GameMapParser.TREASURE_ITEM, 0); }
		public TerminalNode WAR_ITEM() { return getToken(GameMapParser.WAR_ITEM, 0); }
		public TerminalNode CHEST() { return getToken(GameMapParser.CHEST, 0); }
		public TerminalNode FOOD() { return getToken(GameMapParser.FOOD, 0); }
		public PickupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterPickup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitPickup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitPickup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupContext pickup() throws RecognitionException {
		PickupContext _localctx = new PickupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pickup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(119);
=======
			setState(121);
>>>>>>> Stashed changes
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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
<<<<<<< Updated upstream
		"\u0004\u0001\u001az\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
=======
		"\u0004\u0001\u001a|\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
>>>>>>> Stashed changes
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u001e\b\u0001\u000b\u0001\f\u0001\u001f\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002"+
		"(\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
<<<<<<< Updated upstream
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003=\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003O\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0005\u0005i\b\u0005\n\u0005\f\u0005l\t\u0005"+
		"\u0001\u0006\u0005\u0006o\b\u0006\n\u0006\f\u0006r\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001\u0000\u0012"+
		"\u0015w\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000"+
		"\u0000\u0004#\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		"X\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000"+
		"\u0000\u000es\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012"+
		"w\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016"+
		"\u0005\u0002\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"+
		"\u0003\u0004\u0002\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019\u0001"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b\u001d"+
		"\u0005\u0002\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0003\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#$\u0005\u0005\u0000\u0000$&\u0005\u0002\u0000\u0000%\'\u0003\b\u0004"+
		"\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0003\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u0006\u0000"+
		"\u0000-.\u0005\u0002\u0000\u0000./\u0005\u0007\u0000\u0000/0\u0005\b\u0000"+
		"\u000001\u0003\u0010\b\u000012\u0005\t\u0000\u000023\u0005\n\u0000\u0000"+
		"34\u0005\b\u0000\u00004<\u0003\u000e\u0007\u000056\u0005\t\u0000\u0000"+
		"67\u0005\u000b\u0000\u000078\u0005\b\u0000\u000089\u0005\u0002\u0000\u0000"+
		"9:\u0003\u0012\t\u0000:;\u0005\u0003\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<5\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=E\u0001\u0000\u0000"+
		"\u0000>?\u0005\t\u0000\u0000?@\u0005\f\u0000\u0000@A\u0005\b\u0000\u0000"+
		"AB\u0005\u0002\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005\u0003\u0000\u0000"+
		"DF\u0001\u0000\u0000\u0000E>\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FN\u0001\u0000\u0000\u0000GH\u0005\t\u0000\u0000HI\u0005\r\u0000"+
		"\u0000IJ\u0005\b\u0000\u0000JK\u0005\u0002\u0000\u0000KL\u0003\n\u0005"+
		"\u0000LM\u0005\u0003\u0000\u0000MO\u0001\u0000\u0000\u0000NG\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OT\u0001\u0000\u0000\u0000PQ\u0005"+
		"\t\u0000\u0000QR\u0005\u000e\u0000\u0000RS\u0005\b\u0000\u0000SU\u0005"+
		"\u0017\u0000\u0000TP\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u0005\u0003\u0000\u0000W\u0007\u0001\u0000"+
		"\u0000\u0000XY\u0005\u000f\u0000\u0000YZ\u0005\u0002\u0000\u0000Z[\u0005"+
		"\u0007\u0000\u0000[\\\u0005\b\u0000\u0000\\]\u0005\u0018\u0000\u0000]"+
		"^\u0005\t\u0000\u0000^_\u0005\u0010\u0000\u0000_`\u0005\b\u0000\u0000"+
		"`a\u0005\u0018\u0000\u0000ab\u0005\t\u0000\u0000bc\u0005\u0011\u0000\u0000"+
		"cd\u0005\b\u0000\u0000de\u0005\u0018\u0000\u0000ef\u0005\u0003\u0000\u0000"+
		"f\t\u0001\u0000\u0000\u0000gi\u0003\u0012\t\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mo\u0003\u0012\t\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0016\u0000\u0000t\u000f\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0018\u0000\u0000v\u0011\u0001\u0000\u0000"+
		"\u0000wx\u0007\u0000\u0000\u0000x\u0013\u0001\u0000\u0000\u0000\b\u001f"+
		"(<ENTjp";
=======
		"\u0001\u0003\u0001\u0003\u0003\u00039\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"B\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005e\b\u0005"+
		"\n\u0005\f\u0005h\t\u0005\u0001\u0006\u0005\u0006k\b\u0006\n\u0006\f\u0006"+
		"n\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bu\b\b"+
		"\n\b\f\bx\t\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0001\u0000\u0012\u0015z\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004"+
		"#\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\bT\u0001\u0000"+
		"\u0000\u0000\nf\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000e"+
		"o\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012y\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005"+
		"\u0002\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0003"+
		"\u0004\u0002\u0000\u0018\u0019\u0005\u0003\u0000\u0000\u0019\u0001\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0004\u0000\u0000\u001b\u001d\u0005"+
		"\u0002\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\"\u0005\u0003\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005"+
		"\u0005\u0000\u0000$&\u0005\u0002\u0000\u0000%\'\u0003\b\u0004\u0000&%"+
		"\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005\u0003"+
		"\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000"+
		"-.\u0005\u0002\u0000\u0000./\u0005\u0007\u0000\u0000/0\u0005\b\u0000\u0000"+
		"08\u0003\u000e\u0007\u000012\u0005\t\u0000\u000023\u0005\n\u0000\u0000"+
		"34\u0005\b\u0000\u000045\u0005\u0002\u0000\u000056\u0003\u0010\b\u0000"+
		"67\u0005\u0003\u0000\u000079\u0001\u0000\u0000\u000081\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009A\u0001\u0000\u0000\u0000:;\u0005\t\u0000"+
		"\u0000;<\u0005\u000b\u0000\u0000<=\u0005\b\u0000\u0000=>\u0005\u0002\u0000"+
		"\u0000>?\u0003\f\u0006\u0000?@\u0005\u0003\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000A:\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BJ\u0001\u0000"+
		"\u0000\u0000CD\u0005\t\u0000\u0000DE\u0005\f\u0000\u0000EF\u0005\b\u0000"+
		"\u0000FG\u0005\u0002\u0000\u0000GH\u0003\n\u0005\u0000HI\u0005\u0003\u0000"+
		"\u0000IK\u0001\u0000\u0000\u0000JC\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KP\u0001\u0000\u0000\u0000LM\u0005\t\u0000\u0000MN\u0005\r"+
		"\u0000\u0000NO\u0005\b\u0000\u0000OQ\u0005\u0017\u0000\u0000PL\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0003\u0000\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0005\u000e\u0000"+
		"\u0000UV\u0005\u0002\u0000\u0000VW\u0005\u000f\u0000\u0000WX\u0005\b\u0000"+
		"\u0000XY\u0005\u0018\u0000\u0000YZ\u0005\t\u0000\u0000Z[\u0005\u0010\u0000"+
		"\u0000[\\\u0005\b\u0000\u0000\\]\u0005\u0018\u0000\u0000]^\u0005\t\u0000"+
		"\u0000^_\u0005\u0011\u0000\u0000_`\u0005\b\u0000\u0000`a\u0005\u0018\u0000"+
		"\u0000ab\u0005\u0003\u0000\u0000b\t\u0001\u0000\u0000\u0000ce\u0003\u0012"+
		"\t\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ik\u0003\u0012\t\u0000ji\u0001\u0000\u0000\u0000"+
		"kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000m\r\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\u0018"+
		"\u0000\u0000p\u000f\u0001\u0000\u0000\u0000qv\u0003\u0012\t\u0000rs\u0005"+
		"\t\u0000\u0000su\u0003\u0012\t\u0000tr\u0001\u0000\u0000\u0000ux\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"w\u0011\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0007\u0000"+
		"\u0000\u0000z\u0013\u0001\u0000\u0000\u0000\t\u001f(8AJPflv";
>>>>>>> Stashed changes
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}