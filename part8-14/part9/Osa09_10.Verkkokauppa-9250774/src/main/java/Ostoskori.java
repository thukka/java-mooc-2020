
import java.util.ArrayList;
import java.util.List;

public class Ostoskori {

    private List<Ostos> tuotteet;

    public Ostoskori() {
        this.tuotteet = new ArrayList<>();
    }

    public void lisaa(String tuote, int hinta) {
        if (!tuotteet.contains(new Ostos(tuote, 1, hinta))) {
            this.tuotteet.add(new Ostos(tuote, 1, hinta));
        } else {
            for (Ostos i : tuotteet) {
                if (i.getNimi().equals(tuote)) {
                    i.kasvataMaaraa();
                }
            }
        }
    }

    public int hinta() {
        int summa = 0;
        for (Ostos i : tuotteet) {
            summa += i.hinta();
        }
        return summa;
    }

    public void tulosta() {
        for (Ostos i : tuotteet) {
            System.out.println(i);
        }
    }    

}
