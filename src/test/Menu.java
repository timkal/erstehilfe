package test;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Menu extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
	
		// Button Zurück 
		Button back = new Button("Zurück");
		
		// Image Zurück
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");
		
		// Button Verkehrsunfall
		Button unfall = new Button("Verkehrsunfall");

		// Button Verletzte Person
		Button verletzt = new Button("Verletzte Person");

		public Menu() {

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

		// Button Verkehrsunfall
		getChildren().add(unfall);
		unfall.getStyleClass().add("button_menue");
		unfall.setTranslateY(50);
		
		// Button Verletzte Person
		getChildren().add(verletzt);
		verletzt.getStyleClass().add("button_menue");
		verletzt.setTranslateY(-50);
	}

		Button getButton_back() {
		return back;
	}
		
		Button getButton_unfall() {
		return unfall;
	}

		Button getButton_verletzt() {
		return verletzt;
	}

		Button getButton_notruf() {
		return notruf;
	}
	
		Button getButton_krankenhaus() {
		return krankenhaus;
	}
}