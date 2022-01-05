
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
    }

    // KÄYNNISTÄ
    public void kaynnista() {
        System.out.print("Mistä luetaan? ");
        String tiedosto = String.valueOf(lukija.nextLine());
        System.out.println("");
        System.out.println("Komennot:\n" + "listaa - listaa reseptit\n" + "lopeta - lopettaa ohjelman\n" + "hae nimi - hakee reseptiä nimen perusteella\n"
        + "hae keittoaika - hakee reseptiä keittoajan perusteella\n" + "hae aine - hakee reseptiä raaka-aineen perusteella\n");

        ArrayList<Resepti> resepti = lueTiedosto(tiedosto);
        Hakukone reseptihaku = new Hakukone(resepti);
        
        while (true) {
            System.out.print("Syötä komento: ");
            String komento = String.valueOf(lukija.nextLine());
            
            if (komento.equals("lopeta")) {
                break;
            }

            if (komento.equals("listaa")) {
                System.out.println("\nReseptit:");
                for (Resepti i : resepti) {
                    System.out.println(i.getNimi() + ", keittoaika: " + i.getAika());
                }
                System.out.println("");
            }
            
            if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String haettava = lukija.nextLine();
                reseptihaku.haeNimella(haettava);
            }
            
            if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                String haettava = lukija.nextLine();
                reseptihaku.haeKeittoajalla(haettava);
                
            }
            
            if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String haettava = lukija.nextLine();
                reseptihaku.haeRaakaAine(haettava);
            }
        }

    }
    
    // LUE
    public static ArrayList<Resepti> lueTiedosto(String tiedosto) {
        ArrayList<Resepti> resepti = new ArrayList<>();

        try ( Scanner tiedostoLukija = new Scanner(Paths.get(tiedosto))) {
            
            while (tiedostoLukija.hasNextLine()) {
                ArrayList<String> raakaAine = new ArrayList<>();        // tämä paska oli loopin ulkopuolella vuoden, nyt toimii
                String rivi = tiedostoLukija.nextLine();
                int aika = Integer.valueOf(tiedostoLukija.nextLine());
            
                while (tiedostoLukija.hasNextLine()) {
                    String aines = tiedostoLukija.nextLine();
                    if (aines.isEmpty()) {
                        break;
                    }
                    raakaAine.add(aines);
                }

                resepti.add(new Resepti(rivi, aika, raakaAine));
            }

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        return resepti;

    }

}
