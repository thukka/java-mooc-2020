
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Etunimi: ");
            String etunimi = String.valueOf(lukija.nextLine());

            if (etunimi.isEmpty()) {
                break;
            }

            System.out.print("Sukunimi: ");
            String sukunimi = String.valueOf(lukija.nextLine());
            System.out.print("Henkilötunnus: ");
            String henkilotunnus = String.valueOf(lukija.nextLine());

            henkilotiedot.add(new Henkilotieto(etunimi, sukunimi, henkilotunnus));
        }
        System.out.println("");
        for (Henkilotieto i : henkilotiedot) {
            System.out.println(i.getEtunimi() + " " + i.getSukunimi());
        }
    }
}
