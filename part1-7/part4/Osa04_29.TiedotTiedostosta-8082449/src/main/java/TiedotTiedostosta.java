
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mikä tiedosto luetaan?");
        String luettavaTiedosto = String.valueOf(lukija.nextLine());

        try ( Scanner tiedostonLukija = new Scanner(Paths.get(luettavaTiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String riviTiedostosta = tiedostonLukija.nextLine();

                String[] palat = riviTiedostosta.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);

                if (ika == 1) {
                    System.out.println(nimi + ", ikä: " + ika + " vuosi");
                } else {
                    System.out.println(nimi + ", ikä: " + ika + " vuotta");
                }
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
