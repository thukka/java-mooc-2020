
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        Collections.sort(numerot);
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        Random random = new Random();
        while (this.numerot.size() < 7) {
            int numero = random.nextInt(40) + 1;
            if (!sisaltaaNumeron(numero)) {
                this.numerot.add(numero);
            }
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        for (Integer i : numerot) {
            if (i == numero) {
                return true;
            }
        }
        return false;
    }
}
