import java.util.ArrayList;

public class Viestipalvelu {
    
    private ArrayList<Viesti> viestiLista;
    
    public Viestipalvelu() {
        this.viestiLista = new ArrayList<>();
    }
    
    public void lisaa(Viesti viesti) {
        if (viesti.getSisalto().length() <= 280) {
            viestiLista.add(viesti);
        }
    }
    
    public ArrayList<Viesti> getViestit() {
        return viestiLista;
    }
    
    
    
}
