package borderpane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;

public class BorderPaneSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        asettelu.setTop(new Label("NORTH"));
        asettelu.setRight(new Label("EAST"));
        asettelu.setBottom(new Label("SOUTH"));
        
        Scene sisalto = new Scene(asettelu);
        ikkuna.setScene(sisalto);
        ikkuna.show();
        
    }

    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
    }

}
