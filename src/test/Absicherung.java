package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Absicherung extends Basis {

	// ------------------------------------------------------------------------------------------

	// =================================
	// Zurück
	// =================================

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Infos Label
	Label infos2 = new Label("1. Wenn moeglich, Fahrzeug\n" + "     an den Fahrbahnrand\n" + "2. Warnweste anlegen \n"
			+ "3. Warndreieck aufstellen\n" + "        Innerorts: 50 m\n" + 
			"        Landstrasse: 100 m\n" + "        Autobahn: 150 m\n");
	
	// Button weiter
	Button weiter = new Button("Weiter");
	
	// Label Absicherung&Symbol
	Label absicherung = new Label("Absicherung der\nUnfallstelle");
	Image absicherung_image = new Image("file:images/Absicherung Unfallstelle.png");
	ImageView absicherung_view = new ImageView("file:images/Absicherung Unfallstelle.png");

	
	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Absicherung() {

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

		// Label Absicherung
		getChildren().add(absicherung);
		absicherung.setTranslateX(0);
		absicherung.setTranslateY(-165);
		absicherung.getStyleClass().add("button_ueberschrift");

		// Absicherung Image
		getChildren().add(absicherung_view);
		absicherung_view.setFitHeight(120);
		absicherung_view.setFitWidth(120);
		absicherung_view.setTranslateX(0);
		absicherung_view.setTranslateY(-55);

		// Label Infos
		getChildren().add(infos2);
		infos2.setTranslateX(0);
		infos2.setTranslateY(88);
		infos2.getStyleClass().add("infos2_label");

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
