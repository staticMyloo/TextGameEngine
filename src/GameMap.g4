grammar GameMap;

/** the start rule, begin parsing here **/
gamemap : 'MAP' '[' roomList edgeList ']' ;

//Vertices (Rooms inside the world)
roomList : 'ROOMS' '[' room+ ']' ;
edgeList : 'EDGES' '[' edge+ ']' ;

room : 'ROOM' '['
                    'DESC' '=' roomName
                    (',' 'TREASURE_CHEST' '=' '[' treasureItem ']' )?
                    ']'
                    ;
edge : 'EDGE' '[' 'ID' '=' ID ',' 'START' '=' ID ',' 'END' '=' ID ']' ;

treasureItem : pickup*;
roomName: ID;
pickup: STRING;
STRING : '"' ( ~["\n\r] )* '"' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\r\n]+ -> skip ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)