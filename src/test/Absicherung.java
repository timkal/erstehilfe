package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Absicherung extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button weiter = new Button("Weiter");

	Label absicherung = new Label("Absicherung der\nUnfallstelle");

	Image absicherung_image = new Image("file:images/Absicherung Unfallstelle.png");
	ImageView absicherung_view = new ImageView("file:images/Absicherung Unfallstelle.png");

	Label infos2 = new Label("1. Wenn möglich, Fahrzeug\n" + "     an den Fahrbahnrand\n" + "2. Warnweste anlegen \n"
			+ "3. Warndreieck aufstellen\n" + "        Innerorts: 50 m\n" + "        Landstrasse: 100 m\n"
			+ "        Autobahn: 150 m\n");

	public Absicherung() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		getChildren().add(absicherung);
		absicherung.setTranslateX(0);
		absicherung.setTranslateY(-165);
		absicherung.getStyleClass().add("label_ueberschrift");

		getChildren().add(absicherung_view);
		absicherung_view.setFitHeight(120);
		absicherung_view.setFitWidth(120);
		absicherung_view.setTranslateX(0);
		absicherung_view.setTranslateY(-55);

		getChildren().add(infos2);
		infos2.setTranslateX(0);
		infos2.setTranslateY(88);
		infos2.getStyleClass().add("infos_label2");
	}

	/**
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
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

	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}
