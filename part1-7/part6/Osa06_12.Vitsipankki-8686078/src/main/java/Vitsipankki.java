
import java.util.ArrayList;
import java.util.Random;

public class Vitsipankki {

    private ArrayList<String> vitsit;

    public Vitsipankki() {
        this.vitsit = new ArrayList<>();
    }

    public void lisaaVitsi(String vitsi) {
        vitsit.add(vitsi);
    }

    public String arvoVitsi() {

        if (vitsit.isEmpty()) {
            return "Vitsit vähissä.";
        } else {
            Random arpa = new Random();
            int indeksi = arpa.nextInt(vitsit.size());
            return vitsit.get(indeksi);
        }

    }

    public void tulostaVitsit() {
        for (String vitsi : vitsit) {
            System.out.println(vitsi);
        }

    }

}
