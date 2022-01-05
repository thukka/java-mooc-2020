
    import java.util.List;
    import java.util.ArrayList;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        Opiskelija eka = new Opiskelija("jamo");
        Opiskelija toka = new Opiskelija("jamo1");
        Opiskelija kolmas = new Opiskelija("Aatu");
        System.out.println(eka.compareTo(toka));
        
        List<Opiskelija> opiskelijat = new ArrayList<>();
        opiskelijat.add(eka);
        opiskelijat.add(toka);
        opiskelijat.add(kolmas);
        System.out.println(opiskelijat);
        Collections.sort(opiskelijat);
        System.out.println(opiskelijat);
        
    }
}
