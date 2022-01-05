
import java.util.ArrayList;

public class Pakka {

    private ArrayList<String> pakka;

    public Pakka() {
        this.pakka = new ArrayList<>();
    }
    
    public void lisaa(String arvo) {
        pakka.add(arvo);
    }
    
    public boolean onTyhja() {
        return pakka.isEmpty();
    }
    
    public String ota() {
        return pakka.remove(pakka.size() - 1);
    }
    
    public ArrayList<String> arvot() {
        return pakka;
    }

}
