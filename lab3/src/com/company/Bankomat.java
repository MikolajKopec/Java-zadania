package com.company;
import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Konto[] users = new Konto[10];
        for (int i=0;i<users.length;i++){
            users[i] = new Konto(i,100);
        }
        Scanner scan = new Scanner(System.in);
        for (;;){
            boolean exit = false;
            System.out.println("Enter your ID:");
            int id = scan.nextInt();
            if (id> users.length-1){
                System.out.println("Brak danego id!");
            }
            else {
                while (exit == false) {
                    System.out.println("MAIN MENU");
                    System.out.println("1. Check balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Exit");
                    System.out.print("Enter a choice: ");
                    int choice = scan.nextInt();
                    int cash;
                    switch (choice) {
                        case 1:
                            System.out.println(users[id].check());
                            break;
                        case 2:
                            System.out.println("Wpisz kwotę: ");
                            cash = scan.nextInt();
                            users[id].withdraw(cash);
                            break;
                        case 3:
                            System.out.println("Wpisz kwotę: ");
                            cash = scan.nextInt();
                            users[id].deposit(cash);
                            break;
                        case 4:
                            exit = true;
                            break;
                    }
                }
            }
        }
    }
}
