package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Knochenbrüche extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
		
		// Button Weiter
		Button weiter = new Button("Weiter");

		// Label Knochenbrüche
		Label knochenbrueche = new Label("Knochenbrüche");

		// Label 2 Knochenbrüche
		Label knochenbrueche2 = new Label("   Bruchstelle\nnicht bewegen!");

		// Label 3 Knochenbrüche 
		Label knochenbrueche3 = new Label("Offener Bruch:\n" + "Mit keimfreier\n" + "Wundauflage\n" + "bedecken");

		// Label 4 Knochenbrüche 
		Label knochenbrueche4 = new Label("Geschlossener\n" + "Bruch: Kühlen\n");

		// Label 5 Knochenbrüche
		Label knochenbrueche5 = new Label("Abgetrennte Körperteile\n" + "             sichern");

		public Knochenbrüche() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");
		
/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Label Knochenbrüche
		getChildren().add(knochenbrueche);
		knochenbrueche.setTranslateX(0);
		knochenbrueche.setTranslateY(-185);
		knochenbrueche.getStyleClass().add("button_ueberschrift");

		// Label 2 Knochenbrüche
		getChildren().add(knochenbrueche2);
		knochenbrueche2.setTranslateX(0);
		knochenbrueche2.setTranslateY(-105);

		// Label 3 Knochenbrüche
		getChildren().add(knochenbrueche3);
		knochenbrueche3.setTranslateX(0);
		knochenbrueche3.setTranslateY(0);
		knochenbrueche3.getStyleClass().add("brueche_label");

		// Label 4 Knochenbrüche
		getChildren().add(knochenbrueche4);
		knochenbrueche4.setTranslateX(0);
		knochenbrueche4.setTranslateY(80);
		knochenbrueche4.getStyleClass().add("brueche_label");

		// Label 5 Knochenbrüche 
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
