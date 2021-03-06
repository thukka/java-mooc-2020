
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    
    public static List<Kirja> lueKirjat(String tiedosto) {
        
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(tiedosto))
                    .map(i -> i.split(","))
                    .filter(i -> i.length >=4)
                    .map(i -> new Kirja(i[0], Integer.valueOf(i[1]), Integer.valueOf(i[2]), i[3]))
                    .forEach(i -> kirjat.add(i));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
               
        return kirjat;
    }

}
