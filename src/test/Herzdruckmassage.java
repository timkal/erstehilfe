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
public class Herzdruckmassage extends StackPane {
	
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
		
		// Schritt 2 Button
		Button schritt2 = new Button("Schritt 2");
		
		// Herzdruckmassage Label
		Label herzdruck1 = new Label("1. Herzdruck-\n    massage");
		
		// Herzdruckmassage Label 2
		Label herzdruck2 = new Label("30x druecken");
		
		// Herzdruckmassage Label 2
		Label herzdruck3 = new Label("Brustkorb freimachen\n"
				+ "Druckpunkt auf der Mitte des Brustkorbes\n"
				+ "30 mal kurz und kraeftig herunterduecken\n"
				+ "Zwischen Pumpstoessen Brustkorb komplett\nentlasten");
				
		// Herzdruckmassage Image
		Image herzdruck = new Image("file:images/Herzdruckmassage.png");
		ImageView herzdruck_view = new ImageView("file:images/Herzdruckmassage.png");
		
		//Druck Label&Kreis&Symbol
		Label druck = new Label("Druck-\nfrequenz");
		final int radius = 40;
		Circle druck1 = new Circle(radius, Color.GREY);
		Image druckfrequenz = new Image("file:images/Druckfrequenz.png");
		ImageView druckfrequenz_view = new ImageView("file:images/Druckfrequenz.png");
	
		
  /**
   * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich die Aufrufe von add auf
   * Pane1 selbst.
   */
  public Herzdruckmassage() {
    
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
		
		
		//Button Weiter
		getChildren().add(schritt2);
		schritt2.setTranslateX(0);
		schritt2.setTranslateY(185);
		schritt2.getStyleClass().add("button_weiter");
		
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
		
		
		// Herzdruckmassage Label
		getChildren().add(herzdruck1);
		herzdruck1.setTranslateX(0);
		herzdruck1.setTranslateY(-160);
		herzdruck1.getStyleClass().add("button_absicherung");
		
		// Herzdruckmassage Label 1
		getChildren().add(herzdruck2);
		herzdruck2.setTranslateX(70);
		herzdruck2.setTranslateY(10);
		herzdruck2.getStyleClass().add("button_anderesland");
		
		// Herzdruckmassage Label 2
		getChildren().add(herzdruck3);
		herzdruck3.setTranslateX(0);
		herzdruck3.setTranslateY(120);
		herzdruck3.getStyleClass().add("beatmunginfo_label");
		
		// Herzdruckmassage Image
		getChildren().add(herzdruck_view);
		herzdruck_view.setFitHeight(150);
		herzdruck_view.setFitWidth(126);
		herzdruck_view.setTranslateX(-70);
		herzdruck_view.setTranslateY(-20);
		
		//Druckfrequenz Label&Kreis&Symbol
		getChildren().add(druck1);
		druck1.setFill(Color.GREEN);
		druck1.setTranslateX(70);
		druck1.setTranslateY(-60);
		getChildren().add(druck);
		druck.setTranslateX(72);
		druck.setTranslateY(-70);
		druck.getStyleClass().add("druck_label");
		getChildren().add(druckfrequenz_view);
		druckfrequenz_view.setFitHeight(25);
		druckfrequenz_view.setFitWidth(25);
		druckfrequenz_view.setTranslateX(70);
		druckfrequenz_view.setTranslateY(-38);
		
		// Linie 2 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(70);
  }

  /**
   * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
   * @return Der weiter-Button
   */
  
  Button getButton_schritt2() {
    return schritt2;
    
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
 
  
  

  