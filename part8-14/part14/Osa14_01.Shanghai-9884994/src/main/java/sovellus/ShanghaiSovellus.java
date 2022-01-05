package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        // kaaviossa käytettävät x- ja y-akselit
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 2);
        NumberAxis yAkseli = new NumberAxis(0, 100, 10);
        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");
        
        // luodaan viivakaavio, saa arvot numeroina, käyttää aiemmin luotuja x- ja y-akseleita
        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");
        
        // luodaan viivakaavioon lisättävä datajoukko ja data
        XYChart.Series sijoitukset = new XYChart.Series();
        sijoitukset.setName("HY");
        
        sijoitukset.getData().add(new XYChart.Data(2007, 73));
        sijoitukset.getData().add(new XYChart.Data(2008, 68));
        sijoitukset.getData().add(new XYChart.Data(2009, 72));
        sijoitukset.getData().add(new XYChart.Data(2010, 72));
        sijoitukset.getData().add(new XYChart.Data(2011, 74));
        sijoitukset.getData().add(new XYChart.Data(2012, 73));
        sijoitukset.getData().add(new XYChart.Data(2013, 76));
        sijoitukset.getData().add(new XYChart.Data(2014, 73));
        sijoitukset.getData().add(new XYChart.Data(2015, 67));
        sijoitukset.getData().add(new XYChart.Data(2016, 56));
        sijoitukset.getData().add(new XYChart.Data(2017, 56));
        
        // lisätään datajoukko viivakaavioon
        viivakaavio.getData().add(sijoitukset);
        
        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }

}
