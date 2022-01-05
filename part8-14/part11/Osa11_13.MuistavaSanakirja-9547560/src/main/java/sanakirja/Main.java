package sanakirja;

public class Main {

    public static void main(String[] args) {
        // Testaa sanakirjaa täällä

        MuistavaSanakirja s = new MuistavaSanakirja("sanat-3980.txt");
        s.lataa();
        s.poista("below");
        s.lisaa("tieokone", "computer");
        s.tallenna();

    }
}
