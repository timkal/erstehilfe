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

	// Label 1
	Label europa = new Label("European Union:     112");

	// Label 2
	Label allelaender = new Label("Argentinia    107\n" + "Australia       000\n" + "Brasil             192\n"
			+ "Canada          911\n" + "China             120\n" + "Hongkong     999\n" + "Israel              101\n"
			+ "Japan             119\n" + "Mexico           006\n" + "New Zealand 111\n" + "Norway          113\n"
			+ "Switzerland   144\n" + "Turkey           112\n" + "UK                  999\n"
			+ "USA                911\n");

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

		// Unteres Label Nummer
		getChildren().add(allelaender);
		allelaender.setTranslateX(0);
		allelaender.setTranslateY(30);
		allelaender.getStyleClass().add("land_label");

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