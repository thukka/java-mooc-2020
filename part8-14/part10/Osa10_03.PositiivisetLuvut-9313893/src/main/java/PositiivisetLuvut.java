
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä
        
        List<Integer> lista = new ArrayList<>();
        int luku = -2;
        for (int i = 0; i < 9; i++) {
            lista.add(luku);
            luku++;
        }
        
        System.out.println(positiiviset(lista));

    }
    
    // Positiiviset luvut
    public static List<Integer> positiiviset(List<Integer> luvut) {
        return luvut.stream().filter(i -> i > 0).collect(Collectors.toList());
    }

}
