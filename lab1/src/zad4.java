import java.util.Scanner;
public class zad4 {
    public static void main(String[]args){
        String best ="";
        int maxPoints = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbę studentów: ");
        int i = scan.nextInt();
        while (i>0){
            System.out.print("Wpisz imię studenta: ");
            String name = scan.next();
            System.out.print("Wpisz punkty studenta: ");
            int points = scan.nextInt();
            if (points>maxPoints){
                best = name;
                maxPoints = points;
            }
            i--;
        }
        System.out.println("Najlepszy student to " + best + " z ilością punktów: " + maxPoints);
    }
}
