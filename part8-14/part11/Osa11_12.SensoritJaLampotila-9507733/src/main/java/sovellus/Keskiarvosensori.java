
package sovellus;

import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori {
    
    private ArrayList<Sensori> sensorit;
    private List<Integer> lampotilahistoria;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.lampotilahistoria = new ArrayList<>();
    }
        
    @Override
    public boolean onPaalla() {
        for (Sensori i : sensorit) {
            if (i.onPaalla() == false) {
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public void paalle() {
        for (Sensori i : sensorit) {
            i.paalle();
        }
    }
    
    @Override
    public void poisPaalta() {
        this.sensorit.stream()
                .forEach(i -> i.poisPaalta());
    }
    
    @Override
    public int mittaa() {
        int summa = 0;
        int indeksi = 0;
        
        if (this.onPaalla() == false || this.sensorit.isEmpty()) {
            throw new IllegalStateException("Jokin sensori on pois päältä tai sensoreita ei ole lisätty.");
        }
        
        for (Sensori i : sensorit) {
            summa = summa + i.mittaa();
            indeksi++;
        }
        
        this.lampotilahistoria.add(summa/indeksi);
        return summa / indeksi;
                
    }
    
    public void lisaaSensori (Sensori lisattava) {
        this.sensorit.add(lisattava);
    }
    
    public List<Integer> mittaukset() {
        return lampotilahistoria;
    }
    
    
    
}
