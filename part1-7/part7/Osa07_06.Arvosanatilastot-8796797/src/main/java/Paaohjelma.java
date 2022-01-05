
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        
        Arvosanarekisteri arvosanat = new Arvosanarekisteri();
        Kayttoliittyma ui = new Kayttoliittyma(lukija, arvosanat);
        ui.kaynnista();
        
        
    }
}
