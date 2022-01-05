 
import java.util.ArrayList;
 
 
public class LintuTietokanta {
    
    private ArrayList<Lintu> linnut;
 
    public LintuTietokanta() {
        this.linnut = new ArrayList<>();
    }
    
    public void lisaa(Lintu lintu) {
        this.linnut.add(lintu);
    }
    
//    public ArrayList<Lintu> Tilasto() {
//        return this.linnut;
//    }
    
    public void tilasto() {
        for (Lintu i : linnut) {
            System.out.println(i);
        }
    }
    
    public void havainto(String nimi) {
        boolean loytyiko = false;
        for (Lintu i : linnut) {
            if (nimi.equals(i.getNimi())) {
                i.setHavainnot();
                loytyiko = true;
            }
        }
        
        if (loytyiko == false) {
            System.out.println("Ei ole lintu!");
        }
    }
    
    public void nayta(String nimi) {
        for (Lintu i : linnut) {
            if (i.getNimi().equals(nimi)) {
                System.out.println(i);
            }
        }
    }
    
    public void koko() {
        System.out.println(this.linnut.size());
    }
    
    
}
 