package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz promień kwadratu");
        int radius =scan.nextInt();
        MyCircle Circle = new MyCircle(radius);
        System.out.print("Promień: ");
        System.out.println(Circle.radius);
        System.out.print("Obwód: ");
        System.out.println(Circle.circum());
        System.out.print("Pole: ");
        System.out.println(Circle.area());
        System.out.print("Średnica: ");
        System.out.println(Circle.diameter());
    }
}
