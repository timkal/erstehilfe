package test;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.shape.Line;

public class Herzdruckmassage extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Line line2 = new Line();

	Button schritt2 = new Button("Schritt 2");

	Label herzdruck1 = new Label("1. Herzdruckmassage");

	Label herzdruck2 = new Label("30x drücken");

	Label herzdruck3 = new Label("- Brustkorb freimachen\n" + "- Druckpunkt auf der Mitte des Brustkorbes\n"
			+ "- 30 mal kurz und kräftig herunterdrücken\n"
			+ "- Zwischen Pumpstössen Brustkorb komplett\n   entlasten");

	Image herzdruck = new Image("file:images/Herzdruckmassage.png");
	ImageView herzdruck_view = new ImageView("file:images/Herzdruckmassage.png");

	Button druckfrequenz = new Button("▷");

	/*
	 * Zunächst wird ein Dateipfad erzeugt, der die Musikdatei aus dem
	 * Source-Ordner bezieht. Dieser Dateipfad wird in ein Uniform Resource
	 * Identifier (URI) umgewandet, welcher die Referenz für unsere Musikdatei
	 * ist. Zuletzt wird dieser URI an die Media-Klasse übergeben, welche dann
	 * mit Hilfe des MediaPlayers abgespielt werden kann.
	 */

	Path path1 = Paths.get("src", "Audio", "reanimation.mp3");
	URI uri1 = path1.toUri();
	Media hit = new Media(uri1.toString());
	MediaPlayer player = new MediaPlayer(hit);

	public Herzdruckmassage() {

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(55);

		getChildren().add(schritt2);
		schritt2.setTranslateX(0);
		schritt2.setTranslateY(185);
		schritt2.getStyleClass().add("button_weiter");

		getChildren().add(herzdruck1);
		herzdruck1.setTranslateX(0);
		herzdruck1.setTranslateY(-185);
		herzdruck1.getStyleClass().add("label_ueberschrift");

		getChildren().add(herzdruck2);
		herzdruck2.setTranslateX(70);
		herzdruck2.setTranslateY(-5);
		herzdruck2.getStyleClass().add("button_zusatzinfos");

		getChildren().add(herzdruck3);
		herzdruck3.setTranslateX(0);
		herzdruck3.setTranslateY(105);
		herzdruck3.getStyleClass().add("anweisungen_label");

		getChildren().add(herzdruck_view);
		herzdruck_view.setFitHeight(150);
		herzdruck_view.setFitWidth(126);
		herzdruck_view.setTranslateX(-70);
		herzdruck_view.setTranslateY(-50);

		getChildren().add(druckfrequenz);
		druckfrequenz.setTranslateX(70);
		druckfrequenz.setTranslateY(-78);
		druckfrequenz.getStyleClass().add("button_mediastart");

		/*
		 * Es wird ein EventHandler erzeugt, welcher für das Abspielen des Tons zuständig
		 * ist. Der Button druckfrequenz wird an das Event geknüpft. Das erste
		 * if-Statement sorgt dafür, dass beim Betätigen des Buttons das zweite
		 * if-Statement ausgeführt wird. Es wird geprüft, ob der Ton bereits
		 * gespielt wird (getStatus) - ist dies der Fall, wird der Ton gestoppt.
		 * Ist dies nicht der Fall, wird der Ton über den MediaPlayer
		 * abgespielt.
		 * player.play() startet den Ton
		 */

		EventHandler<ActionEvent> e1 = new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				if (event.getSource() == druckfrequenz) {

					if (player.getStatus() == Status.PLAYING) {
						player.stop();
					} else {
						player.play();

					}

				}
			};
		};

		druckfrequenz.setOnAction(e1);
	}

	/*
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */

	Button getButton_schritt2() {
		return schritt2;
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
