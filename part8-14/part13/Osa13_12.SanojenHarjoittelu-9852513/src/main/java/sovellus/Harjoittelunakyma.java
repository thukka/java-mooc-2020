package sovellus;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Harjoittelunakyma {

    private Sanakirja sanakirja;
    private String sana;

    public Harjoittelunakyma(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
        this.sana = sanakirja.haeRandomSana();
    }

    public Parent getNakyma() {
        GridPane asettelu = new GridPane();

        Label kaanna = new Label("Käännä sana " + "'" + this.sana + "'");
        TextField kaannaField = new TextField();
        Button tarkista = new Button("Tarkista");
        Label palaute = new Label("");

        asettelu.add(kaanna, 0, 0);
        asettelu.add(kaannaField, 0, 1);
        asettelu.add(tarkista, 0, 2);
        asettelu.add(palaute, 0, 3);

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));
        
        tarkista.setOnMouseClicked((event) -> {
            if (sanakirja.hae(sana).equals(kaannaField.getText())) {
                palaute.setText("Oikein!");
            } else {
                palaute.setText("Väärin! Sanan '" + this.sana + "' käännös on " + "'" + this.sanakirja.hae(sana) + "'.");
            return;
            }
            
            this.sana = this.sanakirja.haeRandomSana();
            kaanna.setText("Käännä sana " + "'" + this.sana + "'");
            kaannaField.clear();
        });

        return asettelu;
    }

}
