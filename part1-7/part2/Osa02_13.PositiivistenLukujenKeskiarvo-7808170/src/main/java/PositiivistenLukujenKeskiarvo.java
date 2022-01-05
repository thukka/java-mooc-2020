
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int positiivisetLuvut = 0;
        int positiivisetKerrat = 0;

        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());

            if (syote == 0) {
                break;
            }

            if (syote > 0) {
                positiivisetLuvut = positiivisetLuvut + syote;
                positiivisetKerrat = positiivisetKerrat + 1;
            }
        }

        if (positiivisetKerrat <= 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            System.out.println((double) positiivisetLuvut / positiivisetKerrat);
        }

    }
}
