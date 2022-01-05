
package lentokentta.logiikka;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import lentokentta.domain.Lento;
import lentokentta.domain.Lentokone;
import lentokentta.domain.Paikka;

public class Sovelluslogiikka {
    
    private HashMap<String, Lentokone> lentokoneet;
    private HashMap<String, Lento> lennot;
    private HashMap<String, Paikka> paikat;

    public Sovelluslogiikka() {
        this.lentokoneet = new HashMap<>();
        this.lennot = new HashMap<>();
        this.paikat = new HashMap<>();
        
    }
    
    
    // Hallintamoodi
    
    public void lisaaLentokone(String tunnus, int kapasiteetti) {
        Lentokone lentokone = new Lentokone(tunnus, kapasiteetti);
        this.lentokoneet.put(tunnus, lentokone);   
    }
    
    
    
    public void lisaaLento(Lentokone lentokone, String lahto, String kohde) {
        this.paikat.putIfAbsent(lahto, new Paikka(lahto));
        this.paikat.putIfAbsent(kohde, new Paikka(kohde));
        
        Lento lento = new Lento(lentokone, this.paikat.get(lahto), this.paikat.get(kohde));
        this.lennot.put(lento.toString(), lento);
    }
    
    
    // Hakutoiminnot
    
    public Collection<Lentokone> getLentokoneet() {
        return this.lentokoneet.values();
    }
    
    public Collection<Lento> getLennot() {
        return this.lennot.values();
    }
    
    public Lentokone haeLentokone(String tunnus) {
        return this.lentokoneet.get(tunnus);
    }
    
}
