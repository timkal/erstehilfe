package test;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert sind
 */
public class Schocklage extends StackPane {
	
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
		
		// Weiter Button
		Button weiter = new Button("Weiter");
		
		// Schocklage Label
		Label schocklage = new Label("Schocklage");
		
		// Schocklage Label 2
		Label schocklage2 = new Label ("ggf. Person zudecken und\n"
				+ "beengende Kleidung\n"
				+ "oeffnen");
		
		// Schocklage Image
		Image schocklagebild = new Image("file:images/Schocklage.png");
		ImageView schocklagebild_view = new ImageView("file:images/Schocklage.png");
	
  /**
   * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich die Aufrufe von add auf
   * Pane1 selbst.
   */
  public Schocklage() {
    
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
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");
		
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
		
		
		// Schocklage Label
		getChildren().add(schocklage);
		schocklage.setTranslateX(0);
		schocklage.setTranslateY(-185);
		schocklage.getStyleClass().add("button_absicherung");
		
		// Schocklage Label 2
		getChildren().add(schocklage2);
		schocklage2.setTranslateX(0);
		schocklage2.setTranslateY(100);
		schocklage2.getStyleClass().add("land_label");
		
		// Schocklage Image
		getChildren().add(schocklagebild_view);
		schocklagebild_view.setFitHeight(213);
		schocklagebild_view.setFitWidth(290);
		schocklagebild_view.setTranslateX(0);
		schocklagebild_view.setTranslateY(-50);
		
		
		
  }

  /**
   * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
   * @return Der weiter-Button
   */
  
  Button getButton_weiter() {
	    return weiter;
	    
	  }
	  Button getButton_back() {
		return back;
	  }


	}
	 
	  