package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  // Panes und Szenen aller Klassen definieren
  // Panes abgekürzt mit pZAHL, Scenes mit sZAHL
  Notruf_Absetzen p2 = new Notruf_Absetzen();
  Scene s2 = new Scene(p2, 300, 550);
  
  Telefonnummern p3 = new Telefonnummern();
  Scene s3 = new Scene(p3, 300, 550);
  
  Menu p1 = new Menu();
  Scene s1 = new Scene(p1, 300, 550);



  public void start(Stage primaryStage) throws Exception {

    // Aktion des Buttons in der Szene 1
    p2.getButton_land().setOnAction(e -> primaryStage.setScene(s3));
    p2.getButton_weiter().setOnAction(e -> primaryStage.setScene(s1));
    p3.getButton_back().setOnAction(e -> primaryStage.setScene(s2));
    p1.getButton_back().setOnAction(e -> primaryStage.setScene(s2));
    



    primaryStage.setScene(s2);
    primaryStage.setTitle("Startscreen");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}
