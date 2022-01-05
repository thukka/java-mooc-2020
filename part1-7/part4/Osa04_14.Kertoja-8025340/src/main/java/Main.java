
public class Main {

    public static void main(String[] args) {
        // Tämä on vain tyhjä main-metodi jossa voit kokeilla luokkasi toimintaa.
        // esimerkiksi: 

        // Kertoja kolmellaKertoja = new Kertoja(3);
        // System.out.println(kolmellaKertoja.kerro(5));
        
        Kertoja kolmella = new Kertoja(3);
        System.out.println("kolmella " + kolmella.kerro(4));
        
        Kertoja neljalla = new Kertoja(4);
        System.out.println("Neljällä " + neljalla.kerro(5));
    }
}
