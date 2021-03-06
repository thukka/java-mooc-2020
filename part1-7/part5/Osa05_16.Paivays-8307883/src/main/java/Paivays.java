
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public void etene() {
        this.etene(1);
    }

    public void etene(int montakoPaivaa) {
        for (int i = 0; i < montakoPaivaa; i++) {
            this.paiva++;

            if (this.paiva == 31) {
                this.paiva = 1;
                this.kuukausi++;
                if (this.kuukausi == 13) {
                    this.kuukausi = 1;
                    this.vuosi++;
                }
            }

        }

    }
    
    public Paivays paivienPaasta(int paivia) {
        Paivays uusiPaivays = new Paivays(this.paiva, this.kuukausi, this.vuosi);
        
        uusiPaivays.etene(paivia);
        
        return uusiPaivays;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

}
