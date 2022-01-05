
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        
        Hajautustaulu taulu = new Hajautustaulu();
        
        taulu.lisaa("toni", "tonttelson");
        System.out.println(taulu.hae("toni"));
        taulu.lisaa("anni", "annelson");
        taulu.lisaa("joni", 5);
        taulu.lisaa("seppo", "seppolsson");
        taulu.lisaa("mona", "jokke");
        System.out.println("hash: " + taulu.hashArvo("toni"));
        System.out.println("taulun koko " + taulu.getArvoja());
    }

}
