
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String vanhimmanNimi = "";
        int suurinIka = 0;
        
        while (true) {
            String syote = String.valueOf(lukija.nextLine());
            if(syote.equals("")) {
                break;
            }
            
            String[] paloiteltu = syote.split(",");
            if (Integer.valueOf(paloiteltu[1]) >= suurinIka) {
                suurinIka = Integer.valueOf(paloiteltu[1]);
                vanhimmanNimi = String.valueOf(paloiteltu[0]);
            }
        }
        System.out.println("Vanhimman nimi: " + vanhimmanNimi);

    }
}
