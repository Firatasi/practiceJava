public class Bstr {
    public static void main(String[] args) {


        String[][] star = new String[6][4];

        for(int x = 0; x < star.length; x++) { //dizideki satırı döner

            for(int y = 0; y < star[x].length; y++) {//dizideki kolonu döner

                if ((x == 0) || (x == 2) || (x == 5)) {
                    star[x][y] = " * ";
                }else if ((y == 0) || (y == 3)) {
                    star[x][y] = " * ";
                }else {
                    star[x][y] = "   ";
                }

            }

        }

        for (String[] row: star) {
            for (String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
