
import java.util.Objects;

public class Rekisterinumero {
    // älä muuta luokan jo valmiina olevia osia

    // oliomuuttujille on lisätty määre final, jolloin niiden arvoa ei asetuksen
    // jälkeen voi enää muuttaa
    private final String rekNro;
    private final String maa;

    public Rekisterinumero(String maa, String rekNro) {
        this.rekNro = rekNro;
        this.maa = maa;
    }

    @Override
    public String toString() {
        return maa + " " + rekNro;
    }
    
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        
        if (!(verrattava instanceof Rekisterinumero)) {
            return false;
        }
        
        Rekisterinumero verrattavaObjekti = (Rekisterinumero) verrattava;
        
        if (this.rekNro.equals(verrattavaObjekti.rekNro) && this.maa.equals(verrattavaObjekti.maa)) {
            return true;
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.rekNro);
        hash = 19 * hash + Objects.hashCode(this.maa);
        return hash;
    }
    
    

}
