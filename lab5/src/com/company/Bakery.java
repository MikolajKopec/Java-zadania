package com.company;

public class Bakery extends Shop{
    protected String[] products = new String[3];
    protected Bakery(String address,int size){
        super(address,size);
        this.products[0] = "Bułki";
        this.products[1] = "Chleb";
        this.products[2] = "Ciastka";
    }
    protected String getInformation(){
        return super.getInformation() + "\nProdukty znajdujące się w sklepie: \n" + this.products[0] +"\n"+this.products[1]+"\n"+this.products[2];
    }
}
