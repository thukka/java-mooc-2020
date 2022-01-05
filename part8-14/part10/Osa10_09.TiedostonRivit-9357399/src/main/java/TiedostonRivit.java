
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TiedostonRivit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    
    public static List<String> lue(String tiedosto) {
        ArrayList<String> sisalto = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(tiedosto)).forEach(i -> sisalto.add(i));
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        return sisalto;
        
    }

}
