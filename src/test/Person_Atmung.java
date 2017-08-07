package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

public class Person_Atmung extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Label atmetpersonfrage = new Label("Atmet die Person?");

	Line line2 = new Line();

	Line line3 = new Line();

	Button ja = new Button("Ja");

	Button nein = new Button("Nein");

	Label atmunginfo = new Label(
			"Sehen (Brustbewegung, Hautfarbe)\n" + "Hören (Atemgeräusche)\n" + "Fühlen (Atemhauch)");

	Label atmunginfo2 = new Label("Atemwege\nfreimachen!");

	Image atemcheck_image = new Image("file:images/Atem-Check.png");
	ImageView atemcheck_view = new ImageView("file:images/Atem-Check.png");

	Image atemwege_image = new Image("file:images/Atemwege.png");
	ImageView atemwege_view = new ImageView("file:images/Atemwege.png");

	public Person_Atmung() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(atmetpersonfrage);
		atmetpersonfrage.setTranslateX(0);
		atmetpersonfrage.setTranslateY(-175);

		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-130);

		getChildren().add(line3);
		line3.setStartX(0);
		line3.setStartY(0);
		line3.setEndX(240);
		line3.setEndY(0);
		line3.setStrokeWidth(1.5);
		line3.setTranslateY(105);

		getChildren().add(ja);
		ja.setTranslateX(62.5);
		ja.setTranslateY(150);
		ja.getStyleClass().add("button_ja");

		getChildren().add(nein);
		nein.setTranslateX(-62.5);
		nein.setTranslateY(150);
		nein.getStyleClass().add("button_nein");

		getChildren().add(atmunginfo);
		atmunginfo.setTranslateX(0);
		atmunginfo.setTranslateY(50);
		atmunginfo.getStyleClass().add("atmunginfo_label");

		getChildren().add(atmunginfo2);
		atmunginfo2.setTranslateX(87);
		atmunginfo2.setTranslateY(-100);
		atmunginfo2.getStyleClass().add("infos_label2");

		getChildren().add(atemcheck_view);
		atemcheck_view.setFitHeight(114);
		atemcheck_view.setFitWidth(150);
		atemcheck_view.setTranslateX(-50);
		atemcheck_view.setTranslateY(-60);

		getChildren().add(atemwege_view);
		atemwege_view.setFitHeight(70);
		atemwege_view.setFitWidth(80);
		atemwege_view.setTranslateX(87);
		atemwege_view.setTranslateY(-38);
	}

	/**
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