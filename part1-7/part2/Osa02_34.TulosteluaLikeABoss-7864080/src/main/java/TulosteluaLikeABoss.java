
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        for (int i = 1; i <= maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        for (int i = 1; i <= maara; i++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {

        int kasvu = (koko + 1) - koko; // (4+1) - 4 = 1
        int miinustaminen = koko -1; // 3

        for (int i = 1; i <= koko; i++) {
            tulostaTyhjaa(miinustaminen);
            tulostaTahtia(kasvu);
            kasvu++;
            miinustaminen--;
        }
    }

    public static void jouluKuusi(int korkeus) {

        int kasvu = (korkeus + 1) - korkeus; // (4+1) - 4 = 1
        int miinustus = korkeus -1; // 3

        // runko
        for (int i = 1; i <= korkeus; i++) {
            tulostaTyhjaa(miinustus);
            tulostaTahtia(kasvu);
            kasvu += 2;
            miinustus -= 1;
        }
        tulostaTyhjaa((kasvu / 2) - 2);
        tulostaTahtia(3);
        tulostaTyhjaa((kasvu / 2) - 2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
