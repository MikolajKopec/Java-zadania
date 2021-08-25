import java.util.Scanner;
public class zad8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        int[] sort = new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Wpisz liczbę");
            array[i] = scan.nextInt();
        }
        if(array[0]>array[1] && array[1]>array[2]){
            sort[2] = array[0];
            sort[1] = array[1];
            sort[0] = array[2];
        }
        else if(array[0]>array[2] && array[2]>array[1]){
            sort[2] = array[0];
            sort[1] = array[2];
            sort[0] = array[1];
        }
        else if(array[2]>array[1] && array[1]>array[0]){
            sort[2] = array[2];
            sort[1] = array[1];
            sort[0] = array[0];
        }
        else if(array[2]>array[0] && array[0]>array[1]){
            sort[2] = array[2];
            sort[1] = array[0];
            sort[0] = array[1];
        }
        else if(array[1]>array[2] && array[2]>array[0]){
            sort[2] = array[1];
            sort[1] = array[2];
            sort[0] = array[0];
        }
        else if(array[1]>array[0] && array[0]>array[2]){
            sort[2] = array[1];
            sort[1] = array[0];
            sort[0] = array[2];
        }
        for(int i = 0;i<3;i++){
            System.out.print(sort[i]+"/");
        }
    }
}
