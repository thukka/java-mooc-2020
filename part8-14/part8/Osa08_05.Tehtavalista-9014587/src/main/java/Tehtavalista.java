
import java.util.ArrayList;


public class Tehtavalista {
    
    private ArrayList<String> tehtavat;

    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
    
    
    
    public void lisaa(String tehtava) {
        tehtavat.add(tehtava);
    }
    
    public void tulosta() {
        int indeksi = 1;
        for (String i : tehtavat) {
            System.out.println(indeksi + ": " +i);
            indeksi++;
        }
    }
    
    public void poista(int numero) {
        numero -= 1;
        tehtavat.remove(numero);
    }
}
