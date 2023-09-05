grammar GameMap;

/** the start rule, begin parsing here **/
gamemap : 'MAP' '[' vertexList edgeList ']' ;

//Vertices (Rooms inside the world)
vertexList : 'VERTICES' '[' vertex+ ']' ;
edgeList : 'EDGES' '[' edge+ ']' ;

vertex : 'VERTEX' '[' 'ID' '=' ID ',' 'NAME' '=' STRING ']' ;
edge : 'EDGE' '[' 'ID' '=' ID ',' 'START' '=' ID ',' 'END' '=' ID ']' ;

STRING : '"' ( ~["\n\r] )* '"' ;
ID : [a-zA-Z][a-zA-Z0-9]* ;
WS : [ \t\r\n]+ -> skip ;
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)