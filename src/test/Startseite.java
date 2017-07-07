package test;

import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Startseite extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/

		// Image logo
		Image logo = new Image("file:images/Logo.png");
		ImageView logo_view = new ImageView("file:images/Logo.png");

		// Progress Bar
		ProgressBar progressBar = new ProgressBar();
	
		// Button Weiter
		Button start = new Button("Start");

		public Startseite() {

		getStylesheets().add("test/styles.css");

/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/
		
		// Top Bar ausblenden
		top.setVisible(false);
		back.setVisible(false);
		back_view.setVisible(false);
		title.setVisible(false);
		akku_view.setVisible(false);
		prozent.setVisible(false);
		empfang_view.setVisible(false);
		line.setVisible(false);
		zeit.setVisible(false);
		
		// Tab Bar ausblenden
		menu.setVisible(false);
		home_view.setVisible(false);
		krankenhaus.setVisible(false);
		krankenhaus_view.setVisible(false);
		notruf.setVisible(false);
		notruf_view.setVisible(false);

		// Image Erste Hilfe
		getChildren().add(logo_view);
		logo_view.setFitHeight(190);
		logo_view.setFitWidth(180);
		logo_view.setTranslateX(0);
		logo_view.setTranslateY(-40);

		// Progress Bar
		getChildren().add(progressBar);
		progressBar.setTranslateX(0);
		progressBar.setTranslateY(120);
		progressBar.setMaxHeight(20);
		progressBar.setMaxWidth(180);
		progressBar.getStyleClass().add("button_start");
		
		// Button Weiter
		getChildren().add(start);
		start.getStyleClass().add("button_start");
		start.setTranslateX(0);
		start.setTranslateY(120);
		start.setVisible(false);

		Task<Void> sleeper = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				
				try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

				final int zähler = 130;
				for (int i = 0; i < zähler; i++) {
					updateProgress(i, zähler);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
				}
				updateProgress(zähler, zähler);
				return null;
			}
		};

		progressBar.progressProperty().bind(sleeper.progressProperty());
		
		sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                start.setVisible(true);
            }
        });

		new Thread(sleeper).start();
	}

		Button getButton_start() {
		return start;
	}
}
