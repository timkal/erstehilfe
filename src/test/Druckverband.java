package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Druckverband extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Linie darunter
	Line line2 = new Line();

	// Zurueck zur Reanimation Button
	Button weiter = new Button("Weiter");

	// Druckverband Label
	Label druckverband = new Label("Druckverband");

	// Druckverband Label 2
	Label druckverband2 = new Label("1. Betroffenes K�rperteil hochhalten\n" + "2. Wunde mit steriler Wundauflage\n"
			+ "    bedecken\n" + "   (Alternative sauberes Taschentuch)\n"
			+ "3. nicht saugf�higer Druckk�rper auf der\n" + "    bereits abgedeckten Wunde fixieren");

	// Druckverband Image
	Image druckverbandbild = new Image("file:images/Druckverband.png");
	ImageView druckverbandbild_view = new ImageView("file:images/Druckverband.png");

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Druckverband() {

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

		// Linie 2
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-10);

		// Druckverband Label
		getChildren().add(druckverband);
		druckverband.setTranslateX(0);
		druckverband.setTranslateY(-185);
		druckverband.getStyleClass().add("button_ueberschrift");

		// Druckverband Label 2
		getChildren().add(druckverband2);
		druckverband2.setTranslateX(0);
		druckverband2.setTranslateY(50);
		druckverband2.getStyleClass().add("beatmunginfo_label");

		// Druckverband Image
		getChildren().add(druckverbandbild_view);
		druckverbandbild_view.setFitHeight(123);
		druckverbandbild_view.setFitWidth(150);
		druckverbandbild_view.setTranslateX(0);
		druckverbandbild_view.setTranslateY(-85);

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
	
	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}
