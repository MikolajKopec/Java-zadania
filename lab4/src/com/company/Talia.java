package com.company;

public class Talia {
    public static void main(String[] args) {
        Karta karta = new Karta(Kolor.pik,Figura.dama);
        Kolor tab1[] = Kolor.values();
        Figura tab2[] = Figura.values();
        for (Kolor kolor : tab1 ){
            for(Figura figura : tab2){
                System.out.println( figura.figura() + " " + kolor);
            }
        }
    }
}
