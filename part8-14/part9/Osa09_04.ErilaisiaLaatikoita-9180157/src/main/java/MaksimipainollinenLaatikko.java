
import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipaino;
    private ArrayList<Tavara> sisalto;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.sisalto = new ArrayList<>();
    }

    public int getMaksimipaino() {
        return maksimipaino;
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara i : sisalto) {
            if (i.getNimi().equals(tavara.getNimi())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.maksimipaino >= tavara.getPaino()) {
            this.sisalto.add(tavara);
            this.maksimipaino -= tavara.getPaino();
            if (this.maksimipaino < 0) {
                this.maksimipaino = 0;
            }
        }
    }

}
