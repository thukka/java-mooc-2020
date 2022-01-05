
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> sanat = new ArrayList<>();
        
        while (true) {
            String sana = lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            sanat.add(sana);
        }
        
        sanat.stream()
                .forEach(i -> System.out.println(i));
        

    }
}
