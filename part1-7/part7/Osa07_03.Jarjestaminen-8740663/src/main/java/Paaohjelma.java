
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
//        int[] taulukko = {30, 15, 5, 99, 3, 12};
//
//        System.out.println("Pienin: " + Paaohjelma.pienin(taulukko));
//        System.out.println("Pienin indeksi: " + Paaohjelma.pienimmanIndeksi(taulukko));

        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }

    // Hae pienin luku
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (Integer i : taulukko) {
            if (i < pienin) {
                pienin = i;
            }
        }

        return pienin;

    }

    // Hae pienimmän luvun indeksi
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int indeksi = 0;
        int pieninIndeksi = 0;

        for (Integer i : taulukko) {
            if (i < pienin) {
                pienin = i;
                pieninIndeksi = indeksi;
            }
            indeksi++;
        }

        return pieninIndeksi;
    }

    // Pienin indeksi annetusta indeksipaikasta lähtien
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int indeksi = aloitusIndeksi;
        int pieninIndeksi = 0;
        int pienin = taulukko[aloitusIndeksi] + 1;

        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                pieninIndeksi = i;
            }
        }

        return pieninIndeksi;

    }

    // Vaihda indeksit keskenään
    public static void vaihda(int taulukko[], int indeksi1, int indeksi2) {
        int sailo = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = sailo;

    }

    // Järjestä taulukko
    public static void jarjesta(int taulukko[]) {

        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(Arrays.toString(taulukko));
            
            int pieninIndeksi = Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i);
            Paaohjelma.vaihda(taulukko, i, pieninIndeksi);;

        }

    }

}
