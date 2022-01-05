
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 9999) {
                break;
            }
            lista.add(luku);

        }

        System.out.println("");
        int indeksi = 0;
        int listanLoppu = lista.size() - 1;
        int pieninLuku = lista.get(0);

        // System.out.println("Luku on " + lista.get(indeksi) + "ja indeksi on " + indeksi);
        for (int i = indeksi; i <= listanLoppu; i++) {

            if (pieninLuku > lista.get(indeksi)) {
                pieninLuku = lista.get(indeksi);

            }
            indeksi++;
        }
        System.out.println("Pienin luku on " + pieninLuku);
        
        for (int n = 0; n <= listanLoppu; n++) {
            
            if (pieninLuku == lista.get(n)) {
                System.out.println("Pienin luku löytyy indeksistä " + n);
            }
        }

    }
}
