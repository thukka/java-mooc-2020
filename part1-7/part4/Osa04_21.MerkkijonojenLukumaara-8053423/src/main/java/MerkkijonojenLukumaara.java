
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int indeksi = 0;
        while (true) {
            String syote = String.valueOf(lukija.nextLine());
            if (syote.equals("loppu")) {
                break;
            }
            indeksi++;
        }
        System.out.println(indeksi);

    }
}
