package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Rettungsgriff extends Basis {

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

	// Rettungsgriff Label&Symbol
	Label rettungsgriff = new Label("Rettungsgriff");
	Image rettungsgriffbild = new Image("file:images/Rettungsgriff.png");
	ImageView rettungsgriffbild_view = new ImageView("file:images/Rettungsgriff.png");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Rettungsgriff() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// =================================
		// TOP Bar importieren und anordnen
		// =================================

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

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

		// Rettungsgriff Label
		getChildren().add(rettungsgriff);
		rettungsgriff.setTranslateX(0);
		rettungsgriff.setTranslateY(-175);
		rettungsgriff.getStyleClass().add("button_ueberschrift");

		// Rettungsgriff Image
		getChildren().add(rettungsgriffbild_view);
		rettungsgriffbild_view.setFitHeight(220);
		rettungsgriffbild_view.setFitWidth(220);
		rettungsgriffbild_view.setTranslateX(0);
		rettungsgriffbild_view.setTranslateY(0);

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
	
	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}
