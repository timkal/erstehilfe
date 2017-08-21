package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Beatmung extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button back_reanimation = new Button("Zurück zur Reanimation");

	Label reanimation = new Label("2. Beatmung");

	Label beatmung1 = new Label("2x beatmen");

	Image beatmung = new Image("file:images/Beatmung.png");
	ImageView beatmung_view = new ImageView("file:images/Beatmung.png");

	Line line2 = new Line();

	Label beatmung2 = new Label("- Nase der Person bei der Mund-zu-Mund\n   Beatmung verschliessen\n"
			+ "- Beatmungsphase beträgt eine Sekunde\n"
			+ "- Bei richtiger Durchführung hebt sich der\n   Brustkorb der Person sichtbar");

	Label beatmung3 = new Label("Schritt 1 und 2 solange wiederholen,\n" + "bis der Notarzt da ist oder keine\n"
			+ "Reanimation mehr benötigt wird");

	public Beatmung() {

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(back_reanimation);
		back_reanimation.setTranslateX(0);
		back_reanimation.setTranslateY(185);
		back_reanimation.getStyleClass().add("button_weiter");

		getChildren().add(reanimation);
		reanimation.setTranslateX(0);
		reanimation.setTranslateY(-185);
		reanimation.getStyleClass().add("label_ueberschrift");

		getChildren().add(beatmung1);
		beatmung1.setTranslateX(54);
		beatmung1.setTranslateY(-100);
		beatmung1.getStyleClass().add("button_zusatzinfos");

		getChildren().add(beatmung_view);
		beatmung_view.setFitHeight(100);
		beatmung_view.setFitWidth(91);
		beatmung_view.setTranslateX(-65);
		beatmung_view.setTranslateY(-90);

		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-30);

		getChildren().add(beatmung2);
		beatmung2.setTranslateX(0);
		beatmung2.setTranslateY(30);
		beatmung2.getStyleClass().add("anweisungen_label");

		getChildren().add(beatmung3);
		beatmung3.setTranslateX(0);
		beatmung3.setTranslateY(128);
		beatmung3.getStyleClass().add("beatmunginfo_label");
		beatmung3.setTextAlignment(TextAlignment.CENTER);
	}

	/*
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */

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
