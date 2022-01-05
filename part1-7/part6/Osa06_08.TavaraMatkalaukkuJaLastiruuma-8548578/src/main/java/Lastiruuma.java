import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> lastiruuma;
    

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.lastiruuma = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku (Matkalaukku laukku) {
        int yhteispaino = 0;
        
        for (Matkalaukku i : lastiruuma) {
            yhteispaino+= i.yhteispaino();
        }
        
        if (yhteispaino < this.maksimipaino && laukku.yhteispaino() <= this.maksimipaino - yhteispaino) {
            this.lastiruuma.add(laukku);
        }
        
    }

    @Override
    public String toString() {
        int yhteispaino = 0;
        for (Matkalaukku i : lastiruuma) {
            yhteispaino+= i.yhteispaino();
        }
        
        return lastiruuma.size() + " matkalaukkua (" + yhteispaino + " kg)";
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku i : lastiruuma) {
            i.tulostaTavarat(); 
        }
    }
    
    
    
}
