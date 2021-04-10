parser grammar InterpreteParser;

options{
    tokenVocab=InterpreteScanner;
}

program             : (statement)*                                                  #programAST;
statement           : variableDecl PyCOMA                                           #variableDeclSAST
                    | classDecl PyCOMA                                              #classDeclSAST
                    | assignment PyCOMA                                             #assignSAST
	                | arrayAssignment PyCOMA                                        #arrayAssignSAST
                    | printStatement PyCOMA                                         #printSAST
                    | ifStatement                                                   #ifSAST
                    | whileStatement                                                #whileSAST
                    | returnStatement PyCOMA                                        #returnSAST
                    | functionDecl                                                  #functionDeclSAST
                    | block                                                         #blockSAST;
block               : LLAVEIZQ (statement)* LLAVEDER                                #blockAST;
functionDecl        : type ID PARENTESISIZQ (formalParams)? PARENTESISDER block     #functionDeclAST;
formalParams        : formalParam (COMA formalParam)*                               #formalParamsAST;
formalParam         : type ID                                                       #formalParamAST;
whileStatement      : WHILE PARENTESISIZQ expression PARENTESISDER block            #whileAST;
ifStatement         : IF PARENTESISIZQ expression PARENTESISDER block (ELSE block)? #ifAST;
returnStatement     : RETURN expression                                             #returnAST;
printStatement      : PRINT expression                                              #printAST;
classDecl           : CLASS ID LLAVEIZQ (classVariableDecl)*  LLAVEDER              #classDeclAST;
classVariableDecl   : simpleType ID (ASYGN expression)?                             #classVariableDeclAST;
variableDecl        : type ID (ASYGN expression)?                                   #variableDeclAST;
type                : simpleType                                                    #typeAST
                    | arrayType                                                     #arrayTypeTAST
                    | ID                                                            #idAST;
arrayType           : simpleType BRACKETIZQ BRACKE5TDER                             #arrayTypeAST;
assignment          : ID (PUNTO ID)? ASYGN expression                               #assignAST;
arrayAssignment     : ID BRACKETIZQ expression BRACKE5TDER ASYGN expression         #arrayAssignAST;

simpleType          : BOOLEAN                                                       #booleanTAST
                    | CHAR                                                          #charTAST
                    | INT                                                           #intTAST
                    | STRING                                                        #stringTAST;
expression          : simpleExpression (relacionalop simpleExpression)*             #expressionAST;
simpleExpression    : term (additiveop term)*                                       #simpleExpressionAST;
term                : factor (multiplicativeop factor)*                             #termAST;
factor              : literal                                                       #literalFAST
                    | ID (PUNTO ID)?                                                #idFAST
                    | functionCall                                                  #functionCallFAST
                    | arrayLookup                                                   #arrayLookupFAST
                    | arrayLenght                                                   #arrayLenghtFAST
                    | subEspression                                                 #subEspressionFAST
                    | arrayAllocationEspression                                     #arrayAllocationEspressionFAST
                    | allocationExpression                                          #allocationExpressionFAST
                    | unary                                                         #unaryFAST;
unary               : (SUM|RES|ADMIRACION) (expression)*                            #unaryAST;
allocationExpression : NEW ID  PARENTESISIZQ PARENTESISDER                          #allocationExpressionAST;
arrayAllocationEspression: NEW simpleType BRACKETIZQ expression BRACKE5TDER         #arrayAllocationEspressionAST;
subEspression       : PARENTESISIZQ expression PARENTESISDER                        #subEspressionAST;
functionCall        : ID PARENTESISIZQ (actualParams)? PARENTESISDER                #functionCallAST;
actualParams        : expression (COMA expression)*                                 #actualParamsAST;
arrayLookup         : ID BRACKETIZQ expression BRACKE5TDER                          #arrayLookupAST;
arrayLenght         : ID PUNTO LENGHT                                               #arrayLenghtAST;

relacionalop        : MAYOR                                                         #mayorRAST
                    | MAYORIGUAL                                                    #mayorIgualRAST
                    | MENOR                                                         #menorRAST
                    | MENORIGUAL                                                    #menorIgualRAST
                    | EQUALS                                                        #equalsRAST
                    | DIF                                                           #difRAST;
additiveop          : SUM                                                           #sumAST
                    | RES                                                           #resAST
                    | OR                                                            #orAST;
multiplicativeop    : MUL                                                           #mulAST
                    | DIV                                                           #divAST
                    | AND                                                           #andAST;
literal             : INTLITERAL                                                    #inLAST
                    | REALLITERAL                                                   #realLAST
                    | BOOLLITERAL                                                   #boolLAST
                    | STRINGLITERAL                                                 #stringLAST;
