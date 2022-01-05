
import java.util.ArrayList;

public class Resepti {

    private String nimi;
    private int aika;
    private ArrayList<String> raakaAineet;

    public Resepti(String nimi, int aika, ArrayList<String> raakaAineet) {
        this.nimi = nimi;
        this.aika = aika;
        this.raakaAineet = raakaAineet;
    }

    public String getNimi() {
        return nimi;
    }

    public int getAika() {
        return aika;
    }

    public ArrayList<String> getRaakaAineet() {
        return raakaAineet;
    }

    public void lisaa(String aine) {
        this.raakaAineet.add(aine);
    }

    @Override
    public String toString() {
        return this.getNimi() + ", keittoaika: " + this.getAika();
    }

}
