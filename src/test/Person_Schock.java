package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Person_Schock extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Label schock = new Label("Hat die Person einen\nSchock?");

	Label anzeichen = new Label("Anzeichen:\n" + "- beschleunigte Atmung\n" + "- blasse, kühle Haut\n"
			+ "- unklare Äußerungen des Betroffenen\n");

	Line line2 = new Line();

	Button ja = new Button("Ja");

	Button nein = new Button("Nein");

	public Person_Schock() {

		/*------------------------------------
		Seitenspezifische Elemente erzeugen
		------------------------------------*/

		getChildren().add(schock);
		schock.setTranslateX(0);
		schock.setTranslateY(-175);
		schock.setTextAlignment(TextAlignment.CENTER);

		getChildren().add(anzeichen);
		anzeichen.setTranslateX(0);
		anzeichen.setTranslateY(-90);
		anzeichen.getStyleClass().add("anzeichen_label");

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

	/*
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */

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
