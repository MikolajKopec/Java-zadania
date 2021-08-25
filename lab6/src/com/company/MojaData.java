package com.company;

public class MojaData {
    private int dzień;
    private int miesiąc;
    private int rok;

    public MojaData(int dzień, int miesiąc, int rok) {
        this.dzień = dzień;
        this.miesiąc = miesiąc;
        this.rok = rok;
    }
    //Wersja A
/*    @Override
    public String toString(){
        return this.dzień+"."+this.miesiąc+"."+this.rok;
    }*/
    //Wersja B
/*    @Override
    public String toString(){
        if (this.dzień<10){
            return "0"+this.dzień+"."+this.miesiąc+"."+this.rok;
        }
        else {
            return this.dzień+"."+this.miesiąc+"."+this.rok;
        }
    }*/
    //Wersja C
    @Override
    public String toString(){
        switch (this.miesiąc){
            case 1:
                return this.dzień+" "+"sty"+" "+this.rok;
            case 2:
                return this.dzień+" "+"lut"+" "+this.rok;
            case 3:
                return this.dzień+" "+"marz"+" "+this.rok;
            case 4:
                return this.dzień+" "+"kwie"+" "+this.rok;
            case 5:
                return this.dzień+" "+"maj"+" "+this.rok;
            case 6:
                return this.dzień+" "+"czer"+" "+this.rok;
            case 7:
                return this.dzień+" "+"lip"+" "+this.rok;
            case 8:
                return this.dzień+" "+"sier"+" "+this.rok;
            case 9:
                return this.dzień+" "+"wrze"+" "+this.rok;
            case 10:
                return this.dzień+" "+"paź"+" "+this.rok;
            case 11:
                return this.dzień+" "+"lis"+" "+this.rok;
            case 12:
                return this.dzień+" "+"gru"+" "+this.rok;
            default:
                return "";
        }
    }
}
