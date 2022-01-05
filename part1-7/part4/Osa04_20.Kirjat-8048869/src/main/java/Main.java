
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.print("Nimi: ");
            String nimi = String.valueOf(lukija.nextLine());
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.print("Sivuja: ");
            int sivut = Integer.valueOf(lukija.nextLine());
            System.out.print("Julkaisuvuosi: ");
            int julkaisuvuosi = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi,sivut,julkaisuvuosi));
            
        }
        
        System.out.println("");
        System.out.print("Mitä tulostetaan? ");
        String valinta = String.valueOf(lukija.nextLine());
        
        if (valinta.equals("kaikki")) {
        for (Kirja i: kirjat) {
            System.out.println(i);
        }
        } else if(valinta.equals("nimi")) {
        for (Kirja u: kirjat) {
            System.out.println(u.getNimi());
        }
    }

    }
}
