
import java.util.ArrayList;

public class HukkaavaLaatikko extends Laatikko {
    
    private ArrayList<Tavara> sisalto;
    
    public HukkaavaLaatikko() {
        this.sisalto = new ArrayList<>();
    }
    
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        this.sisalto.add(tavara);
    }
    
}
