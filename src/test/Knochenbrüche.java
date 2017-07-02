package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Knochenbrüche extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurück");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Weiter Button
	Button weiter = new Button("Weiter");

	// Knochenbrüche Label
	Label knochenbrueche = new Label("Knochenbrüche");

	// Knochenbrüche Label 2
	Label knochenbrueche2 = new Label("   Bruchstelle\nnicht bewegen!");

	// Knochenbrüche Label 3
	Label knochenbrueche3 = new Label("Offener Bruch:\n" + "Mit keimfreier\n" + "Wundauflage\n" + "bedecken");

	// Knochenbrüche Label 4
	Label knochenbrueche4 = new Label("Geschlossener\n" + "Bruch: Kühlen\n");

	// Knochenbrüche Label 5
	Label knochenbrueche5 = new Label("Abgetrennte Körperteile\n" + "             sichern");


	public Knochenbrüche() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Zurück Button und Symbol
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
		
		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Knochenbrüche Label
		getChildren().add(knochenbrueche);
		knochenbrueche.setTranslateX(0);
		knochenbrueche.setTranslateY(-185);
		knochenbrueche.getStyleClass().add("button_ueberschrift");

		// Knochenbrüche Label 2
		getChildren().add(knochenbrueche2);
		knochenbrueche2.setTranslateX(0);
		knochenbrueche2.setTranslateY(-105);

		// Knochenbrüche Label 3
		getChildren().add(knochenbrueche3);
		knochenbrueche3.setTranslateX(0);
		knochenbrueche3.setTranslateY(0);
		knochenbrueche3.getStyleClass().add("brueche_label");

		// Knochenbrüche Label 4
		getChildren().add(knochenbrueche4);
		knochenbrueche4.setTranslateX(0);
		knochenbrueche4.setTranslateY(80);
		knochenbrueche4.getStyleClass().add("brueche_label");

		// Knochenbrüche Label 5
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
