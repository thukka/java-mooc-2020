
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku < 0) {
                break;
            }
            luvut.add(luku);
        }
        
        luvut.stream()
                .filter(i -> i > 0 && i <= 5)
                .distinct()
                .forEach(i -> System.out.println(i));
        

    }
}
