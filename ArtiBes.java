import java.util.Scanner;
public class ArtiBes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int num = inp.nextInt();


        plMin(num);
    }

    static void plMin(int num) {

        for(int i = 0; i <= num; i += 5) {

            int result = (num - i);

            System.out.println(result);

            if (result == 0) {
                for (int b = 5; b <= num; b += 5) {
                    int res = (result + b);
                    System.out.println(res);
                }
            }

        }

    }
}
