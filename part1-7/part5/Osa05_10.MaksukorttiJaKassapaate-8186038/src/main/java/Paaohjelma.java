
public class Paaohjelma {

    public static void main(String[] args) {
        Kassapaate unicafeExactum = new Kassapaate();
        System.out.println(unicafeExactum);

        Maksukortti toninKortti = new Maksukortti(2);
        System.out.println("kortilla rahaa " + toninKortti.saldo() + " euroa");

        boolean onnistuiko = unicafeExactum.syoMaukkaasti(toninKortti);
        System.out.println("riittikö raha: " + onnistuiko);

        unicafeExactum.lataaRahaaKortille(toninKortti, 100);
        onnistuiko = unicafeExactum.syoMaukkaasti(toninKortti);
        System.out.println("riittikö raha: " + onnistuiko);
        System.out.println("kortilla rahaa " + toninKortti.saldo() + " euroa");
        System.out.println(unicafeExactum);

    }
}
