import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalTime zaman = LocalTime.now();
        LocalDate tarih = LocalDate.now();

        DateTimeFormatter zamanFormatlayici = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter tarihFormatlayici = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String zamanOnce = zaman.format(zamanFormatlayici);
        String tarihOnce = tarih.format(tarihFormatlayici);

        System.out.println("Zaman Format Değişkliği Öncesi: " + zaman);
        System.out.println("Tarih Format Değişkliği Öncesi: " + tarih);

        System.out.println("Zaman Format Değişkliği Sonrası: " + zamanOnce);
        System.out.println("Tarih Format Değişkliği Sonrası: " + tarihOnce);
    }
}