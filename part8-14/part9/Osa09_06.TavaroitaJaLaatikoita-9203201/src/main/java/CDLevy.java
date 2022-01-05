

public class CDLevy implements Talletettava {
    
    private String artisti;
    private String levy;
    private int julkaisuvuosi;
    private double paino;

    public CDLevy(String artisti, String levy, int julkaisuvuosi) {
        this.artisti = artisti;
        this.levy = levy;
        this.julkaisuvuosi = julkaisuvuosi;
        this.paino = 0.1;
    }
    
    @Override
    public double paino() {
        return this.paino;
    }

    @Override
    public String toString() {
        return this.artisti + ": " + this.levy + " (" + this.julkaisuvuosi + ")";
    }
    
    
    
    
}
