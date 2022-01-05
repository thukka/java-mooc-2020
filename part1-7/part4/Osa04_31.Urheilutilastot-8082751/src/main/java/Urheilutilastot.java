
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = String.valueOf(lukija.nextLine());
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = String.valueOf(lukija.nextLine());
        
        int otteluita = 0;
        int voitto = 0;
        int havio = 0;
        
        try (Scanner tiedostoLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostoLukija.hasNextLine()) {
                String rivi = tiedostoLukija.nextLine();
                String[] palat = rivi.split(",");
                String kotiJoukkue = palat[0];
                String vierasJoukkue = palat[1];
                int kotijoukkuePisteet = Integer.valueOf(palat[2]);
                int vierasjoukkuePisteet = Integer.valueOf(palat[3]);
                
                if (rivi.contains(joukkue)) {
                    otteluita++;
                    
                }
                
                if (kotiJoukkue.equals(joukkue) && kotijoukkuePisteet > vierasjoukkuePisteet || vierasJoukkue.equals(joukkue) && vierasjoukkuePisteet > kotijoukkuePisteet) {
                    voitto++;
                } else if (kotiJoukkue.equals(joukkue) && kotijoukkuePisteet < vierasjoukkuePisteet || vierasJoukkue.equals(joukkue) && vierasjoukkuePisteet < kotijoukkuePisteet){
                    havio++;
                }
                
                
            }
            System.out.println("Otteluita: " + otteluita);
            System.out.println("Voittoja: " + voitto);
            System.out.println("Tappioita: " + havio);
            
            
        } catch (Exception e) {
            
        }
        

    }

}
