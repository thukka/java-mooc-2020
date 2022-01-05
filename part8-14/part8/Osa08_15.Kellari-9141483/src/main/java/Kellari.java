
import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {
    
    private HashMap<String, ArrayList<String>> taulu;

    public Kellari() {
        this.taulu = new HashMap<>();
    }
    
    public void lisaa (String komero, String tavara) {
        this.taulu.putIfAbsent(komero, new ArrayList<>());
        this.taulu.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero) {
        return this.taulu.getOrDefault(komero, new ArrayList<>());
    }
    
    public void poista(String komero, String tavara) {
        this.taulu.get(komero).remove(tavara);
        if (this.taulu.get(komero).isEmpty()) {
            this.taulu.remove(komero);
        }
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> komerot = new ArrayList<>();
        for (String i : taulu.keySet()) {
            komerot.add(i);
        }
        return komerot;
    }
    
}
