
package lentokentta.domain;


public class Lentokone {
    
    private String tunnus;
    private int kapasiteetti;

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
    }

    public String getTunnus() {
        return tunnus;
    }

    @Override
    public String toString() {
        return this.tunnus + " (" + this.kapasiteetti + " henkilöä)";
    }
    
    
    
    
}
