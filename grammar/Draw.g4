
grammar Draw;

compilationUnit
    :  (statement)* EOF
    ;

statement
    : paperDeclaration
    | assignment
    | goToStatement
    | moveStatement
    | penStateStatement
    | penColorStatement
    | repeatStatement
    | whileStatement
    | turnStatement
    | forwardStatement
    | ifStatement
    | depictDeclaration
    | depictCall
    | statementBlock
    ;

paperDeclaration
    : PAPER width=expression height=expression DOT
    ;

assignment
    : identifier ASSIGN expression DOT
    ;

goToStatement
    : GO x=expression y=expression DOT
    ;

moveStatement
    : MOVE dx=expression dy=expression DOT
    ;

depictDeclaration
    : DEPICT identifier LPAR parameterList RPAR statementBlock
    ;

depictCall
    : reference LPAR actualParameterList RPAR DOT
    ;

parameterList
    : (identifier COMMA)* identifier
    ;

actualParameterList
    : (expression COMMA)* expression
    ;

ifStatement
    : IF expression primary=statement (ELSE secondary=statement)?
    ;

statementBlock
    : LCURLY (statement)* RCURLY
    ;

penStateStatement
    : PEN state=(UP|DOWN) DOT
    ;

penColorStatement
    : PEN COLOR color=expression DOT
    ;

repeatStatement
    : REPEAT times=expression statementBlock
    ;

whileStatement
    : WHILE expression statementBlock
    ;

turnStatement
    : TURN expression DOT
    ;

forwardStatement
    : FORWARD expression DOT
    ;

reference
    : ID
    ;

identifier
    : ID
    ;

expression
    :   '(' expression ')'                                                                      # parenthesisExpression
    |   operation=('+'|'-') expression                                                          # unaryExpression
    |   left=expression operation='^' right=expression                                          # infixExpression
    |   left=expression operation='**' right=expression                                         # infixExpression
    |   left=expression operation=('*'|'/') right=expression                                    # infixExpression
    |   left=expression operation=('+'|'-') right=expression                                    # infixExpression
    |   left=expression operation=('=='|'!='|'>'|'<'|'>='|'<=') right=expression                # infixExpression
    |   left=expression operation=('&&'|'||') right=expression                                  # infixExpression
    |   left=expression operation='&' right=expression                                          # infixExpression
    |   check=expression '?' first=expression ':' second=expression                             # conditionalExpression
    |   value=(INTEGER|REAL|HEX|COLOR_LITERAL|BOOLEAN_LITERAL)                                  # numberExpression
    |   reference                                                                               # referenceExpression
    ;

STRING_LITERAL: '"' ( ESC | ~[\\"\r\n] )* '"';

fragment ESC : '\\"' | '\\\\' ;

PAPER   : (P A P E R)           |   (K A ('ğ'|'Ğ') ('ı'|'I') T);
PEN     : (P E N)               |   (K A L E M);
UP      : (U P)                 |   (K A L D ('ı'|'I') R);
DOWN    : (D O W N)             |   (B A S T ('ı'|'I') R);
GO      : (G O)                 |   (G ('i'|'İ') T);
MOVE    : (M O V E)             |   (Y ('ü'|'Ü') R ('ü'|'Ü'));
COLOR   : (C O L O R)           |   (R E N K);
REPEAT  : (R E P E A T)         |   (T E K R A R L A);
TURN    : (T U R N)             |   (D ('ö'|'Ö') N);
RIGHT   : (R I G H T)           |   (S A ('ğ'|'Ğ'));
LEFT    : (L E F T)             |   (S O L);
FORWARD : (F O R W A R D)       |   (('i'|'İ') L E R ('i'|'İ'));
IF      : (I F )                |   (E ('ğ'|'Ğ') E R);
ELSE    : (E L S E)             |   (Y O K S A);
DEPICT  : (D E P I C T)         |   (('ç'|'Ç') ('i'|'İ') Z ('i'|'İ') M);
WHILE   : (W H I L E)           |   (('i'|'İ') K E N);

DOT         : '.';
DOTDOT      : '..';
ASSIGN      : '=';
LCURLY      : '{';
RCURLY      : '}';
LBRACKET    : '[';
RBRACKET    : ']';
COMMA       : ',';
COLON       : ':';
LPAR        : '(';
RPAR        : ')';

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

BOOLEAN_LITERAL
    : TRUE
    | FALSE
    ;

TRUE: ('TRUE'|'true');
FALSE: ('FALSE'|'false');

OPERATOR_ADD         : '+';
OPERATOR_SUB         : '-';
OPERATOR_MUL         : '*';
OPERATOR_EXP         : '**';
OPERATOR_DIV         : '/';
OPERATOR_AND         : '&&';
OPERATOR_BITWISE_AND : '&';
OPERATOR_OR          : '||';
OPERATOR_XOR         : '^';
OPERATOR_EQ          : '==';
OPERATOR_NEQ         : '!=';
OPERATOR_GT          : '>' ;
OPERATOR_LT          : '<' ;
OPERATOR_GTEQ        : '>=';
OPERATOR_LTEQ        : '<=';
OPERATOR_SCOPE       : '::';
OPERATOR_IN          : '<<';

INTEGER         :   [0-9]+;
REAL            :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
COLOR_LITERAL   :   'c' ([a-fA-F_0-9]+);
HEX             :   '0x' ([a-fA-F_0-9]+);
ID              :   ([a-zA-Z_0-9]|('ğ'|'Ğ')|('ç'|'Ç')|('ş'|'Ş')|('ü'|'Ü')|('ö'|'Ö')|('ı'|'İ'))+;  // This should be extended, this is unfeasible.
COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;

WS  :   [ \t\r\n] -> channel(HIDDEN);