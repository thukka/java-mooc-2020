
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet [0-100]:");
        int pistemaara = Integer.valueOf(lukija.nextLine());

        if (pistemaara < 0) {
            System.out.println("mahdotonta!");
        } else if (pistemaara <= 49) {
            System.out.println("hylätty");
        } else if (pistemaara <= 59) {
            System.out.println("Arvosana: 1");
        } else if (pistemaara <= 69) {
            System.out.println("Arvosana: 2");
        } else if (pistemaara <= 79) {
            System.out.println("Arvosana: 3");
        } else if (pistemaara <= 89) {
            System.out.println("Arvosana: 4");
        } else if (pistemaara <= 100) {
            System.out.println("Arvosana: 5");
        } else {
            System.out.println("uskomatonta!");
        }
    }
}
