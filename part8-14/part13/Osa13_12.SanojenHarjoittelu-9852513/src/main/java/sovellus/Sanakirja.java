
package sovellus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Sanakirja {
    
    private List<String> sanat;
    private Map<String, String> kaannokset;
    
    public Sanakirja() {
        this.sanat = new ArrayList<>();
        this.kaannokset = new HashMap<>();
        
        lisaa("sana", "word");
    }
    
    public String hae(String sana) {
        return this.kaannokset.get(sana);
    }
    
    public void lisaa(String sana, String kaannos) {
        if (!this.sanat.contains(sana)) {
            this.sanat.add(sana);
        }
        
        this.kaannokset.putIfAbsent(sana, kaannos);
    }
    
    public String haeRandomSana() {
        Random random = new Random();
        int randomIndeksi = random.nextInt(this.sanat.size());
        return this.sanat.get(randomIndeksi);
    }
    
}
