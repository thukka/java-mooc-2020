 
public class Lintu {
    
    private String nimi;
    private String latinaNimi;
    private int havainnot;
 
    public Lintu(String nimi, String latinaNimi) {
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
        this.havainnot = 0;
    }
 
    public String getNimi() {
        return nimi;
    }
 
    public String getLatinaNimi() {
        return latinaNimi;
    }
 
    public void setHavainnot() {
        this.havainnot++;
    }
    
    
 
    @Override
    public String toString() {
        return this.nimi + " (" + this.latinaNimi + "): " + this.havainnot + " havaintoa";
    }
    
    
    
    
    
}
 