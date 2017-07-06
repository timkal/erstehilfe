package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rettungsgriff extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/

		// Button Weiter 
		Button weiter = new Button("Weiter");

		// Label Rettungsgriff 
		Label rettungsgriff = new Label("Rettungsgriff");
		
		// Image Rettungsgriff
		Image rettungsgriffbild = new Image("file:images/Rettungsgriff.png");
		ImageView rettungsgriffbild_view = new ImageView("file:images/Rettungsgriff.png");

		public Rettungsgriff() {

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
		
		// Label Rettungsgriff
		getChildren().add(rettungsgriff);
		rettungsgriff.setTranslateX(0);
		rettungsgriff.setTranslateY(-175);
		rettungsgriff.getStyleClass().add("button_ueberschrift");

		// Image Rettungsgriff
		getChildren().add(rettungsgriffbild_view);
		rettungsgriffbild_view.setFitHeight(220);
		rettungsgriffbild_view.setFitWidth(220);
		rettungsgriffbild_view.setTranslateX(0);
		rettungsgriffbild_view.setTranslateY(0);
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
