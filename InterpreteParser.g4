parser grammar InterpreteParser;

options{
    tokenVocab=InterpreteScanner;
}


simpleType: BOOLEAN
            | CHAR
            | INT
            | STRING;
expression: simpleExpression (RELACIONALOP simpleExpression)*;
simpleExpression: term (ADDITIVEOP term)*;
term : factor (MULTIPLICATIVEOP factor)*;
factor : LITERAL
         | ID (PUNTO ID)
         | functionCall
         | arrayLookup
         | arrayLenght
         | subEspression
         | arrayAllocationEspression
         | allocationExpression
         | unary;
unary: (SUM|RES|ADMIRACION) expression*;
allocationExpression : NEW ID  PARENTESISIZQ PARENTESISDER;
arrayAllocationEspression: NEW simpleType BRACKETIZQ expression BRACKE5TDER ;
subEspression : PARENTESISIZQ expression PARENTESISDER;
functionCall : ID PARENTESISIZQ (actualParams) PARENTESISDER;//revisar este
actualParams: expression (COMA expression)*;
arrayLookup: ID BRACKETIZQ expression BRACKE5TDER;
arrayLenght : ID PUNTO LENGHT;