package test;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls plaziert
 * sind
 */
public class Menu extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	Button unfall = new Button("Verkehrsunfall");

	Button verletzt = new Button("Verletzte Person");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, bezeihen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Menu() {

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

		getChildren().add(unfall);
		unfall.getStyleClass().add("custom_button");
		unfall.setTranslateY(50);

		getChildren().add(verletzt);
		verletzt.getStyleClass().add("custom_button");
		verletzt.setTranslateY(-50);

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
	 * @return Der weiter-Button
	 */
	Button getButton_back() {
		return back;
	}

	Button getButton_unfall() {
		return unfall;
	}

	Button getButton_verletzt() {
		return verletzt;
	}

	Button getButton_notruf() {
		return notruf;
	}

}