
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Tyontekijat {
    
    private ArrayList<Henkilo> tyontekijat;

    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }
    
    public void lisaa (Henkilo lisattava) {
        this.tyontekijat.add(lisattava);
    }
    
    public void lisaa (List<Henkilo> lisattavat) {
        lisattavat.stream().forEach(i -> tyontekijat.add(i));
    }
    
    public void tulosta() {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        
        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }
    
    public void tulosta (Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        
        while (iteraattori.hasNext()) {
            Henkilo seuraavaVuorossa = iteraattori.next();
            
            if (seuraavaVuorossa.getKoulutus() == koulutus) {
                System.out.println(seuraavaVuorossa);
            }
        }
    }
    
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();
        
        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
        
    }
    
    
    
}
