
import java.util.ArrayList;

public class Muutoshistoria {

    private ArrayList<Double> muutoshistoria;

    public Muutoshistoria() {
        this.muutoshistoria = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        this.muutoshistoria.add(tilanne);
    }

    public void nollaa() {
        this.muutoshistoria.clear();
    }

    public String toString() {
        return muutoshistoria.toString();
    }

    // Analyysimetodit
    public double maxArvo() {
        double maksimi = this.muutoshistoria.get(0);
        if (this.muutoshistoria.isEmpty()) {
            return 0;
        } else {
            for (Double i : this.muutoshistoria) {
                if (i > maksimi) {
                    maksimi = i;
                }
            }
        }
        return maksimi;
    }

    public double minArvo() {
        double minimi = this.muutoshistoria.get(0);
        if (this.muutoshistoria.isEmpty()) {
            return 0;
        } else {
            for (Double i : this.muutoshistoria) {
                if (i < minimi) {
                    minimi = i;
                }
            }
        }
        return minimi;
    }

    public double keskiarvo() {
        double summa = 0.0;
        int indeksi = 0;
        if (this.muutoshistoria.isEmpty()) {
            return 0;
        } else {
            for (Double i : this.muutoshistoria) {
                summa+=i;
                indeksi++;
            }
        }
        return summa / indeksi;
    }

}
