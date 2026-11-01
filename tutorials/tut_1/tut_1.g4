grammar draw;

prog:   stm*
stm:    Init NUMBER NUMBER #Init
    | Up # up
    | Down # down
    | Left # left
    | Right # right
    | Draw # draw
    | Display # display
    ;