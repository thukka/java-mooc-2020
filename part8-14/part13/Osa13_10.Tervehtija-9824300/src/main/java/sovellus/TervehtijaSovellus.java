package sovellus;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class TervehtijaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {

        // Scene 1
        Label aloitusteksti = new Label("Kirjoita nimesi ja aloita.");
        TextField nimikentta = new TextField();
        Button aloita = new Button("Aloita");

        GridPane grid = new GridPane();
        grid.add(aloitusteksti, 0, 0);
        grid.add(nimikentta, 0, 1);
        grid.add(aloita, 0, 2);
       

        // Styling
        grid.setPrefSize(300, 180);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        // Scene 2 + style
        Label tervetuloa = new Label("Tervetuloa ");
        tervetuloa.setAlignment(Pos.CENTER);
        tervetuloa.setPrefSize(300, 180);
        tervetuloa.setPadding(new Insets(20, 20, 20, 20));

        // set scenes
        Scene alkuNakyma = new Scene(grid);
        Scene tokaNakyma = new Scene(tervetuloa);

        // button actions
        aloita.setOnAction((event) -> {
            tervetuloa.setText("Tervetuloa " + nimikentta.getText() + "!");
            ikkuna.setScene(tokaNakyma);
        });

        ikkuna.setScene(alkuNakyma);
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }
}
