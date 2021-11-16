grammar CC20212;

// Gramática CC-2021-2:

program: (statement | funclist)?;

funclist: funcdef funclist | funcdef;

funcdef: DEF IDENT '(' paramlist ')' '{' statelist '}';

paramlist: (
		( INT | FLOAT | STRING) IDENT ',' paramlist
		| ( INT | FLOAT | STRING) IDENT
	)?;

statement: (
		vardecl ';'
		| atribstat ';'
		| printstat ';'
		| readstat ';'
		| returnstat ';'
		| ifstat
		| forstat
		| '{' statelist '}'
		| BREAK ';'
		| ';'
	);

vardecl: ( INT | FLOAT | STRING) IDENT ( '[' INT_CONSTANT ']')*;

atribstat: lvalue '=' ( expression | allocexpression | funccall);

funccall: IDENT '(' paramlistcall ')';

paramlistcall: ( IDENT ',' paramlistcall | IDENT)?;

printstat: PRINT expression;

readstat: READ lvalue;

returnstat: RETURN;

ifstat: IF '(' expression ')' statement ( ELSE statement)?;

forstat:
	FOR '(' atribstat ';' expression ';' atribstat ')' statement;

statelist: statement ( statelist)?;

allocexpression:
	NEW (INT | FLOAT | STRING) ('[' numexpression ']')+;

expression:
	numexpression (
		('<' | '>' | '<=' | '>=' | '==' | '!=') numexpression
	)?;

numexpression: term ( ( '+' | '-') term)*;

term: unaryexpr ( ( '*' | '/' | '%') unaryexpr)*;

unaryexpr: ( ( '+' | '-'))? factor;

factor: (
		INT_CONSTANT
		| FLOAT_CONSTANT
		| STRING_CONSTANT
		| NULL
		| lvalue
		| '(' numexpression ')'
	);

lvalue: IDENT ( '[' numexpression ']')*;

// Nossa contribuição para finalizar a gramática:

IDENT: [a-zA-Z_] ( [a-zA-Z0-9_])*;

INT: 'int';

FLOAT: 'float';

STRING: 'string';

NULL: 'null';

INT_CONSTANT: DIGITS;

FLOAT_CONSTANT: DIGITS '.' DIGITS | '.' DIGITS;

STRING_CONSTANT: '"' ~('"')* '"';

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

ADD: '+';

SUB: '-';

DIV: '/';

MUL: '*';

MOD: '%';

ASSIGN: '=';

GREATER_THAN: '>';

LESS_THAN: '<';

EQUAL: '==';

LESS_EQUAL: '<=';

GREATER_EQUAL: '>=';

NOT_EQUAL: '!=';

WHITE_SPACE: [\t\r\n]+ -> skip;