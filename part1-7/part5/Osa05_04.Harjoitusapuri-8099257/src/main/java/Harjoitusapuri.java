
public class Harjoitusapuri {
    private int ika;
    private int leposyke;
    
    public Harjoitusapuri(int ika, int leposyke) {
        this.ika = ika;
        this.leposyke = leposyke;
    }
    
    public double getMaksimiSyke() {
        return 206.3 - (0.711 * this.ika);
    }
    
    public double tavoitesyke(double prosenttiaMaksimista) {
        
        //Tavoitesykkeen laskeminen perustuu kaavaan (maksimisyke - leposyke) * (tavoitesykeprosentti) + leposyke, missä tavoitesyke annetaan prosenttina maksimisykkeestä.
        return (this.getMaksimiSyke() - this.leposyke) * (prosenttiaMaksimista) + this.leposyke;
        
    }
    
}
