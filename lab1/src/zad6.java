import java.util.Scanner;

public class zad6 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Wpisz numer dnia tygodnia");
    int i = scan.nextInt();
        switch (i){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nie ma takiego dnia!");
                break;
        }
    }
}
