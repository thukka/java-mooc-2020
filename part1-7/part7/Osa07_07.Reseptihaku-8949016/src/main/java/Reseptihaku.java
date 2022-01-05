
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma ui = new Kayttoliittyma(lukija);
        
        ui.kaynnista();
        
    }
}
