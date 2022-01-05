
import java.util.ArrayList;


public class Piilo<T> {
    
    private ArrayList<T> piilopaikka;

    public Piilo() {
        this.piilopaikka = new ArrayList<>();
    }
    
    public void laitaPiiloon(T piilotettava) {
        if (piilopaikka.size() > 0) {
            piilopaikka.remove(0);
        }
        this.piilopaikka.add(piilotettava);
    }
    
    public T otaPiilosta() {
        if (this.piilopaikka == null) {
            return null;
        }
        T varapiilo = this.piilopaikka.get(0);
        piilopaikka.remove(0);
        return varapiilo;
    }
    
    public boolean onkoPiilossa() {
        if (this.piilopaikka.size() > 0) {
            return true;
        }
        return false;
    }
}
