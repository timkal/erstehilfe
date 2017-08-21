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

	Image logo = new Image("file:images/Logo.png");
	ImageView logo_view = new ImageView("file:images/Logo.png");

	ProgressBar progressBar = new ProgressBar();

	Button start = new Button("Start");

	public Startseite() {

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

		getChildren().add(logo_view);
		logo_view.setFitHeight(190);
		logo_view.setFitWidth(180);
		logo_view.setTranslateX(0);
		logo_view.setTranslateY(-40);

		getChildren().add(progressBar);
		progressBar.setTranslateX(0);
		progressBar.setTranslateY(120);
		progressBar.setMaxHeight(20);
		progressBar.setMaxWidth(180);
		progressBar.getStyleClass().add("button_start");

		getChildren().add(start);
		start.getStyleClass().add("button_start");
		start.setTranslateX(0);
		start.setTranslateY(120);
		start.setVisible(false);

		/*
		 * Diese Task ist dafür zuständig, dass die ProgressBar in 130
		 * Abschnitte unterteilt wird, welche jeweils mit einer Unterbrechung
		 * (Wartezeit) von 10ms "aufgefüllt werden". Das Warten wird in einem
		 * sogenannten try und catch Statement geregelt. Dieses Statement ist
		 * notwendig, da das Programm während des Wartevorganges mittem im
		 * Prozess „stillsteht“ und dies normalerweise eine Fehlermeldung
		 * ergeben würde. Daher gibt es auch ein try und catch Statement zu
		 * Beginn, welches dafür sorgen soll, dass das Laden des Balkens erst
		 * dann beginnt, wenn das Programm auf dem Bildschirm angezeigt wird, da
		 * der Ladeprozess sonst nicht zu sehen ist. Diese Wartezeit (1000ms)
		 * ist jedoch abhängig von der Geschwindigkeit des Computers auf dem das
		 * Programm läuft und kann daher gerne individuell angepasst werden.
		 */

		Task<Void> sleeper = new Task<Void>() {
			@Override
			public Void call() throws Exception {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

				int zähler = 130;
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
		
		// Bar und Task werden zusammengeführt.
		progressBar.progressProperty().bind(sleeper.progressProperty());

		/*
		 * Hier wird geregelt, dass der Button start angezeigt wird, sobald die
		 * Task vollständig durchgeführt wurde.
		 */

		sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
			@Override
			public void handle(WorkerStateEvent event) {
				start.setVisible(true);
			}
		});
		
		// Der Thread muss gestartet werden.
		new Thread(sleeper).start();
	}

	/*
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */

	Button getButton_start() {
		return start;
	}
}
