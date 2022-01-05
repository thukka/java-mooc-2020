
import java.util.HashMap;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        HashMap<Paivays, String> taulu = new HashMap<>();
        Paivays syndet = new Paivays(28, 12, 1991);
        taulu.put(syndet, "Toni");
        System.out.println(taulu.get(new Paivays(28, 12, 1991)));
    }
}
