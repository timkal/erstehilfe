package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Beatmung extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

/*=================================
	// Weitere Elemente
 =================================*/

	// Linie darunter
	Line line2 = new Line();

	// Zurueck zur Reanimation Button
	Button back_reanimation = new Button("Zurück zur Reanimation");

	// Reanimation Label
	Label reanimation = new Label("2. Beatmung");

	// Beatmung Label 
	Label beatmung1 = new Label("2x beatmen");

	// Beatmung Label 2
	Label beatmung2 = new Label("- Nase der Person bei der Mund zu Mund\n   Beatmung verschliessen\n"
			+ "- Beatmungsphase beträgt eine Sekunde\n"
			+ "- 30 mal kurz und kräftig herunterdrücken\n"
			+ "- Bei richtiger Durchführung hebt sich der\n   Brustkorb der Person sichtbar");

	// Beatmung Label 3
	Label beatmung3 = new Label("Schritt 1 und 2 solange wiederholen,\n" + "bis der Notarzt da ist oder keine\n"
			+ "Reanimation mehr benötigt wird");

	// Beatmung Image
	Image beatmung = new Image("file:images/Beatmung.png");
	ImageView beatmung_view = new ImageView("file:images/Beatmung.png");

	public Beatmung() {

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

		// Button Zurueck zur Reanimation
		getChildren().add(back_reanimation);
		back_reanimation.setTranslateX(0);
		back_reanimation.setTranslateY(185);
		back_reanimation.getStyleClass().add("button_weiter");

		// Reanimation Label
		getChildren().add(reanimation);
		reanimation.setTranslateX(0);
		reanimation.setTranslateY(-185);
		reanimation.getStyleClass().add("button_ueberschrift");

		// Beatmung Label
		getChildren().add(beatmung1);
		beatmung1.setTranslateX(54);
		beatmung1.setTranslateY(-100);
		beatmung1.getStyleClass().add("button_zusatzinfos");

		// Beatmung Image
		getChildren().add(beatmung_view);
		beatmung_view.setFitHeight(100);
		beatmung_view.setFitWidth(91);
		beatmung_view.setTranslateX(-65);
		beatmung_view.setTranslateY(-90);

		// Linie 2
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-30);

		// Beatmung Label 2
		getChildren().add(beatmung2);
		beatmung2.setTranslateX(0);
		beatmung2.setTranslateY(30);
		beatmung2.getStyleClass().add("anweisungen_label");

		// Beatmung Label 3
		getChildren().add(beatmung3);
		beatmung3.setTranslateX(0);
		beatmung3.setTranslateY(128);
		beatmung3.getStyleClass().add("beatmunginfo_label");
		beatmung3.setTextAlignment(TextAlignment.CENTER);

	}

	Button getButton_back_reanimation() {
		return back_reanimation;
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
