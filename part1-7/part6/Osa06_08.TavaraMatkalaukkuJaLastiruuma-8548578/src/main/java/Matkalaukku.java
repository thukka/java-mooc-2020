
import java.util.ArrayList;

public class Matkalaukku {

    private int maksimipaino;
    //  private int yhteispaino;
    private ArrayList<Tavara> matkalaukuntavarat;

    public Matkalaukku(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukuntavarat = new ArrayList<>();
        // this.yhteispaino = 0;
    }

    public void lisaaTavara(Tavara tavara) {
        if (yhteispaino() < this.maksimipaino) {
            if (tavara.getPaino() <= this.maksimipaino - yhteispaino()) {
            this.matkalaukuntavarat.add(tavara);
            }
            // this.yhteispaino+= tavara.getPaino();

        }
    }

    public int yhteispaino() {
        int yhteispaino = 0;
        for (Tavara i : matkalaukuntavarat) {
            yhteispaino += i.getPaino();
        }
        return yhteispaino;
    }

    public void tulostaTavarat() {
        for (Tavara i : matkalaukuntavarat) {
            System.out.println(i.getNimi() + " (" + i.getPaino() + " kg)");
        }
    }

    @Override
    public String toString() {
        if (matkalaukuntavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }

        if (matkalaukuntavarat.size() == 1) {
            return matkalaukuntavarat.size() + " tavara (" + this.yhteispaino() + " kg)";
        }

        return matkalaukuntavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }

    public Tavara raskainTavara() {
        if (matkalaukuntavarat.isEmpty()) {
            return null;
        }

        Tavara raskainTavara = matkalaukuntavarat.get(0);
        for (Tavara i : matkalaukuntavarat) {
            if (i.getPaino() > raskainTavara.getPaino()) {
                raskainTavara = i;
            }
        }
        return raskainTavara;
    }

}
