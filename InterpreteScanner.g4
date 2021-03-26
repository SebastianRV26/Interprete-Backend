lexer grammar InterpreteScanner;

// PALABRAS RESERVADAS
IF : 'if';
ELSE : 'else';
SWITCH : 'switch';
CASE : 'case';
DEFAULT : 'default';
DO : 'do';
WHILE : 'while';
FOR : 'for';
BREAK : 'break';
CONTINUE : 'continue';
IN : 'in';
RETRUN : 'return';
PRINT : 'print';
ABSTRACT : 'abstract';
ENUM : 'enum';
THIS : 'this';
SYNCHRONIZED : 'synchronized';
CLASS : 'class';
SUPER : 'super';
EXTENDS : 'extends';
IMPLEMENTS : 'implements';
INTERFACE : 'interface';
NEW : 'new';
IMPORT : 'import';
PACKAGE : 'package';
NATIVE : 'native';
VOID : 'void';
PUBLIC: ' public';
PRIVATE : 'private';
PROTECTED : 'protected';
STATIC : 'static';
TRY : 'try';
CATCH : 'catch';
FINALLY : 'finally';
THROW : 'throw';
THROWS : 'throws';
FINAL : 'final';
INSTANCEOF : 'instanceof';
VOLATILE : 'volatile';
// TYPES
BOOLEAN : 'boolean';
BYTE : 'byte';
CHAR : 'char';
DOUBLE : 'double';
FLOAT : 'float';
INT : 'int';
LONG : 'long';
SHORT : 'short';

// SIMBOLOS
PyCOMA : ';';
ASYGN : '=';
EQUALS : '==';
SUM : '+';
RES : '-';
DIV : '/';
MUL : '*';


// COMENTARIOS
BLOCK_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT :  ('//')(LETTER|DIGIT|[ \r\t\n]|'@#$%^&!_-+=.,><?/`"') -> skip;

// COMPLEJAS
WS : [ \r\t\n]+ -> skip;
fragment NUMBER : (DIGIT|DIGIT)*;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;

ID : LETTER (LETTER|DIGIT)* ;
NUM : DIGIT DIGIT* ;
