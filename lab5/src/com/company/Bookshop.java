package com.company;

public class Bookshop extends Shop{
    protected String[] products = new String[3];
    protected Bookshop(String address,int size){
        super(address,size);
        this.products[0] = "Wiedźmin";
        this.products[1] = "Gra o tron";
        this.products[2] = "Illidan";
    }
    protected String getInformation(){
        return super.getInformation() + "\nProdukty znajdujące się w sklepie: \n" + this.products[0] +"\n"+this.products[1]+"\n"+this.products[2];
    }
}
