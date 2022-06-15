grammar Cminus;

program : declaration+ ;

declaration : varDeclaration | funDeclaration ;

varDeclaration : typeSpecifier varDeclId (',' varDeclId)* ';' ;

varDeclId : ID | ID '[' NUMCONST ']' ;
 
funDeclaration : ('void' | typeSpecifier) ID '(' param? (',' param)* ')' statement ;
//funDeclaration : ('void' | typeSpecifier) ID '(' param? (',' param)* ')' compoundStatement ;

typeSpecifier : 'int' | 'bool' | 'char' ;

param : typeSpecifier paramId ;

paramId : ID | ID '[]' ;

statement : expressionStmt | compoundStmt | ifStmt
          | whileStmt | returnStmt | breakStmt ;

compoundStmt : '{' varDeclaration* statement* '}' ;

expressionStmt : expression ';' | ';' ;

ifStmt : 'if' '(' simpleExpression ')' statement
       | 'if' '(' simpleExpression ')' statement 'else' statement
       ;

whileStmt : 'while' '(' simpleExpression ')' statement ;

returnStmt : 'return' ';' | 'return' expression ';' ;

breakStmt : 'break' ';' ;

expression : mutable '=' expression
           | mutable '+=' expression | mutable '-=' expression
           | mutable '*=' expression | mutable '/=' expression
           | mutable '++' | mutable '--' | simpleExpression
           ;

simpleExpression : orExpression ;

orExpression : (andExpression '||')* andExpression ;

andExpression : (unaryRelExpression '&&')* unaryRelExpression ;

unaryRelExpression : BANG* relExpression ;

relExpression : (sumExpression relop)* sumExpression ;

relop : '<=' | '<' | '>' | '>=' | '==' | '!=' ;

sumExpression : (termExpression sumop)* termExpression ;

sumop : '+' | '-' ;

termExpression : (unaryExpression mulop)* unaryExpression ;

mulop : '*' | '/' | '%' ;

unaryExpression : unaryop* factor ;

unaryop : '-' | '*' | '?' ;

factor : immutable | mutable ;

mutable : ID | ID '[' expression ']' ;

immutable : '(' expression ')' | call | constant ;

call : ID '(' (expression ',')* expression? ')' ;

constant : NUMCONST | CHARCONST | STRINGCONST | 'true' | 'false' ;

ID : LETTER (LETTER | DIGIT)* ;
NUMCONST : DIGIT+ ;
STRINGCONST : '"' ('\\"'|~'"')*? '"' ;
CHARCONST : '"' ('\\"'|~'"') '"' ;
BANG : '!' ;

WS :  (' ' | '\t' | '\n' | '\r' | '\f')+ -> skip ;
COMMENT
  :   ( '//' ~[\r\n]* '\r'? '\n'
      | '/*' .*? '*/'
      ) -> skip
  ;

fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT  : ('0'..'9');
