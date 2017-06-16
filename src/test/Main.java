package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  // Panes und Szenen aller Klassen definieren
  // Panes abgekürzt mit pZAHL, Scenes mit sZAHL
  Notruf_Absetzen p3 = new Notruf_Absetzen();
  Scene s3 = new Scene(p3, 300, 550);
  
  Telefonnummern p4 = new Telefonnummern();
  Scene s4 = new Scene(p4, 300, 550);
  
  Menu p2 = new Menu();
  Scene s2 = new Scene(p2, 300, 550);

  Notruf_gewaehlt p1 = new Notruf_gewaehlt();
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
  
  Person_Atmung p10 = new Person_Atmung();
  Scene s10 = new Scene (p10, 300, 550);
  
  Reanimation p11 = new Reanimation();
  Scene s11 = new Scene (p11, 300, 550);
  
  Herzdruckmassage p12 = new Herzdruckmassage();
  Scene s12 = new Scene (p12, 300, 550);
  
  Beatmung p13 = new Beatmung();
  Scene s13 = new Scene (p13, 300, 550);
  
  Aeussere_Verletzung p14 = new Aeussere_Verletzung();
  Scene s14 = new Scene (p14, 300, 550);

  Innere_Verletzung p15 = new Innere_Verletzung();
  Scene s15 = new Scene (p15, 300, 550);
  
  Stabile_Seitenlage p16 = new Stabile_Seitenlage();
  Scene s16 = new Scene (p16, 300, 550);
  
  Beduerfnisse_Person p17 = new Beduerfnisse_Person();
  Scene s17 = new Scene (p17, 300, 550);
  
  Schocklage p18 = new Schocklage();
  Scene s18 = new Scene (p18, 300, 550);
  
  Blutet_Person p19 = new Blutet_Person();
  Scene s19 = new Scene (p19, 300, 550);
  
  Druckverband p20 = new Druckverband();
  Scene s20 = new Scene (p20, 300, 550);
  
  public void start(Stage primaryStage) throws Exception {

    // Aktion des Buttons in der Szene 1
    p3.getButton_land().setOnAction(e -> primaryStage.setScene(s4));
    p3.getButton_weiter().setOnAction(e -> primaryStage.setScene(s2));
    p3.getButton_back().setOnAction(e -> primaryStage.setScene(s1));
    p4.getButton_back().setOnAction(e -> primaryStage.setScene(s3));
    p2.getButton_back().setOnAction(e -> primaryStage.setScene(s3));
    p2.getButton_unfall().setOnAction(e -> primaryStage.setScene(s5));
    p2.getButton_verletzt().setOnAction(e -> primaryStage.setScene(s9));
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
    p9.getButton_nein().setOnAction(e -> primaryStage.setScene(s10));
    p10.getButton_back().setOnAction(e -> primaryStage.setScene(s9));
    p10.getButton_nein().setOnAction(e -> primaryStage.setScene(s11));
    p11.getButton_back().setOnAction(e -> primaryStage.setScene(s10));
    p11.getButton_anleitung().setOnAction(e -> primaryStage.setScene(s12));
    p12.getButton_back().setOnAction(e -> primaryStage.setScene(s11));
    p12.getButton_schritt2().setOnAction(e -> primaryStage.setScene(s13));
    p13.getButton_back().setOnAction(e -> primaryStage.setScene(s12));
    p13.getButton_back1().setOnAction(e -> primaryStage.setScene(s11));
    p9.getButton_ja().setOnAction(e -> primaryStage.setScene(s14));
    p14.getButton_back().setOnAction(e -> primaryStage.setScene(s9));
    p10.getButton_ja().setOnAction(e -> primaryStage.setScene(s14));
    p14.getButton_nein().setOnAction(e -> primaryStage.setScene(s15));
    p15.getButton_back().setOnAction(e -> primaryStage.setScene(s14));
    p15.getButton_nein().setOnAction(e -> primaryStage.setScene(s16));
    p16.getButton_back().setOnAction(e -> primaryStage.setScene(s15));
    p16.getButton_weiter().setOnAction(e -> primaryStage.setScene(s17));
    p17.getButton_back().setOnAction(e -> primaryStage.setScene(s16));
    p15.getButton_ja().setOnAction(e -> primaryStage.setScene(s18));
    p18.getButton_weiter().setOnAction(e -> primaryStage.setScene(s17));
    p18.getButton_back().setOnAction(e -> primaryStage.setScene(s15));
    p14.getButton_ja().setOnAction(e -> primaryStage.setScene(s19));
    p19.getButton_back().setOnAction(e -> primaryStage.setScene(s14));
    p19.getButton_ja().setOnAction(e -> primaryStage.setScene(s20));
    p20.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
    
    primaryStage.setScene(s1);
    primaryStage.setTitle("Startscreen");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}
