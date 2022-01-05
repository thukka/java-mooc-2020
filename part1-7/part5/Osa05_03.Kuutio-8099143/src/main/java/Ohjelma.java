
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Kokeile luokkasi toimintaa täällä
        Kuutio testikuutio = new Kuutio(4);
        System.out.println(testikuutio.tilavuus());
        System.out.println(testikuutio);

        System.out.println();

        Kuutio suola = new Kuutio(2);
        System.out.println(suola.tilavuus());
        System.out.println(suola);
    }
}
