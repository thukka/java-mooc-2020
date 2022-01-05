
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Lahjan suuruus?");
        int lahjasumma = Integer.valueOf(lukija.nextLine());

        if (lahjasumma < 5000) {
            System.out.println("Ei veroa!");
        } else if (lahjasumma >= 5000 && lahjasumma < 25000) {
            System.out.println("Vero: " + (100 + (lahjasumma - 5000) * 0.08));
        } else if (lahjasumma >= 25000 && lahjasumma < 55000) {
            System.out.println("Vero: " + (1700 + (lahjasumma - 25000) * 0.10));
        } else if (lahjasumma >= 55000 && lahjasumma < 200000) {
            System.out.println("Vero: " + (4700 + (lahjasumma - 55000) * 0.12));
        } else if (lahjasumma >= 200000 && lahjasumma < 1000000) {
            System.out.println("Vero: " + (22100 + (lahjasumma - 200000) * 0.15));
        } else {
            System.out.println("Vero: " + (142100 + (lahjasumma - 1000000) * 0.17));
        }

    }
}
