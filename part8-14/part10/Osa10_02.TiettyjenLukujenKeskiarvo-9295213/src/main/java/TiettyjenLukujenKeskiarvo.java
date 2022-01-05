
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> luvut = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) { break; }
            
            luvut.add(syote);
        }
        
        System.out.println("\nTulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String syote = lukija.nextLine();
        if (syote.equals("n")) {
            
            double negaKeskiarvo = luvut.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(i -> i < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Negatiivisten lukujen keskiarvo: " + negaKeskiarvo);
            
        } else if (syote.equals("p")) {
            
            double posiKeskiarvo = luvut.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(i -> i > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Positiivisten lukujen keskiarvo: " + posiKeskiarvo);
            
        }
        

    }
}
