package com.company;

public enum Figura {
    dwójka("2"),
    trójka("3"),
    czwórka("4"),
    piątka("5"),
    szóstka("6"),
    siódemka("7"),
    ósemka("8"),
    dziewątka("9"),
    dziesiątka("10"),
    walet("walet"),
    dama("dama"),
    król("król");
    private final String figura;

    Figura(String figura) {
        this.figura = figura;
    }
    protected String figura(){
        return this.figura;
    }
}
