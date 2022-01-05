
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        
        ArrayList<Maa> maat = new ArrayList<>();
        //     public Maa(String teema, String ikaryhma, String sukupuoli, String maa, int vuosi, int lukutaitoprosentti) {
        try {
            Files.lines(Paths.get("lukutaito.csv"))
                    .map(rivi -> rivi.split(","))
                    .map(palat -> new Maa(palat[0], palat[1], palat[2], palat[3], Integer.valueOf(palat[4]), Double.valueOf(palat[5])))
                    .forEach(i -> maat.add(i));
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
        Collections.sort(maat, (h1,h2) -> Double.compare(h1.getLukutaitoprosentti(), h2.getLukutaitoprosentti()));
        maat.stream().forEach(k -> System.out.println(k));

    }
}
