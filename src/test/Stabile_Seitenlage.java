package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Stabile_Seitenlage extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Weiter Button
	Button weiter = new Button("Weiter");

	// Stabile Seitenlage Label&Symbol
	Label stabileseitenlage = new Label("Stabile Seitenlage");
	Image stabileseitenlagebild = new Image("file:images/Stabile Seitenlage.png");
	ImageView stabileseitenlagebild_view = new ImageView("file:images/Stabile Seitenlage.png");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Stabile_Seitenlage() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// =================================
		// TOP Bar importieren und anordnen
		// =================================

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

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

		// Stabile Seitenlage Label
		getChildren().add(stabileseitenlage);
		stabileseitenlage.setTranslateX(0);
		stabileseitenlage.setTranslateY(-175);
		stabileseitenlage.getStyleClass().add("button_absicherung");

		// Rettungsgriff Image
		getChildren().add(stabileseitenlagebild_view);
		stabileseitenlagebild_view.setFitHeight(220);
		stabileseitenlagebild_view.setFitWidth(292);
		stabileseitenlagebild_view.setTranslateX(0);
		stabileseitenlagebild_view.setTranslateY(0);

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
	 * @return Der weiter-Button
	 */

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
}
