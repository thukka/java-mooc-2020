
import java.util.ArrayList;

public class Laatikko implements Talletettava {
    
    private double maksimiKg;
    private ArrayList<Talletettava> tavarat;

    public Laatikko(double maksimiKg) {
        this.maksimiKg = maksimiKg;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Talletettava tavara) {
        if (this.maksimiKg >= tavara.paino()) {
        this.tavarat.add(tavara);
        this.maksimiKg-=tavara.paino();
        }
    }
    
    public double paino() {
        double paino = 0;
        for (Talletettava i : tavarat) {
            paino += i.paino();
        }
        return paino;
    }

    @Override
    public String toString() {
        return "Laatikko: " + this.tavarat.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }
    
    
    
    
}
