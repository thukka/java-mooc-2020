
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tallennetaan negatiivisten lukujen määrä muuttujaan
        int negatiiviset = 0;

        // Tehdään toistolause kyselyille
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());

            // JOS negatiivinen niin kasvatetaan aiemmin määritettyä muuttujaa
            if (syote < 0) {
                negatiiviset = negatiiviset + 1;
            }

            // JOS nolla niin lopetetaan
            if (syote == 0) {
                break;
            }
        }
        System.out.println("Negatiivisia lukuja yhteensä " + negatiiviset);

    }
}
