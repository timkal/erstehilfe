package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Person_entfernt extends Basis {
	
/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/

		// Label Person entfernt
		Label personentfernt = new Label("Person vom Unfallort\nentfernt?");

		// Label Hinweis
		Label hinweis = new Label("Beachte:\n" + "Bei Verdacht auf eine\n" + "Wirbelsäulenverletzung nur\n"
			+ "aus lebensgefährlicher\n" + "Umgebung entfernen!");
		
		// Linie 
		Line line2 = new Line();

		// Button Ja
		Button ja = new Button("Ja");

		// Button Nein
		Button nein = new Button("Nein");

		public Person_entfernt() {

		getStylesheets().add("test/styles.css");

/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/

		// Label Person entfernt 
		getChildren().add(personentfernt);
		personentfernt.setTranslateX(0);
		personentfernt.setTranslateY(-175);
        personentfernt.setTextAlignment(TextAlignment.CENTER);
        
		// Label Hinweis
		getChildren().add(hinweis);
		hinweis.setTranslateX(0);
		hinweis.setTranslateY(-60);
		hinweis.getStyleClass().add("hinweis_label");
		hinweis.setTextAlignment(TextAlignment.CENTER);

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
