
public class Main {

    public static void main(String[] args) {
        // Kokeile luokkaasi täällä

        Huone h = new Huone();
        Henkilo eka = new Henkilo("eka", 62);
        Henkilo toka = new Henkilo("toka", 59);
        Henkilo kolmas = new Henkilo("kolmas", 104);
        Henkilo neljas = new Henkilo("neljas", 61);

        h.lisaa(eka);
        h.lisaa(toka);
        h.lisaa(kolmas);
        h.lisaa(neljas);

        while (!h.onTyhja()) {
            System.out.println(h.ota());
        }

    }
}
