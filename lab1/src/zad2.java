import java.util.Scanner;
public class zad2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz stopnie celcjusza: ");
        int celc = scan.nextInt();
        double far = (9.0/5.0) * celc + 32;
        System.out.println(far + " - tyle jest to stopni farenhaita");
    }
}
