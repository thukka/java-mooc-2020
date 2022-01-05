
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String syote = String.valueOf(lukija.nextLine());
            String[] paloiksi = syote.split(" ");

            if (syote.equals("")) {
                break;
            }

            for (String tulosta : paloiksi) {
                System.out.println(tulosta);
            }
        }

    }
}
