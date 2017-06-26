package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls platziert
 * sind
 */
public class Notruf_Absetzen extends Basis {

	// ------------------------------------------------------------------------------------------

	// ZurÃ¼ck Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================
	
	// Telefon Symbol
	Image phone = new Image("file:images/Phone.png");
	ImageView phone_view = new ImageView("file:images/Phone.png");
	
	// Anderes Land Button
	Button anderesland = new Button("Anderes Land?");
	
	// Button Weiter
	Button weiter = new Button("Weiter");
	
	// Notruf absetzen Label
	Label notrufabsetzen = new Label("Notruf\nabsetzen");
	
	// Label Notruf absetzen
	Label notrufabsetzeninfo = new Label ("- Wo geschah es?\n"
			+ "- Was geschah?\n"
			+ "- Wie viele Personen sind\n"
			+ "  betroffen?\n"
			+ "- Welche Art von Erkrankung/\n"
			+ "  Verletzung liegt vor?\n"
			+ "- Warten auf Rückfragen");
			

	/**
	 * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, beziehen sich
	 * die Aufrufe von add auf Pane1 selbst.
	 */
	public Notruf_Absetzen() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Notruf absetzen Label
		getChildren().add(notrufabsetzen);
		notrufabsetzen.setTranslateX(0);
		notrufabsetzen.setTranslateY(-150);
		notrufabsetzen.getStyleClass().add("notrufabsetzen_label");

		// Button Anderes Land
		getChildren().add(anderesland);
		anderesland.setTranslateX(0);
		anderesland.setTranslateY(-60);
		anderesland.getStyleClass().add("button_anderesland");

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
		
		// Telefon Symbol
		getChildren().add(phone_view);
		phone_view.setTranslateX(-70);
		phone_view.setTranslateY(-150);
		phone_view.setFitHeight(50);
		phone_view.setFitWidth(50);
		
		// Label Notruf absetzen
		getChildren().add(notrufabsetzeninfo);
		notrufabsetzeninfo.setTranslateX(0);
		notrufabsetzeninfo.setTranslateY(64);
		notrufabsetzeninfo.getStyleClass().add("infos_label");

	

	}

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zurï¿½ck
	 * 
	 * @return Der weiter-Button
	 */
	Button getButton_land() {
		return anderesland;
	}

	Button getButton_weiter() {
		return weiter;

	}

	Button getButton_back() {
		return back;
	}

	Button getButton_menu() {
		return menu;
	}

}