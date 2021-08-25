package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Bookshop bookshop = new Bookshop("Gdańsk",10);
	    Bakery bakery = new Bakery("Sopot",15);
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
