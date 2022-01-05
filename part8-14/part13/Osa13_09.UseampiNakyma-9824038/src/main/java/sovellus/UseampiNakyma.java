package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class UseampiNakyma extends Application {

    @Override
    public void start(Stage ikkuna) {
        // Eka
        Button ekaNappi = new Button("Tokaan näkymään!");
        BorderPane asettelu = new BorderPane();
        asettelu.setTop(new Label("Eka näkymä!"));
        asettelu.setCenter(ekaNappi);

        // Toka
        Button tokaNappi = new Button("Kolmanteen näkymään!");
        Label tokaLabel = new Label("Toka näkymä!");
        VBox tokaSisalto = new VBox();
        tokaSisalto.getChildren().addAll(tokaNappi, tokaLabel);

        // Kolmas
        Button kolmasNappi = new Button("Ekaan näkymään!");
        GridPane grid = new GridPane();
        grid.add(new Label("Kolmas näkymä!"), 0, 0);
        grid.add(kolmasNappi, 1, 1);

        // Scenet
        Scene ekaNakyma = new Scene(asettelu);
        Scene tokaNakyma = new Scene(tokaSisalto);
        Scene kolmasNakyma = new Scene(grid);

        // Events
        ekaNappi.setOnAction((event) -> {
            ikkuna.setScene(tokaNakyma);
        });

        tokaNappi.setOnAction((event) -> {
            ikkuna.setScene(kolmasNakyma);
        });
        
        kolmasNappi.setOnAction((event) -> {
           ikkuna.setScene(ekaNakyma);
        });

        ikkuna.setScene(ekaNakyma);
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }

}
