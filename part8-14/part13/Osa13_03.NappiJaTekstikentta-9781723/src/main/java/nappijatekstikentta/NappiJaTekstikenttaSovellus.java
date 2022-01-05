package nappijatekstikentta;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class NappiJaTekstikenttaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        TextField kentta = new TextField();
        Button nappi = new Button("Nappula");
        
        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(kentta);
        komponenttiryhma.getChildren().add(nappi);
        
        Scene sisalto = new Scene(komponenttiryhma);
        ikkuna.setScene(sisalto);
        ikkuna.show();
        
    }
    

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
