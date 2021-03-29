
grammar Draw;

compilationUnit
    :  statementList EOF
    ;

statementList
    : (statement)*
    ;

statement
    : paperDeclaration
    | variableDeclaration
    | goToStatement
    | moveStatement
    | penStateStatement
    | penColorStatement
    | repeatStatement
    | turnStatement
    | forwardStatement
    ;

paperDeclaration
    : PAPER width=expression height=expression DOT
    ;

variableDeclaration
    : LET identifier=ID ASSIGN expression DOT
    ;

goToStatement
    : GO TO x=expression y=expression DOT
    ;

moveStatement
    : MOVE dx=expression dy=expression DOT
    ;

penStateStatement
    : PEN state=(UP|DOWN) DOT
    ;

penColorStatement
    : PEN COLOR color=expression DOT
    ;

repeatStatement
    : REPEAT times=expression LCURLY statementList RCURLY DOT
    ;

turnStatement
    : TURN direction=(RIGHT|LEFT) expression DOT
    ;

forwardStatement
    : FORWARD expression DOT
    ;

reference
    : ID
    ;

expression
    :   '(' expression ')'                                                                      # parenthesisExpression
    |   operation=('+'|'-') expression                                                          # unaryExpression
    |   left=expression operation='^' right=expression                                          # infixExpression
    |   left=expression operation='**' right=expression                                         # infixExpression
    |   left=expression operation=('*'|'/') right=expression                                    # infixExpression
    |   left=expression operation=('+'|'-') right=expression                                    # infixExpression
//    |   left=expression operation=('=='|'!='|'>'|'<'|'>='|'<=') right=expression                # infixExpression
//    |   left=expression operation=('&&'|'||') right=expression                                  # infixExpression
//    |   check=expression '?' first=expression ':' second=expression                             # conditionalExpression
    |   reference                                                                               # referenceExpression
    |   value=(NUM|HEX|BOOLEAN_LITERAL)                                                         # numberExpression
    ;

STRING_LITERAL: '"' ( ESC | ~[\\"\r\n] )* '"';

fragment ESC : '\\"' | '\\\\' ;

PAPER   : ('p'|'P')('a'|'A')('p'|'P')('e'|'E')('r'|'R');
PEN     : ('p'|'P')('e'|'E')('n'|'N');
UP      : ('u'|'U')('p'|'P');
DOWN    : ('d'|'D')('o'|'O')('w'|'W')('n'|'N');
LET     : ('l'|'L')('e'|'E')('t'|'T');
GO      : ('g'|'G')('o'|'O');
TO      : ('t'|'T')('o'|'O');
MOVE    : ('m'|'M')('o'|'O')('v'|'V')('e'|'E');
COLOR   : ('c'|'C')('o'|'O')('l'|'L')('o'|'O')('r'|'R');
REPEAT  : ('r'|'R')('e'|'E')('p'|'P')('e'|'E')('a'|'A')('t'|'T');
TURN    : ('t'|'T')('u'|'U')('r'|'R')('n'|'N');
RIGHT   : ('r'|'R')('i'|'I')('g'|'G')('h'|'H')('t'|'T');
LEFT    : ('l'|'L')('e'|'E')('f'|'F')('t'|'T');
FORWARD : ('f'|'F')('o'|'O')('r'|'R')('w'|'W')('a'|'A')('r'|'R')('d'|'D');

DOT     : '.';
DOTDOT  : '..';
ASSIGN  : '=';
LCURLY  : '{';
RCURLY  : '}';
LBRACKET  : '[';
RBRACKET  : ']';
COMMA   : ',';
COLON   : ':';

BOOLEAN_LITERAL
    : TRUE
    | FALSE
    ;

TRUE: ('TRUE'|'true');
FALSE: ('FALSE'|'false');

OPERATOR_ADD    : '+';
OPERATOR_SUB    : '-';
OPERATOR_MUL    : '*';
OPERATOR_EXP    : '**';
OPERATOR_DIV    : '/';
OPERATOR_AND    : '&&';
OPERATOR_OR     : '||';
OPERATOR_XOR    : '^';
OPERATOR_EQ     : '==';
OPERATOR_NEQ    : '!=';
OPERATOR_GT     : '>' ;
OPERATOR_LT     : '<' ;
OPERATOR_GTEQ   : '>=';
OPERATOR_LTEQ   : '<=';
OPERATOR_SCOPE  : '::';
OPERATOR_IN     : '<<';

NUM             :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
COLOR_LITERAL   :   'c'[0-9]+;
HEX             :   '0x'[0-9]+;
ID              :   [a-zA-Z_0-9]+;

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;

WS  :   [ \t\r\n] -> channel(HIDDEN);