
import java.util.Objects;

public class Henkilo {

    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;
        this.syntymaPaiva = syntymaPaiva;
        this.pituus = pituus;
        this.paino = paino;
    }

    // toteuta tänne equals-metodi, jolla tarkastellaan olioiden samuutta
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        
        if (!(verrattava instanceof Henkilo)) {
            return false;
        }
        
        Henkilo verrattavaHnkl = (Henkilo) verrattava;
        
        if (this.nimi.equals(verrattavaHnkl.nimi) && this.syntymaPaiva.equals(verrattavaHnkl.syntymaPaiva) && this.pituus == verrattavaHnkl.pituus && this.paino == verrattavaHnkl.paino) {
            return true;
        }
        
        return false;

    }

}
