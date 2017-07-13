package test;

import javafx.scene.control.Button;

public class Menu extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	// Button Verkehrsunfall
	Button unfall = new Button("Verkehrsunfall");

	// Button Verletzte Person
	Button verletzt = new Button("Verletzte Person");

	public Menu() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Button Verkehrsunfall
		getChildren().add(unfall);
		unfall.getStyleClass().add("button_menue");
		unfall.setTranslateY(50);

		// Button Verletzte Person
		getChildren().add(verletzt);
		verletzt.getStyleClass().add("button_menue");
		verletzt.setTranslateY(-50);
	}

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

	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}