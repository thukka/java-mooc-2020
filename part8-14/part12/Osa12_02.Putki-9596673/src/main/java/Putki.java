
import java.util.ArrayList;

public class Putki<T> {
    
    private T arvo;
    private ArrayList<T> putkinen;

    public Putki() {
        this.putkinen = new ArrayList<>();
    }
    
    public void lisaaPutkeen(T lisattava) {
        putkinen.add(lisattava);
    }
    
    public T otaPutkesta() {
        if (putkinen.isEmpty()) {
            return null;
        }
        T ekaPutki = putkinen.get(0);
        putkinen.remove(0);
        return ekaPutki;
    }
    
    public boolean onkoPutkessa() {
        return !(this.putkinen.isEmpty());
    }

    public ArrayList<T> sisalto() {
        return putkinen;
    }
    
    
    
}
