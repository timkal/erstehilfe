package test;

import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Krankenhaus extends Basis {
	
/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
		
		// Web-View Integration
		WebView browser = new WebView();
		WebEngine webEngine = browser.getEngine();

		public Krankenhaus() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");
		
/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/

		// Web-View Integration
		getChildren().add(browser);
		webEngine.load("http://www.maps.google.com");
		browser.setMaxWidth(300);
		browser.setMaxHeight(436);
		browser.setTranslateY(-3);
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
