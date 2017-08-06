package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;

public class Telefonnummern extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Line line2 = new Line();

	Label europa = new Label("European Union:     112");

	Label allelaender = new Label(
			"Argentinia:\nAustralia:\nBrasil:\nCanada:\nChina:\nHongkong:\nIsrael:\nJapan:\nMexico:\n"
					+ "New Zealand:\nNorway:\nSwitzerland:\nTurkey:\nUK:\nUSA:");

	Label zahlen = new Label("107\n000\n192\n911\n120\n999\n101\n119\n006\n111\n113\n144\n112\n999\n911");

	public Telefonnummern() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(300);
		line2.setEndY(0);
		line2.setStrokeWidth(0.5);
		line2.setTranslateY(-160);

		getChildren().add(europa);
		europa.setTranslateX(0);
		europa.setTranslateY(-190);

		getChildren().add(allelaender);
		allelaender.setTranslateX(-30);
		allelaender.setTranslateY(28);
		allelaender.getStyleClass().add("land_label");

		getChildren().add(zahlen);
		zahlen.setTranslateX(60);
		zahlen.setTranslateY(28);
		zahlen.getStyleClass().add("zahlen_label");
	}

	// getButton Methode gibt den unter return angegebenen Button zurück, um als
	// Referenz für die ActionEvents zu dienen
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