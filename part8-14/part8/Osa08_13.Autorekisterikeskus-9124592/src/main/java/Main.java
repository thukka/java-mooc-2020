
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // alla sama esimerkkiohjelma mikä 9.1:n tehtävämääritelmästä löytyy
        
        Rekisterinumero rek1 = new Rekisterinumero("FI", "ABC-123");
        Rekisterinumero rek2 = new Rekisterinumero("FI", "UXE-465");
        Rekisterinumero rek3 = new Rekisterinumero("D", "B WQ-431");

        ArrayList<Rekisterinumero> suomalaiset = new ArrayList<>();
        suomalaiset.add(rek1);
        suomalaiset.add(rek2);

        Rekisterinumero uusi = new Rekisterinumero("FI", "ABC-123");
        if (!suomalaiset.contains(uusi)) {
            suomalaiset.add(uusi);
        }
        System.out.println("suomalaiset: " + suomalaiset);
        // jos equals-metodia ei ole ylikirjoitettu, menee sama rekisterinumero toistamiseen listalle

        HashMap<Rekisterinumero, String> omistajat = new HashMap<>();
        omistajat.put(rek1, "Arto");
        omistajat.put(rek3, "Jürgen");

        System.out.println("omistajat:");
        System.out.println(omistajat.get(new Rekisterinumero("FI", "ABC-123")));
        System.out.println(omistajat.get(new Rekisterinumero("D", "B WQ-431")));
        // jos hashCode ei ole ylikirjoitettu, eivät omistajat löydy
        System.out.println("");
        Ajoneuvorekisteri rekisteri = new Ajoneuvorekisteri();
        System.out.println(rekisteri.lisaa(rek2, "Tonttel"));
        System.out.println(rekisteri.lisaa(rek2, "Tonttel"));
        System.out.println(rekisteri.hae(rek2));
        System.out.println(rekisteri.lisaa(rek3, "Anni"));
        System.out.println(rekisteri.lisaa(uusi, "Tonttel"));
        System.out.println("");
        rekisteri.tulostaRekisterinumerot();
        System.out.println("");
        rekisteri.tulostaOmistajat();
        
        
        
    }
}
