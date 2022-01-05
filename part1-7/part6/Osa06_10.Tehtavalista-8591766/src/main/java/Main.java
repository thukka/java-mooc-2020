
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kokeile sovelluksen osien yhteistoimintaa täällä
//        Tehtavalista lista = new Tehtavalista();
//        Scanner lukija = new Scanner(System.in);
//
//        Kayttoliittyma liittyma = new Kayttoliittyma(lista, lukija);
//        liittyma.kaynnista();


        Scanner lukija = new Scanner(System.in);
        Tehtavalista lista = new Tehtavalista();
        Kayttoliittyma kayttis = new Kayttoliittyma(lista, lukija);
        kayttis.kaynnista();

    }
}
