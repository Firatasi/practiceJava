import java.util.Scanner;

public class KucuktenBuyugeSiralama27 {
    public static void main (String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayi, b=0, c=0;
        int a;

        System.out.print("Girmek istediğiniz sayı adedini giriniz: ");
        sayi = inp.nextInt();

        for(int i = 1; i <= sayi; i++) {

            System.out.print(i + ".Sayıyı giriniz: ");
            a = inp.nextInt();

            if(a > b) {
                b = a;
            }

            if(a < c) {
                c = a;
            }
        }

        System.out.println("En büyük sayı: " + b);
        System.out.println("En küçük sayı:" + c);

    }
}
