package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Stabile_Seitenlage extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	// Button Weiter
	Button weiter = new Button("Weiter");

	// Label Stabile Seitenlage
	Label stabileseitenlage = new Label("Stabile Seitenlage");

	// Image Stabile Seitenlage
	Image stabileseitenlagebild = new Image("file:images/Stabile Seitenlage.png");
	ImageView stabileseitenlagebild_view = new ImageView("file:images/Stabile Seitenlage.png");

	public Stabile_Seitenlage() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Label Stabile Seitenlage
		getChildren().add(stabileseitenlage);
		stabileseitenlage.setTranslateX(0);
		stabileseitenlage.setTranslateY(-175);
		stabileseitenlage.getStyleClass().add("label_ueberschrift");

		// Image Stabile Seitenlage
		getChildren().add(stabileseitenlagebild_view);
		stabileseitenlagebild_view.setFitHeight(220);
		stabileseitenlagebild_view.setFitWidth(292);
		stabileseitenlagebild_view.setTranslateX(0);
		stabileseitenlagebild_view.setTranslateY(0);
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
