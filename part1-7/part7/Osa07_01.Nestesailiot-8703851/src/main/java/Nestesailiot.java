
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ekaSailio = 0;
        int tokaSailio = 0;
        // En tiedä miksi herjaa Saattaa olla että class Nestesailiot-luokan public static void main(String[] args) -metodi on hävinnyt tai ohjelmasi kaatui poikkeukseen

        while (true) {

            System.out.println("Ensimmäinen: " + ekaSailio + "/100");
            System.out.println("Toinen: " + tokaSailio + "/100");

            // System.out.print("> ");
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

            String osat[] = luettu.split(" ");
            int maara = Integer.valueOf(osat[1]);

            if (osat[0].equals("lisaa")) {
                if (maara > 0 && ekaSailio + maara <= 100) {
                    ekaSailio += +maara;
                } else if (maara > 0 && ekaSailio + maara > 100) {
                    ekaSailio = 100;
                }
            }

            if (osat[0].equals("siirra")) {
                // Jos siirrettävä määrä enemmän kuin ekan säiliön neste, siirrä kaikki ja nollaa säiliö.
                if (ekaSailio > 0 && maara > ekaSailio && ekaSailio + tokaSailio <= 100) {
                    tokaSailio += ekaSailio;
                    ekaSailio = 0;
                }
                
                // Jos määrä on enemmän kuin tokaan säiliöön mahtuu, täytä toka säiliö ja miinusta ekasta oikea määrä
                if (maara > (100 - tokaSailio) && maara > 0 && ekaSailio > maara) {
                    ekaSailio-=maara;
                    if (ekaSailio < 0) {
                        ekaSailio = 0;
                    }
                    tokaSailio = 100;
                }

                // Normaali siirto, eli siirrä ja miinusta ekaa säiliötä. Nollaa säiliö jos meinaa mennä miinukselle.
                if (maara > 0 && tokaSailio + maara <= 100 && ekaSailio >= maara) {
                    ekaSailio -= maara;
                    if (ekaSailio < 0) {
                        ekaSailio = 0;
                    }
                    tokaSailio += maara;
                }

            }

            // Poista tokasta säiliöstä, jos menee nollan puolelle niin laita 0.
            if (osat[0].equals("poista")) {
                if (maara > 0 && tokaSailio > 0) {
                    tokaSailio -= maara;
                    if (tokaSailio < 0) {
                        tokaSailio = 0;
                    }
                }
            }

        }
    }

}
