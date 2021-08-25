package com.company;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz rozmiar tablicy pierwszej: ");
        int rozmiar = scan.nextInt();
        int[] tab1 = new int[rozmiar];
        System.out.println("Wpisz rozmiar tablicy drugiej: ");
        rozmiar = scan.nextInt();
        int[] tab2 = new int[rozmiar];
        fill(tab1);
        fill(tab2);
        int tab3[] = sum(tab1,tab2);
        show(tab3);
    }
    public static void show(int[] tab1){
        for(int i = 0;i<tab1.length;i++){
            System.out.print(tab1[i] + "/");
        }
    }
    public static  int[] fill(int[] tab1){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz wartości do tablicy: ");
        for(int i=0;i<tab1.length;i++){
            tab1[i]=scan.nextInt();
        }
        return tab1;
    }
    public static int[] sum(int[] tab1,int[]tab2){
        int[] sumTab = new int[tab1.length];
        if(tab1.length==tab2.length){
            for(int i=0;i<tab1.length;i++){
                sumTab[i]=tab1[i]+tab2[i];
            }
        }
        else{
            System.out.println("Podane tablice mają różny rozmiar!");
        }
        return sumTab;
    }
}

