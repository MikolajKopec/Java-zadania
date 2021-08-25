import java.util.Scanner;
import java.util.Random;
public class zad10 {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i==0) {
            int random = rand.nextInt(3);
            System.out.println("Kamień/Papier/Nożyce? (0/1/2)  3 - koniec gry");
            int player = scan.nextInt();
            if (player==3){
                System.exit(0);
            }
            if (player == random) {
                System.out.println("REMIS!");
            }
            switch (player) {
                case 0:
                    if (random == 1) {
                        System.out.println("Przegrałeś!");
                    }
                    if (random == 2) {
                        System.out.println("Wygrałeś!");
                    }
                    break;
                case 1:
                    if (random == 2) {
                        System.out.println("Przegrałeś!");
                    }
                    if (random == 0) {
                        System.out.println("Wygrałeś!");
                    }
                    break;
                case 2:
                    if (random == 0) {
                        System.out.println("Przegrałeś!");
                    }
                    if (random == 1) {
                        System.out.println("Wygrałeś!");
                    }
                    break;
            }
            System.out.println(random);
        }
    }
}
