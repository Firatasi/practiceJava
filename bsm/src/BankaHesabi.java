public class BankaHesabi {
    String ad;
    String hesapNumarasi;
    double bakiye;

    public BankaHesabi(String ad, String hesapNo, double bakiye) {
        this.ad = ad;
        this.hesapNumarasi = hesapNo;
        this.bakiye = bakiye;
    }

    public void paraCekme(double tutar) {
        if (tutar > bakiye) {
            System.out.println("Yetersiz bakiye. İşlem gerçekleştirilemedi.");
        } else {
            bakiye -= tutar;
            System.out.println(ad + " adlı müşteri " + tutar + " TL çekti. Yeni bakiye: " + bakiye + " TL");
        }
    }

    public void paraYatirma(double tutar) {
        bakiye += tutar;
        System.out.println(ad + " adlı müşteri " + tutar + " TL yatırdı. Yeni bakiye: " + bakiye + " TL");
    }



}

