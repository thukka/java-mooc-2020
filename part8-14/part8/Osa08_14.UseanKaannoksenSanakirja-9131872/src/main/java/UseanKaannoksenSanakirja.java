import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja {
    
    private HashMap<String, ArrayList<String>> taulu;
    
    public UseanKaannoksenSanakirja() {
        taulu = new HashMap<>();
    }
    
    public void lisaa (String sana, String kaannos) {
        this.taulu.putIfAbsent(sana, new ArrayList<>());
        this.taulu.get(sana).add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana) {
        ArrayList<String> sanat = this.taulu.get(sana);
        if (sanat == null) {
            return new ArrayList<>();
        }
        return sanat;
    }
    
    public void poista(String sana) {
        this.taulu.remove(sana);
    }
    
}
