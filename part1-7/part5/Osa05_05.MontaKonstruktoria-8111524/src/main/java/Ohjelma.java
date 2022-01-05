
public class Ohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

//        Esine testi = new Esine("ripulimiekka");
//        Esine testi2 = new Esine("kakkapökäle", "Aurinko");
//        Esine testi3 = new Esine("pippeli", 5);
//
//        System.out.println(testi);
//        System.out.println(testi2);
//        System.out.println(testi3);

        Esine mitta = new Esine("Mitta");
        Esine laasti = new Esine("Laasti", "remonttitavarat");
        Esine rengas = new Esine("Rengas", 5);

        System.out.println(mitta);
        System.out.println(laasti);
        System.out.println(rengas);
    }
}
