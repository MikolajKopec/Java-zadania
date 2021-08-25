package com.company;

public class Karta {
    private Kolor kolor;
    private Figura figura;

    protected Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    @Override
    public String toString() {
        return figura +" "+ kolor;
    }
}
