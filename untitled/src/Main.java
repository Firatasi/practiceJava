import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        diziBir();
        //diziİki();


    }

    static void diziBir() {
        int[] numbers = new int[5];//dizi oluştururken değer vermek zorunludur

        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 1;
        numbers[4] = 1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);

        String[] weekDays = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"};
        System.out.println(Arrays.toString(weekDays));

        String[] ogrenciler = new String[5];
        ogrenciler[0] = "Atakan";
        ogrenciler[1] = "Metin";
        ogrenciler[2] = "Fırat";
        ogrenciler[3] = "Pegasus";
        ogrenciler[4] = "FHY";
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }



    }
    static void diziİki() {

        int[][] ikiBoyutluDizi ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}

        };

        System.out.println(ikiBoyutluDizi[0][1]);//ilk parantez satırı kontrol ikinci satır sütünu kontrol eder



        int number = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin satır sayısını giriniz: ");
        int satir = input.nextInt();
        System.out.print("Dizinin sütun sayısını giriniz: ");
        int sutun = input.nextInt();

        int matrix[][] = new int[satir][sutun];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

        }
        System.out.println("****************");

        //veya

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();

        }


    }
}