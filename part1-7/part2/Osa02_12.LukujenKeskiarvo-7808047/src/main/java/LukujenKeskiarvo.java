
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lukumaara = 0;
        int lukujenSumma = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int syote = Integer.valueOf(lukija.nextLine());
            
            if (syote == 0) {
                break;
            }
            
            lukujenSumma = lukujenSumma + syote;
            lukumaara = lukumaara + 1;
        }
        System.out.println("Lukujen keskiarvo " + ((double)lukujenSumma / lukumaara));

    }
}
