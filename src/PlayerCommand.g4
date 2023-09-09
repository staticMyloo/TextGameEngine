grammar PlayerCommand;

/** the start rule, begin parsing here **/


command : battleCommand | exploreCommand;

exploreCommand
    : DOOR 'door' INT
    | PICKUP item
    | EXIT
    | DESCRIBE
    | ADMIRE
    | EAT
    | STATS
    | WIELD
    | OPEN item
    | HELP
    ;

battleCommand
    : ATTACK
    | WIELD
    | HELP;

item : STRING+;
//Explore Commands
DOOR : 'door';
PICKUP : 'pickup';
EXIT : 'exit';
DESCRIBE : 'describe';
ADMIRE : 'admire';
EAT : 'eat';
STATS : 'stats';
WIELD : 'wield';
OPEN : 'open';
HELP : 'help';

//Battle commands
ATTACK : 'attack';


STRING : [a-zA-Z]+ ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
NEWLINE:'\r'? '\n' ;    // return newlines to parser (is end-statement signal)