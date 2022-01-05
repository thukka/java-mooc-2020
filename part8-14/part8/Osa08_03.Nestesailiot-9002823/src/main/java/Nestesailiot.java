
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int sailio1 = 0;
        int sailio2 = 0;

        while (true) {
            System.out.println("Ensimmäinen: " + sailio1 + "/100");
            System.out.println("Toinen: " + sailio2 + "/100");

            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String palat[] = luettu.split(" ");
            String komento = palat[0];
            int maara = Integer.valueOf(palat[1]);

            if (komento.equals("lisaa") && maara > 0) {
                sailio1 += maara;
                if (sailio1 >= 100) {
                    sailio1 = 100;
                }
            }

            if (komento.equals("siirra") && maara > 0) {
                if (maara > sailio1) {
                    sailio2 += sailio1;
                    sailio1 = 0;

                } else {
                    sailio1 -= maara;
                    sailio2 += maara;
                }

                if (sailio1 < 0) {
                    sailio1 = 0;
                }
                if (sailio2 > 100) {
                    sailio2 = 100;
                }
            }

            if (komento.equals("poista") && maara > 0) {
                sailio2 -= maara;
                if (sailio2 < 0) {
                    sailio2 = 0;
                }
            }

        }

    }

}
