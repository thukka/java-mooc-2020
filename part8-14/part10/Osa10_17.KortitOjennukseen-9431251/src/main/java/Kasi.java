
import java.util.ArrayList;
import java.util.Collections;


public class Kasi implements Comparable<Kasi> {

    private ArrayList<Kortti> handu;

    public Kasi() {
        this.handu = new ArrayList<>();
    }
    
    public int yhtSumma() {
        int yhtsumma = 0;
        for (Kortti i : handu) {
            yhtsumma+= i.getArvo();
        }
        return yhtsumma;

    }
    
    public void lisaa (Kortti kortti) {
        handu.add(kortti);
    }
    
    public void jarjesta() {
        Collections.sort(handu, Kortti::compareTo);
    }
    
    public void tulosta() {
        handu.stream()
                .forEach(i -> System.out.println(i));
    }
    
    public void jarjestaMaittain() {
        Collections.sort(handu, new SamatMaatVierekkainArvojarjestykseen());
    }

    @Override
    public int compareTo(Kasi kasi) {
        return this.yhtSumma() - kasi.yhtSumma();
    }
    
    
    
    
    
}
