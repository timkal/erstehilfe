package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Knochen_verletzt extends Basis {

	// Zurück Button und Symbol
	Button back = new Button("Zurück");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// Knochen verletzt Label
	Label knochenverletzt = new Label("Sind Knochen der\nPerson verletzt?");

	// Linie darunter
	Line line2 = new Line();

	// Button Ja
	Button ja = new Button("Ja");

	// Button Nein
	Button nein = new Button("Nein");

	public Knochen_verletzt() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// =================================
		// TOP Bar importieren und anordnen
		// =================================

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

		// Label Knochen verletzt
		getChildren().add(knochenverletzt);
		knochenverletzt.setTranslateX(0);
		knochenverletzt.setTranslateY(-175);
        knochenverletzt.setTextAlignment(TextAlignment.CENTER);

		// Linie 2
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-130);

		// Button ja
		getChildren().add(ja);
		ja.setTranslateX(62.5);
		ja.setTranslateY(50);
		ja.getStyleClass().add("button_ja");

		// Button nein
		getChildren().add(nein);
		nein.setTranslateX(-62.5);
		nein.setTranslateY(50);
		nein.getStyleClass().add("button_nein");
	}

	Button getButton_ja() {
		return ja;
	}

	Button getButton_nein() {
		return nein;
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