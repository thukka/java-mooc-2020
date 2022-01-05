
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        
        int indeksi = 0;
        while (indeksi < taulukko.length) {
            int maara = taulukko[indeksi];
            
            for (int i = 1; i <= maara; i++) {
                System.out.print("*");
            }
            System.out.println("");
            indeksi++;
        }
        
    }

}
