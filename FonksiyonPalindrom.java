import java.util.Scanner;

public class FonksiyonPalindrom {
    static int number;

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen üç basamaklı sayı giriniz: ");
        number = inp.nextInt();

        isPalindrom(number);

    }

    static boolean isPalindrom(int number) {

        int numbera, numberb, numberc, reverse;

        numberc = (number % 10);
        numberb = (number/10) % 10;
        numbera = (number/100) % 10;


        reverse = (numberc*100) + (numberb*10) + (numbera);


        if(number == reverse) {
            System.out.println("Girdiğiniz sayı palindromdur: " + reverse + ", Sayının tersi: " + reverse);

            return true;
        }else {
            System.out.println("Girdiğiniz sayı palindrom değildir: " + number + ", Sayının tersi: " + reverse);

            return false;
        }
    }


}
