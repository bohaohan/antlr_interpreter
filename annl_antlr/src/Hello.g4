// Define a grammar called Hello

grammar Hello;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//WS : [ \t]+ -> skip;

program : stmts+ ('{' stmts '}')?;
stmts: listVar|varDecl|ifStmt|(assignStmt Semi) |whileStmt|breakStmt|forStmt| readStmt | writeStmt|stmtBlock;
varDecl : Type (value) (Equal (expr |'{' (expr (Comma expr)*)? '}'))? Semi;
listVar : Type list_var (Equal (expr |'{' (expr (Comma expr)*)? '}') (Comma (expr|'{' (expr(Comma expr)*)? '}'))*)? Semi;
//varDecl : Type assignStmt Semi;
//Stmts : VarDecl | IfStmt| Arr_assign_stat | WhileStmt| ForStmt | BreakStmt | AssignStmt | ReadStmt | WriteStmt |
//StmtBlock;
stmtBlock : '{' ( stmts )* '}';
Type : 'real'|'int'|'double'|'bool'|'char';
ifStmt : IF '(' compare ')' stmtBlock ('elif' '(' compare ')' stmtBlock )* ( eLSE stmtBlock )*;
//ifStmt : IF expr stmtBlock  ( eLSE stmtBlock )*;
READ:'read';
WRITE:'write';
WHILE:'while';
BREAK: 'break';
FOR:'for';
IF:'if';
//expr :((('+'|'-')?value|('+'|'-')?eExpr) ( ( ('*'|'/'|'+'|'-'|'%')  (expr| ('(' expr ')') ))? ( Relation (expr| ('(' expr ')')) )? )
//    | (('+'|'-')?value|('+'|'-')?eExpr) ( ('*'|'/'|'+'|'-'|'%') expr )* ( Relation expr  )?  )
//
//
//    |('*'|'/'|'+'|'-'|'%') (expr| ('(' expr ')'))
//    | (('(' expr ')') (  (Relation |  ('*'|'/'|'+'|'-'|'%'))(expr|('(' expr ')')))* )
//    |(('+'|'-')?value|('+'|'-')?eExpr);
expr: expr op=('*'|'/') expr # MulDiv
| expr op=('+'|'-') expr # AddSub
| ('-')?INT # int
| ('-')?DOUBLE # double
| CHAR #char
| value # expValue
| '(' expr ')' # parens
;
compare: expr (Relation expr)?;

//eExpr: (INT|CHAR| bool|DOUBLE|list_var);

whileStmt : WHILE '(' compare ')' stmtBlock;
forStmt : FOR '(' (assignStmt|varDecl) compare Semi assignStmt ')' stmtBlock;
breakStmt : BREAK ';';
readStmt : READ '('( ID | ID '[' expr ']' ) ')' Semi;
writeStmt : WRITE '(' expr ')' Semi;
assignStmt : (value|list_var) Equal (expr|'{' (expr (Comma expr)*)? '}') (Comma value(Equal (expr|'{' (expr(Comma expr)*)? '}'))?)* ;
//arr_assign_stat:Type? value Equal '{' (value|ƒVarList) '}' Semi;
list_var : value (Comma value)+;
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
NEWLINE : '\r'? '\n' ;
bool: 'true' | 'false';
INT :  NUM;
CHAR: '\'' LETTER '\'';
SL_COMMENT :   '//' .*? (('\n')|EOF)  -> skip;
eLSE:'else';
Semi : ';';
Equal : '=';
Comma : ',';
Lbracket:'[';
Rbracket:']';
MUL_COMMENT:'/*' .*? '*/' ->skip;
