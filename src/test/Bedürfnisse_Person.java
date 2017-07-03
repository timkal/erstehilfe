package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Bedürfnisse_Person extends Basis {
	
/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
	
		// Button Zurück 
		Button back = new Button("Zurück");
		
		// Image Zurück
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

		// Label Bedürfnisse Person
		Label beduerfnisse = new Label("Bedürfnisse\nder Person");

		// Label 2 Bedürfnisse Person 
		Label beduerfnisse2 = new Label("- Ist der Person kalt?\n"
			+ "- Möchten Sie, dass Sie\n"
			+ "   eine vertraute Person\n" + "   anrufen?");

		// Label 3 Bedürfnisse Person
		Label beduerfnisse3 = new Label("Kommen Sie den\nBedürfnissen der\nPerson nach,\n"
			+ "während sie auf den\nNotarzt warten.");

		public Bedürfnisse_Person() {

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

		// Label Bedürfnisse Person
		getChildren().add(beduerfnisse);
		beduerfnisse.setTranslateX(0);
		beduerfnisse.setTranslateY(-160);
		beduerfnisse.getStyleClass().add("button_ueberschrift");

		// Label 2 Bedürfnisse Person 
		getChildren().add(beduerfnisse2);
		beduerfnisse2.setTranslateX(0);
		beduerfnisse2.setTranslateY(-50);
		beduerfnisse2.getStyleClass().add("beduerfnisse_label");

		// Label 3 Bedürfnisse Person 
		getChildren().add(beduerfnisse3);
		beduerfnisse3.setTranslateX(0);
		beduerfnisse3.setTranslateY(100);
		beduerfnisse3.getStyleClass().add("beduerfnisse_label2");
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
	
		Button getButton_back() {
		return back;
	}
}
