
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit tehdä kokeiluja
        Mittari testi = new Mittari();
        
        System.out.println(testi.mitta());
        
        while (!testi.taynna()) {
            System.out.println("Ei täynnä! Mitta: " + testi.mitta());
            testi.lisaa();
        }
        
        System.out.println("Täynnä! Mitta: " + testi.mitta());
        testi.vahenna();
        System.out.println("Ei täynnä! Mitta: " + testi.mitta());
    }
}
