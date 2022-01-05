
import java.util.Scanner;

public class Kayttoliittyma {

    private Tehtavalista tehtavalista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner lukija) {
        this.tehtavalista = tehtavalista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            
            // Lopeta ohjelma
            if (komento.equals("lopeta")) {
                break;
            }
            
            // Lisää tehtävälistalle
            if (komento.equals("lisaa")) {
                System.out.print("Lisättävä: ");
                String lisattava = lukija.nextLine();
//                if (lisattava.equals("lopeta")) {
//                    continue;
//                }
                
                tehtavalista.lisaa(lisattava);
                
            }
            
            // Tulosta lista
            if (komento.equals("listaa")) {
                tehtavalista.tulosta();
            }
            
            // Poistettava tehtävä
            if (komento.equals("poista")) {
                System.out.print("Mikä poistetaan? ");
                int poistettava = Integer.valueOf(lukija.nextLine());
                tehtavalista.poista(poistettava);
            }
            
        }
    }
    
}
