import java.util.Scanner;

public class PalindromKelimeler {


    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sorgulanmasını istediğiniz kelimeyi giriniz: ");
        String str = input.nextLine();

        System.out.println(isPalindrom(str));
}

static boolean isPalindrom(String word) {

    int i = 0;
    int j = (word.length() - 1);

        while (i < j) {

            if (word.charAt(i) != word.charAt(j)) {

                i++;
                j--;
                return false;
            }
           return true;

        }

        return true;

}


}

