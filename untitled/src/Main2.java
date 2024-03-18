
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Random r = new Random();


        System.out.print("Satır sayısı giriniz: ");
        int satir = inp.nextInt();

        int[] list = new int[satir];



        for (int i = 0; i <list.length; i++) {
            list[i] = r.nextInt(10);
            System.out.print(list[i] + " ");
        }


    }
}
