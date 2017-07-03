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
	
		// Button Zurück 
		Button back = new Button("Zurück");
		
		// Image Zurück
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

		// Linie 
		Line line2 = new Line();

		// Button Schritt 2
		Button schritt2 = new Button("Schritt 2");

		// Label Herzdruckmassage 
		Label herzdruck1 = new Label("1. Herzdruckmassage");

		// Label 2 Herzdruckmassage 
		Label herzdruck2 = new Label("30x drücken");

		// Label 3 Herzdruckmassage 
		Label herzdruck3 = new Label("- Brustkorb freimachen\n" + "- Druckpunkt auf der Mitte des Brustkorbes\n"
			+ "- 30 mal kurz und kräftig herunterdrücken\n" + "- Zwischen Pumpstössen Brustkorb komplett\n   entlasten");

		// Image Herzdruckmassage
		Image herzdruck = new Image("file:images/Herzdruckmassage.png");
		ImageView herzdruck_view = new ImageView("file:images/Herzdruckmassage.png");

		// Button Druckfrequenz
		Button druckfrequenz = new Button("▷");
		
		// Media-Player + Audio-Datei einbinden
		Path path1 = Paths.get("src", "Audio", "reanimation.mp3"); // src/audio/reanimate1.mp3
		URI uri1 = path1.toUri();
		Media hit = new Media(uri1.toString());	
		MediaPlayer player = new MediaPlayer(hit);

		public Herzdruckmassage() {

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
		
		// Linie 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(55);

		// Button Schritt 2
		getChildren().add(schritt2);
		schritt2.setTranslateX(0);
		schritt2.setTranslateY(185);
		schritt2.getStyleClass().add("button_weiter");
				
		// Label Herzdruckmassage 
		getChildren().add(herzdruck1);
		herzdruck1.setTranslateX(0);
		herzdruck1.setTranslateY(-185);
		herzdruck1.getStyleClass().add("button_ueberschrift");

		// Label 2 Herzdruckmassage
		getChildren().add(herzdruck2);
		herzdruck2.setTranslateX(70);
		herzdruck2.setTranslateY(-5);
		herzdruck2.getStyleClass().add("button_zusatzinfos");

		// Label 3 Herzdruckmassage
		getChildren().add(herzdruck3);
		herzdruck3.setTranslateX(0);
		herzdruck3.setTranslateY(105);
		herzdruck3.getStyleClass().add("anweisungen_label");

		// Image Herzdruckmassage
		getChildren().add(herzdruck_view);
		herzdruck_view.setFitHeight(150);
		herzdruck_view.setFitWidth(126);
		herzdruck_view.setTranslateX(-70);
		herzdruck_view.setTranslateY(-50);

		// Button Druckfrequenz 
		getChildren().add(druckfrequenz);
		druckfrequenz.setTranslateX(70);
		druckfrequenz.setTranslateY(-78);
		druckfrequenz.getStyleClass().add("button_druckfrequenz");
		
		// Event-Handler und Action
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
