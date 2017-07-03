package test;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Krankenhaus extends Basis {
	
/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
	
		// Button Zurück 
		Button back = new Button("Zurück");
		
		// Image Zurück
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");
		
		// Web-View Integration
		final WebView browser = new WebView();
		final WebEngine webEngine = browser.getEngine();

		public Krankenhaus() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");
		
/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/
		
		// Button Zurück 
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		
		// Image Zurück
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Web-View Integration
		getChildren().add(browser);
		webEngine.load("http://www.maps.google.com");
		browser.setMaxWidth(300);
		browser.setMaxHeight(442);
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

		Button getButton_back() {
		return back;
	}
}
