grammar CAL

prog:   dec_list func_list main;
dec_list:   (dec SEMI)*;

dec:    var_dec
    | const_dec
    ;

var_dec:    Variable ID COLON type;
const_dec:  Constant ID COLON type ASSIGN expr;

func_list:  (func*);
func:   type ID LBR param_list RBR Is dec_list Begin statement_block Return LBR (expr*) RBR COLON End;

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
    | True
    | False
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

// fragments
fragment A: 'a' | 'A';
fragment B: 'b' | 'B';
fragment C: 'c' | 'C';
fragment D: 'd' | 'D';
fragment E: 'e' | 'E';
fragment F: 'f' | 'F';
fragment G: 'g' | 'G';
fragment H: 'h' | 'H';
fragment I: 'i' | 'I';
fragment J: 'j' | 'J';
fragment K: 'k' | 'K';
fragment L: 'l' | 'L';
fragment M: 'm' | 'M';
fragment N: 'n' | 'N';
fragment O: 'o' | 'O';
fragment P: 'p' | 'P';
fragment Q: 'q' | 'Q';
fragment R: 'r' | 'R';
fragment S: 's' | 'S';
fragment T: 't' | 'T';
fragment U: 'u' | 'U';
fragment V: 'v' | 'V';
fragment W: 'w' | 'W';
fragment X: 'x' | 'X';
fragment Y: 'y' | 'Y';
fragment Z: 'z' | 'Z';

fragment Letter:   [a-zA-Z;]
fragment Digit: [0-9]+;
fragment UnderScore:    "_";

// reserved words
Variable:   V A R I A B L E;
Constant:   C O N S T A N T;
Return:     R E T U R N;
Integer:    I N T E G E R;
Boolean:    B O O L E A N;
Void:       V O I D;
Main:       M A I N;
If:         I F;
Else:       E L S E;
True:       T R U E;
False:      F A L S E;
While:      W H I L E;
Begin:      B E G I N;
End:        E N D;
Is:         I S;
Skip:       S K I P;

// symbols
ASSIGN:     ":=";
COMMA:      ",";
COLON:      ":";
LBR:        "(";
RBR:        ")";
PLUS:       "+";
MINUS:      "-";
NEG:        "~";
OR:         "|";
AND:        "&";
EQUAL:      "=";
NONEQ:      "!=";
LESS:       "<";
LE:         "<=";
GREATER:    ">";
GE:         ">=";

ID:     Letter (Letter | Digit | UnderScore)
WS:     [ \t\n\r]+->skip;

LineComment:    "//" ~[\r\n]*-> skip;
Comment:        "/*" (Comment | *)* "*/"-> skip