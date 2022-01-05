
public class Main {

    public static void main(String[] args) {
        // Testaa koodiasi täällä!
        
        Sivari toni = new Sivari();
        System.out.println(toni.paiviaJaljella());
        toni.palvele();
        System.out.println(toni.paiviaJaljella());
        
        System.out.println("");
        Asevelvollinen anni = new Asevelvollinen(180);
        System.out.println(anni.paiviaJaljella());
        anni.palvele();
        System.out.println(anni.paiviaJaljella());
    }
}
