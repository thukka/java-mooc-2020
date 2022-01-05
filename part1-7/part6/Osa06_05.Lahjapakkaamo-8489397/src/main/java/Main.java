
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        
        Lahja kirja = new Lahja("Aapiskukko", 2);
        
        System.out.println("Lahjan nimi: " + kirja.getNimi());
        System.out.println("Lahjan paino: " + kirja.getPaino());
        
        System.out.println("Lahja: " + kirja);
        Pakkaus uusipakkaus = new Pakkaus();
        uusipakkaus.lisaaLahja(kirja);
        System.out.println(uusipakkaus.yhteispaino());
        Lahja lotr = new Lahja("Lord of the Rings", 4);
        uusipakkaus.lisaaLahja(lotr);
        System.out.println(uusipakkaus.yhteispaino());
    }
}
