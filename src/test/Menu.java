package test;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Menu extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurück");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	Button unfall = new Button("Verkehrsunfall");

	Button verletzt = new Button("Verletzte Person");

	public Menu() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Zurück Button und Symbol
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

		getChildren().add(unfall);
		unfall.getStyleClass().add("custom_button");
		unfall.setTranslateY(50);

		getChildren().add(verletzt);
		verletzt.getStyleClass().add("custom_button");
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