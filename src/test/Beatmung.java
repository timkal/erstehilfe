package test;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert sind
 */
public class Beatmung extends StackPane {
	
	// ------------------------------------------------------------------------------------------

		// Pane und Scene
		StackPane stack = new StackPane();
		Scene szene = new Scene(stack, 300, 550);

		// =================================
		// Basis-Elemente TAP Bar
		// =================================
		
		// Rectangle
		Rectangle top = new Rectangle(300, 60);
		Label title = new Label("Erste-Hilfe");

		// Menu Button und Symbol
		Button menu = new Button("\nMenu");
		Image home_image = new Image("file:images/Home.png");
		ImageView home_view = new ImageView("file:images/Home.png");

		// Krankenhaus Button und Symbol
		Button krankenhaus = new Button("\nHospital");
		Image krankenhaus_image = new Image("file:images/Hospital.png");
		ImageView krankenhaus_view = new ImageView("file:images/Hospital.png");

		// Notruf Button und Symbol
		Button notruf = new Button("\nNotruf");
		Image notruf_image = new Image("file:images/Notruf.png");
		ImageView notruf_view = new ImageView("file:images/Notruf.png");

		// =================================
		// Basis-Elemente TOP Bar
		// =================================

		// Akku Symbol
		Image akku = new Image("file:images/Akku.png");
		ImageView akku_view = new ImageView("file:images/Akku.png");
		Label prozent = new Label("100%");

		// Empfang Symbol
		Image empfang = new Image("file:images/Empfang3.png");
		ImageView empfang_view = new ImageView("file:images/Empfang3.png");
		
		// Uhrzeit
		Label zeit = new Label("09:41 AM");
		
		//Zurück Button und Symbol
		Button back = new Button("Zurueck");
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

		// Linie
		Line line = new Line();
		
		// ------------------------------------------------------------------------------------------
		
		// =================================
		// Weitere Elemente
		// =================================
		
		// Linie darunter
		Line line2 = new Line();
				
		// Zurueck zur Reanimation Button
		Button back1 = new Button("Zurueck zur Reanimation");
		
		// Beatmung Label
		Label reanimation = new Label("2. Beatmung");
	
		// Beatmung Label
		Label beatmung1 = new Label("2x beatmen");
		
		// Beatmung Label 2
		Label beatmung2 = new Label("Nase der Person bei der Mund zu Mund\n"
				+ "            Beatmung verschliessen\n"
				+ "Beatmungsphase betraegt eine Sekunde\n"
				+ "30 mal kurz und kraeftig herunterduecken\n"
				+ "Bei richtiger Durchfuehrung hebt sich der\n"
				+ "          Brustkorb der Person sichtbar");
		
		// Beatmung Label 3
		Label beatmung3 = new Label("Schritt 1 und 2 solange wiederholen\n,"
				+ "bis der Notarzt da ist oder keine\n"
				+ "Reanimation mehr benoetigt wird");		
				
		// Beatmung Image
		Image beatmung = new Image("file:images/Beatmung.png");
		ImageView beatmung_view = new ImageView("file:images/Beatmung.png");
		
	
		
  /**
   * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich die Aufrufe von add auf
   * Pane1 selbst.
   */
  public Beatmung() {
    
	  	getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// =================================
		// TOP Bar importieren und anordnen
		// =================================
		
		// Rechteck Abgrenzung oben
		top.setFill(Color.web("#F9F9F9"));
		getChildren().add(top);
		top.setTranslateX(0);
		top.setTranslateY(-250);
		
		
		//Button Zurueck zur Reanimation
		getChildren().add(back1);
		back1.setTranslateX(0);
		back1.setTranslateY(185);
		back1.getStyleClass().add("button_weiter");
		
		//Titel
		getChildren().add(title);
		title.setTranslateX(0);
		title.setTranslateY(-240);
		title.getStyleClass().add("title_label");
		
		
		//Zuruck Button und Symbol
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Akku-Symbol und Text
		getChildren().add(akku_view);
		akku_view.setFitHeight(10);
		akku_view.setFitWidth(32);
		setAlignment(akku_view, Pos.TOP_RIGHT);
		getChildren().add(prozent);
		prozent.getStyleClass().add("topbar_label");
		prozent.setTranslateX(103);
		prozent.setTranslateY(-270);

		getChildren().add(zeit);
		zeit.getStyleClass().add("topbar_label");
		setAlignment(zeit, Pos.TOP_CENTER);

		getChildren().add(empfang_view);
		empfang_view.setFitHeight(10);
		empfang_view.setFitWidth(75);
		setAlignment(empfang_view, Pos.TOP_LEFT);

		// =================================
		// TAP Bar importieren und anordnen
		// =================================

		// Krankenhaus
		getChildren().add(krankenhaus);
		getChildren().add(krankenhaus_view);
		krankenhaus_view.setFitHeight(20);
		krankenhaus_view.setFitWidth(20);
		krankenhaus_view.setTranslateX(0);
		krankenhaus_view.setTranslateY(235);
		setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		krankenhaus.getStyleClass().add("button_hospital");

		// Notruf
		getChildren().add(notruf);
		getChildren().add(notruf_view);
		notruf_view.setFitHeight(20);
		notruf_view.setFitWidth(19);
		notruf_view.setTranslateX(100);
		notruf_view.setTranslateY(235);
		setAlignment(notruf, Pos.BOTTOM_RIGHT);
		notruf.getStyleClass().add("button_notruf");

		// Menu
		getChildren().add(menu);
		getChildren().add(home_view);
		home_view.setFitHeight(19);
		home_view.setFitWidth(20);
		home_view.setTranslateX(-100);
		home_view.setTranslateY(235);
		setAlignment(menu, Pos.BOTTOM_LEFT);
		menu.getStyleClass().add("button_menu");

		
		// Linie 
		getChildren().add(line);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);
		line.setStrokeWidth(0.5);
		line.setTranslateY(-222);
		
		
		//Weitere Elemente hinzufügen
		
		
		// Reanimation Label
		getChildren().add(reanimation);
		reanimation.setTranslateX(0);
		reanimation.setTranslateY(-185);
		reanimation.getStyleClass().add("button_absicherung");
		
		// Beatmung Label 
		getChildren().add(beatmung1);
		beatmung1.setTranslateX(54);
		beatmung1.setTranslateY(-100);
		beatmung1.getStyleClass().add("button_anderesland");
		
		// Beatmung Image
		getChildren().add(beatmung_view);
		beatmung_view.setFitHeight(100);
		beatmung_view.setFitWidth(91);
		beatmung_view.setTranslateX(-65);
		beatmung_view.setTranslateY(-90);
		
		// Linie 2 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-30);
		
		// Beatmung Label 2
		getChildren().add(beatmung2);
		beatmung2.setTranslateX(0);
		beatmung2.setTranslateY(30);
		beatmung2.getStyleClass().add("beatmunginfo_label");
		
		// Beatmung Label 3
		getChildren().add(beatmung3);
		beatmung3.setTranslateX(0);
		beatmung3.setTranslateY(128);
		beatmung3.getStyleClass().add("beatmunginfo_label2");
  }

  /**
   * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
   * @return Der weiter-Button
   */
  
  Button getButton_back1() {
    return back1;
    
  }
  Button getButton_back() {
	return back;
  }
  Button getButton_menu() {
    return menu;
		  }
  Button getButton_notruf() {
		return notruf;
	  }
}
 
  