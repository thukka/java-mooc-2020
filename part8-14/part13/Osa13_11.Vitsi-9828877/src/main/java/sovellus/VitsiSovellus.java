package sovellus;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VitsiSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        
        // Päätaso
        BorderPane asettelu = new BorderPane();
        asettelu.setPrefSize(300, 180);
        
        // Ylävalikko
        Button eka = new Button("Vitsi");
        Button toka = new Button("Vastaus");
        Button kolmas = new Button("Selitys");
        
        HBox ylapalkki = new HBox();
        ylapalkki.setSpacing(10);
        ylapalkki.getChildren().addAll(eka, toka, kolmas);
        
        asettelu.setTop(ylapalkki);
        
        // Teksti
        Label paateksti = new Label("What do you call a bear with no teeth?");
        Label vastaus = new Label("A gummy bear.");
        Label selitys = new Label("Ei oo hampuleita.");
        asettelu.setCenter(paateksti);
        
        Scene sisalto = new Scene(asettelu);
        
        // Nappulat
        eka.setOnAction((event) -> asettelu.setCenter(paateksti));
        toka.setOnAction((event) -> asettelu.setCenter(vastaus));
        kolmas.setOnAction((event) -> asettelu.setCenter(selitys));

        ikkuna.setScene(sisalto);
        ikkuna.show();
    }


    public static void main(String[] args) {
        launch(VitsiSovellus.class);
    }
}
