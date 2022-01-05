import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;

    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("Komento: ");
            String sana = lukija.nextLine();
            
            if (sana.equals("lopeta")) {
                System.out.print("Hei hei!");
                break;
            }
            
            if (sana.equals("lisaa")) {
                System.out.print("Sana: ");
                String kaannettavaSana = lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannettavaKaannos = lukija.nextLine();
                
                sanakirja.lisaa(kaannettavaSana, kaannettavaKaannos);
                continue;
            }
            
            if (sana.equals("hae")) {
                System.out.print("Haettava: ");
                String haettava = lukija.nextLine();
                if (sanakirja.kaanna(haettava) == null) {
                    System.out.println("Sanaa " + haettava + " ei löydy");
                    continue;
                }
                System.out.println("Käännös: " + sanakirja.kaanna(haettava));
                continue;
            }
            
            System.out.println("Tuntematon komento");
        }
    }
    
    
}
