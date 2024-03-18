public class Main {
    public static void main(String[] args) {
        BankaHesabi hesap1 = new BankaHesabi("Ahmet", "0001", 1000.0);
        BankaHesabi hesap2 = new BankaHesabi("Ayşe", "0002", 2000.0);
        BankaHesabi hesap3 = new BankaHesabi("Mehmet", "0003", 1500.0);

        hesap1.paraCekme(500.0);
        hesap2.paraYatirma(1000.0);
        hesap3.paraCekme(2000.0);

        System.out.println("Ad: " + hesap1.ad + " " + hesap1.hesapNumarasi + " " + hesap1.bakiye);
        System.out.println("Ad: " + hesap2.ad + " " + hesap2.hesapNumarasi + " " + hesap2.bakiye);
        System.out.println("Ad: " + hesap3.ad + " " + hesap3.hesapNumarasi + " " + hesap3.bakiye);


    }
}