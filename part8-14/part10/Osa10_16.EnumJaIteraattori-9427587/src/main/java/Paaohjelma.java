
import java.util.ArrayList;
import java.util.List;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        
        Tyontekijat tyolaiset = new Tyontekijat();
        Henkilo toni = new Henkilo("Toni", Koulutus.FM);
        Henkilo anni = new Henkilo("Anni", Koulutus.FT);
        Henkilo seppo = new Henkilo("Seppo", Koulutus.FilYO);
        List<Henkilo> henkilot = new ArrayList<>();
        henkilot.add(toni);
        henkilot.add(anni);
        henkilot.add(seppo);

        tyolaiset.lisaa(henkilot);
        tyolaiset.tulosta();
        tyolaiset.irtisano(Koulutus.FilYO);
        System.out.println("---");
        tyolaiset.tulosta();
        System.out.println("---");
        tyolaiset.tulosta(Koulutus.FT);
        
        
        
    }
}
