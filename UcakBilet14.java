import java.util.Scanner;

public class UcakBilet14 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        double mesafeBasinaUcret, tutar, mesafe, onYas, onYirmi, altmis, donus;
        int yas, yolculukTipi;

        onYas = 0.5;
        onYirmi = 0.1;
        altmis = 0.3;
        mesafeBasinaUcret = 7.90;


        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();


        System.out.print("Lütfen gideceğiniz mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();

        if ((yas>0) && (mesafe>0)) {
            System.out.println("Yaş: " + yas);



        System.out.print("1-) Gidiş \n2-) Gidiş-Dönüş \nLütfen yolculuk tipini seçiniz: ");
        yolculukTipi = input.nextInt();

        if((yolculukTipi==1) || (yolculukTipi==2) ) {
            System.out.println("Seçilen yolculuk tipi: " + yolculukTipi);

            tutar = (mesafe*mesafeBasinaUcret) ;

            if(yolculukTipi==1)
            {

                if (yas < 12) {
                    System.out.println("İndirimli Tutar: " + (tutar * onYas) + "TL");
                } else if ((yas >= 12) && (yas <= 24)) {
                    System.out.println("İndirimli Tutar: " + (tutar * onYirmi) + "TL");
                } else if (yas > 65) {
                    System.out.println("İndirimli Tutar: " + (tutar * altmis) + "TL");
                }
            }

            if(yolculukTipi==2) {
                System.out.print("Dönüş mesafesini km cinsinden giriniz: ");
                donus = input.nextDouble();
                donus = mesafeBasinaUcret*mesafe;
                System.out.println("Gidiş/Geliş ücreti: " + (donus+tutar));

                if(yas<12) {
                    System.out.println("İndirimli Tutar: " + ((donus+tutar)*onYas) + "TL");
                }else if ((yas>12) && (yas<=24)) {
                    System.out.println("İndirimli Tutar: " + ((donus+tutar)*onYirmi) + "TL");
                }else if (yas>65) {
                    System.out.println("İndirimli Tutar: " + ((donus+tutar)*altmis) + "TL");
                }


            }


        }else {
            System.out.println("Lütfen belirtlen yolculuk tipinden birini seçiniz. ");
        }

        }else {
            System.out.println("Girilen yaş ve mesafe negatif olamaz.");
        }




    }
}
