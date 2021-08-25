package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz rozmiar tablicy: ");
        int rozmiar = scan.nextInt();
        String[] tab = new String[rozmiar];
        for(int i = 0;i<rozmiar;i++){
            System.out.println("Wpisz znak do tablicy: ");
            tab[i]= scan.next();
        }
        System.out.println("Twoja tablica: ");
        for(int i=0;i<rozmiar;i++){
            System.out.println(tab[i]);
        }
    }
}
