
import java.util.ArrayList;

public class YhdenTavaranLaatikko extends Laatikko {
    
    private ArrayList<Tavara> sisalto;
    
    public YhdenTavaranLaatikko() {
        this.sisalto = new ArrayList<>();
    }
    
    @Override
    public void lisaa(Tavara tavara) {
        if (this.sisalto.isEmpty()) {
            this.sisalto.add(tavara);
        }
    }
    
    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if (this.sisalto.isEmpty()) {
            return false;
        } 
        return this.sisalto.get(0).getNimi().contains(tavara.getNimi());
    }
    
}
