package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Stabile_Seitenlage extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button weiter = new Button("Weiter");

	Label stabileseitenlage = new Label("Stabile Seitenlage");

	Image stabileseitenlagebild = new Image("file:images/Stabile Seitenlage.png");
	ImageView stabileseitenlagebild_view = new ImageView("file:images/Stabile Seitenlage.png");

	public Stabile_Seitenlage() {

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		getChildren().add(stabileseitenlage);
		stabileseitenlage.setTranslateX(0);
		stabileseitenlage.setTranslateY(-175);
		stabileseitenlage.getStyleClass().add("label_ueberschrift");

		getChildren().add(stabileseitenlagebild_view);
		stabileseitenlagebild_view.setFitHeight(220);
		stabileseitenlagebild_view.setFitWidth(292);
		stabileseitenlagebild_view.setTranslateX(0);
		stabileseitenlagebild_view.setTranslateY(0);
	}

	/*
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
