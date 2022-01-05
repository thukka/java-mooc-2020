
public class Esine {
    private String tunnus;
    private String nimi;
    
    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        
        if (!(verrattava instanceof Esine)) {
            return false;
        }
        
        Esine verrattavaEsine = (Esine) verrattava;
        return this.tunnus.equals(verrattavaEsine.tunnus);
        
    }
    
    public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
    
}
