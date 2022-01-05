package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {

    private boolean paalla;
    
    @Override
    public boolean onPaalla() {
        return this.paalla;
    }

    @Override
    public void paalle() {
        this.paalla = true;
    }

    @Override
    public void poisPaalta() {
        this.paalla = false;
    }

    @Override
    public int mittaa() {
        if (this.paalla == true) {
            return new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException();
        }
    }

}
