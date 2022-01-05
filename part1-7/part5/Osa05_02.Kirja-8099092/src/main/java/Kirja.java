
public class Kirja {
    private String nimi;
    private String kirjailija;
    private int kirjanSivut;
    
    public Kirja(String kirjailija, String nimi, int sivuja) {
    this.kirjailija = kirjailija;
    this.nimi = nimi;
    this.kirjanSivut = sivuja;
}
    public String getKirjailija() {
        return this.kirjailija;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getSivuja() {
        return this.kirjanSivut;
    }
    
    public String toString() {
        return this.getKirjailija() + ", " + this.getNimi() + ", " + this.getSivuja() + " sivua";
    }
}
