
public class Maksukortti {

    private double saldo;

    public Maksukortti(double alkuSaldo) {
        this.saldo = alkuSaldo;
    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }

    public void syoEdullisesti() {
        this.saldo -= 2.60;
        if (this.saldo < 0) {
            this.saldo+=2.60;
        }
    }

    public void syoMaukkaasti() {
        
        this.saldo -= 4.60;
        if (this.saldo < 0) {
            this.saldo = this.saldo + 4.60;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        if (rahamaara < 0) {
            this.saldo = this.saldo;
        } else {
            this.saldo+=rahamaara;
        }
        if (this.saldo > 150) {
            this.saldo = 150;
        }
    }

}
