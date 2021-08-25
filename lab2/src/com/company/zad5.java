package com.company;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz rozmiar  macierzy: (wiersze->kolumny)");
        int w = scan.nextInt();
        int k = scan.nextInt();
        int[][] macierz1 = create(w,k);
        int[][] macierz2 = create(w,k);
        show(add(macierz1,macierz2,w,k),w,k);
    }
    public static void show(int[][] tab,int w,int k){
        for(int i = 0;i<w;i++){
            for(int l = 0;l<k;l++){
                System.out.print("["+tab[i][l] + "] ");
            }
            System.out.println();
        }
    }
    public static int[][] fill(int[][] tab,int w,int k){
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<w;i++){
            int it = i+1;
            System.out.print("Wpisz wartość do macierzy: " + it +" - wiersz");
            for(int l = 0;l<k;l++){
                tab[i][l] = scan.nextInt();
            }
        }
        int[][] tablica = tab;
        return tablica;
    }
    public static int[][] create(int w,int k){
        int[][] macierz = new int[w][k];
        fill(macierz,w,k);
        return macierz;
    }
    public static int [][] add(int[][] tab1,int[][] tab2,int w,int k){
        int[][] wynik = new int[w][k];
        for (int i = 0;i<w;i++){
            for (int l = 0; l<k;l++){
                wynik[i][l]=tab1[i][l]+tab2[i][l];
            }
        }
        return wynik;
    }
}
