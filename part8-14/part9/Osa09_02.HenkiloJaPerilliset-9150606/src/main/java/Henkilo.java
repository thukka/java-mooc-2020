

public class Henkilo {
    
    private String nimi;
    private String osoite;

    public Henkilo(String nimi, String osoite) {
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public String getNimi() {
        return nimi;
    }

    public String getOsoite() {
        return osoite;
    }
    
    @Override
    public String toString() {
        return this.getNimi() + "\n  " + this.getOsoite();
    }
    
    
    
}
