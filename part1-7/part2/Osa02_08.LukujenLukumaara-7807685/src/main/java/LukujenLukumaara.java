
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = 0;

        // Pyydetään syötteitä
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());

            if (syote > 0 || syote < 0) {
                luku = luku + 1;
            }

            if (syote == 0) {
                break;
            }
        }
        System.out.println("Lukuja yhteensä " + luku);
    }
}
