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
  
  Absicherung p6 = new Absicherung();
  Scene s6 = new Scene(p6, 300, 550);

  Person_entfernt p7 = new Person_entfernt();
  Scene s7 = new Scene (p7, 300, 550);
  
  Rettungsgriff p8 = new Rettungsgriff();
  Scene s8 = new Scene (p8, 300, 550);
  
  Person_Bewusstsein p9 = new Person_Bewusstsein();
  Scene s9 = new Scene (p9, 300, 550);

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
    p6.getButton_back().setOnAction(e -> primaryStage.setScene(s5));
    p5.getButton_nein().setOnAction(e -> primaryStage.setScene(s6));
    p5.getButton_ja().setOnAction(e -> primaryStage.setScene(s7));
    p6.getButton_weiter().setOnAction(e -> primaryStage.setScene(s7));
    p7.getButton_back().setOnAction(e -> primaryStage.setScene(s5));
    p7.getButton_nein().setOnAction(e -> primaryStage.setScene(s8));
    p7.getButton_ja().setOnAction(e -> primaryStage.setScene(s9));
    p8.getButton_back().setOnAction(e -> primaryStage.setScene(s7));
    p8.getButton_weiter().setOnAction(e -> primaryStage.setScene(s9));
    p9.getButton_back().setOnAction(e -> primaryStage.setScene(s7));
    
    
    primaryStage.setScene(s1);
    primaryStage.setTitle("Startscreen");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}
