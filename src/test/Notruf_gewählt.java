package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;

public class Notruf_gewählt extends Basis {
	
/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/	
	
		// Label Notruf gewählt
		Label notrufgewaehlt = new Label("Notruf gewählt?");

		// Linie 
		Line line2 = new Line();

		// Button Ja
		Button ja = new Button("Ja");

		// Button Nein
		Button nein = new Button("Nein");

		public Notruf_gewählt() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/
		
		// Label Notruf gewählt
		getChildren().add(notrufgewaehlt);
		notrufgewaehlt.setTranslateX(0);
		notrufgewaehlt.setTranslateY(-175);

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