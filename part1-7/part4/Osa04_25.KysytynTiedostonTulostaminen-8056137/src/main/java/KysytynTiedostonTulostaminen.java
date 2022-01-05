
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String tulostettavaTiedosto = String.valueOf(lukija.nextLine());
        
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tulostettavaTiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                System.out.println(rivi);
            }
            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
