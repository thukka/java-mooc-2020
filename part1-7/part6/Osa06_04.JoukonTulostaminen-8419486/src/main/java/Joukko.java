
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }

    public String toString() {

        String nimet = "";
        for (String i : alkiot) {
            if (i.equals(alkiot.get(alkiot.size() - 1))) {
                nimet = nimet + i;
            } else {
                nimet = nimet + i + "\n";
            }
        }

        if (alkiot.size() == 1) {
            return "Joukossa " + this.nimi + " on " + alkiot.size() + " alkio:\n" + nimet;
        } else if (alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        } else {
            return "Joukossa " + this.nimi + " on " + alkiot.size() + " alkiota:\n" + nimet;
        }

    }
}
