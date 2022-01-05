
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        Paaohjelma.jarjesta(taulukko);
        System.out.println(Arrays.toString(taulukko));
        
        String[] tekstiTaulukko = {"jeppe", "aleksi", "daddy"};
        Paaohjelma.jarjesta(tekstiTaulukko);
        System.out.println(Arrays.toString(tekstiTaulukko));
        
        ArrayList<Integer> lukuja = new ArrayList<>();
        lukuja.add(5);
        lukuja.add(10);
        lukuja.add(2);
        Paaohjelma.jarjestaLuvut(lukuja);
        System.out.println(lukuja);
        
        ArrayList<String> merkkijonoja = new ArrayList<>();
        merkkijonoja.add("toni");
        merkkijonoja.add("anni");
        merkkijonoja.add("seppo");
        Paaohjelma.jarjestaMerkkijonot(merkkijonoja);
        System.out.println(merkkijonoja);
        
    }
    
    public static void jarjesta(int[] taulukko) {
        Arrays.sort(taulukko);
    }
    
    public static void jarjesta(String[] taulukko) {
        Arrays.sort(taulukko);
    }
    
    public static void jarjestaLuvut(ArrayList<Integer> luvut) {
        Collections.sort(luvut);
    }
    
    public static void jarjestaMerkkijonot(ArrayList<String> merkkijonot) {
        Collections.sort(merkkijonot);
    }

}
