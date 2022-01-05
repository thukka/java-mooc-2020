
import java.util.ArrayList;

public class Matkalaukku {

    private int maksimipaino;
    private ArrayList<Tavara> tavarat;

    public Matkalaukku(int maksimipaino) {
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }

    public void lisaaTavara(Tavara tavara) {
        if (this.yhteispaino() + tavara.getPaino() > this.maksimipaino) {
            return;
        }

        this.tavarat.add(tavara);
    }

    public int yhteispaino() {
          int yhteispaino = this.tavarat.stream()
                  .mapToInt(i -> i.getPaino())
                  .sum();
          return yhteispaino;

        
    }

    public void tulostaTavarat() {
          this.tavarat.stream().map(i -> i.toString()).sorted().forEach(System.out::println);
    }

    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.tavarat.stream().max((t1, t2) -> t1.getPaino() - t2.getPaino()).get();
    }

    @Override
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }

        if (this.tavarat.size() == 1) {
            return "1 tavara (" + this.yhteispaino() + " kg)";
        }

        return this.tavarat.size() + " tavaraa (" + this.yhteispaino() + " kg)";
    }
}
