package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Reanimation extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Anleitung Button
	Button anleitung = new Button("Anleitung");

	// Reanimation Label
	Label reanimation = new Label("Reanimation\nWiederholen bis\nder Notarzt da ist");

	// Beatmung Label
	Label beatmung1 = new Label("2x beatmen");

	// Herzdruck Label
	Label herzdruck2 = new Label("30x druecken");

	// Herzdruckmassage Image
	Image herzdruck = new Image("file:images/Herzdruckmassage.png");
	ImageView herzdruck_view = new ImageView("file:images/Herzdruckmassage.png");

	// Beatmung Image
	Image beatmung = new Image("file:images/Beatmung.png");
	ImageView beatmung_view = new ImageView("file:images/Beatmung.png");

	// Druck Label&Kreis&Symbol
	Label druck = new Label("Druck-\nfrequenz");
	final int radius = 40;
	Circle druck1 = new Circle(radius, Color.GREY);
	Image druckfrequenz = new Image("file:images/Druckfrequenz.png");
	ImageView druckfrequenz_view = new ImageView("file:images/Druckfrequenz.png");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Reanimation() {

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

		
		// Anleitung Button
		getChildren().add(anleitung);
		anleitung.setTranslateX(0);
		anleitung.setTranslateY(185);
		anleitung.getStyleClass().add("button_anleitung");

		// Reanimation Label
		getChildren().add(reanimation);
		reanimation.setTranslateX(0);
		reanimation.setTranslateY(-160);
		reanimation.getStyleClass().add("button_absicherung");

		// Beatmung Label
		getChildren().add(beatmung1);
		beatmung1.setTranslateX(-70);
		beatmung1.setTranslateY(90);
		beatmung1.getStyleClass().add("button_anderesland");

		// Herzdruck Label
		getChildren().add(herzdruck2);
		herzdruck2.setTranslateX(70);
		herzdruck2.setTranslateY(10);
		herzdruck2.getStyleClass().add("button_anderesland");

		// Herzdruckmassage Image
		getChildren().add(herzdruck_view);
		herzdruck_view.setFitHeight(150);
		herzdruck_view.setFitWidth(126);
		herzdruck_view.setTranslateX(-70);
		herzdruck_view.setTranslateY(-20);

		// Beatmung Image
		getChildren().add(beatmung_view);
		beatmung_view.setFitHeight(100);
		beatmung_view.setFitWidth(91);
		beatmung_view.setTranslateX(65);
		beatmung_view.setTranslateY(100);

		// Druckfrequenz Label&Kreis&Symbol
		getChildren().add(druck1);
		druck1.setFill(Color.GREEN);
		druck1.setTranslateX(70);
		druck1.setTranslateY(-60);
		getChildren().add(druck);
		druck.setTranslateX(72);
		druck.setTranslateY(-70);
		druck.getStyleClass().add("druck_label");
		getChildren().add(druckfrequenz_view);
		druckfrequenz_view.setFitHeight(25);
		druckfrequenz_view.setFitWidth(25);
		druckfrequenz_view.setTranslateX(70);
		druckfrequenz_view.setTranslateY(-38);
	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
	 * @return Der weiter-Button
	 */

	Button getButton_anleitung() {
		return anleitung;

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
}
