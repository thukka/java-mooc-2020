
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class TehtavienhallintaTest {

    private Tehtavienhallinta hallinta;
    
    @Before
    public void alusta() {
        this.hallinta = new Tehtavienhallinta();
    }

    @Test
    public void tehtavalistaAlussaTyhja() {
        assertEquals(0, hallinta.tehtavalista().size());
    }

    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }

    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
    
    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        hallinta.lisaa("Uusi tehtava");
        hallinta.merkkaaTehdyksi("Uusi tehtava");
        assertTrue(hallinta.onTehty("Uusi tehtava"));
    }
    
    @Test
    public void tehdyksiMerkkaamatonEiOleTehty() {
        hallinta.lisaa("Uusi tehtava");
        hallinta.merkkaaTehdyksi("Uusi tehtava");
        assertFalse(hallinta.onTehty("Joku tehtava"));
    }
    
    @Test
    public void poistuikoTehtava() {
        hallinta.lisaa("Testi");
        hallinta.poista("Testi");
        assertTrue(hallinta.tehtavalista().contains("Testi"));
    }

}
