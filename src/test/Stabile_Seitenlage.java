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
import javafx.util.Pair;

public class Stabile_Seitenlage extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button weiter = new Button("Weiter");

	Label stabileseitenlage = new Label("Stabile Seitenlage");

	Image stabileseitenlagebild = new Image("file:images/Stabile Seitenlage.png");
	ImageView stabileseitenlagebild_view = new ImageView("file:images/Stabile Seitenlage.png");
	
	Button videostart = new Button("▷");

	// Media-Player + Video-Datei einbinden
	Path path1 = Paths.get("src", "Video", "Erste_Hilfe_Stabile_Seitenlage.mp4"); 
	URI uri = path1.toUri();
	Media hit = new Media(uri.toString());
	MediaPlayer player = new MediaPlayer(hit);


	public Stabile_Seitenlage() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		getChildren().add(stabileseitenlage);
		stabileseitenlage.setTranslateX(0);
		stabileseitenlage.setTranslateY(-175);
		stabileseitenlage.getStyleClass().add("label_ueberschrift");

		getChildren().add(stabileseitenlagebild_view);
		stabileseitenlagebild_view.setFitHeight(220);
		stabileseitenlagebild_view.setFitWidth(292);
		stabileseitenlagebild_view.setTranslateX(0);
		stabileseitenlagebild_view.setTranslateY(0);
		
		getChildren().add(videostart);
		videostart.setTranslateX(0);
		videostart.setTranslateY(120);
		videostart.getStyleClass().add("button_mediastart");
		
		// Event-Handler und Action
				EventHandler<ActionEvent> e1 = new EventHandler<ActionEvent>() {

					public void handle(ActionEvent event) {

						if (event.getSource() == videostart) {

							if (player.getStatus() == Status.PLAYING) {
								player.stop();
							} else {
								player.play();

							}

						}
					};
				};

				videostart.setOnAction(e1);
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

	Button getButton_notruf() {
		return notruf;
	}

	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}
