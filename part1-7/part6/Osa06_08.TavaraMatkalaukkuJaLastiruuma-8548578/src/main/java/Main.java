
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        
        Tavara kirja = new Tavara("Lord of the rings", 2);
        Tavara nokia = new Tavara("Nokia 3310", 1);
        Tavara tiiliskivi = new Tavara("Tiiliskivi", 10);
        
        Matkalaukku loma = new Matkalaukku(10);
        
        loma.lisaaTavara(tiiliskivi);
        
        Lastiruuma laiva = new Lastiruuma(9);
        laiva.lisaaMatkalaukku(loma);
        
        System.out.println("Matkalaukussa on: " + loma);
        System.out.println("Laivassa on : " + laiva);
    }

}
