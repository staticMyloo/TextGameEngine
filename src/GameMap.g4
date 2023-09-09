grammar GameMap;

/** the start rule, begin parsing here **/
gamemap : 'MAP' '[' roomList edgeList ']' ;

//Vertices (Rooms inside the world)
roomList : 'ROOMS' '[' room+ ']' ;
edgeList : 'EDGES' '[' edge+ ']' ;

room : 'ROOM' '['
                    'DESC' '=' roomName
                    (',' 'TREASURE_CHEST' '=' '[' treasureItem ']' )?
                    (',' 'WAR_CHEST' '=' '[' wieldable ']' )?
                    (',' 'END_ROOM' '=' END_ROOM)?
                    ']'
                    ;
edge : 'EDGE' '[' 'ID' '=' ID ',' 'START' '=' ID ',' 'END' '=' ID ']' ;

wieldable : pickup*;
treasureItem : pickup*;
roomName: ID;
pickup: TREASURE_ITEM | WAR_ITEM | CHEST;

CHEST : 'WarChest' | 'TreasureChest';
WAR_ITEM : 'Axe' | 'Sword' ;
TREASURE_ITEM : 'Ring' | 'Jewel' | 'Goldbars' ;
STRING : '"' ( ~["\n\r] )* '"' ;
END_ROOM : 'true' | 'false' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\r\n]+ -> skip ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)