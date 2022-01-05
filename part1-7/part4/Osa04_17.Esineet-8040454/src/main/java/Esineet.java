
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nimi: ");
            String syote = String.valueOf(lukija.nextLine());
            
            if (syote.isEmpty()) {
                break;
            }
            
            esineet.add(new Esine(syote));
        }
        
        for (Esine esine: esineet) {
            System.out.println(esine);
        }

    }
}
