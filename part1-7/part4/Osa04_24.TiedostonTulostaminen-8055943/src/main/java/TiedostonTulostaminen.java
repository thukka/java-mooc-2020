
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        try ( Scanner tiedostonLukija = new Scanner(Paths.get("data.txt"))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                System.out.println(rivi);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
