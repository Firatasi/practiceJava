import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            dizi[i] = (int) (Math.random() * 91) + 10;
        }

        System.out.println("Oluşturulan dizi: " + Arrays.toString(dizi));

        int secim;
        do {
            System.out.println("1) Selection Sort");
            System.out.println("2) Doğrusal Arama");
            System.out.println("3) İkili Arama");
            System.out.println("0) Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    selectionSort(dizi);
                    System.out.println("Selection Sort sonrası dizi: " + Arrays.toString(dizi));
                    break;
                case 2:
                    System.out.print("Aranacak değeri girin: ");
                    int arananDeger = scanner.nextInt();
                    int indeks = dogrusalArama(dizi, arananDeger);
                    if (indeks != -1) {
                        System.out.println(arananDeger + " değeri dizide bulundu, indeks: " + indeks);
                    } else {
                        System.out.println(arananDeger + " değeri dizide bulunamadı");
                    }
                    break;
                case 3:

                    System.out.print("Aranacak değeri girin: ");
                    int aranan = scanner.nextInt();
                    int index = ikiliArama(dizi, aranan);
                    if (index != -1) {
                        System.out.println(aranan + " değeri dizide bulundu, indeks: " + index);
                    } else {
                        System.out.println(aranan + " değeri dizide bulunamadı");
                    }
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
        } while (secim != 0);

        scanner.close();
    }

    public static void selectionSort(int[] dizi) {
        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = dizi[minIndex];
            dizi[minIndex] = dizi[i];
            dizi[i] = temp;
        }
    }

    public static int dogrusalArama(int[] dizi, int ara) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == ara) {
                return i;
            }
        }
        return -1;
    }

    public static int ikiliArama(int[] dizi, int ara) {
        int baslangic = 0;
        int son = dizi.length - 1;
        while (baslangic <= son) {
            int orta = (baslangic + son) / 2;
            if (dizi[orta] == ara) {
                return orta;
            }
            if (dizi[orta] < ara) {
                baslangic = orta + 1;
            } else {
                son = orta - 1;
            }
        }
        return -1;
    }
}