
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
            if (luettu.equals("lopeta")) {
                break;
            }
            String osat[] = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            
            if (komento.equals("lisaa")) {
                sailio1.lisaa(maara);
            }
            
            if (komento.equals("siirra") && sailio1.sisalto() > 0) {
                if (maara > sailio1.sisalto()) {
                    sailio2.lisaa(sailio1.sisalto());
                    sailio1.poista(maara);
                    continue;
                }
                sailio2.lisaa(maara);
                sailio1.poista(maara);
            }
            
            if (komento.equals("poista")) {
                sailio2.poista(maara);
            }
            

        }
    }

}
