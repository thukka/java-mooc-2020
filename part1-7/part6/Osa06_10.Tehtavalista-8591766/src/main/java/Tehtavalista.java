
import java.util.ArrayList;

public class Tehtavalista {

    private ArrayList<String> lista;

    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }

    public void lisaa(String tehtava) {
        this.lista.add(tehtava);
    }

    public void tulosta() {
        
        int indeksi = 1;
        for (String i: lista) {
            System.out.println(indeksi + ": " + i);
            indeksi++;
        }
    }

    public void poista(int numero) {
        this.lista.remove(numero -1);
    }

}
