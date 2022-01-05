
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        
        System.out.print("Mihin asti? ");
        int asti = Integer.valueOf(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        
        for (int i = alaraja; i <= asti; i++) {
            System.out.println(i);
        }
        
    }
}
