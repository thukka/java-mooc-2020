
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        }

        return false;
    }

    public int hintaero(Asunto verrattava) {
        int asuntoa = this.nelioita * this.neliohinta;
        int asuntob = verrattava.nelioita * verrattava.neliohinta;

        if (asuntoa > asuntob) {
            return asuntoa - asuntob;
        }

        return asuntob - asuntoa;
    }

    public boolean kalliimpi(Asunto verrattava) {
        int asuntoa = this.nelioita * this.neliohinta;
        int asuntob = verrattava.nelioita * verrattava.neliohinta;

        if (asuntoa > asuntob) {
            return true;
        }
        return false;
    }

}
