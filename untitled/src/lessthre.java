import java.util.Scanner;

public class lessthre {

    public static void main(String[] args) {
        int[]dizi = new int[20];


        for (int i = 0; i < 20; i++) {
            dizi[i] = (int)(Math.random()*100)+1;
        }

        System.out.print("Dizi içeriği: ");
        for (int not :dizi) {
            System.out.print(not + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geçme notunu giriniz: ");
        int gecmeNotu = scanner.nextInt();

        int gecenler = hesapla(dizi, gecmeNotu);
        int kalanlar = 20 - gecenler;

        System.out.println("Geçenler: " + gecenler);
        System.out.println("Kalanlar: " + kalanlar);
    }

    public static int hesapla(int[] dizi, int gecmeNotu) {
        int gecenler = 0;
        for (int not : dizi) {
            if (not >= gecmeNotu) {
                gecenler++;
            }
        }
        return gecenler;
}
}
