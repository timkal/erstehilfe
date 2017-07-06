package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Unfallstelle_abgesichert extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/

		// Label Unfallstelle abgesichert
		Label unfallstelleabgesichert = new Label("Unfallstelle\nabgesichert?");

		// Linie 
		Line line2 = new Line();

		// Button Ja
		Button ja = new Button("Ja");

		// Button Nein
		Button nein = new Button("Nein");

		public Unfallstelle_abgesichert() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/

		// Label Unfallstelle abgesichert 
		getChildren().add(unfallstelleabgesichert);
		unfallstelleabgesichert.setTranslateX(0);
		unfallstelleabgesichert.setTranslateY(-175);
		unfallstelleabgesichert.setTextAlignment(TextAlignment.CENTER);

		// Linie 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-130);

		// Button Ja
		getChildren().add(ja);
		ja.setTranslateX(62.5);
		ja.setTranslateY(50);
		ja.getStyleClass().add("button_ja");

		// Button Nein
		getChildren().add(nein);
		nein.setTranslateX(-62.5);
		nein.setTranslateY(50);
		nein.getStyleClass().add("button_nein");
	}

		Button getButton_ja() {
		return ja;
	}

		Button getButton_nein() {
		return nein;
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
