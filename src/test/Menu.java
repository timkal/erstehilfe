package test;

import javafx.scene.control.Button;

public class Menu extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button unfall = new Button("Verkehrsunfall");

	Button verletzt = new Button("Verletzte Person");

	public Menu() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(unfall);
		unfall.getStyleClass().add("button_menue");
		unfall.setTranslateY(50);

		getChildren().add(verletzt);
		verletzt.getStyleClass().add("button_menue");
		verletzt.setTranslateY(-50);
	}

	/**
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
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

	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}