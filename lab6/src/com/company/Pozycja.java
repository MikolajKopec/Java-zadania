package com.company;

public class Pozycja {
    private String nazwaTowaru;
    private double iloscSztuk;
    private double cenaSztuki;
    protected Pozycja(String nazwa, double ilosc, double cena){
        this.nazwaTowaru = nazwa;
        this.iloscSztuk = ilosc;
        this.cenaSztuki = cena;
    }
    protected double obliczWartosc(){
        return this.iloscSztuk*this.cenaSztuki;
    }
    @Override
    public String toString(){
        return this.nazwaTowaru+"   "+this.cenaSztuki+" zł   "+this.iloscSztuk+" szt.   "+obliczWartosc()+" zł";
    }
}

