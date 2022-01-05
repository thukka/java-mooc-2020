package sovellus;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Syottonakyma {

    private Sanakirja sanakirja;

    public Syottonakyma(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
    }

    public Parent getNakyma() {
        GridPane asettelu = new GridPane();
        Label sana = new Label("Sana");
        TextField sanaField = new TextField();
        Label kaannos = new Label("Käännös");
        TextField kaannosField = new TextField();
        Button lisaa = new Button("Lisää sanapari");
        
        asettelu.add(sana, 0, 0);
        asettelu.add(sanaField, 0, 1);
        asettelu.add(kaannos, 0, 2);
        asettelu.add(kaannosField, 0, 3);
        asettelu.add(lisaa, 0, 4);
        
        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));
        
        lisaa.setOnMouseClicked((event) -> {
            String sanaEvent = sanaField.getText();
            String kaannosEvent = kaannosField.getText();
            
            sanakirja.lisaa(sanaEvent, kaannosEvent);
            
            sanaField.clear();
            kaannosField.clear();
        });

        return asettelu;
    }

}
