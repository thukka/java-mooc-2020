
import java.util.ArrayList;


public class Hakukone {
    private ArrayList<Resepti> reseptilista;

    public Hakukone(ArrayList<Resepti> reseptilista) {
        this.reseptilista = reseptilista;
    }
    
    
    
    public void haeNimella(String haettava) {
        System.out.println("");
        for (Resepti i : reseptilista) {
            if (i.getNimi().toLowerCase().contains(haettava.toLowerCase())) {
                System.out.println(i);
            }
        }
        System.out.println("");
        
    }
    
    public void haeKeittoajalla(String haettava) {
        System.out.println("");
        for (Resepti i : reseptilista) {
            if (i.getAika() <= Integer.valueOf(haettava)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
    
    public void haeRaakaAine(String haettava) {
        System.out.println("");
        for (Resepti i : reseptilista) {
            if (i.getRaakaAineet().contains(haettava)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }
    
    
    
}
