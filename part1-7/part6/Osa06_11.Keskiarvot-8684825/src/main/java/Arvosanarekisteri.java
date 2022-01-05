
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> koepistelista;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.koepistelista = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.koepistelista.add(pisteet);
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double arvosanojenKeskiarvo() {
        
        if (arvosanat.isEmpty()) {
            return -1;
        }
        
        int yhteensa = 0;
        int lkm = 0;
        for (Integer i : arvosanat) {
            yhteensa+=i;
            lkm++;
        }
        return (double) yhteensa / lkm;
    }
    
    public double koepisteidenKeskiarvo() {
        if (koepistelista.isEmpty()) {
            return -1;
        }
        
        int yhteensa = 0;
        int lkm = 0;
        
        for (Integer koepiste : koepistelista) {
            yhteensa+=koepiste;
            lkm++;
        }
        
        return (double) yhteensa / lkm;
    }
}
