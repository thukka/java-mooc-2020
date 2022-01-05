
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Määritetään muuttujiin kuinka monta kertaa on syötetty luku (lukumaara) sekä summa (summa)
        int lukumaara = 0;
        int summa = 0;
        
        // Pyydetään syötteitä
        while (true) {
            System.out.println("Syötä luku");
            // Syöte tallennetaan syote-muuttujaan
            int syote = Integer.valueOf(lukija.nextLine());
            // Jos syöte on 0, lopetetaan
            if (syote == 0) {
                break;
            }
            // Muuten lisätään summaan syötetty luku ja kasvatetaan lukumäärää yhdellä
            summa = summa + syote;
            lukumaara = lukumaara + 1;
        }
        // Tulostetaan yrityskerrat ja summa
        System.out.println("Lukuja yhteensä " + lukumaara + "\nLukujen summa " + summa);

    }
}
