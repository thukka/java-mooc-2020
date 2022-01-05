
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap<String, String> taulu = new HashMap<>();
        taulu.put("matti", "mage");
        taulu.put("mikael", "mixu");
        taulu.put("arto", "arppa");
        
        System.out.println(taulu.get("mikael"));
        
    }

}
