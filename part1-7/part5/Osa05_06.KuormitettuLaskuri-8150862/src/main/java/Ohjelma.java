
public class Ohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia

        Laskuri laskuri = new Laskuri(5);
        Laskuri huonolaskuri = new Laskuri();
        System.out.println(laskuri.arvo());
        System.out.println(huonolaskuri.arvo());

        laskuri.lisaa();
        huonolaskuri.lisaa();

        System.out.println(laskuri.arvo());
        System.out.println(huonolaskuri.arvo());
        
        laskuri.vahenna();
        laskuri.vahenna();
        System.out.println(laskuri.arvo());
        laskuri.lisaa(10);
        laskuri.lisaa();
        System.out.println(laskuri.arvo());
        
        laskuri.vahenna(5);
        System.out.println(laskuri.arvo());
        laskuri.vahenna();
        System.out.println(laskuri.arvo());

    }
}
