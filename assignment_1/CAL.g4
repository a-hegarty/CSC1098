grammar CAL

prog:   dec_list func_list main;
dec_list:   (dec SEMI)*;

dec:    var_dec
    | const_dec
    ;

var_dec:    Variable ID COLON type;
const_dec:  Constant ID COLON type ASSIGN expr;

func_list:  (func*);
func:   type ID (param_list) Is dec_list Begin statement_block return LBR (expr*) RBR COLON End;

type:   Integer
    | Boolean
    | Void
    ;

param_list: nemp_param_list*;
nemp_param_list:    ID COLON type
    | ID COLON type COMMA nemp_param_list
    ;

main:   Main Begin dec_list statement_block End;
statement_block:    (statement*);
statement:  ID ASSIGN expr COLON
    | ID LBR arg_list RBR COLON
    | Begin statement_block End
    | If condition Begin statement_block End Else Begin statement_block End
    | While condition Begin statement_block End
    | Skip COLON
    ;

expr:   fragment bin_arith_op fragment
    | LBR expr RBR
    | ID LBR arg_list RBR
    | fragment
    ;

bin_arith_op:   PLUS
    | MINUS
    ;

fragment:   ID
    | MINUS ID
    | True
    | False
    | expr
    ;

condition:  NEG condition
    | LBR condition RBR
    | expr comp_op expr
    | condition (AND | OR) condition
    ;

comp_op:    EQUAL
    | NONEQ
    | LESS
    | LE
    | GREATER
    | GE
    ;

arg_list:   nemp_arg_list*;
nemp_arg_list:  ID
    | ID COMMA nemp_arg_list
    ;