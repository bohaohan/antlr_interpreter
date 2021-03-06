// Define a grammar called Hello

grammar Hello;

 // skip spaces, tabs, newlines
WS : [ \t\r\n]+ -> skip ;//WS : [ \t]+ -> skip;

program : stmts+ ('{' stmts '}')?;
stmts: listVar|varDecl|ifStmt|(assignStmt Semi) |whileStmt|breakStmt|forStmt| readStmt | writeStmt|stmtBlock;
varDecl : Type (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))? Semi;
//listVar : Type (list_var (Equal (expr |'{' (expr (Comma expr)*)? '}') (Comma (expr|'{' (expr(Comma expr)*)? '}'))*)?)* Semi;
listVar : Type sub_var (Comma sub_var)+ Semi;
sub_var : (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))?;
//varDecl : Type assignStmt Semi;
//Stmts : VarDecl | IfStmt| Arr_assign_stat | WhileStmt| ForStmt | BreakStmt | AssignStmt | ReadStmt | WriteStmt |
//StmtBlock;
stmtBlock : '{' ( stmts )* '}';
Type : 'int'|'double'|'bool'|'char';
ifStmt : IF '(' compare ')' stmtBlock ('elif' '(' compare ')' stmtBlock )* ( eLSE stmtBlock )*;
//ifStmt : IF expr stmtBlock  ( eLSE stmtBlock )*;
READ:'read';
WRITE:'write';
WHILE:'while';
BREAK: 'break';
FOR:'for';
IF:'if';

expr: expr op=('*'|'/'|'%') expr # MulDiv
| expr op=('+'|'-') expr # AddSub
| ('-')?INT # int
| ('-')?DOUBLE # double
| CHAR #char
| bool #expBool
| value # expValue
| '(' expr ')' # parens
;

compare: 'not' compare  # notComp
|compare '||' compare # Or
| compare '&&' compare # And
| expr (Relation expr)? # Comp
| '(' compare ')' # parensComp
;

//eExpr: (INT|CHAR| bool|DOUBLE|list_var);

whileStmt : WHILE '(' compare ')' stmtBlock;
forStmt : FOR '(' ((assignStmt Semi)|varDecl| expr Semi) compare Semi assignStmt ')' stmtBlock;
breakStmt : BREAK ';';
readStmt : READ '(' expr ')' Semi;
writeStmt : WRITE '(' (string|expr) ')' Semi;

assignStmt : (value) Equal (expr) ;

//arr_assign_stat:Type? value Equal '{' (value|VarList) '}' Semi;
list_var : value (Comma value)+;
//list_var : ((value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))?) (Comma ((value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))?))+;
value : arrayValue # valAV
| ID # valID
;
arrayValue: ID Lbracket (expr)? Rbracket;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
fragment
Operator : '+'|'-'|'*'|'/'|'%';
Relation : '>'|'<'|'>='|'<='|'=='|'!='|'<>';
fragment NUM: [0-9]+ ;
DOUBLE : ('-'|'+')? NUM '.' NUM;
fragment LETTER: [a-zA-Z];
//charater : (LETTER|Operator|Relation)*;
NEWLINE : '\r'? '\n' ;
bool: 'true' | 'false';
//string : '\"' (. '\"')? (('\\')? ('\b')? (. ~'\"'))* '\"';
//string : '"' ( ESC | . )*? '"' ;
string : STRING ;
//STRING: '\"' (.)? (('\\')? ('\b')? (.))* '\"';
STRING : '"' (ESC|.)*? '"' ;
fragment ESC : ('\"'|'\\' [btnr"\\]) ; // \b, \t, \n etc...

INT :  NUM;
CHAR: '\'' (LETTER|NUM) '\'';
SL_COMMENT :   '//' .*? (('\n')|EOF)  -> skip;
eLSE:'else';
Semi : ';';
Equal : '=';
Comma : ',';
Lbracket:'[';
Rbracket:']';
MUL_COMMENT:'/*' .*? '*/' ->skip;
