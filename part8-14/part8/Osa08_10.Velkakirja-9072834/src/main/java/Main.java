
public class Main {

    public static void main(String[] args) {
        // Testaa ohjelmaasi täällä
        Velkakirja matinVelkakirja = new Velkakirja();
        matinVelkakirja.asetaLaina("Arto", 51.5);
        matinVelkakirja.asetaLaina("Mikael", 30);
        System.out.println(matinVelkakirja.paljonkoVelkaa("Arto"));
        System.out.println(matinVelkakirja.paljonkoVelkaa("Mikael"));
        matinVelkakirja.asetaLaina("Mikael", 20);
        System.out.println("Mikaelin uusi velka: " + matinVelkakirja.paljonkoVelkaa("Mikael"));
    }
}
