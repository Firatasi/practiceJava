import java.util.Random;
import java.util.Scanner;

public class lessTh {
    public static void main(String[] args) {

        diziİki();
    }

    static void diziİki() {
        Scanner inp = new Scanner(System.in);
        Random r = new Random();

        int[] rastGele = new int[20];

        for (int j = 0; j < rastGele.length; j++) {
            rastGele[j] = r.nextInt(100);
            System.out.print(rastGele[j] + " ");
        }
        System.out.println();


        int search = 56;

        for (int i : rastGele) {
            if (i > search) {
                System.out.print(i + ",");
            }
        }
      }



    }


