
import java.util.Scanner;


public class Kayttoliittyma {
    private Scanner lukija;
    private Arvosanarekisteri arvosanat;

    public Kayttoliittyma(Scanner lukija, Arvosanarekisteri arvosanat) {
        this.lukija = lukija;
        this.arvosanat = arvosanat;
    }
    
    public void kaynnista() {
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while (true) {
            int pisteet = Integer.valueOf(lukija.nextLine());
            
            if (pisteet == -1) {
                break;
            }
            
            if (pisteet >= 0 && pisteet <= 100) {
                arvosanat.lisaaPisteet(pisteet);
            }
               
        }
        arvosanat.tulostaKeskiarvo();
        arvosanat.hyvaksytytKeskiarvo();
        arvosanat.tulostaArvosanat();
    }
    
    
    
    
}
