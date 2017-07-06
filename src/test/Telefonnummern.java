package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

public class Telefonnummern extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/

		// Linie 
		Line line2 = new Line();

		// Label Nummer EU
		Label europa = new Label("European Union:     112");

		// Label Nummern Länder
		Label allelaender = new Label("Argentinia:\nAustralia:\nBrasil:\nCanada:\nChina:\nHongkong:\nIsrael:\nJapan:\nMexico:\n"
			+ "New Zealand:\nNorway:\nSwitzerland:\nTurkey:\nUK:\nUSA:");
	
		// Label Zahlen
		Label zahlen = new Label("107\n000\n192\n911\n120\n999\n101\n119\n006\n111\n113\n144\n112\n999\n911");

		public Telefonnummern() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/

		// Linie 
		getChildren().add(line2);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);
		line.setStrokeWidth(0.5);
		line.setTranslateY(-160);

		// Label Nummer EU
		getChildren().add(europa);
		europa.setTranslateX(0);
		europa.setTranslateY(-190);

		// Label Nummern Länder
		getChildren().add(allelaender);
		allelaender.setTranslateX(-30);
		allelaender.setTranslateY(28);
		allelaender.getStyleClass().add("land_label");
		
		// Label Zahlen
		getChildren().add(zahlen);
		zahlen.setTranslateX(60);
		zahlen.setTranslateY(28);
		zahlen.getStyleClass().add("zahlen_label");
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