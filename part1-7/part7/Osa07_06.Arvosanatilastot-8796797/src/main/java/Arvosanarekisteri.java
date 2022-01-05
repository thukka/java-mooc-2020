
import java.util.ArrayList;

public class Arvosanarekisteri {
    private ArrayList<Integer> pisteet;

    public Arvosanarekisteri() {
        this.pisteet = new ArrayList<>();
    }
    
    public void lisaaPisteet(int pisteet) {
        this.pisteet.add(pisteet);
    }
    
    // Kaikkien pisteiden keskiarvo
    public void tulostaKeskiarvo() {
        int yhteensa = 0;
        int indeksi = 0;
        for (Integer i : pisteet) {
            yhteensa+=i;
            indeksi++;
        }
        
        System.out.println("Pisteiden keskiarvo (kaikki): " + (double) yhteensa/indeksi);
    }
    
    // Hyväksyttyjen arvosanojen keskiarvo
    public void hyvaksytytKeskiarvo() {
        int yhteensa = 0;
        int indeksi = 0;
        int osallistujat = 0;
        for (Integer i : pisteet) {
            if (i >= 50) {
                yhteensa+=i;
                indeksi++;
            }
           osallistujat++;
        }
        
        if (indeksi == 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + (double) yhteensa / indeksi);
        }
        System.out.println("Hyväksymisprosentti: " + (100 * (double) indeksi / osallistujat));
    }
    
    // Tulosta arvosanat tähtinä
    public void tulostaArvosanat() {
        int hylatty = 0;
        int yksi = 0;
        int kaksi = 0;
        int kolme = 0;
        int nelja = 0;
        int viisi = 0;
        
        for (Integer i : pisteet) {
            if (i < 50) {
                hylatty++;
            } else if (i < 60) {
                yksi++;
            } else if (i < 70) {
                kaksi++;
            } else if (i < 80) {
                kolme++;
            } else if ( i < 90) {
                nelja++;
            } else {
                viisi++;
            } 
        }
        
        System.out.print("Arvosanajakauma:\n" + "5: ");
        this.tahtia(viisi);
        System.out.println("");
        System.out.print("4: ");
        this.tahtia(nelja);
        System.out.println("");
        System.out.print("3: ");
        this.tahtia(kolme);
        System.out.println("");
        System.out.print("2: ");
        this.tahtia(kaksi);
        System.out.println("");
        System.out.print("1: ");
        this.tahtia(yksi);
        System.out.println("");
        System.out.print("0: ");
        this.tahtia(hylatty);
        
        
    }
    
    public void tahtia(int maara) {
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
        }
    }
    
    
}
