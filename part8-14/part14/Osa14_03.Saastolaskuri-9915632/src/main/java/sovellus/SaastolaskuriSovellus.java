package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        // Päätaso
        BorderPane asettelu = new BorderPane();
        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();
        LineChart viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Säästölaskuri");
        viivakaavio.setLegendVisible(false);

        // KK tallennus
        VBox ylalaita = new VBox();
        Slider liukuri = new Slider(25.0, 250.0, 25.0);
        liukuri.setShowTickMarks(true);
        liukuri.setShowTickLabels(true);
        liukuri.setSnapToTicks(true);
        liukuri.setMinorTickCount(0);
        liukuri.setMajorTickUnit(25.0);
        liukuri.setBlockIncrement(25.0);

        Label liukurinArvo = new Label("25");

        BorderPane ylaBP = new BorderPane();
        ylaBP.setLeft(new Label("Kuukausittainen tallennus"));
        ylaBP.setCenter(liukuri);
        ylaBP.setRight(liukurinArvo);

        // KORKO
        Label korkoliukuriArvo = new Label("0");
        Slider korkoLiukuri = new Slider(0.0, 10.0, 0.0);
        korkoLiukuri.setShowTickMarks(true);
        korkoLiukuri.setShowTickLabels(true);
        korkoLiukuri.setSnapToTicks(true);
        //korkoLiukuri.setMinorTickCount(0);
        korkoLiukuri.setMajorTickUnit(10.0);
        //korkoLiukuri.setBlockIncrement(2);

        BorderPane alaBP = new BorderPane();
        alaBP.setLeft(new Label("Vuosittainen korko"));
        alaBP.setCenter(korkoLiukuri);
        alaBP.setRight(korkoliukuriArvo);

        // toiminnallisuus
        XYChart.Series data = new XYChart.Series();
        laskeKK(data, liukuri);

        liukuri.valueProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            liukurinArvo.setText(String.valueOf(uusiArvo));
            data.getData().clear();
            laskeKK(data, liukuri);
        });

        XYChart.Series korkoData = new XYChart.Series();
        laskeKorko(korkoData, liukuri, korkoLiukuri);

        korkoLiukuri.valueProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            korkoliukuriArvo.setText(String.valueOf(uusiArvo));
            korkoData.getData().clear();
            laskeKorko(korkoData, liukuri, korkoLiukuri);
        });


        // Asettelu
        viivakaavio.getData().add(data);
        viivakaavio.getData().add(korkoData);
        ylalaita.getChildren().addAll(ylaBP, alaBP);
        asettelu.setCenter(viivakaavio);
        asettelu.setTop(ylalaita);
        asettelu.setPadding(new Insets(10, 10, 10, 10));

        Scene sisalto = new Scene(asettelu, 320, 300);
        ikkuna.setScene(sisalto);
        ikkuna.show();

    }

    public static void laskeKK(XYChart.Series data, Slider liukuri) {
        double saastoVuodessa = liukuri.getValue() * 12;
        double lopullinenSaasto;
        for (int i = 0; i <= 30; i++) {
            lopullinenSaasto = i * saastoVuodessa;
            data.getData().add(new XYChart.Data(i, lopullinenSaasto));
        }
    }

    public static void laskeKorko(XYChart.Series korkoData, Slider liukuri, Slider korkoLiukuri) {
        double kkSaasto = liukuri.getValue() * 12;
        double korko = ((korkoLiukuri.getValue() / 100) + 1);
        double summaVuodenLoputtua = 0.0;
        korkoData.getData().add(new XYChart.Data(0, 0));
        
        for (int i = 1; i <= 30; i++) {
            
            summaVuodenLoputtua += kkSaasto;
            summaVuodenLoputtua *= korko;
            korkoData.getData().add(new XYChart.Data(i, summaVuodenLoputtua));

        }
    }

    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }

}
