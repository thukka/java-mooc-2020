
public class Tuote {
    private String nimi;
    private int lukumaara;
    private double hinta;
    
    public Tuote (String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.nimi = nimiAlussa;
        this.lukumaara = maaraAlussa;
        this.hinta = hintaAlussa;
    }
    
    public void tulostaTuote() {
        System.out.println(this.nimi + ", hinta " + this.hinta + ", " + this.lukumaara + " kpl");
    }
    
}
