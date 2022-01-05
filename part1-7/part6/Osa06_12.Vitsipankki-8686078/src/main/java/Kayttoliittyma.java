
import java.util.Scanner;

public class Kayttoliittyma {

    private Vitsipankki vitsipankki;
    private Scanner lukija;

    public Kayttoliittyma(Vitsipankki vitsipankki, Scanner lukija) {
        this.vitsipankki = vitsipankki;
        this.lukija = lukija;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");
            String komento = lukija.nextLine();

            if (komento.equals("X")) {
                break;
            }
            
            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                this.vitsipankki.lisaaVitsi(vitsi);

            } else if (komento.equals("2")) {
                System.out.println("Arvotaan vitsi.");
                System.out.println(this.vitsipankki.arvoVitsi());

            } else if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                this.vitsipankki.tulostaVitsit();
            }

        }
    }

}
