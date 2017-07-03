package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Stabile_Seitenlage extends Basis {
	
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

		// Label Stabile Seitenlage
		Label stabileseitenlage = new Label("Stabile Seitenlage");
		
		// Image Stabile Seitenlage
		Image stabileseitenlagebild = new Image("file:images/Stabile Seitenlage.png");
		ImageView stabileseitenlagebild_view = new ImageView("file:images/Stabile Seitenlage.png");

		public Stabile_Seitenlage() {

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
		
		// Label Stabile Seitenlage 
		getChildren().add(stabileseitenlage);
		stabileseitenlage.setTranslateX(0);
		stabileseitenlage.setTranslateY(-175);
		stabileseitenlage.getStyleClass().add("button_ueberschrift");

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
