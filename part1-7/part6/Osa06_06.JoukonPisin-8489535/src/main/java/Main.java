
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Joukko j = new Joukko("hahmot");
        System.out.println("Pisin: " + j.pisin());
        
        j.lisaa("magnetoooooooooooooo");
        j.lisaa("mystique");
        j.lisaa("phoenix");
        
        System.out.println("Pisin: " + j.pisin());
        
    }
}
