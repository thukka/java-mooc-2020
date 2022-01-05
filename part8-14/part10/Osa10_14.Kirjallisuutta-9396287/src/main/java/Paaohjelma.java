
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while(true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int minkohde = Integer.valueOf(lukija.nextLine());
            kirjat.add(new Kirja(nimi, minkohde));
        }
        
        Comparator<Kirja> jarjestaja = Comparator
                .comparing(Kirja::getMinKohdeIka)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, jarjestaja);
        System.out.println();
        System.out.println("Yhteensä " + kirjat.size() + " kirjaa.\n");
        System.out.println("Kirjat:");
        kirjat.stream()
                .forEach(System.out::println);
    }

}
