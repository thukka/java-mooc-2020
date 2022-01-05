
public class Tuotevarasto extends Varasto {
    
    private String tuotenimi;

    public Tuotevarasto(String tuotenimi, double tilavuus) {
        super(tilavuus);
        this.tuotenimi = tuotenimi;
    }
    
    public String getNimi() {
        return this.tuotenimi;
    }
    
    public void setNimi(String uusiNimi) {
        this.tuotenimi = uusiNimi;
    }
    
    @Override
    public String toString() {
        return this.getNimi() + ": " + super.toString();
    }
    
}
