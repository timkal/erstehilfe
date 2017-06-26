package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Beduerfnisse_Person extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Beduerfnisse Person Label
	Label beduerfnisse = new Label("Beduerfnisse\nder Person");

	// Beduerfnisse Person Label 2
	Label beduerfnisse2 = new Label("- Ist der Person kalt?\n"
			+ "- Moechten Sie, dass Sie\n"
			+ "   eine vertraute Person\n" + "   anrufen?");

	// Beduerfnisse Person Label 3
	Label beduerfnisse3 = new Label("Kommen Sie den\nBeduerfnissen der\nPerson nach,\n"
			+ "waehrend sie auf den\nNotarzt warten.");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Beduerfnisse_Person() {

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

		// Beduerfnisse Person Label
		getChildren().add(beduerfnisse);
		beduerfnisse.setTranslateX(0);
		beduerfnisse.setTranslateY(-160);
		beduerfnisse.getStyleClass().add("button_ueberschrift");

		// Beduerfnisse Person Label 2
		getChildren().add(beduerfnisse2);
		beduerfnisse2.setTranslateX(0);
		beduerfnisse2.setTranslateY(-50);
		beduerfnisse2.getStyleClass().add("beduerfnisse_label");

		// Beduerfnisse Person Label 3
		getChildren().add(beduerfnisse3);
		beduerfnisse3.setTranslateX(0);
		beduerfnisse3.setTranslateY(100);
		beduerfnisse3.setTextAlignment(TextAlignment.CENTER);
		beduerfnisse3.getStyleClass().add("beduerfnisse2_label");

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
	 * @return Der weiter-Button
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
}
