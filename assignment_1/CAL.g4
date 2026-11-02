grammar CAL   

prog:   MAIN BEGIN stm* END;
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

fragment Letter:    [a-zA-Z];