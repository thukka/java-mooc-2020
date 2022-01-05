package kollaasi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KollaasiSovellus extends Application {

    @Override
    public void start(Stage stage) {

        // esimerkki avaa kuvan, luo uuden kuvan, ja kopioi avatun kuvan 
        // uuteen kuvaan pikseli kerrallaan
        Image lahdeKuva = new Image("file:monalisa.png");

        PixelReader kuvanLukija = lahdeKuva.getPixelReader();

        int leveys = (int) lahdeKuva.getWidth();
        int korkeus = (int) lahdeKuva.getHeight();

        WritableImage kohdeKuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kohdeKuva.getPixelWriter();

        int yKoordinaatti = 0;
        int yPlace = (int) lahdeKuva.getHeight();
        
        while (yKoordinaatti < korkeus) {
            int xKoordinaatti = 0;
            int xPlace = (int) lahdeKuva.getWidth();
            
            while (xKoordinaatti < leveys) {

                Color vari = kuvanLukija.getColor(xKoordinaatti, yKoordinaatti);
                double punainen = 1 - vari.getRed();
                double vihrea = 1 - vari.getGreen();
                double sininen = 1 - vari.getBlue();
                double lapinakyvyys = vari.getOpacity();

                Color uusiVari = new Color(punainen, vihrea, sininen, lapinakyvyys);

                kuvanKirjoittaja.setColor(xKoordinaatti / 2, yKoordinaatti / 2, uusiVari); // vasen ylä
                kuvanKirjoittaja.setColor(xPlace / 2, yKoordinaatti / 2, uusiVari); // oikea ylä
                kuvanKirjoittaja.setColor(xKoordinaatti / 2, yPlace / 2, uusiVari); // vasen ala
                kuvanKirjoittaja.setColor(xPlace / 2, yPlace / 2, uusiVari); // vasen oikea
                
                xKoordinaatti += 2;
                xPlace += 2;
            }

            yKoordinaatti += 2;
            yPlace += 2;
        }

        ImageView kuva = new ImageView(kohdeKuva);

        Pane pane = new Pane();
        pane.getChildren().add(kuva);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
