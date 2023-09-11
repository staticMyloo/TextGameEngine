grammar GameMap;

/** the start rule, begin parsing here **/
gamemap : 'MAP' '[' roomList edgeList ']' ;

//Vertices (Rooms inside the world)
roomList : 'ROOMS' '[' room+ ']' ;
edgeList : 'EDGES' '[' edge+ ']' ;

room : 'ROOM' '['
                    'DESC' '=' roomName
                    (',' 'ROOM_ITEMS' '=' '[' pickup ']')?
                    (',' 'TREASURE_CHEST' '=' '[' treasureItem ']' )?
                    (',' 'WAR_CHEST' '=' '[' wieldable ']' )?
                    (',' 'END_ROOM' '=' END_ROOM)?
                    ']'
                    ;
edge : 'EDGE' '[' 'ID' '=' ID ',' 'START' '=' ID ',' 'END' '=' ID ']' ;

wieldable : pickup*;
treasureItem : pickup*;
roomName: ID;
pickup: TREASURE_ITEM | WAR_ITEM | CHEST | FOOD;

CHEST : 'WarChest' | 'TreasureChest';
FOOD : 'Mead' | 'RoastBoar' | 'Bread';
WAR_ITEM : 'Axe' | 'Sword' | 'FistsOfFury' ;
TREASURE_ITEM : 'Ring' | 'Jewel' | 'Goldbars' | 'Chalice' | 'Coin' | 'MoneyBag';
STRING : '"' ( ~["\n\r] )* '"' ;
END_ROOM : 'true' | 'false' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\r\n]+ -> skip ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)