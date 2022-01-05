
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio sailio1 = new Sailio();
        Sailio sailio2 = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + sailio1);
            System.out.println("Toinen: " + sailio2);

            String luettu = lukija.nextLine();
            System.out.println("");
            if (luettu.equals("lopeta")) {
                break;
            }
            String palat[] = luettu.split(" ");
            luettu = palat[0];
            int maara = Integer.valueOf(palat[1]);

            if (luettu.equals("lisaa")) {
                sailio1.lisaa(maara);
            }
            if (luettu.equals("siirra")) {
                if (maara > sailio1.sisalto()) {
                    maara = sailio1.sisalto();
                    sailio1.poista(maara);
                    sailio2.lisaa(maara);
                } else {
                    sailio1.poista(maara);
                    sailio2.lisaa(maara);
                }
            }
            if (luettu.equals("poista")) {
                sailio2.poista(maara);
            }

        }
    }

}
