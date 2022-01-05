
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = String.valueOf(lukija.nextLine());
            if(syote.equals("")) {
                break;
            }
            
            String[] paloiksi = syote.split(" ");
            
            for (String tulosta: paloiksi) {
                if (tulosta.contains("av")) {
                    System.out.println(tulosta);
                }
            }
            
            
            
        }


    }
}
