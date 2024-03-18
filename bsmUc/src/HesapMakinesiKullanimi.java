
class HesapMakinesi {
    double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    double bolme(double sayi1, double sayi2) {
        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return 0;
        }
    }
}


