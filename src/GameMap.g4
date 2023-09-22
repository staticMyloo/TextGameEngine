grammar GameMap;

/** the start rule, begin parsing here **/
gamemap : 'MAP' '[' roomList edgeList ']' ;

//Vertices (Rooms inside the world)
roomList : 'ROOMS' '[' room+ ']' ;
edgeList : 'EDGES' '[' edge+ ']' ;

room : 'ROOM' '['
<<<<<<< Updated upstream
                    'ID' '=' roomName ','
                    'DESC' '=' description
                    (',' 'ROOM_ITEMS' '=' '[' pickup ']')?
=======
                    'DESC' '=' roomName
                    (',' 'ROOM_ITEMS' '=' '[' roomItems ']')?
>>>>>>> Stashed changes
                    (',' 'TREASURE_CHEST' '=' '[' treasureItem ']' )?
                    (',' 'WAR_CHEST' '=' '[' wieldable ']' )?
                    (',' 'END_ROOM' '=' END_ROOM)?
                    ']'
                    ;
edge : 'EDGE' '[' 'ID' '=' ID ',' 'START' '=' ID ',' 'END' '=' ID ']' ;

wieldable : pickup*;
treasureItem : pickup*;
description: STRING;
roomName: ID;
roomItems : pickup (',' pickup)*;
pickup: TREASURE_ITEM | WAR_ITEM | CHEST | FOOD | KEY;

CHEST : 'WarChest' | 'TreasureChest';
FOOD : 'Mead' | 'RoastBoar' | 'Bread';
WAR_ITEM : 'Axe' | 'Sword' | 'FistsOfFury' ;
TREASURE_ITEM : 'Ring' | 'Jewel' | 'Goldbars' | 'Chalice' | 'Coin' | 'MoneyBag';
KEY : 'LockPick' | 'Key';
STRING : '"' ( ~["\n\r] )* '"' ;
END_ROOM : 'true' | 'false' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\r\n]+ -> skip ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)