package com.company;

public class Shop {
    protected String address;
    protected int size;
    protected Shop(String address,int size){
        this.address = address;
        this.size = size;
    }
    protected String getInformation(){
        return ("Adres sklepu: " + this.address + " Rozmiar sklepu: " + this.size);
    }
}
