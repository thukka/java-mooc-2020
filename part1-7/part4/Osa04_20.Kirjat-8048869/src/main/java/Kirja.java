
public class Kirja {
    private String nimi;
    private int sivut;
    private int julkaisuvuosi;
    
    public Kirja(String kirjanNimi,int kirjanSivut, int kirjanJulkaisuvuosi) {
    this.nimi = kirjanNimi;
    this.sivut = kirjanSivut;
    this.julkaisuvuosi = kirjanJulkaisuvuosi;
}
    
    public String toString() {
        return this.nimi + ", " + this.sivut + " sivua, " + this.julkaisuvuosi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
}
