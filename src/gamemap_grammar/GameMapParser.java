// Generated from C:/Users/myles/Desktop/TextGameEngine/src\GameMap.g4 by ANTLR 4.12.0
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
		T__17=18, CHEST=19, FOOD=20, WAR_ITEM=21, TREASURE_ITEM=22, KEY=23, STRING=24, 
		END_ROOM=25, ID=26, WS=27, NEWLINE=28;
	public static final int
		RULE_gamemap = 0, RULE_roomList = 1, RULE_edgeList = 2, RULE_room = 3, 
		RULE_edge = 4, RULE_wieldable = 5, RULE_treasureItem = 6, RULE_description = 7, 
		RULE_roomName = 8, RULE_roomID = 9, RULE_roomItems = 10, RULE_pickup = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "roomList", "edgeList", "room", "edge", "wieldable", "treasureItem", 
			"description", "roomName", "roomID", "roomItems", "pickup"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MAP'", "'['", "']'", "'ROOMS'", "'EDGES'", "'ROOM'", "'ID'", 
			"'='", "','", "'NAME'", "'DESC'", "'ROOM_ITEMS'", "'TREASURE_CHEST'", 
			"'WAR_CHEST'", "'END_ROOM'", "'EDGE'", "'START'", "'END'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CHEST", "FOOD", "WAR_ITEM", 
			"TREASURE_ITEM", "KEY", "STRING", "END_ROOM", "ID", "WS", "NEWLINE"
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
			setState(24);
			match(T__0);
			setState(25);
			match(T__1);
			setState(26);
			roomList();
			setState(27);
			edgeList();
			setState(28);
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
			setState(30);
			match(T__3);
			setState(31);
			match(T__1);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				room();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(37);
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
			setState(39);
			match(T__4);
			setState(40);
			match(T__1);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				edge();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			setState(46);
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
		public RoomIDContext roomID() {
			return getRuleContext(RoomIDContext.class,0);
		}
		public RoomNameContext roomName() {
			return getRuleContext(RoomNameContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public RoomItemsContext roomItems() {
			return getRuleContext(RoomItemsContext.class,0);
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
			setState(48);
			match(T__5);
			setState(49);
			match(T__1);
			setState(50);
			match(T__6);
			setState(51);
			match(T__7);
			setState(52);
			roomID();
			setState(53);
			match(T__8);
			setState(54);
			match(T__9);
			setState(55);
			match(T__7);
			setState(56);
			roomName();
			setState(57);
			match(T__8);
			setState(58);
			match(T__10);
			setState(59);
			match(T__7);
			setState(60);
			description();
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(61);
				match(T__8);
				setState(62);
				match(T__11);
				setState(63);
				match(T__7);
				setState(64);
				match(T__1);
				setState(65);
				roomItems();
				setState(66);
				match(T__2);
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(70);
				match(T__8);
				setState(71);
				match(T__12);
				setState(72);
				match(T__7);
				setState(73);
				match(T__1);
				setState(74);
				treasureItem();
				setState(75);
				match(T__2);
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(79);
				match(T__8);
				setState(80);
				match(T__13);
				setState(81);
				match(T__7);
				setState(82);
				match(T__1);
				setState(83);
				wieldable();
				setState(84);
				match(T__2);
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(88);
				match(T__8);
				setState(89);
				match(T__14);
				setState(90);
				match(T__7);
				setState(91);
				match(END_ROOM);
				}
			}

			setState(94);
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
			setState(96);
			match(T__15);
			setState(97);
			match(T__1);
			setState(98);
			match(T__6);
			setState(99);
			match(T__7);
			setState(100);
			match(ID);
			setState(101);
			match(T__8);
			setState(102);
			match(T__16);
			setState(103);
			match(T__7);
			setState(104);
			match(ID);
			setState(105);
			match(T__8);
			setState(106);
			match(T__17);
			setState(107);
			match(T__7);
			setState(108);
			match(ID);
			setState(109);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) {
				{
				{
				setState(111);
				pickup();
				}
				}
				setState(116);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) {
				{
				{
				setState(117);
				pickup();
				}
				}
				setState(122);
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
			setState(123);
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
		public TerminalNode STRING() { return getToken(GameMapParser.STRING, 0); }
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
			setState(125);
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
	public static class RoomIDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public RoomIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomIDContext roomID() throws RecognitionException {
		RoomIDContext _localctx = new RoomIDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_roomID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		enterRule(_localctx, 20, RULE_roomItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			pickup();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(130);
				match(T__8);
				setState(131);
				pickup();
				}
				}
				setState(136);
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
		public TerminalNode KEY() { return getToken(GameMapParser.KEY, 0); }
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
		enterRule(_localctx, 22, RULE_pickup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16252928L) != 0)) ) {
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
		"\u0004\u0001\u001c\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001"+
		"\f\u0001#\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003N\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005q\b\u0005\n\u0005"+
		"\f\u0005t\t\u0005\u0001\u0006\u0005\u0006w\b\u0006\n\u0006\f\u0006z\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u0085\b\n\n\n\f\n\u0088\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0001\u0001\u0000\u0013\u0017\u0088\u0000\u0018"+
		"\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004\'\u0001"+
		"\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000"+
		"\u0000\nr\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e{\u0001"+
		"\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u007f\u0001\u0000"+
		"\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a\u0005\u0002"+
		"\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0003\u0004"+
		"\u0002\u0000\u001c\u001d\u0005\u0003\u0000\u0000\u001d\u0001\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0004\u0000\u0000\u001f!\u0005\u0002\u0000"+
		"\u0000 \"\u0003\u0006\u0003\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000&\u0003\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0005\u0000\u0000(*\u0005\u0002\u0000\u0000)+\u0003\b"+
		"\u0004\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		"./\u0005\u0003\u0000\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0006"+
		"\u0000\u000012\u0005\u0002\u0000\u000023\u0005\u0007\u0000\u000034\u0005"+
		"\b\u0000\u000045\u0003\u0012\t\u000056\u0005\t\u0000\u000067\u0005\n\u0000"+
		"\u000078\u0005\b\u0000\u000089\u0003\u0010\b\u00009:\u0005\t\u0000\u0000"+
		":;\u0005\u000b\u0000\u0000;<\u0005\b\u0000\u0000<D\u0003\u000e\u0007\u0000"+
		"=>\u0005\t\u0000\u0000>?\u0005\f\u0000\u0000?@\u0005\b\u0000\u0000@A\u0005"+
		"\u0002\u0000\u0000AB\u0003\u0014\n\u0000BC\u0005\u0003\u0000\u0000CE\u0001"+
		"\u0000\u0000\u0000D=\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EM\u0001\u0000\u0000\u0000FG\u0005\t\u0000\u0000GH\u0005\r\u0000\u0000"+
		"HI\u0005\b\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0003\f\u0006\u0000"+
		"KL\u0005\u0003\u0000\u0000LN\u0001\u0000\u0000\u0000MF\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NV\u0001\u0000\u0000\u0000OP\u0005\t\u0000"+
		"\u0000PQ\u0005\u000e\u0000\u0000QR\u0005\b\u0000\u0000RS\u0005\u0002\u0000"+
		"\u0000ST\u0003\n\u0005\u0000TU\u0005\u0003\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VO\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\\\u0001\u0000"+
		"\u0000\u0000XY\u0005\t\u0000\u0000YZ\u0005\u000f\u0000\u0000Z[\u0005\b"+
		"\u0000\u0000[]\u0005\u0019\u0000\u0000\\X\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0003\u0000\u0000"+
		"_\u0007\u0001\u0000\u0000\u0000`a\u0005\u0010\u0000\u0000ab\u0005\u0002"+
		"\u0000\u0000bc\u0005\u0007\u0000\u0000cd\u0005\b\u0000\u0000de\u0005\u001a"+
		"\u0000\u0000ef\u0005\t\u0000\u0000fg\u0005\u0011\u0000\u0000gh\u0005\b"+
		"\u0000\u0000hi\u0005\u001a\u0000\u0000ij\u0005\t\u0000\u0000jk\u0005\u0012"+
		"\u0000\u0000kl\u0005\b\u0000\u0000lm\u0005\u001a\u0000\u0000mn\u0005\u0003"+
		"\u0000\u0000n\t\u0001\u0000\u0000\u0000oq\u0003\u0016\u000b\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000s\u000b\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000uw\u0003\u0016\u000b\u0000vu\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y\r\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0018\u0000"+
		"\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005\u0018\u0000\u0000~\u0011"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u001a\u0000\u0000\u0080\u0013"+
		"\u0001\u0000\u0000\u0000\u0081\u0086\u0003\u0016\u000b\u0000\u0082\u0083"+
		"\u0005\t\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0015\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0007"+
		"\u0000\u0000\u0000\u008a\u0017\u0001\u0000\u0000\u0000\t#,DMV\\rx\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}