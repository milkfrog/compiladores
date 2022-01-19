grammar ConvCC20212;

program:

 	(statement 
	| funclist)? 
;

funclist: 

	funcdef funclist2 
;

funclist2:  

	funclist?
;

funcdef:
	 DEF IDENT LPAREN paramlist RPAREN LBRACE statelist RBRACE
;

paramlist:

	(TYPE_INT IDENT paramlist2 
	| TYPE_FLOAT IDENT paramlist2
	| TYPE_STRING IDENT paramlist2 
	)?
;

paramlist2:

	( COMMA paramlist 
	)?

;

statement:

	vardecl SEMI 
	| atribstat SEMI 
	| printstat SEMI
	| readstat SEMI 
	| returnstat SEMI
	| ifstat 
	| forstat 
	| LBRACE statelist RBRACE 
	| BREAK SEMI | SEMI
;

vardecl:

	TYPE_INT IDENT a 
	| TYPE_FLOAT IDENT a 
	| TYPE_STRING IDENT a
;

a:
	(t1 a 
	)?
; 

t1: 
	LBRACK INT RBRACK;

atribstat:
	
	lvalue ASSIGN atribstat1 
;

atribstat1:

	IDENT  atribstat2
	| allocexpression 
	| ADD factor 
	| SUB factor 
	| INT
  	| FLOAT
  	| STRING
	| NULL
	| LPAREN numexpression RPAREN
;

 atribstat2: 

	b d c expression2 
	|   LPAREN paramlistcall RPAREN
;

paramlistcall:

	(IDENT paramlistcall2
	)?
;

paramlistcall2:

	(COMMA paramlistcall 
	)?
; 

printstat:

	PRINT expression
;

readstat:

	READ lvalue
;

returnstat:

	RETURN
;

ifstat:

	IF LPAREN expression RPAREN LBRACE statelist RBRACE ifstat1
;

ifstat1:

	(ELSE statement 
	)?
;

forstat:

	FOR LPAREN atribstat SEMI expression SEMI atribstat RPAREN statement
;

statelist: 

	statement statelist2
;

statelist2:

	(statelist 
	)?
;	

allocexpression:

	NEW allocexpression1
;

allocexpression1:

	TYPE_INT t2 b 
	| TYPE_FLOAT t2 b 
	| TYPE_STRING t2 b
;

b:
	(t2 b 
	)?
;

t2:
	LBRACK numexpression RBRACK
;

expression:

	numexpression expression2
; 

expression2:

	(GT numexpression 
	| LT numexpression 
	| LE numexpression 
	| GE numexpression 
	| EQUAL numexpression 
	| NOTEQUAL numexpression 
	)?
; 

numexpression:

	term c
;

c:
	(t3 c 
	)?
;

t3: 
	ADD term 
	| SUB term
;

term:
	 unaryexpr d
;

d: 
	(t4 d
	)?
;

t4: 
	MUL unaryexpr 
	| DIV unaryexpr
	| MOD unaryexpr
;

unaryexpr:

	ADD factor 
	| SUB factor 
	| factor
;

factor:
	INT
	| FLOAT
	| STRING
	| NULL
	| lvalue 
	| LPAREN numexpression RPAREN
;

lvalue:
	 IDENT b
;

/* Nossa contribuição para finalizar a gramática e deixar ela mais "programming language like" */

TYPE_INT: 'int';

TYPE_FLOAT: 'float';

TYPE_STRING: 'string';

NULL: 'null';

INT: DIGITS;

FLOAT: DIGITS '.' DIGITS | '.' DIGITS;

STRING: '"' ~('"')* '"';

fragment DIGITS: [0-9]+;

IF: 'if';

FOR: 'for';

ELSE: 'else';

RETURN: 'return';

READ: 'read';

PRINT: 'print';

NEW: 'new';

BREAK: 'break';

DEF: 'def';

ADD : '+';

SUB : '-';

DIV : '/';

MUL : '*';

MOD : '%';

ASSIGN : '=';

GT : '>';

LT : '<';

EQUAL : '==';

LE : '<=';

GE : '>=';

NOTEQUAL : '!=';

LPAREN : '(';

RPAREN : ')';

LBRACE : '{';

RBRACE : '}';

LBRACK : '[';

RBRACK : ']';

SEMI : ';';

COMMA : ',';

IDENT: [a-zA-Z_] ( [a-zA-Z0-9_] )*;

WHITESPACE: [ \t\r\n]+ -> skip;
