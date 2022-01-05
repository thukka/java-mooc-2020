package tekstitilastointia;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import java.util.Arrays;

public class TekstitilastointiaSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        Label kirjaimia = new Label("Kirjaimia: ");
        Label sanatLabel = new Label("Sanoja: ");
        Label pisinLabel = new Label("Pisin sana on: ");
        TextArea kentta = new TextArea();

        kentta.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String palat[] = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
            kirjaimia.setText("Kirjaimia: " + merkkeja);
            sanatLabel.setText("Sanoja: " + sanoja);
            pisinLabel.setText("Pisin sana on: " + pisin);
        });
        

        HBox alarivi = new HBox();
        alarivi.getChildren().addAll(kirjaimia, sanatLabel, pisinLabel);
        alarivi.setSpacing(20);

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(kentta);
        asettelu.setBottom(alarivi);

        Scene sisalto = new Scene(asettelu);
        ikkuna.setScene(sisalto);
        ikkuna.show();

    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
