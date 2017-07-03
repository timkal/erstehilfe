package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rettungsgriff extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/

		// Button Zurück  
		Button back = new Button("Zurück");
		
		// Image Zurück
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

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

		// Button Zurück 
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		
		// Image Zurück
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);
		
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
