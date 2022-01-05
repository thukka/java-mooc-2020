package sovellus;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

// END SOLUTION
public class SanaharjoitteluSovellus extends Application {
    
    private Sanakirja sanakirja;
    
    @Override
    public void init() {
        this.sanakirja = new Sanakirja();
    }
    
    @Override
    public void start(Stage ikkuna) {
        // Päätaso
        BorderPane asettelu = new BorderPane();
        Syottonakyma syottonakyma = new Syottonakyma(sanakirja);
        Harjoittelunakyma harjoittelunakyma = new Harjoittelunakyma(sanakirja);
        
        // Yläpalkki
        HBox ylapalkki = new HBox();
        Button lisaaSanoja = new Button("Lisää sanoja");
        Button harjoittele = new Button("Harjoittele");
        ylapalkki.getChildren().addAll(lisaaSanoja, harjoittele);
        
        ylapalkki.setSpacing(10);
        
        // Namiskuukkelit
        lisaaSanoja.setOnAction((event) -> asettelu.setCenter(syottonakyma.getNakyma()));
        harjoittele.setOnAction((event) -> asettelu.setCenter(harjoittelunakyma.getNakyma()));
        
        // Asettelut
        asettelu.setTop(ylapalkki);
        asettelu.setCenter(syottonakyma.getNakyma());
        Scene sisalto = new Scene(asettelu, 400, 300);
        ikkuna.setScene(sisalto);
        ikkuna.show();
        
        
        
    }


    public static void main(String[] args) {
        launch(SanaharjoitteluSovellus.class);
    }
    
    
}
