
import java.util.Scanner;


public class Kayttoliittyma {

    private Scanner lukija;
    private Tehtavalista lista;

    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }
            
            if (komento.equals("lisaa")) {
                System.out.print("Lisättävä: ");
                String lisattava = lukija.nextLine();
                lista.lisaa(lisattava);
            }
            
            if (komento.equals("listaa")) {
                lista.tulosta();
            }
            
            if (komento.equals("poista")) {
                System.out.print("Mikä poistetaan? ");
                int poista = Integer.valueOf(lukija.nextLine());
                lista.poista(poista);
            }
            
        }
    }
    
    
    
    
}
