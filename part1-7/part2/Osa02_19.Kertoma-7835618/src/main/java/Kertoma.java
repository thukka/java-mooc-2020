
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luku: ");
        int syote = Integer.valueOf(lukija.nextLine());
        
        int kertoma = 1;

        while (syote != 0) {
            kertoma = kertoma * syote;
            syote = syote - 1;
        }
        System.out.println("Kertoma on " + kertoma);
        
    }
}
