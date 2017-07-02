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

public class Reanimation extends Basis {

	// ------------------------------------------------------------------------------------------

	// Zurück Button und Symbol
	Button back = new Button("Zurück");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// ------------------------------------------------------------------------------------------

	// =================================
	// Weitere Elemente
	// =================================

	// Anleitung Button
	Button anleitung = new Button("Anleitung");

	// Reanimation Label
	Label reanimation = new Label("Reanimation\nwiederholen bis\nder Notarzt da ist");

	// Beatmung Label
	Label beatmung1 = new Label("2x beatmen");

	// Herzdruck Label
	Label herzdruck2 = new Label("30x drücken");

	// Herzdruckmassage Image
	Image herzdruck = new Image("file:images/Herzdruckmassage.png");
	ImageView herzdruck_view = new ImageView("file:images/Herzdruckmassage.png");

	// Beatmung Image
	Image beatmung = new Image("file:images/Beatmung.png");
	ImageView beatmung_view = new ImageView("file:images/Beatmung.png");

	// Button Druckfrequenz
	Button druckfrequenz = new Button("▷");

	// Media-Player + Audio-Datei einbinden
	Path path1 = Paths.get("src", "Audio", "reanimation.mp3"); // src/audio/reanimate1.mp3
	URI uri1 = path1.toUri();
	Media hit = new Media(uri1.toString());
	MediaPlayer player = new MediaPlayer(hit);

	public Reanimation() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// Zurück Button und Symbol
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Weitere Elemente hinzufügen

		// Anleitung Button
		getChildren().add(anleitung);
		anleitung.setTranslateX(0);
		anleitung.setTranslateY(185);
		anleitung.getStyleClass().add("button_anleitung");

		// Reanimation Label
		getChildren().add(reanimation);
		reanimation.setTranslateX(0);
		reanimation.setTranslateY(-160);
		reanimation.getStyleClass().add("button_ueberschrift");

		// Beatmung Label
		getChildren().add(beatmung1);
		beatmung1.setTranslateX(-70);
		beatmung1.setTranslateY(90);
		beatmung1.getStyleClass().add("button_anderesland");

		// Herzdruck Label
		getChildren().add(herzdruck2);
		herzdruck2.setTranslateX(70);
		herzdruck2.setTranslateY(10);
		herzdruck2.getStyleClass().add("button_anderesland");

		// Herzdruckmassage Image
		getChildren().add(herzdruck_view);
		herzdruck_view.setFitHeight(150);
		herzdruck_view.setFitWidth(126);
		herzdruck_view.setTranslateX(-70);
		herzdruck_view.setTranslateY(-20);

		// Beatmung Image
		getChildren().add(beatmung_view);
		beatmung_view.setFitHeight(100);
		beatmung_view.setFitWidth(91);
		beatmung_view.setTranslateX(65);
		beatmung_view.setTranslateY(100);

		// Druckfrequenz Button
		getChildren().add(druckfrequenz);
		druckfrequenz.setTranslateX(70);
		druckfrequenz.setTranslateY(-62);
		druckfrequenz.getStyleClass().add("button_reanimation");
		
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


	Button getButton_anleitung() {
		return anleitung;

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

	Button getButton_druckfrequenz() {
		return druckfrequenz;
	}
	
	Button getButton_krankenhaus() {
		return krankenhaus;
	}

}
