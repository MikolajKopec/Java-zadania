package com.company;

public class Zawodnik {
    protected String imie;
    protected int predkosc_min;
    protected int predkosc_max;
    protected int odleglosc;

    public Zawodnik(String imie, int predkosc_min, int predkosc_max) {
        this.imie = imie;
        this.predkosc_min = predkosc_min;
        this.predkosc_max = predkosc_max;
        this.odleglosc = 0;
    }
    protected void przedstawSie(){
        System.out.println("Jestem " + this.imie + " i biegam z prędkością " + predkosc_min + " - " + predkosc_max + " km/h.");
    }
    protected void biegnij(){
        this.odleglosc = this.odleglosc+(int)Math.round(Math.random()*(this.predkosc_max-this.predkosc_min)+(this.predkosc_min));
        System.out.println(this.imie + " przebiegł " + this.odleglosc);
    }
}
