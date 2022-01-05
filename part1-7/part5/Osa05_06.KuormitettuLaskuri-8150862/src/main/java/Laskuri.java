
public class Laskuri {

    private int alkuarvo;
    // Konstruktorit

    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }

    public Laskuri() {
        this(0);
    }

    // Metodit
    public int arvo() {
        return this.alkuarvo;
    }

    public void lisaa(int lisays) {
        if (lisays > 0) {
            this.alkuarvo += lisays;
        }
    }

    public void lisaa() {
        this.lisaa(1);
    }

    public void vahenna(int vahennys) {
        if (vahennys > 0) {
            this.alkuarvo -= vahennys;
        }
    }

    public void vahenna() {
        this.vahenna(1);
    }
}
