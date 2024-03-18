import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ornDizi {
    public static void main(String[] args) {



    }

    static void diziBir() {

        String[] cars = {"BMW", "MERCEDES", "RENAULT", "FORD"};

        for (int j = 0; j < cars.length; j++) {

            System.out.print(cars[j] + " ");

        }

        for (String car : cars) {
            System.out.println(car);
        }


    }

    static void diziİki() {
        Random r = new Random();
        Scanner inp = new Scanner(System.in);


        int[] rastGele = new int[20];

        for (int j = 0; j < rastGele.length; j++) {
            rastGele[j] = r.nextInt(100);
            System.out.print(rastGele[j] + ", ");
        }
        System.out.println();

        System.out.print("Aramak istediğiniz sayıyı giriniz: ");
        int search = inp.nextInt();

        for (int k = 0; k < rastGele.length; k++) {

            if (search == rastGele[k]) {
                System.out.println("Aranan değer: " + search + " Aranan değerin indeks numarası: " + k);
                break;
            }

        }


    }

    static void sayiHarf() {
        Scanner input = new Scanner(System.in);

        System.out.print("İki basamaklı pozitif değer giriniz: ");
        int num = input.nextInt();

        String[] birler = {"", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] onlar = {"", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};

        int onlarBas = num / 10;
        int birlerBas = num % 10;

        System.out.print(onlar[onlarBas]);
        System.out.print(birler[birlerBas]);

    }

    static void dikDortgen() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int satir = inp.nextInt();

        System.out.print("Sütun sayısını giriniz: ");
        int sutun = inp.nextInt();

        int[][] matrix = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {

            for (int j = 0; j < sutun; j++) {
                System.out.print("#");
            }

            System.out.println();

        }

    }

    static void degis() {
        Scanner inp = new Scanner(System.in);

        System.out.print("m sayısını giriniz: ");
        int m = inp.nextInt();

        System.out.print("n sayısını giriniz: ");
        int n = inp.nextInt();

        swap(m, n);


    }

    static void swap(int m, int n) {
        System.out.println("Değişim öncesi m: " + m + " n: " + n);

        int degisIm = m;
        m = n;

        n = degisIm;

        System.out.println("Değişim sonrası m: " + m + " n: " + n);

    }

    static void ort() {
        Scanner inp = new Scanner(System.in);

        int[] matris = new int[5];

        int toplam = 0;

        for (int i = 0; i < matris.length; i++) {
            System.out.print((i + 1) + "." + "Dizi elemanı gir: ");
            matris[i] = inp.nextInt();
            toplam += matris[i];
        }

        int ortalama = toplam / 5;

        for (int j = 0; j < matris.length; j++) {
            if (matris[j] > ortalama) {
                matris[j] -= ortalama;
                System.out.print(matris[j] + ", ");
            } else {
                matris[j] += ortalama;
                System.out.print(matris[j] + ", ");
            }
        }


    }

    static void tekCift() {
        Scanner inp = new Scanner(System.in);
        Random r = new Random();

        int[] list = new int[20];

        for (int j = 0; j < list.length; j++) {
            list[j] = r.nextInt(100);
        }

        System.out.print("Dizi: " + Arrays.toString(list));
        System.out.println();

        System.out.print("Çift dizi: ");
        for (int k = 0; k < list.length; k++) {

            if ((list[k] % 2) == 0) {
                System.out.print(list[k] + ", ");
            }

        }

        System.out.println();

        System.out.print("Çift dizi: ");
        for (int m = 0; m < list.length; m++) {
            if (list[m] % 2 != 0) {
                System.out.print(list[m] + ",");
            }

        }

    }

    static void sira() {
        Scanner inp = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Dizi büyüklüğünü giriniz: ");
        int a = inp.nextInt();

        int[] list = new int[a];

        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(100);
        }

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(list));


    }

    static void sira2() {

        Scanner inp = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Dizi büyüklüğünü giriniz: ");
        int num = inp.nextInt();

        int[] matrix = new int[num];

        int max = matrix[0];
        int min = matrix[0];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(matrix));


        System.out.print("En büyük dizi: ");
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j] > max) {

            }
        }
        System.out.print(matrix[max]);

        System.out.println();

        System.out.print("En küçük dizi: ");
        for (int k = 0; k < matrix.length; k++) {
            if (k < min)
                System.out.print(matrix[k] + ", ");
        }

        System.out.print(matrix[min]);


    }


}