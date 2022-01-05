package tekstitilastointia;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class TekstitilastointiaSovellus extends Application {
    
    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        
        HBox alaKomponentit = new HBox();
        alaKomponentit.setSpacing(10);
        alaKomponentit.getChildren().add(new Label("Kirjaimia: 0"));
        alaKomponentit.getChildren().add(new Label("Sanoja: 0"));
        alaKomponentit.getChildren().add(new Label("Pisin sana on:"));
        
        
        
        asettelu.setBottom(alaKomponentit);
        asettelu.setCenter(new TextArea());
        
        Scene sisalto = new Scene(asettelu);
        ikkuna.setScene(sisalto);
        ikkuna.show();
        
        
    }


    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
