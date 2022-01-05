
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        tulostaTahtia(5);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(7,5);
        System.out.println("\n---");
        tulostaKolmio(6);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        for (int i = 1; i <= maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        for (int i = 1; i <= sivunpituus; i++) {
            tulostaTahtia(sivunpituus);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {

        tulostaTahtia(leveys);

        for (int n = 2; n <= korkeus; n++) {
            tulostaTahtia(leveys);
        }
    }

    public static void tulostaKolmio(int koko) {

        /*int kerroin = koko + 1; // 4+1 = 5
        int alku = kerroin - koko; // 5 - 4= 1; */
        int kasvata = (koko + 1) - koko;

        for (int i = 1; i <= koko; i++) {
            tulostaTahtia(kasvata);
            kasvata++;

        }

    }

    /* public static void tulostaKolmio(int koko) {

        System.out.println("Koko on: " + koko);
                
        int kerroin = koko;

        for (int i = 1; i <= koko; i++) {
            System.out.println("");
            tulostaTahtia(kerroin);
            kerroin = kerroin - 1;
        }

    } */
}
