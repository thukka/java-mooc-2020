
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;

        while (true) {
            //Pyydetään syöte
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());

            // Jos syöte on nolla niin lopetetaan
            if (syote == 0) {
                break;
            }

            // Summaan lisätään käyttäjän syöte (0 + 5 + 5 jne)
            summa = summa + syote;
        }
        // Tulostetaan summa
        System.out.println("Lukujen summa " + summa);

    }
}
