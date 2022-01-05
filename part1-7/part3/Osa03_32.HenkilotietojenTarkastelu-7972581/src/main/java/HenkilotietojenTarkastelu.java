
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int indeksi = 0;
        String pisinNimi = "";
        int pisin = 0;
        
        while (true) {
            String syote = String.valueOf(lukija.nextLine());
            if(syote.equals("")) {
                break;
            }
            
            String[] palat = syote.split(",");
            summa = summa + Integer.valueOf(palat[1]);
            indeksi++;
            if(palat[0].length() > pisin) {
                pisin+=palat[0].length();
                pisinNimi = palat[0];
            }
        }
        System.out.println("Pisin nimi: " + pisinNimi + "\nSyntymävuosien keskiarvo: " + ((double)summa / indeksi));


    }
}
