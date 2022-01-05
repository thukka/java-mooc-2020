
public class Mittari {
    private int mitta;
    
    public Mittari() {
        
    }
    
    public void lisaa() {
        if (mitta < 5) {
            mitta++;
        }
    }
    
    public void vahenna() {
        if (mitta > 0) {
            mitta--;
        }
    }
    
    public int mitta() {
        return mitta;
    }
    
    public boolean taynna() {
        return mitta == 5;
    } 
}
