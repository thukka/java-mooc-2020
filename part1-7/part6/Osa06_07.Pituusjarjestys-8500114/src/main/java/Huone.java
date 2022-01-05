
import java.util.ArrayList;

public class Huone {

    private ArrayList<Henkilo> hnkl;

    public Huone() {
        this.hnkl = new ArrayList<>();
    }

    public void lisaa(Henkilo henkilo) {
        hnkl.add(henkilo);
    }

    // Tsekkaa onko lista tyhjä
    public boolean onTyhja() {
        return hnkl.isEmpty();
    }

    // Palauttaa listan
    public ArrayList<Henkilo> getHenkilot() {
        return hnkl;
    }

    // Etsi lyhin henkilo
    public Henkilo lyhin() {

        if (hnkl.isEmpty()) {
            return null;
        }

        Henkilo lyhyinHenkilo = hnkl.get(0);
        for (Henkilo i : hnkl) {
            if (i.getPituus() < lyhyinHenkilo.getPituus()) {
                lyhyinHenkilo = i;
            }

        }
        return lyhyinHenkilo;
    }

    // Poista lyhin henkilö
    public Henkilo ota() {

        if (hnkl.isEmpty()) {
            return null;
        }
        Henkilo poistaLyhin = hnkl.get(0);
        
        for (Henkilo i : hnkl) {
            if (i.getPituus() < poistaLyhin.getPituus()) {
                poistaLyhin = i;
            }

        }

        hnkl.remove(poistaLyhin);

        return poistaLyhin;
    }

}
