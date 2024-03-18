import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        while (true) {
            System.out.println("İşlem seçin: Toplama (1), Çıkarma (2), Çarpma (3), Bölme (4), Çıkış (0)");
            int secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            System.out.print("İlk sayıyı girin: ");
            double sayi1 = scanner.nextDouble();
            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            switch (secim) {
                case 1:
                    System.out.println("Toplam: " + hesapMakinesi.toplama(sayi1, sayi2));
                    break;
                case 2:
                    System.out.println("Fark: " + hesapMakinesi.cikarma(sayi1, sayi2));
                    break;
                case 3:
                    System.out.println("Çarpım: " + hesapMakinesi.carpma(sayi1, sayi2));
                    break;
                case 4:
                    System.out.println("Bölüm: " + hesapMakinesi.bolme(sayi1, sayi2));
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
        scanner.close();
    }

    }
