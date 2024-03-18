import java.util.ArrayList;
import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();


            System.out.print("Lütfen bir sayı girin:");
            int input = scanner.nextInt();



        while (input != 0) {
            liste.add(input);
            input = scanner.nextInt();
        }

        if (!liste.isEmpty()) {
            System.out.println("ArrayList: " + liste);

            if (liste.size() > 0) {
                liste.remove(0);
            }

            if (liste.size() > 0) {
                liste.remove(liste.size() - 1);
            }

            System.out.println("ArrayList ilk ve son elemanları silindikten sonra: " + liste);
        } else {
            System.out.println("ArrayList boş.");
        }


    }
}