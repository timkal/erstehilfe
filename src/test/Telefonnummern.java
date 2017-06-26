package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls plaziert
 * sind
 */
public class Telefonnummern extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurueck Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// Linie 2
	Line line2 = new Line();

	// Oberes Label Nummer
	Label europa = new Label("European Union:     112");

	// Unteres Label Nummern
	Label allelaender = new Label("Argentinia:\nAustralia:\nBrasil:\nCanada:\nChina:\nHongkong:\nIsrael:\nJapan:\nMexico:\n"
			+ "New Zealand:\nNorway:\nSwitzerland:\nTurkey:\nUK:\nUSA:");
	
	// Zahlen Label
	Label zahlen = new Label("107\n000\n192\n911\n120\n999\n101\n119\n006\n111\n113\n144\n112\n999\n911");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, bezeihen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Telefonnummern() {

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

		// Linie 2
		getChildren().add(line2);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);
		line.setStrokeWidth(0.5);
		line.setTranslateY(-160);

		// Oberes Label Nummer 
		getChildren().add(europa);
		europa.setTranslateX(0);
		europa.setTranslateY(-190);

		// Unteres Label Nummern
		getChildren().add(allelaender);
		allelaender.setTranslateX(-30);
		allelaender.setTranslateY(28);
		allelaender.getStyleClass().add("land_label");
		
		// Zahlen Label
		getChildren().add(zahlen);
		zahlen.setTranslateX(60);
		zahlen.setTranslateY(28);
		zahlen.getStyleClass().add("zahlen_label");

		// Weitere Elemente hinzufügen

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * 
	 * @return Der weiter-Button
	 */
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