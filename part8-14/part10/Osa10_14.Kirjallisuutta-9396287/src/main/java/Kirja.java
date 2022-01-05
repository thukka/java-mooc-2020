

public class Kirja {
    
    private String nimi;
    private int minKohdeIka;

    public Kirja(String nimi, int minKohdeIka) {
        this.nimi = nimi;
        this.minKohdeIka = minKohdeIka;
    }

    public String getNimi() {
        return nimi;
    }

    public int getMinKohdeIka() {
        return minKohdeIka;
    }

    @Override
    public String toString() {
        return this.nimi + " (" + this.minKohdeIka + " vuotiaille ja vanhemmille)";
    }
    
    
    
}
