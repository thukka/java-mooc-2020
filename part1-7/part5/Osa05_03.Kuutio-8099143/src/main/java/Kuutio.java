
public class Kuutio {
    private int sarma;
    
    public Kuutio(int sarmanPituus) {
        this.sarma = sarmanPituus;
    }
    
    public int tilavuus() {
        return this.sarma * this.sarma * this.sarma;
    }
    
    public String toString() {
        return "Kuution särmän pituus on " + this.sarma + ", tilavuus on " + this.tilavuus();
    }
    
}
