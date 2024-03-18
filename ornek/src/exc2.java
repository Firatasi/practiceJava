import java.util.ArrayList;

public class exc2 {
    public static void main(String[] args) {
        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("kırmızı");
        renkler.add("turuncu");
        renkler.add("sarı");
        renkler.add("yeşil");
        renkler.add("mor");
        renkler.add("pembe");
        renkler.add("lacivert");

        System.out.print("Yeşil olmayan renkler:");
        for (String renk : renkler) {
            if (!renk.equals("yeşil")) {
                System.out.print(renk + " ");
            }
        }

        int ortancaIndex = renkler.size() / 2;
        String ortancaDeger = renkler.get(ortancaIndex);
        renkler.remove(ortancaIndex);
        renkler.add(ortancaIndex, "turkuaz"); // Silinen indeks yerine yeni indeks değerini ata

        System.out.println();
        System.out.println("Ortanca değer: " + ortancaDeger);
        System.out.println("Arraylist ortanca eleman silindi ve turkuaz eklendi: " + renkler);

        renkler.clear();
        System.out.println("Arraylist temizlendi: " + renkler);
    }
}