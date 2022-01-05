package ristinolla;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class RistinollaSovellus extends Application {

    private int vuoroCount;
    private Boolean peliLoppu;

    public RistinollaSovellus() {
        this.vuoroCount = 1;
        peliLoppu = false;
    }

    @Override
    public void start(Stage ikkuna) {
        // Päätaso
        BorderPane asettelu = new BorderPane();
        Label infoteksti = new Label("Vuoro: X");
        infoteksti.setFont(Font.font("Monospaced", 40));

        // NAPPULAT, tästä tulee järkyttävä
        GridPane nappulat = new GridPane();

        Button nappi00 = new Button(" ");
        nappi00.setFont(Font.font("Monospaced", 40));
        Button nappi10 = new Button(" ");
        nappi10.setFont(Font.font("Monospaced", 40));
        Button nappi20 = new Button(" ");
        nappi20.setFont(Font.font("Monospaced", 40));
        Button nappi01 = new Button(" ");
        nappi01.setFont(Font.font("Monospaced", 40));
        Button nappi11 = new Button(" ");
        nappi11.setFont(Font.font("Monospaced", 40));
        Button nappi21 = new Button(" ");
        nappi21.setFont(Font.font("Monospaced", 40));
        Button nappi02 = new Button(" ");
        nappi02.setFont(Font.font("Monospaced", 40));
        Button nappi12 = new Button(" ");
        nappi12.setFont(Font.font("Monospaced", 40));
        Button nappi22 = new Button(" ");
        nappi22.setFont(Font.font("Monospaced", 40));

        nappulat.add(nappi00, 0, 0);
        nappulat.add(nappi10, 1, 0);
        nappulat.add(nappi20, 2, 0);
        nappulat.add(nappi01, 0, 1);
        nappulat.add(nappi11, 1, 1);
        nappulat.add(nappi21, 2, 1);
        nappulat.add(nappi02, 0, 2);
        nappulat.add(nappi12, 1, 2);
        nappulat.add(nappi22, 2, 2);

        // RIVI 1
        nappi00.setOnMouseClicked((event) -> {
            if (nappi00.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi00.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    nappi00.setText("X");
                    infoteksti.setText("Vuoro: O");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        nappi10.setOnMouseClicked((event) -> {
            if (nappi10.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi10.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    infoteksti.setText("Vuoro: O");
                    nappi10.setText("X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        nappi20.setOnMouseClicked((event) -> {
            if (nappi20.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi20.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    infoteksti.setText("Vuoro: O");
                    nappi20.setText("X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        // RIVI 2
        nappi01.setOnMouseClicked((event) -> {
            if (nappi01.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0 && this.vuoroCount > 0) {
                    nappi01.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    nappi01.setText("X");
                    infoteksti.setText("Vuoro: O");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        nappi11.setOnMouseClicked((event) -> {
            if (nappi11.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi11.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    infoteksti.setText("Vuoro: O");
                    nappi11.setText("X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        nappi21.setOnMouseClicked((event) -> {
            if (nappi21.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi21.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    infoteksti.setText("Vuoro: O");
                    nappi21.setText("X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        // RIVI 3
        nappi02.setOnMouseClicked((event) -> {
            if (nappi02.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi02.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    nappi02.setText("X");
                    infoteksti.setText("Vuoro: O");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        nappi12.setOnMouseClicked((event) -> {
            if (nappi12.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi12.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    infoteksti.setText("Vuoro: O");
                    nappi12.setText("X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        nappi22.setOnMouseClicked((event) -> {
            if (nappi22.getText().equals(" ") && peliLoppu == false) {
                if (this.vuoroCount % 2 == 0) {
                    nappi22.setText("O");
                    infoteksti.setText("Vuoro: X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                } else {
                    infoteksti.setText("Vuoro: O");
                    nappi22.setText("X");
                    this.vuoroCount++;
                    if (tarkastaVoitto(nappi00, nappi10, nappi20, nappi01, nappi11, nappi21, nappi02, nappi12, nappi22)) {
                        peliLoppu = true;
                        infoteksti.setText("Loppu!");
                    }
                }
            }
        });
        // END OF NAPPULAT

        // Asettelu
        asettelu.setCenter(nappulat);
        asettelu.setTop(infoteksti);

        Scene sisalto = new Scene(asettelu);
        ikkuna.setScene(sisalto);
        ikkuna.show();
    }

    public boolean tarkastaVoitto(Button nappi00, Button nappi10, Button nappi20, Button nappi01, Button nappi11, Button nappi21, Button nappi02, Button nappi12, Button nappi22) {
        return nappi00.getText().equals("O") && nappi10.getText().equals("O") && nappi20.getText().equals("O")
                // Vino
                || nappi02.getText().equals("O") && nappi11.getText().equals("O") && nappi20.getText().equals("O")
                || nappi02.getText().equals("X") && nappi11.getText().equals("X") && nappi20.getText().equals("X")
                
                || nappi22.getText().equals("O") && nappi11.getText().equals("O") && nappi00.getText().equals("O")
                || nappi22.getText().equals("X") && nappi11.getText().equals("X") && nappi00.getText().equals("X")
                
                // Vaaka
                || nappi00.getText().equals("O") && nappi10.getText().equals("O") && nappi20.getText().equals("O")
                || nappi00.getText().equals("X") && nappi10.getText().equals("X") && nappi20.getText().equals("X")
                
                || nappi01.getText().equals("O") && nappi11.getText().equals("O") && nappi21.getText().equals("O")
                || nappi01.getText().equals("X") && nappi11.getText().equals("X") && nappi21.getText().equals("X")
                
                || nappi02.getText().equals("O") && nappi12.getText().equals("O") && nappi22.getText().equals("O")
                || nappi02.getText().equals("X") && nappi12.getText().equals("X") && nappi22.getText().equals("X")
                
                // Pysty
                || nappi22.getText().equals("O") && nappi21.getText().equals("O") && nappi20.getText().equals("O")
                || nappi22.getText().equals("X") && nappi21.getText().equals("X") && nappi20.getText().equals("X")
                
                || nappi12.getText().equals("O") && nappi11.getText().equals("O") && nappi10.getText().equals("O")
                || nappi12.getText().equals("X") && nappi11.getText().equals("X") && nappi10.getText().equals("X")
                
                || nappi00.getText().equals("O") && nappi01.getText().equals("O") && nappi02.getText().equals("O")
                || nappi00.getText().equals("X") && nappi01.getText().equals("X") && nappi02.getText().equals("X")
                
                ;
    }

    public static void main(String[] args) {
        launch(RistinollaSovellus.class);
    }

}
