
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Random randominator = new Random();
        System.out.println("Montako satunnaislukua tulostetaan?");
        int montako = Integer.valueOf(lukija.nextLine());
        
        
        for (int i = 0; i < montako; i++) {
            System.out.println(randominator.nextInt(11));
        }
        
    }

}
