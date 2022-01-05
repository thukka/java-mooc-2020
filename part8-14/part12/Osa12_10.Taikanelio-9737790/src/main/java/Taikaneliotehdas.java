
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);

        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        int korkeus = 0;
        int leveys = (nelio.getLeveys() / 2) - (int) 0.5; // keskipaikka
        int alkupKorkeus = 0;
        int alkupLeveys = 0;

        nelio.asetaArvo(leveys, korkeus, 1);

        for (int i = 2; i <= nelio.getLeveys() * nelio.getKorkeus(); i++) {
            alkupKorkeus = korkeus;
            korkeus--;
            if (korkeus < 0) {
                korkeus = nelio.getKorkeus() - 1;
            }

            alkupLeveys = leveys;
            leveys++;
            if (leveys > nelio.getLeveys() - 1) {
                leveys = 0;
            }

            if (nelio.annaArvo(leveys, korkeus) > 0) {
                alkupKorkeus++;
                nelio.asetaArvo(alkupLeveys, alkupKorkeus, i);
                korkeus = alkupKorkeus;
                leveys = alkupLeveys;
                continue;
            }

            nelio.asetaArvo(leveys, korkeus, i);

        }

        return nelio;
    }

}
