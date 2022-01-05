
import java.util.HashMap;


public class Lyhenteet {
    
    private HashMap<String, String> lyhenteet;

    public Lyhenteet() {
        this.lyhenteet = new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyhenne, String selite) {
        this.lyhenteet.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        return this.lyhenteet.containsKey(lyhenne);
    }
    
    public String haeLyhenne(String lyhenne) {
        if (this.lyhenteet.containsKey(lyhenne) == false) {
            return null;
        } else {
            return this.lyhenteet.get(lyhenne);
        }
    }
    
}
