import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Bölme işlemi için bir sayı girin veya programı sonlandırmak için 0 girin: ");
                double bolunen = scanner.nextInt();


                System.out.print("Böleni girin: ");
                double bolen = scanner.nextInt();

                if (bolen == 0) {
                    throw new ArithmeticException("Bir sayıyı 0'a bölemezsiniz!");
                }

                double sonuc = bolunen / bolen;
                System.out.println("Bölme işleminin sonucu: " + sonuc);
            } catch (ArithmeticException e) {
                System.out.println("Hata: Bir sayıyı 0'a bölemezsiniz!");
            }
        }
    }
}