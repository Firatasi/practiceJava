
public class MaxMin {
    public static void main (String[] args) {
        int[] list = {56, 43, 23, 13, 90, -1, -12, -56,4};
        int max = list[0];
        int min = list[0];

        for(int j : list) {

            if (j > max)
                max = j;

            if (j < min)
                min = j;
        }

        System.out.println("Maksimum değer: " + max);
        System.out.println("Minimum değer: " + min);

    }
}
