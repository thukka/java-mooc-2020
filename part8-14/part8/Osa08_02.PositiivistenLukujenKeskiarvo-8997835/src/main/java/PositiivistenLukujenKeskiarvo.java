
import java.util.ArrayList;
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int maara = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            
            if (luku > 0) {
                summa+=luku;
                maara++;
            }
            
        }
        if (maara == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            System.out.println((double) summa / maara);
        }
        

    }
}
