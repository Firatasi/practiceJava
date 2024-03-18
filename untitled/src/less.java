import java.util.Scanner;
public class less {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        double noteOne = inp.nextDouble();

        System.out.print("Final notunuzu giriniz: ");
        double noteTwo = inp.nextDouble();

        double ort = calc(noteOne, noteTwo);
        chaCalc(ort);
    }

    static double calc(double noteOne, double noteTwo) {
        double vize = noteOne * 0.4;
        double fin = noteTwo * 0.6;
        double ort = vize + fin;
        System.out.println("Ortalama: " + ort);
        return ort;
    }

    static void chaCalc(double ort) {
        if (ort >= 90 && ort <= 100) {
            System.out.println('A');
        } else if (ort >= 80 && ort < 90) {
            System.out.println('B');
        } else if (ort >= 70 && ort < 80) {
            System.out.println('C');
        } else if (ort >= 0 && ort < 70) {
            System.out.println('F');
        }
    }
}
