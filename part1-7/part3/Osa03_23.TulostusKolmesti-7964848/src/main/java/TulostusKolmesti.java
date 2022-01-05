
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        
        System.out.print("Mitä tulostetaan?");
        String syote = String.valueOf(lukija.nextLine());
        
        for (int i = 1; i <= 3; i++) {
            System.out.print(syote);
        }
        

    }
}
