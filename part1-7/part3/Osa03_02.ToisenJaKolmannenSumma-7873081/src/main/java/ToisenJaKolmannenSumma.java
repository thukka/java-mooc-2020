
import java.util.ArrayList;
import java.util.Scanner;

public class ToisenJaKolmannenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            //System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            }
            
            luvut.add(luku);
        }
       // System.out.println("Toisen ja kolmannen arvon summa on:");
        System.out.println(luvut.get(1) + luvut.get(2));
    }
}
