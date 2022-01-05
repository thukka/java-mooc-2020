package sovellus;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class PuolueetSovellus extends Application {

    private Map<String, Map<Integer, Double>> arvot;

    public PuolueetSovellus() {
        this.arvot = new HashMap<>();
    }

    @Override
    public void start(Stage ikkuna) {
        NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
        NumberAxis yAkseli = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");

        // luetaan data olioon
        try ( Scanner lueTiedosto = new Scanner(Paths.get("puoluedata.tsv"))) {
            String otsikko = lueTiedosto.nextLine();
            String[] otsikkoPalat = otsikko.split("\t");

            while (lueTiedosto.hasNextLine()) {
                String rivi = lueTiedosto.nextLine();
                String[] palat = rivi.split("\t");

                arvot.put(palat[0], new HashMap());
                for (int i = 1; i < palat.length; i++) {
                    if (!palat[i].equals("-")) {
                    arvot.get(palat[0]).put(Integer.valueOf(otsikkoPalat[i]), Double.valueOf(palat[i]));
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // käydään puolueet läpi ja lisätään ne kaavioon
        arvot.keySet().stream().forEach(puolue -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(puolue);

            arvot.get(puolue).entrySet().stream().forEach(pari -> {
                data.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));
            });
            
            viivakaavio.getData().add(data);
        });

        // näytetään viivakavio
        
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(PuolueetSovellus.class);
    }

}
