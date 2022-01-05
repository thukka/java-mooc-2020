package lentokentta;

import java.util.Scanner;
import lentokentta.ui.Kayttoliittyma;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma ui = new Kayttoliittyma(lukija);
        ui.kaynnistaHallinta();
        ui.kaynnistaLentopalvelu();
    }
}
