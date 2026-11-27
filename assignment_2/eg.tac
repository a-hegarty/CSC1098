mod:
    mx = getparam 1
    my = getparam 2
    mt1 = mx / my
    mt2 = mt1 * my
    mt3 = mx - mt2
    return mt3
gcd:
    ga = getparam 1
    gb = getparam 2
gwb:
    ifz gb != 0 goto gwe
    gt = gb
    param gb
    param ga
    gb = call mod, 2
    ga = gt
    goto gwb
gwe:
    return ga
main:
    s1 = "Enter 1st number "
    param s1
    call _print, 1
    x = call _read, 0
    s2 = "Enter 2nd number "
    param s2
    call _print, 1
    y = call _read, 0
    param y
    param x
    answer = call gcd, 2
    os = "Answer is "
    param os
    call _print, 1
    param answer
    call _println, 1
    call _exit, 0
