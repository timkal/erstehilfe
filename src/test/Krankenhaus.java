package test;

import java.io.File;
import java.net.URI;

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

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Web-View Integration
		getChildren().add(browser);
		// Das HTML Document wird bestimmt
		URI url= new File("map.html").toURI();
		
		// Das HTML Document wird geladen. Der Weg ueber HTML ist notwendig da GoogleMap Embeded Directions API v1 nur aus iFrames heraus funktioniert.
		//Dokumentation: https://developers.google.com/maps/documentation/embed/guide?hl=de
		
		browser.getEngine().load(url.toString());
		browser.setMaxWidth(285);
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
