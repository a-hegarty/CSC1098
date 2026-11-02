grammar CAL   

prog:   stm*;
stm:    Variable    # Variable
    | Constant  # Constant
    | Return    # Return
    | Integer   # Integer
    | Boolean   # Boolean
    | Void      # Void
    | Main      # Main
    | If        # If
    | Else      # Else
    | True      # True
    | False     # False
    | While     # While
    | Begin     # Begin
    | End       # End
    | Is        # Is
    | Skip      # Skip
    ;

fragment A:      'a'|'A';
fragment B:      'b'|'B';
fragment C:      'c'|'C';
fragment D:      'd'|'D';
fragment E:      'e'|'E';
fragment F:      'f'|'F';
fragment G:      'g'|'G';
fragment H:      'h'|'H';
fragment I:      'i'|'I';
fragment K:      'k'|'K';
fragment L:      'l'|'L';
fragment M:      'm'|'M';
fragment N:      'n'|'N';
fragment O:      'o'|'O';
fragment P:      'p'|'P';
fragment R:      'r'|'R';
fragment S:      's'|'S';
fragment T:      't'|'T';
fragment U:      'u'|'U';
fragment V:      'v'|'V';
fragment W:      'w'|'W';
fragment Y:      'y'|'Y';