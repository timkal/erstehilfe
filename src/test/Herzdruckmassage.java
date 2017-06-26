package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Herzdruckmassage extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Linie darunter
	Line line2 = new Line();

	// Schritt 2 Button
	Button schritt2 = new Button("Schritt 2");

	// Herzdruckmassage Label
	Label herzdruck1 = new Label("1. Herzdruckmassage");

	// Herzdruckmassage Label 2
	Label herzdruck2 = new Label("30x druecken");

	// Herzdruckmassage Label 3
	Label herzdruck3 = new Label("- Brustkorb freimachen\n" + "- Druckpunkt auf der Mitte des Brustkorbes\n"
			+ "- 30 mal kurz und kraeftig herunterduecken\n" + "- Zwischen Pumpstoessen Brustkorb komplett\n   entlasten");

	// Herzdruckmassage Image
	Image herzdruck = new Image("file:images/Herzdruckmassage.png");
	ImageView herzdruck_view = new ImageView("file:images/Herzdruckmassage.png");

	// Druck Label&Kreis&Symbol
	Label druck = new Label("Druck-\nfrequenz");
	final int radius = 40;
	Circle druck1 = new Circle(radius, Color.GREY);
	Image druckfrequenz = new Image("file:images/Druckfrequenz.png");
	ImageView druckfrequenz_view = new ImageView("file:images/Druckfrequenz.png");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Herzdruckmassage() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Zuruck Button und Symbol
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Weitere Elemente hinzufügen
		
		// Linie 2
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(55);

		// Schritt 2 Button
		getChildren().add(schritt2);
		schritt2.setTranslateX(0);
		schritt2.setTranslateY(185);
		schritt2.getStyleClass().add("button_weiter");
				
		// Herzdruckmassage Label
		getChildren().add(herzdruck1);
		herzdruck1.setTranslateX(0);
		herzdruck1.setTranslateY(-185);
		herzdruck1.getStyleClass().add("button_ueberschrift");

		// Herzdruckmassage Label 1
		getChildren().add(herzdruck2);
		herzdruck2.setTranslateX(70);
		herzdruck2.setTranslateY(-5);
		herzdruck2.getStyleClass().add("button_anderesland");

		// Herzdruckmassage Label 2
		getChildren().add(herzdruck3);
		herzdruck3.setTranslateX(0);
		herzdruck3.setTranslateY(105);
		herzdruck3.getStyleClass().add("beatmunginfo_label");

		// Herzdruckmassage Image
		getChildren().add(herzdruck_view);
		herzdruck_view.setFitHeight(150);
		herzdruck_view.setFitWidth(126);
		herzdruck_view.setTranslateX(-70);
		herzdruck_view.setTranslateY(-50);

		// Druckfrequenz Label&Kreis&Symbol
		getChildren().add(druck1);
		druck1.setFill(Color.GREEN);
		druck1.setTranslateX(70);
		druck1.setTranslateY(-75);
		getChildren().add(druck);
		druck.setTranslateX(72);
		druck.setTranslateY(-85);
		druck.getStyleClass().add("druck_label");
		getChildren().add(druckfrequenz_view);
		druckfrequenz_view.setFitHeight(25);
		druckfrequenz_view.setFitWidth(25);
		druckfrequenz_view.setTranslateX(70);
		druckfrequenz_view.setTranslateY(-53);

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
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
	
	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}
