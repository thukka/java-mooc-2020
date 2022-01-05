
package lentokentta.domain;


public class Lento {
    
    private Lentokone lentokone;
    private Paikka lahtopaikka;
    private Paikka kohdepaikka;

    public Lento(Lentokone lentokone, Paikka lahtopaikka, Paikka kohdepaikka) {
        this.lentokone = lentokone;
        this.lahtopaikka = lahtopaikka;
        this.kohdepaikka = kohdepaikka;
    }

    public Paikka getKohdepaikka() {
        return kohdepaikka;
    }

    public Paikka getLahtopaikka() {
        return lahtopaikka;
    }

    public Lentokone getLentokone() {
        return lentokone;
    }

    @Override
    public String toString() {
        return this.lentokone + " (" + this.lahtopaikka + "-" + this.kohdepaikka + ")";
    }
    
    
        
    
}
