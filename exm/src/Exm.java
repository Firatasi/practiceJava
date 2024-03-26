import java.util.Scanner;

public class Exm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programı sonlandırmak için 0 tuşuna basınız.");

        while (true) {
            try {
                System.out.print("Sayıyı girininiz: ");
                int sayi = scanner.nextInt();

                if (sayi == 0) {
                    System.out.println("Program sonlandırılıyor...");
                    break;
                }


                kontrolEt(sayi);
            } catch (IllegalArgumentException e) {
                System.out.println("Hata: " + e.getMessage());
            }
        }


    }

    public static void kontrolEt(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı " + sayi + " çifttir.");
        } else {
            throw new IllegalArgumentException("Girilen sayı " + sayi + " tektir!");
        }
    }
}