package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Bedürfnisse_Person extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Label beduerfnisse = new Label("Bedürfnisse\nder Person");

	Label beduerfnisse2 = new Label(
			"- Ist der Person kalt?\n" + "- Möchten Sie, dass Sie\n" + "   eine vertraute Person\n" + "   anrufen?");

	Label beduerfnisse3 = new Label(
			"Kommen Sie den\nBedürfnissen der\nPerson nach,\n" + "während sie auf den\nNotarzt warten.");

	public Bedürfnisse_Person() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(beduerfnisse);
		beduerfnisse.setTranslateX(0);
		beduerfnisse.setTranslateY(-160);
		beduerfnisse.getStyleClass().add("label_ueberschrift");

		getChildren().add(beduerfnisse2);
		beduerfnisse2.setTranslateX(0);
		beduerfnisse2.setTranslateY(-50);
		beduerfnisse2.getStyleClass().add("beduerfnisse_label");

		getChildren().add(beduerfnisse3);
		beduerfnisse3.setTranslateX(0);
		beduerfnisse3.setTranslateY(100);
		beduerfnisse3.getStyleClass().add("beduerfnisse_label2");
	}

	/**
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */
	Button getButton_menu() {
		return menu;
	}

	Button getButton_notruf() {
		return notruf;
	}

	Button getButton_krankenhaus() {
		return krankenhaus;
	}

	Button getButton_back() {
		return back;
	}
}
