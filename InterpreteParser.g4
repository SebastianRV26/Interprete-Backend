parser grammar InterpreteParser;

options{
    tokenVocab=InterpreteScanner;
}

program             : (statement)*                                              ;
statement           : variableDecl PyCOMA
                    | classDecl PyCOMA
                    | assignment PyCOMA
	                | arrayAssignment PyCOMA
                    | printStatement PyCOMA
                    | ifStatement
                    | whileStatement
                    | returnStatement PyCOMA
                    | functionDecl
                    | block                                                     ;
block               : LLAVEIZQ (statement)* LLAVEDER                            ;
functionDecl        : type ID PARENTESISIZQ (formalParams)? PARENTESISDER block  ;
formalParams        : formalParam (COMA formalParam)*                            ;
formalParam         : type ID                                                   ;
whileStatement      : WHILE PARENTESISIZQ expression PARENTESISDER block        ;
ifStatement         : IF PARENTESISIZQ expression PARENTESISDER block (ELSE block)?;
returnStatement     : RETURN expression                                          ;
printStatement      : PRINT expression                                          ;
classDecl           : CLASS ID LLAVEIZQ (classVariableDecl)*  LLAVEDER;
classVariableDecl   : simpleType ID (ASYGN expression)?                         ;
variableDecl        : type ID (ASYGN expression)?                                ;
type                : simpleType
                    | arrayType
                    | ID                                                        ;
arrayType           : simpleType BRACKETIZQ BRACKE5TDER                         ;
assignment          : ID (PUNTO ID)? ASYGN expression                          ;
arrayAssignment     : ID BRACKETIZQ expression BRACKE5TDER ASYGN expression     ;

simpleType          : BOOLEAN
                    | CHAR
                    | INT
| STRING                                                                        ;
expression          : simpleExpression (relacionalop simpleExpression)*        ;
simpleExpression    : term (additiveop term)*                                   ;
term                : factor (multiplicativeop factor)*                       ;
factor              :  LITERAL
                    | ID (PUNTO ID)?
                    | functionCall
                    | arrayLookup
                    | arrayLenght
                    | subEspression
                    | arrayAllocationEspression
                    | allocationExpression
                    | unary                                                       ;
unary               : (SUM|RES|ADMIRACION) (expression)*                         ;
allocationExpression : NEW ID  PARENTESISIZQ PARENTESISDER                        ;
arrayAllocationEspression: NEW simpleType BRACKETIZQ expression BRACKE5TDER       ;
subEspression       : PARENTESISIZQ expression PARENTESISDER                      ;
functionCall        : ID PARENTESISIZQ (actualParams)? PARENTESISDER               ;//revisar este
actualParams        : expression (COMA expression)*                               ;
arrayLookup         : ID BRACKETIZQ expression BRACKE5TDER                        ;
arrayLenght         : ID PUNTO LENGHT                                             ;

relacionalop        : MAYOR|MAYORIGUAL|MENOR|MENORIGUAL|EQUALS|DIF                ;
additiveop          : SUM|RES|OR                                                  ;
multiplicativeop    : MUL|DIV|AND                                                 ;

