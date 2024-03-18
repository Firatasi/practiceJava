public class Aa {
    public static void main(String[] args) {
        soru2();

    }

    static void soru() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            for (int k = 9; k > i; k--)
                System.out.println("*");
            System.out.println();
        }
    }

    static void soru2() {
        int sayac;
        int[] dizi ={20, 22, 16,23,19,15,16,16,23,20,21,24,21,19,19,18,20,18,16};

        for (int i = 10; i<=25; i++) {
            sayac = 0;
            for (int j = 0;j<dizi.length;j++) {
                if (i == dizi[j]) {
                    sayac++;
                }
            }

            if (sayac != 0)
                System.out.println(i+ "sayısından" + sayac + "tane");

        }

    }
}




