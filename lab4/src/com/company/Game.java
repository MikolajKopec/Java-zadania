package com.company;
import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    private int player;
    private int number;
    private int[] zakres = new int[2];
    public Game(){
    }
    protected void settings(){
        System.out.println("Wybierz zakres zgadywanych liczb - od - do : ");
        this.zakres[0] = scan.nextInt();
        this.zakres[1] = scan.nextInt();
        double random = Math.random()*(zakres[1]-zakres[0])+zakres[0];
        this.number = (int)Math.round(random);
    }
    protected void start(){
        for (int i=0;i<5;i++){
            System.out.println("Jaką wybierasz liczbę?");
            player = scan.nextInt();
            if (player==number){
                System.out.println("Brawo, wygrałeś!");
                System.exit(0);
            }
            else if (player<number){
                System.out.println("Za mała!");
            }
            else if(player>number){
                System.out.println("Za duża!");
            }
        }
        System.out.println("Niestety przegrałeś. Wylosowana liczba to: " + this.number);
    }
}
