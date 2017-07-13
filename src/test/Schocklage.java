package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Schocklage extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	// Button Weiter
	Button weiter = new Button("Weiter");

	// Label Schocklage
	Label schocklage = new Label("Schocklage");

	// Label 2 Schocklage
	Label schocklage2 = new Label("- Person zudecken\n" + "- beengende Kleidung\n   öffnen");

	// Image Schocklage
	Image schocklagebild = new Image("file:images/Schocklage.png");
	ImageView schocklagebild_view = new ImageView("file:images/Schocklage.png");

	public Schocklage() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Label Schocklage
		getChildren().add(schocklage);
		schocklage.setTranslateX(0);
		schocklage.setTranslateY(-185);
		schocklage.getStyleClass().add("label_ueberschrift");

		// Label 2 Schocklage
		getChildren().add(schocklage2);
		schocklage2.setTranslateX(0);
		schocklage2.setTranslateY(95);
		schocklage2.getStyleClass().add("anweisungen_label2");

		// Image Schocklage
		getChildren().add(schocklagebild_view);
		schocklagebild_view.setFitHeight(213);
		schocklagebild_view.setFitWidth(290);
		schocklagebild_view.setTranslateX(0);
		schocklagebild_view.setTranslateY(-50);
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
