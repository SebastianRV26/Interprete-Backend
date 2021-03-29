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
LENGHT: 'lenght';
// TYPES
STRING : 'string';
BOOLEAN : 'boolean';
BYTE : 'byte';
CHAR : 'char';
DOUBLE : 'double';
FLOAT : 'float';
INT : 'int';
LONG : 'long';
SHORT : 'short';
TRUE:'true';
FALSE:'false';
// SIMBOLOS
PyCOMA : ';';
ASYGN : '=';
EQUALS : '==';
SUM : '+';
RES : '-';
DIV : '/';
MUL : '*';
DIF : '!=';
MAYOR : '>';
MAYORIGUAL : '>=';
MENOR : '<';
MENORIGUAL: '<=';
ADMIRACION : '!';
PREGUNTA: '?';
DOBLECOMILLA: '"';
NUMERAL :'#';
DOLAR : '$';
PORCENTAJE: '%';
AND:'&';
OR:'|';
//COMILLASIMPLE:"'";
PARENTESISIZQ:'(';
PARENTESISDER:')';
COMA:',';
PUNTO:'.';
DOSPUNTOS:':';
AROBA:'@';
BRACKETIZQ:'[';
BRACKE5TDER:']';
//SLASH:'\';
ELEVADO:'^';
GUIONBAJO:'_';
TILDEALREVES:'`';
LLAVEIZQ:'{';
LLAVEDER:'}';
RABO:'~';


//OPERADORES
RELACIONALOP: MAYOR|MAYORIGUAL|MENOR|MENORIGUAL|EQUALS|DIF;
ADDITIVEOP: SUM|RES|OR;
MULTIPLICATIVEOP:MUL|DIV|AND;

//LITERALS
LITERAL : INTLITERAL|REALLITERAL|BOOLLITEAL|STRINGLITERAL;
INTLITERAL: DIGIT DIGIT* ;
REALLITERAL:DIGIT DIGIT* PUNTO DIGIT* | PUNTO DIGIT DIGIT*;
BOOLLITEAL:TRUE|FALSE;
STRINGLITERAL: DOBLECOMILLA PRINTABLE* DOBLECOMILLA;
PRINTABLE: DIGIT|LETTER|WS|PyCOMA|ASYGN|EQUALS|SUM|RES|DIV|MUL|DIF|MAYOR|MAYORIGUAL|MENOR|MENORIGUAL|ADMIRACION|
           PREGUNTA|DOBLECOMILLA|NUMERAL|DOLAR|PORCENTAJE|AND|OR|PARENTESISIZQ||PARENTESISDER|COMA|PUNTO|DOSPUNTOS
           |AROBA|BRACKE5TDER|BRACKETIZQ|ELEVADO|GUIONBAJO|TILDEALREVES|LLAVEIZQ|LLAVEDER|RABO;

// COMENTARIOS
BLOCK_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT :  ('//')(LETTER|DIGIT|[ \r\t\n]|'@#$%^&!_-+=.,><?/`"') -> skip;

// COMPLEJAS
WS : [ \r\t\n]+ -> skip;
fragment NUMBER : (DIGIT|DIGIT)*;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;

ID : (GUIONBAJO|LETTER) (GUIONBAJO|LETTER|DIGIT)* ;
NUM : DIGIT DIGIT* ;
