package lentokentta.ui;

import java.util.Scanner;
import lentokentta.logiikka.Sovelluslogiikka;
import lentokentta.domain.Lentokone;
import lentokentta.domain.Lento;

public class Kayttoliittyma {

    private Scanner lukija;
    private Sovelluslogiikka logiikka;

    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.logiikka = new Sovelluslogiikka();
    }

    // Hallinta
    public void kaynnistaHallinta() {
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Lisää lentokone");
            System.out.println("[2] Lisää lento");
            System.out.println("[x] Poistu hallintamoodista");
            System.out.print("> ");
            String syote = lukija.nextLine();
            if (syote.equals("1")) {
                lisaaLentokone();
            } else if (syote.equals("2")) {
                lisaaLento();
            } else if (syote.equals("x")) {
                break;
            }

        }

    }

    // Lennot
    public void kaynnistaLentopalvelu() {
        System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Tulosta lentokoneet");
            System.out.println("[2] Tulosta lennot");
            System.out.println("[3] Tulosta lentokoneen tiedot");
            System.out.println("[x] Lopeta");
            System.out.print("> ");
            String syote = lukija.nextLine();
            if (syote.equals("1")) {
                tulostaLentokoneet();
            } else if (syote.equals("2")) {
                tulostaLennot();
            } else if (syote.equals("3")) {
                tulostaLentokoneentiedot();
            } else if (syote.equals("x")) {
                break;
            }
        }
    }

// Tulostukset
    public void tulostaLentokoneet() {
        for (Lentokone i : logiikka.getLentokoneet()) {
            System.out.println(i);
        }
    }

    public void tulostaLennot() {
        for (Lento i : logiikka.getLennot()) {
            System.out.println(i);
            System.out.println();
        }
        
    }

    public void tulostaLentokoneentiedot() {
        System.out.print("Mikä kone: ");
        Lentokone kone = kysyLentokone();
        System.out.println(kone);
        System.out.println();
    }

// Toiminnot
    public void lisaaLentokone() {
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(lukija.nextLine());
        logiikka.lisaaLentokone(tunnus, kapasiteetti);
    }

    public void lisaaLento() {
        System.out.print("Anna lentokoneen tunnus: ");
        Lentokone konee = kysyLentokone();
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahtopaikka = lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohdepaikka = lukija.nextLine();
        logiikka.lisaaLento(konee, lahtopaikka, kohdepaikka);
    }

    public Lentokone kysyLentokone() {
        Lentokone lentokone = null;

        while (lentokone == null) {
            String tunnus = lukija.nextLine();
            lentokone = logiikka.haeLentokone(tunnus);

            if (lentokone == null) {
                System.out.println("Tunnuksella " + tunnus + " ei ole lentokonetta.");
            }
        }

        return lentokone;
    }

}
