
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
