grammar game;

// Ponto de entrada para o código da linguagem
program : line* EOF ;

// Definição de uma linha, que pode ser uma operação, definição de variável ou sub-rotina
line : operacao
     | variavel
     | subrotina
     ;

// Definição de uma operação (exemplo: "mul,a,b")
operacao : 'CASTLE ' VALUE ',' VALUE
         | 'HOUSE ' VALUE ',' VALUE
         | 'MAN ' VALUE ',' VALUE
         ;

// Definição de variável (exemplo: "integer,i,0")
variavel : 'integer' ',' ID ',' VALUE | 'float' ',' ID ','VALUE | 'string' ',' ID ',' VALUE;

// Definição de sub-rotina (exemplo: "sub,main")
subrotina : 'def' ',' ID ;

// Tokens básicos
ID : [a-zA-Z_][a-zA-Z0-9_]* ; // Identificadores
VALUE :  INT | FLOAT | STRING  ;
INT : DIGIT+ ;               // Inteiros
FLOAT : DIGIT+ '.' DIGIT* ;               // float
STRING : '"'~[\t\r\n]+ '"' ;
fragment DIGIT: [0-9] ;

WS : [ ;\t\r\n]+ -> skip ;    // Espaços em branco (ignorar)