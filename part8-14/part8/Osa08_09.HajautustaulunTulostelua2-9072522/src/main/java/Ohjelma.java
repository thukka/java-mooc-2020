
import java.util.HashMap;
import java.util.ArrayList;

public class Ohjelma {

    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu) {
        for (Kirja i : hajautustaulu.values()) {
            System.out.println(i);
        }
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono) {
        for (Kirja i : hajautustaulu.values()) {
            if (i.getNimi().contains(merkkijono)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä!
        HashMap<String, Kirja> taulu = new HashMap<>();
        taulu.put("tunteet", new Kirja("Järki ja tunteet", 1811, "..."));
        taulu.put("luulot", new Kirja("Ylpeys ja ennakkoluulo", 1813, "...."));
        
        tulostaArvot(taulu);
        System.out.println("---");
        tulostaArvoJosNimessa(taulu, "ennakko");
        
    }

}
