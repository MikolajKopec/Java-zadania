package com.company;

public class Zamowienie {
    private int maksRozmiar;
    private Pozycja pozycje[];

    protected Zamowienie(){
        this.maksRozmiar=10;
    }
    protected Zamowienie(int maxRozmiar){
        this.maksRozmiar=maxRozmiar;
        this.pozycje=new Pozycja[this.maksRozmiar];
    }
    protected void dodajPozycje(Pozycja...pozycja){
        this.pozycje=new Pozycja[pozycja.length];
        this.pozycje=pozycja;
    }
    protected double obliczWartosc(){
        double x=0;
        for (int i=0;i<this.pozycje.length;i++){
            x= x + this.pozycje[i].obliczWartosc();
        }
        return x;
    }
    @Override
    public String toString(){
        for (int i=0;i<this.pozycje.length;i++){
            System.out.println(pozycje[i].toString()+"\n");
        }
        return "\n\n\nRazem: "+obliczWartosc()+" zł";
    }
}
