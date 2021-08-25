package com.company;
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz rozmiar  tablicy:");
        int k = scan.nextInt();
        int[] tab1 = create(k);
        System.out.println("Wynik sumowania liczb dodatnich z tablicy to: " + add(tab1));
    }
    public static int[] fill(int[] tab,int k){
        Scanner scan = new Scanner(System.in);
        for(int l = 0;l<k;l++){
            System.out.println("Wpisz liczbę: ");
            tab[l] = scan.nextInt();
        }
        int[] tablica = tab;
        return tablica;
    }
    public static int[] create(int k){
        int[] macierz = new int[k];
        fill(macierz,k);
        return macierz;
    }
    public static int add(int[] tab1){
        int suma = 0;
        for (int i=0; i<tab1.length;i++){
            if(tab1[i]>0){
                suma=suma+tab1[i];
            }
        }
        return suma;
    }
}
