package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Person_entfernt extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Label personentfernt = new Label("Person vom Unfallort\nentfernt?");

	Label hinweis = new Label("Beachte:\n" + "Bei Verdacht auf eine\n" + "Wirbelsäulenverletzung nur\n"
			+ "aus lebensgefährlicher\n" + "Umgebung entfernen!");

	Line line2 = new Line();

	Button ja = new Button("Ja");

	Button nein = new Button("Nein");

	public Person_entfernt() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(personentfernt);
		personentfernt.setTranslateX(0);
		personentfernt.setTranslateY(-175);
		personentfernt.setTextAlignment(TextAlignment.CENTER);

		getChildren().add(hinweis);
		hinweis.setTranslateX(0);
		hinweis.setTranslateY(-60);
		hinweis.getStyleClass().add("hinweis_label");
		hinweis.setTextAlignment(TextAlignment.CENTER);

		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-130);

		getChildren().add(ja);
		ja.setTranslateX(62.5);
		ja.setTranslateY(50);
		ja.getStyleClass().add("button_ja");

		getChildren().add(nein);
		nein.setTranslateX(-62.5);
		nein.setTranslateY(50);
		nein.getStyleClass().add("button_nein");
	}
	
	// getButton Methode gibt den unter return angegebenen Button zurück, um als
	// Referenz für die ActionEvents zu dienen
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
