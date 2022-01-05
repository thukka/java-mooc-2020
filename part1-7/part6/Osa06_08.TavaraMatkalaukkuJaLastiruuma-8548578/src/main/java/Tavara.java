
public class Tavara {
    
    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public String toString() {
        return this.getNimi() + " (" + this.getPaino() + " kg)"; 
    }
    
    
    
    
    
}
