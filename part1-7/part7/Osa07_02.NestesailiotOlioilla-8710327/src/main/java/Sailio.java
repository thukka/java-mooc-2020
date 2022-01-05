
public class Sailio {

    private int tilavuus;

    public Sailio() {
        this.tilavuus = 0;
    }

    public int sisalto() {
        return this.tilavuus;
    }

    public void lisaa(int maara) {
        if (maara > 0) {
            this.tilavuus += maara;
            if (this.tilavuus > 100) {
                this.tilavuus = 100;
            }
        }
    }
    
    
    public void poista(int maara) {
        if (maara > 0) {
            this.tilavuus -= maara;
            if (this.tilavuus < 0) {
                tilavuus = 0;
            }
        }
    }
    
    public String toString() {
        return this.tilavuus + "/100";
    }
    
    

}
