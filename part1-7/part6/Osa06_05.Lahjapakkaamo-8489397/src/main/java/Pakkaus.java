import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> lahjat;

    public Pakkaus() {
        this.lahjat = new ArrayList<>();
    }
    
    
    
    public void lisaaLahja(Lahja lahja) {
        this.lahjat.add(lahja);
        
    }

    public int yhteispaino() {
        int yhteispaino = 0;
        // Käydään lahjat-lista läpi ja lisätään jokaisen listalla olevan paino yhteen
        for (Lahja i: lahjat) {
            yhteispaino+=i.getPaino();
        }
        return yhteispaino;
        
    }
    
}
