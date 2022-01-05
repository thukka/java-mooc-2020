
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria historia;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.historia = new Muutoshistoria();
        this.historia.lisaa(alkuSaldo);
    }

    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        this.historia.lisaa(super.getSaldo());
    }

    @Override
    public double otaVarastosta(double maara) {
        double ota = super.otaVarastosta(maara);
        this.historia.lisaa(super.getSaldo());
        return ota;
    }

    public String historia() {
        return this.historia.toString();
    }

    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + this.historia());
        System.out.println("Suurin tuotemäärä: " + String.format("%.1f", this.historia.maxArvo()).replace(",", "."));
        System.out.println("Pienin tuotemäärä: " + String.format("%.1f", this.historia.minArvo()).replace(",", "."));
        System.out.println("Keskiarvo: " + String.format("%.1f", this.historia.keskiarvo()).replace(",", "."));
    }

}
