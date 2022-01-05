
import java.util.Objects;


public class Ostos {
    
    private String nimi;
    private int kpl;
    private int hinta;

    public Ostos(String tuote, int kpl, int hinta) {
        this.nimi = tuote;
        this.kpl = kpl;
        this.hinta = hinta;
    }

    public String getNimi() {
        return nimi;
    }
    
    //hinta
    public int hinta() {
        return hinta * kpl;
    }
    
    public void kasvataMaaraa() {
        kpl++;
    }
    
    public String toString() {
        return nimi + ": " + kpl;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nimi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ostos other = (Ostos) obj;
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        return true;
    }
    
    
    
}
