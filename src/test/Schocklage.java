package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Schocklage extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Weiter Button
	Button weiter = new Button("Weiter");

	// Schocklage Label
	Label schocklage = new Label("Schocklage");

	// Schocklage Label 2
	Label schocklage2 = new Label("ggf. Person zudecken und\n" + "beengende Kleidung\n" + "oeffnen");

	// Schocklage Image
	Image schocklagebild = new Image("file:images/Schocklage.png");
	ImageView schocklagebild_view = new ImageView("file:images/Schocklage.png");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Schocklage() {

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

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");
				
		// Schocklage Label
		getChildren().add(schocklage);
		schocklage.setTranslateX(0);
		schocklage.setTranslateY(-185);
		schocklage.getStyleClass().add("button_ueberschrift");

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
	 * 
	 * @return Der weiter-Button
	 */

	Button getButton_weiter() {
		return weiter;

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
