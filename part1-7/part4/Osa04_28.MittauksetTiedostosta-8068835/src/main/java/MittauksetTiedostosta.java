
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        ArrayList<Integer> tiedostonSisalto = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                tiedostonSisalto.add(Integer.valueOf(tiedostonLukija.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        int lukuja = 0;
        for (Integer i: tiedostonSisalto) {
            if (i >= alaraja && i <= ylaraja) {
                lukuja++;
            }
        }
        
        System.out.println("Lukuja: " + lukuja);
        
        

    }

}
