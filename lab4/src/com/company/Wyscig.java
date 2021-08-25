package com.company;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik1 = new Zawodnik("Mariusz",5,10);
        Zawodnik zawodnik2 = new Zawodnik("Karol",3,15);
        Zawodnik zawodnik3 = new Zawodnik("Filemon",8,8);
        while (zawodnik1.odleglosc<50 && zawodnik2.odleglosc<50 && zawodnik3.odleglosc<50) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();
            if (zawodnik1.odleglosc>=50){
                System.out.println("Wygrał " + zawodnik1.imie + "! Teraz się przedstawi.");
                zawodnik1.przedstawSie();
            }
            else if (zawodnik2.odleglosc>=50){
                System.out.println("Wygrał " + zawodnik2.imie + "! Teraz się przedstawi.");
                zawodnik2.przedstawSie();
            }
            else if (zawodnik3.odleglosc>=50){
                System.out.println("Wygrał " + zawodnik3.imie + "! Teraz się przedstawi.");
                zawodnik3.przedstawSie();
            }
        }
    }
}
