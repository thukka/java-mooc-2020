
import java.util.ArrayList;
import java.util.Objects;

public class Hajautustaulu<K, V> {

    private ArrayList<Pari<K, V>>[] arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new ArrayList[32];
        this.arvoja = 0;
    }

    public int getArvoja() {
        return arvoja;
    }

    public int hashArvo(K avain) {
        return Math.abs(avain.hashCode() % this.arvot.length);
    }

    public void lisaa(K avain, V arvo) {

        ArrayList<Pari<K, V>> arvotIndeksissa = haeAvaimeenLiittyvaLista(avain);
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
        
        if (indeksi < 0) {
            arvotIndeksissa.add(new Pari(avain, arvo));
            arvoja++;
        } else {
            arvotIndeksissa.get(indeksi).setArvo(arvo);
        }
        
        if (1.0 * this.arvoja / this.arvot.length > 0.75) {
            kasvata();
        }

    }

    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.length);
        if (this.arvot[hajautusArvo] == null) {
            return null;
        }

        ArrayList<Pari<K, V>> arvotIndeksissa = arvot[hajautusArvo];

        for (int i = 0; i < arvotIndeksissa.size(); i++) {
            if (arvotIndeksissa.get(i).getAvain().equals(avain)) {
                return arvotIndeksissa.get(i).getArvo();
            }
        }

        return null;
    }

    private ArrayList<Pari<K, V>> haeAvaimeenLiittyvaLista(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.length);

        if (arvot[hajautusArvo] == null) {
            arvot[hajautusArvo] = new ArrayList<>();
        }

        return arvot[hajautusArvo];
    }

    private int haeAvaimenIndeksi(ArrayList<Pari<K, V>> lista, K avain) {
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAvain().equals(avain)) {
                return i;
            }
        }
        return -1;
        
    }
    
    // Kasvata taulukon koko
    
    private void kasvata() {
        ArrayList<Pari<K,V>>[] uusiLista = new ArrayList[this.arvot.length * 2];
        
        for (int i = 0; i < this.arvoja; i++) {
            kopioi(uusiLista, i);
        }
        
        this.arvot = uusiLista;
        
    }
    
    // Kopioi tiedot uuteen
    
    private void kopioi(ArrayList<Pari<K,V>>[] uusi, int indeksista) {
        for (int i = 0; i < this.arvot[indeksista].size(); i++) {
            Pari<K,V> arvo = this.arvot[indeksista].get(i);
            
            int hajautusArvo = Math.abs(arvo.getAvain().hashCode() % uusi.length);
            if (uusi[hajautusArvo] == null) {
                uusi[hajautusArvo] = new ArrayList<>();
            }
            uusi[hajautusArvo].add(arvo);
            
        }
    }
    
    public V poista(K avain) {
        ArrayList<Pari<K,V>> arvotIndeksissa = haeAvaimeenLiittyvaLista(avain);
        if (arvotIndeksissa.size() == 0) {
            return null;
        }
        
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
        if (indeksi < 0) {
            return null;
        }
        
        Pari<K,V> pari = arvotIndeksissa.get(indeksi);
        arvotIndeksissa.remove(pari);
        return pari.getArvo();
        
    }

}
