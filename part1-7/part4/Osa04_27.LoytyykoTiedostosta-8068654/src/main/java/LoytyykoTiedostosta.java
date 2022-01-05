
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        ArrayList<String> sisalto = new ArrayList<>();
        try ( Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {

            while (tiedostonLukija.hasNextLine () 
                ) {
                sisalto.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }
        
        
        boolean loytyiko = false;
            for (String i : sisalto) {
                if (etsittava.equals(i)) {
                    System.out.println("Löytyi!");
                    loytyiko = true;
                    break;
                }
            }
            
            if (loytyiko == false) {
                System.out.println("Ei löytynyt.");
            }

        }
    }
