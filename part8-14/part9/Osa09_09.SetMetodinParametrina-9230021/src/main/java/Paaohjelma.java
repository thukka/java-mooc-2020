
import java.util.HashSet;
import java.util.Set;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
        
        Set<String> nimet = new HashSet<>();
        
        nimet.add("toni");
        nimet.add("tonttel");
        nimet.add("tontelloni");
        System.out.println(palautaKoko(nimet));

    }

    // toteuta tänne metodi palautaKoko, joka palauttaa parametrina 
    // saamansa set-olion alkioiden lukumäärän
    
    public static int palautaKoko(Set setti) {
        return setti.size();
    }

}
