package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HymioSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();
        Canvas kanvaasi = new Canvas(640, 480);
        GraphicsContext piirturi = kanvaasi.getGraphicsContext2D();

        asettelu.setCenter(kanvaasi);

        // Piirto
        piirturi.setFill(Color.BLACK);
        piirturi.fillRect(200, 100, 50, 50);
        piirturi.fillRect(300, 100, 50, 50);
        piirturi.fillRect(100, 200, 50, 50);
        piirturi.fillRect(400, 200, 50, 50);
        piirturi.fillRect(150, 250, 250, 50);

        Scene sisalto = new Scene(asettelu);
        ikkuna.setScene(sisalto);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

}
