
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        Lista<String> lista = new Lista<>();
        System.out.println(lista.sisaltaa("hei"));
        lista.lisaa("hei");
        System.out.println(lista.sisaltaa("hei"));
        System.out.println("Sijaitsee indeksissä: " + lista.arvonIndeksi("hei"));
        System.out.println("Indeksin arvo eli sisältö: " + lista.arvo(0));
        System.out.println("Listan koko: " + lista.koko());
        lista.poista("hei");
        System.out.println(lista.sisaltaa("hei"));
        System.out.println("Listan koko: " + lista.koko());
    }

}
