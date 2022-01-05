
import java.util.HashMap;


public class Velkakirja {
    
    private HashMap<String, Double> taulu;

    public Velkakirja() {
        this.taulu = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        this.taulu.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka) {
        return this.taulu.getOrDefault(kuka, 0.0);
    }
    
    
    
}
