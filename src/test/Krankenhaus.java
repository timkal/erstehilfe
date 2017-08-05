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

	/**
	 * Web-View Integration: Der WebView in Verbindung mit dem WebEngine stellt
	 * die Webseite dar: Der WebEngine lädt die Webseite aus dem Internet und
	 * stellt den HTML Content dar. Der WebView steuert die Eingabe über Maus
	 * und Keyboard und regelt das Scrollen. WebEngine und WebView werden
	 * miteinander verknüpft ("getEngine").
	 */
	WebView browser = new WebView();
	WebEngine webEngine = browser.getEngine();

	public Krankenhaus() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Web-View wird auf die StackPane gesetzt
		getChildren().add(browser);
		// Das HTML Document wird über einen Uniform Resource Identifier in eine
		// File gepackt.
		URI htmldoc = new File("map.html").toURI();

		// Das HTML Document wird geladen. Der Weg ueber HTML ist notwendig da
		// GoogleMap Embeded Directions API v1 nur aus iFrames heraus
		// funktioniert.
		// Dokumentation:
		// https://developers.google.com/maps/documentation/embed/guide?hl=de

		browser.getEngine().load(htmldoc.toString());
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
