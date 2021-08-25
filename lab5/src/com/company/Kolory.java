package com.company;

public class Kolory {
    protected String kolor1;
    protected String kolor2;
    protected String kolor3;
    protected String kolor4;
    protected String kolor5;
    protected Kolory(String color1,String color2,String color3,String color4,String color5){
        this.kolor1 = color1;
        this.kolor2 = color2;
        this.kolor3 = color3;
        this.kolor4 = color4;
        this.kolor5 = color5;
    }
    @Override
    public String toString(){
        return kolor1+"-"+kolor2+"-"+kolor3+"-"+kolor4+"-"+kolor5;
    }
}
