
import java.util.ArrayList;
import java.util.HashMap;


public class Ajoneuvorekisteri {
    
    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }
    
    public String hae(Rekisterinumero rekkari) {
        return this.omistajat.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (this.omistajat.containsKey(rekkari)) {
            this.omistajat.remove(rekkari);
            return true;
        }
        
        return false;
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!(this.omistajat.containsKey(rekkari))) {
        this.omistajat.put(rekkari, omistaja);
        return true;
        }
        
        return false;
    }
    
    public void tulostaRekisterinumerot() {
        for (Rekisterinumero i : omistajat.keySet()) {
            System.out.println(i);
        }
    }
    
    public void tulostaOmistajat() {
        ArrayList<String> omistajatLista = new ArrayList<>();
        for (String i : omistajat.values()) {
            if (!(omistajatLista.contains(i))) {
            omistajatLista.add(i);
            System.out.println(i);
            }
        }
    }
    
}
