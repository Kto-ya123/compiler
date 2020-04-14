
grammar StringGrammar;
program : 'main_program' block;

block :BEGIN statement* END;

statement :
assign_var |
assign_string |
assign_string_array |
print |
operations |
operarions_with_string_array |
assign_var_method_invocation |
while_cicle |
if_else |
method_invokation |
for_each;


BEGIN : 'begin';

IF : 'if';
PRINT : 'print';
FOR: 'for';
ELSE : 'else';
END : 'end';
CONST : 'const';
WHILE : 'while';
INT : 'int';
CHAR : 'char';
ADD : 'add';
REMOVE : 'remove';
STRING : 'string';
STRING_ARRAY : 'stringArray';
RETURN : 'return';
CALL : 'call';
GLOBAL : 'global';
DOT : '.';
DOT_COMMA : ';';
COLON : ':';



PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
LESS_OR_EQUALS: '<=';
GREATER: '>';
GREATER_OR_EQUALS: '>=';

O_BRACKET : '(';
C_BRACKET : ')';

K_O_BRACKET : '{';
K_C_BRACKET : '}';

SQ_O_BRACKET : '[';
SQ_C_BRACKET : ']';


LINE : '"'(.)+?'"';
NUMBER : [0-9]+;
SYMBOL : '\''(.)'\'';
ID : [a-zA-Z_][a-zA-Z_0-9]*;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

digit_expression:	digit_expression (MULTIPLY|DIVIDE) digit_expression
    |	digit_expression (PLUS|MINUS) digit_expression
    |	ID
    |	O_BRACKET digit_expression C_BRACKET
    | NUMBER
    ;

   intialize_char: SYMBOL;
   initialize_string: LINE|(ID(MULTIPLY|DIVIDE|PLUS|MINUS)ID);
   initialize_string_array : (SQ_O_BRACKET SQ_C_BRACKET)|(SQ_O_BRACKET (ID ',')* ID SQ_C_BRACKET);

   global_assign_var : GLOBAL assign_var;
   global_assign_string : GLOBAL assign_string;
   global_assign_string_array : GLOBAL assign_string_array;

   print : PRINT O_BRACKET (ID|NUMBER|LINE) C_BRACKET DOT_COMMA;

   assign_var_method_invocation : type CONST? ID '=' method_invokation;
   assign_string : STRING CONST? ID '=' (initialize_string) DOT_COMMA;
   assign_string_array : STRING_ARRAY CONST? ID '=' (initialize_string_array) DOT_COMMA;
   assign_var : type_1 CONST? ID '=' (digit_expression|intialize_char) DOT_COMMA;

   operarions_with_string_array: ID DOT (ADD|REMOVE) (O_BRACKET ID C_BRACKET) DOT_COMMA;


   operations : ID '=' digit_expression DOT_COMMA;
    simple_compare : (digit_expression) (EQUAL|NON_EQUAL|LESS|GREATER|LESS_OR_EQUALS|GREATER_OR_EQUALS) (digit_expression);
    multi_compare : NEGATION? O_BRACKET simple_compare C_BRACKET;

    while_cicle: WHILE O_BRACKET (simple_compare|multi_compare) C_BRACKET block;
    if_else: IF O_BRACKET (simple_compare|multi_compare) C_BRACKET block ELSE block;
    for_each: FOR O_BRACKET ID COLON ID C_BRACKET block;

    type: INT|CHAR|STRING|STRING_ARRAY;
    type_1: INT|CHAR;
    signature: (O_BRACKET (type ID ',')* (type ID) C_BRACKET);
    subprogram_return : 'sub_program' type ID (signature|(O_BRACKET C_BRACKET)) block_return;
    subprogram_non_return : 'sub_program' ID (signature|(O_BRACKET C_BRACKET)) (block_non_return|block);

    block_return : BEGIN statement* RETURN ID DOT_COMMA END;
    block_non_return : BEGIN statement* RETURN DOT_COMMA END;

    signature_method_invokation: (O_BRACKET (ID ',')* (ID) C_BRACKET);
    method_invokation : CALL ID (signature_method_invokation|(O_BRACKET C_BRACKET)) DOT_COMMA;

    global_program: (global_assign_var|global_assign_string|global_assign_string_array)*program(subprogram_non_return|subprogram_return)*;



