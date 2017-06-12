package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  // Panes und Szenen aller Klassen definieren
  // Panes abgekÃ¼rzt mit pZAHL, Scenes mit sZAHL
  Notruf_absetzen p3 = new Notruf_absetzen();
  Scene s3 = new Scene(p3, 300, 550);
  
  Telefonnummern p4 = new Telefonnummern();
  Scene s4 = new Scene(p4, 300, 550);
  
  Menu p2 = new Menu();
  Scene s2 = new Scene(p2, 300, 550);

  Notruf_gewählt p1 = new Notruf_gewählt();
  Scene s1 = new Scene(p1, 300, 550);
  
  Unfallstelle_abgesichert p5 = new Unfallstelle_abgesichert();
  Scene s5 = new Scene(p5, 300, 550);


  public void start(Stage primaryStage) throws Exception {

    // Aktion des Buttons in der Szene 1
    p3.getButton_land().setOnAction(e -> primaryStage.setScene(s4));
    p3.getButton_weiter().setOnAction(e -> primaryStage.setScene(s2));
    p3.getButton_back().setOnAction(e -> primaryStage.setScene(s1));
    p4.getButton_back().setOnAction(e -> primaryStage.setScene(s3));
    p2.getButton_back().setOnAction(e -> primaryStage.setScene(s3));
    p2.getButton_unfall().setOnAction(e -> primaryStage.setScene(s5));
    p1.getButton_ja().setOnAction(e -> primaryStage.setScene(s2));
    p1.getButton_nein().setOnAction(e -> primaryStage.setScene(s3));
    p5.getButton_back().setOnAction(e -> primaryStage.setScene(s2));

    primaryStage.setScene(s1);
    primaryStage.setTitle("Startscreen");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}
