package nappijatekstielementti;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class NappiJaTekstielementtiSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        // Luodaan napit yms
        Button nappi = new Button("Nappi");
        Label teksti = new Label("Morojettes");
        //teksti.setContentDisplay(ContentDisplay.TOP);
        
        // Luodaan komponenttiryhmä
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(teksti);
        
        // Luodaan näkymä
        Scene nakyma = new Scene(komponenttiryhma);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
        
    }


    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
