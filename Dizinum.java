import java.util.Scanner;
import java.util.Arrays;
public class Dizinum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print("Dizinin büyüklüğünü giriniz: ");
        number = input.nextInt();


        int[] list = new int[number];

        for (int i = 0; i < list.length; i++ ) {

            System.out.print("Dizinin " + (i + 1) + ".elemanını giriniz: " );
            list[i] = input.nextInt();

        }

        Arrays.sort(list);
        System.out.println("Dizinin küçükten büyüğe sıralanışı: " + Arrays.toString(list));






    }
}
