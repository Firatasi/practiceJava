import java.util.Scanner;

public class lessTwo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double kilo = inp.nextDouble();
        System.out.print("Boyunuzu m cinsinden giriniz: ");
        double boy = inp.nextDouble();

        System.out.println("Boy: " + boy);
        System.out.println("Kilo: " + kilo);

        double bki = calc(kilo,boy);
        System.out.println(bki);
        System.out.println(endeks(bki));
    }

    static double calc(double kilo, double boy) {
        double bki = ((kilo*100)/(boy*boy));
        return bki;
    }

    static String endeks(double bki) {
        if (bki < 18.5) {
            return ("Zayıf");
        }else if (bki < 25) {
            return ("Normal");
        }else if (bki < 30) {
            return("Kilolu");
        }else {
            return("Obez");
        }
    }
}
