
public class Main {

    public static void main(String[] args) {

        // Kokeile luokkaasi täällä
        Viesti testi = new Viesti("Toni", "Moi toimiiks");
        Viesti testi2 = new Viesti("Anni", "oon paras");
        
        System.out.println(testi);
        Viestipalvelu uusiViestipalvelu = new Viestipalvelu();
        uusiViestipalvelu.lisaa(testi);
        uusiViestipalvelu.lisaa(testi2);
        System.out.println(uusiViestipalvelu.getViestit());
    }
}
