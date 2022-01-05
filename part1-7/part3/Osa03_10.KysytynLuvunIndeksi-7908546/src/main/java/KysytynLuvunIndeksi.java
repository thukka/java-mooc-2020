
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

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

        // toteuta tänne toiminnallisuus luvun etsimiseen
        System.out.println("Mitä etsitään?");
        int etsittavaLuku = Integer.valueOf(lukija.nextLine());
        int loppu = lista.size() - 1;
        int indeksi = 0;

        System.out.println("");

        while (indeksi <= loppu) {

            if (etsittavaLuku == lista.get(indeksi)) {
                System.out.println("Luku " + etsittavaLuku + " on indeksissä " + indeksi);
            }
            indeksi++;
        }
    }
}
