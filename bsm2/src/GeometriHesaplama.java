class Ucgen {
    double taban;
    double yukseklik;

    Ucgen(double taban, double yukseklik) {
        this.taban = taban;
        this.yukseklik = yukseklik;
    }


    double alanHesaplama() {
        return (taban * yukseklik) / 2;
    }

    double cevreHesaplama() {
        return taban + 2 * (Math.sqrt(Math.pow(taban / 2, 2) + Math.pow(yukseklik, 2)));
    }
}

class Dikdortgen {
    double genislik;
    double yukseklik;

    Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    double alanHesaplama() {
        return genislik * yukseklik;
    }

    double cevreHesaplama() {
        return 2 * (genislik + yukseklik);
    }
}

public class GeometriHesaplama {

}