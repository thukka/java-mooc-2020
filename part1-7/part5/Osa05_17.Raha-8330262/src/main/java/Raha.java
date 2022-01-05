
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
        return uusi;
    }

    public Raha miinus(Raha vahentaja) {
    
        int muuttunutEuroa = this.euroa - vahentaja.euroa;
        int muutaThisSentitEuroiksi = this.senttia;
        if (this.senttia < vahentaja.senttia) {
            muutaThisSentitEuroiksi = this.senttia + 100;
            muuttunutEuroa--;
        }
        int muuttunutSentit = muutaThisSentitEuroiksi - vahentaja.senttia;
        
        if (muuttunutEuroa < 0) {
            muuttunutEuroa = 0;
            muuttunutSentit = 0;
        }


        Raha uusi = new Raha(muuttunutEuroa, muuttunutSentit);
        return uusi;
    }

    public boolean vahemman(Raha verrattava) {
        if (this.euroa < verrattava.euroa) {
            return true;
        } 
        
        if (this.euroa == verrattava.euroa) {
            if (this.senttia < verrattava.senttia) {
                return true;
            }
        }
        
        return false;
//        return this.euroa + this.senttia < verrattava.euroa + verrattava.senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
