public class Main {
    public static void main(String[] args) {

        Fighter fOne = new Fighter("Ali", 10, 120, 100);
        Fighter fTwo = new Fighter("Fırat", 8, 100,90);

        Match match = new Match(fOne,fTwo,80, 105);
        match.run();

    }
}