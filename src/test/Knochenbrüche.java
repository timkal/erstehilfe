package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Knochenbrüche extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button weiter = new Button("Weiter");

	Label knochenbrueche = new Label("Knochenbrüche");

	Label knochenbrueche2 = new Label("   Bruchstelle\nnicht bewegen!");

	Label knochenbrueche3 = new Label("Offener Bruch:\n" + "Mit keimfreier\n" + "Wundauflage\n" + "bedecken");

	Label knochenbrueche4 = new Label("Geschlossener\n" + "Bruch: Kühlen\n");

	Label knochenbrueche5 = new Label("Abgetrennte Körperteile\n" + "             sichern");

	public Knochenbrüche() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		getChildren().add(knochenbrueche);
		knochenbrueche.setTranslateX(0);
		knochenbrueche.setTranslateY(-185);
		knochenbrueche.getStyleClass().add("label_ueberschrift");

		getChildren().add(knochenbrueche2);
		knochenbrueche2.setTranslateX(0);
		knochenbrueche2.setTranslateY(-105);

		getChildren().add(knochenbrueche3);
		knochenbrueche3.setTranslateX(0);
		knochenbrueche3.setTranslateY(0);
		knochenbrueche3.getStyleClass().add("brueche_label");

		getChildren().add(knochenbrueche4);
		knochenbrueche4.setTranslateX(0);
		knochenbrueche4.setTranslateY(80);
		knochenbrueche4.getStyleClass().add("brueche_label");

		getChildren().add(knochenbrueche5);
		knochenbrueche5.setTranslateX(0);
		knochenbrueche5.setTranslateY(140);
		knochenbrueche5.getStyleClass().add("anweisungen_label2");
	}

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
