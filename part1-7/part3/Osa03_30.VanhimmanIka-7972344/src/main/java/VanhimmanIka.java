
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int suurinIka = 0;
        
        while (true) {
            String syote = String.valueOf(lukija.nextLine());

            if (syote.equals("")) {
                break;
            }

            String[] taulu = syote.split(",");
            if (Integer.valueOf(taulu[1]) >= suurinIka) {
                suurinIka = Integer.valueOf(taulu[1]);
            }
        }
        System.out.println("Vanhimman ikä: " + suurinIka);

    }
}
