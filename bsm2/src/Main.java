public class Main {
    public static void main(String[] args) {

        Ucgen ucgen = new Ucgen(5, 3);
        Dikdortgen dikdortgen = new Dikdortgen(4, 6);

        System.out.println("Üçgen Alanı: " + ucgen.alanHesaplama());
        System.out.println("Üçgenin Cevresi: " + ucgen.cevreHesaplama());
        System.out.println("Dikdörtgen Alanı: " + dikdortgen.alanHesaplama());
        System.out.println("Dikdörtgenin Cevresi: " + dikdortgen.cevreHesaplama());

    }
}