
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Kirjoita merkkijono: ");
        String merkkijono = String.valueOf(lukija.nextLine());
        
        if (merkkijono.equals("totta")) {
            System.out.println("Oikein meni!");
        } else {
            System.out.println("Koitappa uudelleen!");
        }

    }
}
