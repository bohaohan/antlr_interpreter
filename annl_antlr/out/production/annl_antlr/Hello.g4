// Define a grammar called Hello

grammar Hello;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//WS : [ \t]+ -> skip;

program : stmts+ ('{' stmts '}')?;
stmts: varDecl|ifStmt|(assignStmt Semi) |whileStmt|breakStmt|forStmt| readStmt | writeStmt|stmtBlock;
varDecl : Type (value|list_var) (Equal (expr|'{' expr (Comma expr)* '}'))?(Comma value(Equal (expr|'{' expr(Comma expr)* '}'))?)* Semi;
//Stmts : VarDecl | IfStmt| Arr_assign_stat | WhileStmt| ForStmt | BreakStmt | AssignStmt | ReadStmt | WriteStmt |
//StmtBlock;
stmtBlock : '{' ( stmts )* '}';
Type : 'real'|'int'|'double'|'bool'|'char'| 'int' '[' INT ']'| 'double' '[' INT ']'| 'bool' '[' INT ']'| 'char' '[' INT ']';
ifStmt : IF '(' expr ')' stmtBlock ('elif' '(' expr ')' stmtBlock )* ( eLSE stmtBlock )*;
//ifStmt : IF expr stmtBlock  ( eLSE stmtBlock )*;
READ:'read';
WRITE:'write';
WHILE:'while';
BREAK: 'break';
FOR:'for';
IF:'if';
expr :((('+'|'-')?value|('+'|'-')?eExpr) ( (('*'|'/'|'+'|'-')  (expr|('(' expr ')') ))? ( Relation (expr) )? )| '(' (('+'|'-')?value|('+'|'-')?eExpr) ( Relation (value|eExpr))? ')')( ('*'|'/'|'+'|'-') expr )* | ('*'|'/'|'+'|'-') (expr | ('(' expr ')'))|(('+'|'-')?value|('+'|'-')?eExpr);
eExpr: (INT|CHAR| BOOL|DOUBLE|list_var);

whileStmt : WHILE '(' expr ')' stmtBlock;
forStmt : FOR '(' (assignStmt|varDecl) expr Semi assignStmt ')' stmtBlock;
breakStmt : BREAK ';';
readStmt : READ '('( ID | ID '[' expr ']' ) ')' Semi;
writeStmt : WRITE '(' expr ')' Semi;
assignStmt : value Equal (expr|'{' expr (Comma expr)* '}') ;
//arr_assign_stat:Type? value Equal '{' (value|VarList) '}' Semi;
list_var : value (Comma value)+;
value : arrayValue | ID;
arrayValue: ID Lbracket expr Rbracket;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
fragment
Operator : '+'|'-'|'*'|'/'|'%';
Relation : '>'|'<'|'>='|'<='|'=='|'!='|'<>';
fragment NUM: [0-9]+ ;
DOUBLE : NUM ('.' NUM)?;
fragment LETTER: [a-zA-Z];
NEWLINE : '\r'? '\n' ;
BOOL: 'true' | 'false';
INT	:	NUM;
CHAR: '\'' LETTER '\'';
SL_COMMENT :   '//' .*? (('\n')|EOF)  -> skip;
eLSE:'else';
Semi : ';';
Equal : '=';
Comma : ',';
Lbracket:'[';
Rbracket:']';
MUL_COMMENT:'/*' .*? '*/' ->skip;