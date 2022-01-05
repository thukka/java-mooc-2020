package mooc;

import mooc.logiikka.Sovelluslogiikka;
import mooc.ui.Kayttoliittyma;
import mooc.ui.Tekstikayttoliittyma;

public class Main {

    public static void main(String[] args) {
        Kayttoliittyma kayttis = new Tekstikayttoliittyma();
        new Sovelluslogiikka(kayttis).suorita(3);
    }
}
