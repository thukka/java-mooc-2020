package sanakirja;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class MuistavaSanakirja {

    private HashMap<String, String> sanakirja;
    private String tiedostonimi;

    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto) {
        this.tiedostonimi = tiedosto;
        this.sanakirja = new HashMap<>();
    }

    public boolean lataa() {
        try ( Scanner skanneri = new Scanner(Paths.get(this.tiedostonimi))) {
            while (skanneri.hasNextLine()) {
                String rivi = skanneri.nextLine();
                String[] osat = rivi.split(":");
                this.sanakirja.put(osat[0], osat[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean tallenna() {

        try {
            PrintWriter kirjoittaja = new PrintWriter(tiedostonimi);
            //if (!sanakirja.isEmpty()) {
                for (String avain : sanakirja.keySet()) {
                    kirjoittaja.println(avain + ":" + sanakirja.get(avain));
                }

                kirjoittaja.close();
                return true;
            //}
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return false;
                
    }

    public void lisaa(String sana, String kaannos) {
        sanakirja.putIfAbsent(sana, kaannos);
    }

    public String kaanna(String sana) {
        if (sanakirja.containsValue(sana)) {
            for (String avain : sanakirja.keySet()) {
                if (sanakirja.get(avain).equals(sana)) {
                    return avain;
                }
            }
        }
        return sanakirja.get(sana);
    }

    public void poista(String sana) {
        if (sanakirja.containsValue(sana)) {
            Iterator iteraattori = this.sanakirja.values().iterator();
            while (iteraattori.hasNext()) {
                if (iteraattori.next().equals(sana)) {
                    iteraattori.remove();
                }
            }
        } else if (sanakirja.containsKey(sana)) {
            sanakirja.remove(sana);
        }
    }

}
