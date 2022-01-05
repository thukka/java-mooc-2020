
public class Kertoja {
    private int kertojaLuku;
    
    public Kertoja (int luku) {
        this.kertojaLuku = luku;
    }
    
    public int kerro(int luku) {
        return luku * this.kertojaLuku;
    }
}
