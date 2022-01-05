
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja   
        
        Scanner lukija = new Scanner(System.in);
        Tarkistin tarkistin = new Tarkistin();
        
        while (true) {
            System.out.print("Anna merkkijono: ");
            String sana = lukija.nextLine();
            if (sana.equals("loppu")) { break; }
            
            if (tarkistin.kellonaika(sana) == true) {
                System.out.println("Muoto on oikea.");
            } else {
                System.out.println("Muoto ei ole oikea.");
            }
            
            
            
        }
    }
}
