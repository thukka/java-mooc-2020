
import java.util.ArrayList;
import java.util.Collections;

public class Taikanelio {

    private int[][] nelio;

    // valmis konstruktori
    public Taikanelio(int koko) {
        if (koko < 2) {
            koko = 2;
        }

        this.nelio = new int[koko][koko];
//        nelio[0][0] = 8;
//        nelio[0][1] = 1;
//        nelio[0][2] = 6;
//        nelio[1][0] = 3;
//        nelio[1][1] = 5;
//        nelio[1][2] = 7;
//        nelio[2][0] = 1;
//        nelio[2][1] = 10;
//        
//        System.out.println("test " + lavistajienSummat());
    }

    // toteuta nämä kolme metodia
    public ArrayList<Integer> rivienSummat() {
        ArrayList<Integer> summat = new ArrayList<>();
        int sisaSumma;
        
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            sisaSumma = 0;
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                sisaSumma += nelio[rivi][sarake];
            }
            summat.add(sisaSumma);
        }
        
        
        return summat;
    }

    public ArrayList<Integer> sarakkeidenSummat() {
        ArrayList<Integer> summat = new ArrayList<>();
        int sisaSumma;
        
        for (int sarake = 0; sarake < nelio.length; sarake++) {
            sisaSumma = 0;
            for (int rivi = 0; rivi < nelio[sarake].length; rivi++) {
                sisaSumma += nelio[rivi][sarake];
            }
            summat.add(sisaSumma);
        }
        
        return summat;
        
    }

    public ArrayList<Integer> lavistajienSummat() {
        ArrayList<Integer> summat = new ArrayList<>();
        int sisaSumma = 0;
        
        for (int i = 0; i < nelio.length; i++) {
            sisaSumma += nelio[i][i];
        }
        summat.add(sisaSumma);
        sisaSumma = 0;
        int xx = 0;
        for (int i = (nelio.length -1); i >= 0; i--) {
            sisaSumma += nelio[i][xx];
            xx++;
        }
        summat.add(sisaSumma);
        
        return summat;
    }

    // valmiit apumetodit -- älä koske näihin
    public boolean onTaikanelio() {
        return summatSamat() && kaikkiNumerotEri();
    }

    public ArrayList<Integer> annaKaikkiNumerot() {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                numerot.add(nelio[rivi][sarake]);
            }
        }

        return numerot;
    }

    public boolean kaikkiNumerotEri() {
        ArrayList<Integer> numerot = annaKaikkiNumerot();

        Collections.sort(numerot);
        for (int i = 1; i < numerot.size(); i++) {
            if (numerot.get(i - 1) == numerot.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean summatSamat() {
        ArrayList<Integer> summat = new ArrayList<>();
        summat.addAll(rivienSummat());
        summat.addAll(sarakkeidenSummat());
        summat.addAll(lavistajienSummat());

        if (summat.size() < 3) {
            return false;
        }

        for (int i = 1; i < summat.size(); i++) {
            if (summat.get(i - 1) != summat.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int annaArvo(int x, int y) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return - 1;
        }

        return this.nelio[y][x];
    }

    public void asetaArvo(int x, int y, int arvo) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return;
        }

        this.nelio[y][x] = arvo;
    }

    public int getLeveys() {
        return this.nelio.length;
    }

    public int getKorkeus() {
        return this.nelio.length;
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]).append("\t");
            }

            palautus.append("\n");
        }

        return palautus.toString();
    }
}
