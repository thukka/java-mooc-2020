
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Esine> esineet = new ArrayList<>();

        while (true) {
            System.out.println("Syötä esineen tunnus, tyhjä lopettaa.");
            String tunnus = String.valueOf(lukija.nextLine());

            if (tunnus.isEmpty()) {
                break;
            }

            System.out.println("Syötä esineen nimi, tyhjä lopettaa");
            String nimi = String.valueOf(lukija.nextLine());

            if (nimi.isEmpty()) {
                break;
            }

            Esine lisattavaEsine = new Esine(tunnus, nimi);
            if (!(esineet.contains(lisattavaEsine))) {
                esineet.add(lisattavaEsine);
            }

        }

        for (Esine i : esineet) {
            System.out.println(i);
        }

    }
}
