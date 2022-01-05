

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {

    private Map<String, Integer> varastoHinta;
    private Map<String, Integer> varastoSaldo;

    public Varasto() {
        this.varastoHinta = new HashMap<>();
        this.varastoSaldo = new HashMap<>();
    }

    public void lisaaTuote(String nimi, int hinta, int saldo) {
        this.varastoHinta.put(nimi, hinta);
        this.varastoSaldo.put(nimi, saldo);
    }

    public int hinta(String tuote) {
        if (this.varastoHinta.containsKey(tuote)) {
            return this.varastoHinta.get(tuote);
        }
        return -99;
    }

    public int saldo(String tuote) {
        if (this.varastoSaldo.containsKey(tuote)) {
            return this.varastoSaldo.get(tuote);
        }
        return 0;
    }

    public boolean ota(String tuote) {
        int nykySaldo;
        if (varastoSaldo.containsKey(tuote) && varastoSaldo.get(tuote) > 0) {
            nykySaldo = varastoSaldo.get(tuote);
            nykySaldo = nykySaldo - 1;
            varastoSaldo.put(tuote, nykySaldo);
            return true;
        }
        return false;
    }
    
    public Set<String> tuotteet() {
        
        return varastoHinta.keySet();
        
    }

}
