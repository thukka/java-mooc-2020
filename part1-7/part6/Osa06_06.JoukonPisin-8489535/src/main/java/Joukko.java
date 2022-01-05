
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

    public String pisin() {
        // Jos lista on tyhjä palautetaan null
        if (this.alkiot.isEmpty()) {
            return null;
        }

        String alkupiste = alkiot.get(0);

        for (String i : alkiot) {

            if (alkupiste.length() < i.length()) {
                alkupiste = i;
            }

        }
        
        return alkupiste;
    }

}
