package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Knochenbrueche extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Weiter Button
	Button weiter = new Button("Weiter");

	// Knochenbrueche Label
	Label knochenbrueche = new Label("Knochenbrueche");

	// Knochenbrueche Label 2
	Label knochenbrueche2 = new Label("   Bruchstelle\nnicht bewegen!");

	// Knochenbrueche Label 3
	Label knochenbrueche3 = new Label("Offener Bruch:\n" + "Mit keimfreier\n" + "Wundauflage\n" + "bedecken");

	// Knochenbrueche Label 4
	Label knochenbrueche4 = new Label("Geschlossener\n" + "Bruch: Kuehlen\n");

	// Knochenbrueche Label 5
	Label knochenbrueche5 = new Label("Abgetrennte Koerperteile\n" + "             sichern");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Knochenbrueche() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Zuruck Button und Symbol
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Weitere Elemente hinzufügen

		// Knochenbrueche Label
		getChildren().add(knochenbrueche);
		knochenbrueche.setTranslateX(0);
		knochenbrueche.setTranslateY(-185);
		knochenbrueche.getStyleClass().add("button_absicherung");

		// Knochenbrueche Label 2
		getChildren().add(knochenbrueche2);
		knochenbrueche2.setTranslateX(0);
		knochenbrueche2.setTranslateY(-120);

		// Knochenbrueche Label 3
		getChildren().add(knochenbrueche3);
		knochenbrueche3.setTranslateX(0);
		knochenbrueche3.setTranslateY(-40);
		knochenbrueche3.getStyleClass().add("button_brueche");

		// Knochenbrueche Label 4
		getChildren().add(knochenbrueche4);
		knochenbrueche4.setTranslateX(0);
		knochenbrueche4.setTranslateY(36);
		knochenbrueche4.getStyleClass().add("button_brueche");

		// Knochenbrueche Label 5
		getChildren().add(knochenbrueche5);
		knochenbrueche5.setTranslateX(0);
		knochenbrueche5.setTranslateY(115);
		knochenbrueche5.getStyleClass().add("land_label");

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
	 * @return Der weiter-Button
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

}
