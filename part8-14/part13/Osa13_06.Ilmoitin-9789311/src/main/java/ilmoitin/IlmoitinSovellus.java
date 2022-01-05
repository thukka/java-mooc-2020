package ilmoitin;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;


public class IlmoitinSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        
        Label alaTeksti = new Label();
        TextField kentta = new TextField();
        Button nappi = new Button("Päivitä");
        
//        nappi.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                alaTeksti.setText(kentta.getText());
//            }
//        });
        
        nappi.setOnAction((event) -> {
            alaTeksti.setText(kentta.getText());
    });
        
        VBox komponenttiryhma = new VBox();
        komponenttiryhma.setSpacing(10);
        komponenttiryhma.getChildren().addAll(kentta, nappi, alaTeksti);
        
        Scene sisalto = new Scene(komponenttiryhma);
        ikkuna.setScene(sisalto);
        ikkuna.show();
        
        
    }

    public static void main(String[] args) {
        
        launch(IlmoitinSovellus.class);
        
    }

}
