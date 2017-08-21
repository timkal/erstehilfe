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

	/*
	 * Web-View Integration: Der @WebView in Verbindung mit dem @WebEngine
	 * stellt die Webseite dar: Der WebEngine lädt die Webseite aus dem Internet
	 * und stellt den HTML-Content dar. Der WebView steuert die Eingabe über
	 * Maus und Keyboard und regelt das Scrollen. WebEngine und WebView werden
	 * miteinander verknüpft ("getEngine").
	 */

	WebView browser = new WebView();
	WebEngine webEngine = browser.getEngine();

	public Krankenhaus() {

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Zurück-Button ausblenden
		back.setVisible(false);
		back_view.setVisible(false);

		// Web-View wird auf die StackPane gesetzt
		getChildren().add(browser);

		/*
		 * Das HTML Dokument wird über einen Uniform Resource Identifier in eine
		 * File gepackt.
		 */

		URI map = new File("map.html").toURI();

		/*
		 * Das HTML Dokument wird geladen. Der Weg über HTML ist notwendig, da
		 * GoogleMaps Embeded Directions API V1 nur aus iFrames heraus
		 * funktioniert. Dokumentation:
		 * https://developers.google.com/maps/documentation/embed/guide?hl=de
		 * https://developers.google.com/maps/documentation/embed/guide?hl=de#
		 * directions_mode
		 */

		browser.getEngine().load(map.toString());
		browser.setMaxWidth(285);
		browser.setMaxHeight(436);
		browser.setTranslateY(-3);
	}

	/*
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */

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
