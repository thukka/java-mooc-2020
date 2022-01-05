
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        System.out.println("");

        // toteuta listan suurimman luvun selvittäminen tänne
        
        int suurin = lista.get(0);
        
        for (int i = 0; i < lista.size(); i++) { // i = 0 jota verrataan listan pituuteen, kasvatetaan yhdellä per kiekka
            int luku = lista.get(i);             // lukuun tulee muuttujan i arvo, eli ekalla kierroksella 0 ja siitä eteenpäin 1,2, jne
            if (suurin < luku) {                 // onko listan eka arvo pienempi kuin muuttuja i, jos ei, kasvatetaan i yhdellä ja verrataan uudestaan
                suurin = luku;                   // jos on, lisätään sen arvo suurin-muuttujalle
            }
        }
        
        System.out.println("Listan suurin luku: " + suurin);
    }
}
