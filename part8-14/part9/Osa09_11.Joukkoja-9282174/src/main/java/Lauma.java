
import java.util.ArrayList;


public class Lauma implements Siirrettava {
    
    private ArrayList<Siirrettava> jasenet;

    public Lauma() {
        this.jasenet = new ArrayList<>();
    }
    
    
    
    public void siirra(int dx, int dy) {
        for (Siirrettava i : jasenet) {
            i.siirra(dx, dy);
        }
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        jasenet.add(siirrettava);
    }

    @Override
    public String toString() {
        String tulostus = "";
        for (Siirrettava i : jasenet) {
            tulostus += i + "\n";
        }
        return tulostus;
    }
    
}
