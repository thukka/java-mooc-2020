
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = String.valueOf(lukija.nextLine());
            
            if (syote.equals("")) {
                break;
            }
            
            String[] palat = syote.split(" ");
            System.out.println(palat[palat.length - 1]);
            
        }


    }
}
