

public class Maa {
    
    private String teema;
    private String ikaryhma;
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private Double lukutaitoprosentti;

    public Maa(String teema, String ikaryhma, String sukupuoli, String maa, int vuosi, Double lukutaitoprosentti) {
        this.teema = teema;
        this.ikaryhma = ikaryhma;
        this.sukupuoli = sukupuoli;
        this.maa = maa;
        this.vuosi = vuosi;
        this.lukutaitoprosentti = lukutaitoprosentti;
    }

    public Double getLukutaitoprosentti() {
        return this.lukutaitoprosentti;
    }
    
    public String sukupuoliClean(String sukup) {
        if (sukup.equals(" male (%)")) {
            return "male";
        } else {
            return "female";
        }
    }

    @Override
    public String toString() {
        return this.maa + " (" + this.vuosi + ")" + ", " + this.sukupuoliClean(sukupuoli) + ", " + this.lukutaitoprosentti;
    }
    
    
    
}
