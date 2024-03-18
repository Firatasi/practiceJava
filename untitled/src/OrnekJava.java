import java.util.Scanner;
public class OrnekJava {
    public static void main(String[] args) {

    }

    static void forBir() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı gir: ");
        int num = inp.nextInt();
        int res = 0;

        for (int i = 0; i <= num; i++ ) {

            res = res + i;

        }
        System.out.println(res);

    }

    static void fak() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int a = inp.nextInt();
        int fak = 1;

        for (int i = 1; i <= a; i++) {
            fak *= i;
        }
        System.out.println(fak);



    }
    static void sira() {
        Scanner inp = new Scanner(System.in);


        System.out.println("aSayı gir: ");
        int a = inp.nextInt();
        System.out.println("bSayı gir: ");
        int b = inp.nextInt();
        System.out.println("cSayı gir: ");
        int c = inp.nextInt();

        if(a > b && b > c) {
            System.out.println("a>b>c");
        }else if(a > c && c > b) {
            System.out.println("a>c>b");
        }else if(b > a && a > c) {
            System.out.println("b>a>c");
        }else if(b > c &&  c> a) {
            System.out.println("b>c>a");
        }else if(c > b && b > a) {
            System.out.println("c>b>a");
        }else if(c > a && a > b) {
            System.out.println("c>a>b");
        }




    }

    static void us() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int a = inp.nextInt();

        System.out.print("Üs gir: ");
        int b = inp.nextInt();

        int res = 1;

        for (int i = 1 ; i < b; i++) {
            res = a * a;
        }
        System.out.println(res);


    }

    static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    static int yasKontrol(int z) {

        if (z > 18) {
            System.out.println("Yaş şartı sağlanıyor! ");
        }else {
            System.out.println("Yaş şartı sağlanmıyor! ");

        }
return z;

    }

    static void finalVize() {
        Scanner in = new Scanner(System.in);

        int fin, vize;

    for (int i = 0; i < 5; i++) {

        System.out.println((i+1) + "." + "Öğrenci ");

        System.out.println("Vize notunuzu giriniz: ");
        vize = in.nextInt();

        System.out.println("Final notunuzu giriniz: ");
        fin = in.nextInt();

        double ort = (fin*0.6) + (vize*0.4);

        System.out.println("Ortalama" + ort);

     }

    }

    static void isAsal() {

        Scanner in = new Scanner(System.in);

        System.out.print("Sayı gir: ");
        int a = in.nextInt();

        for (int i = 2; i <= a; i++) {

            if ((a%i) == 0) {
                System.out.println("Sayı asal değildir! " + a);
                break;
            }else {
                System.out.println("Sayı asaldır! " + a);
                break;
            }

        }



    }

    static boolean isAsal2(int b) {



        boolean sonuc = true;

        for (int j = 2; j<=b; j++) {
            if ((b % j) == 0) {
                sonuc = false;
            }

        }

        return sonuc;
    }

    static int ozYine(int sayi) {

        if (sayi <= 1)
            return 1;
        else
        return sayi * ozYine(sayi-1);

    }

}
