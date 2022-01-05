
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
//
//        Lukutilasto tilasto = new Lukutilasto();
//        tilasto.lisaaLuku(3);
//        tilasto.lisaaLuku(5);
//        tilasto.lisaaLuku(1);
//        tilasto.lisaaLuku(2);
//        System.out.println("Määrä: " + tilasto.haeLukujenMaara());
//        System.out.println("Summa: " + tilasto.summa());
//        System.out.println("Keskiarvo: " + tilasto.keskiarvo());
//        
//        
//        System.out.println("");

        Lukutilasto syotteenLuvut = new Lukutilasto();
        Lukutilasto parillistenSumma = new Lukutilasto();
        Lukutilasto parittomienSumma = new Lukutilasto();

        System.out.println("Anna lukuja:");
        while (true) {
            int syote = Integer.valueOf(lukija.nextLine());

            if (syote == -1) {
                break;
            }
            syotteenLuvut.lisaaLuku(syote);

            if (syote % 2 == 0) {
                parillistenSumma.lisaaLuku(syote);
            } else {
                parittomienSumma.lisaaLuku(syote);
            }
        }
        System.out.println("Summa: " + syotteenLuvut.summa());
        System.out.println("Parillisten summa: " + parillistenSumma.summa());
        System.out.println("Parittomien summa: " + parittomienSumma.summa());
    }
}
