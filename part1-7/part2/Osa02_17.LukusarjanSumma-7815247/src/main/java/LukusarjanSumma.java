
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Mihin asti? ");
        int asti = Integer.valueOf(lukija.nextLine());
        int summa = 0;
        
        for (int i = 1; i <= asti; i++) {
            summa = summa + i;
        }
        
        System.out.println("Summa on " + summa);

    }
}
