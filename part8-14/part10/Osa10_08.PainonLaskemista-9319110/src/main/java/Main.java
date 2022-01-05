

public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        Tavara banaani = new Tavara("Banaani", 1);
        Tavara mango = new Tavara("Mango", 2);
        Matkalaukku laukku = new Matkalaukku(10);
        
        laukku.lisaaTavara(banaani);
        laukku.lisaaTavara(mango);
        laukku.tulostaTavarat();
        System.out.println("laukun 1 yhteispaino on " + laukku.yhteispaino());
        
        System.out.println("------");
        Matkalaukku laukku2 = new Matkalaukku(11);
        laukku2.lisaaTavara(mango);
        laukku2.lisaaTavara(mango);
        System.out.println("Laukku 2 sisältö ");
        laukku2.tulostaTavarat();
        System.out.println("laukku 2 paino " + laukku2.yhteispaino());
        
        System.out.println("------");
        Lastiruuma laiva = new Lastiruuma(100);
        laiva.lisaaMatkalaukku(laukku);
        laiva.lisaaMatkalaukku(laukku2);
        System.out.println("Laivan lastiruuma: " + laiva.yhteispaino());
        System.out.println(laiva);
        
        System.out.println("----");
        laiva.tulostaTavarat();
    }

}
