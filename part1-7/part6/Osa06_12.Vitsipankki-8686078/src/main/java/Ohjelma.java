
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        Vitsipankki pankki = new Vitsipankki();
        Kayttoliittyma ui = new Kayttoliittyma(pankki, lukija);
        ui.kaynnista();
        
    
        }
    }
