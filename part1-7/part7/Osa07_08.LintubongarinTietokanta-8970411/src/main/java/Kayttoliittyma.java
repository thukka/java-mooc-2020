
import java.util.Scanner;
 
 
public class Kayttoliittyma {
    
    private Scanner lukija;
    private LintuTietokanta kanta;
 
    public Kayttoliittyma(Scanner lukija, LintuTietokanta kanta) {
        this.lukija = lukija;
        this.kanta = kanta;
    }
 
    public void kaynnista() {
        
        
        while (true) {
            System.out.print("? ");
            String syote = String.valueOf(lukija.nextLine());
            if (syote.equals("Lopeta")) {
                break;
            }
            
            if (syote.equals("Lisaa")) {
                System.out.print("Nimi: ");
                String nimi = String.valueOf(lukija.nextLine());
                System.out.print("Latinankielinen nimi: ");
                String latinaNimi = String.valueOf(lukija.nextLine());
                kanta.lisaa(new Lintu(nimi, latinaNimi));
            }
            
            if (syote.equals("Tilasto")) {
                kanta.tilasto();
            }
            
            if (syote.equals("Havainto")) {
                System.out.print("Mikä havaittu? ");
                String havaittuNimi = String.valueOf(lukija.nextLine());
                kanta.havainto(havaittuNimi);
            }
            
            if (syote.equals("Nayta")) {
                System.out.print("Mikä? ");
                String naytaNimi = String.valueOf(lukija.nextLine());
                kanta.nayta(naytaNimi);
            }
            
            
        }
    }
    
    
    
}