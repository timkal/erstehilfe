package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;

public class Bedürfnisse_Person extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurück");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Bedürfnisse Person Label
	Label beduerfnisse = new Label("Bedürfnisse\nder Person");

	// Bedürfnisse Person Label 2
	Label beduerfnisse2 = new Label("- Ist der Person kalt?\n"
			+ "- Möchten Sie, dass Sie\n"
			+ "   eine vertraute Person\n" + "   anrufen?");

	// Bedürfnisse Person Label 3
	Label beduerfnisse3 = new Label("Kommen Sie den\nBedürfnissen der\nPerson nach,\n"
			+ "während sie auf den\nNotarzt warten.");

	
	public Bedürfnisse_Person() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Zuruck Button und Symbol
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

		// Bedürfnisse Person Label
		getChildren().add(beduerfnisse);
		beduerfnisse.setTranslateX(0);
		beduerfnisse.setTranslateY(-160);
		beduerfnisse.getStyleClass().add("button_ueberschrift");

		// Bedürfnisse Person Label 2
		getChildren().add(beduerfnisse2);
		beduerfnisse2.setTranslateX(0);
		beduerfnisse2.setTranslateY(-50);
		beduerfnisse2.getStyleClass().add("beduerfnisse_label");

		// Bedürfnisse Person Label 3
		getChildren().add(beduerfnisse3);
		beduerfnisse3.setTranslateX(0);
		beduerfnisse3.setTranslateY(100);
		beduerfnisse3.setTextAlignment(TextAlignment.CENTER);
		beduerfnisse3.getStyleClass().add("beduerfnisse2_label");

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
