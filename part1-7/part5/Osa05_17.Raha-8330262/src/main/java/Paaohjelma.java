
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne koodia jolla testaat ohjelmoimasi luokan toimintaa

        Raha a = new Raha(10, 0);
        Raha b = new Raha(3, 50);

        Raha c = a.miinus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e
//
//        c = c.miinus(a);        // HUOM: tässä syntyy uusi Raha-olio, joka laitataan "c:n langan päähän"
////       vanha c:n langan päässä ollut 6.5 euroa häviää ja Javan roskien kerääjä korjaa sen pois
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 0.00e
//        
//        
        Raha r1 = new Raha(1,50);
        Raha r2 = new Raha(2,0);
        Raha r3 = r1.miinus(r2);
        System.out.println(r3);
        System.out.println(r3.sentit());
        // expected 0 but was 10
        // System.out.println(r1.vahemman(r3));

    }
}
