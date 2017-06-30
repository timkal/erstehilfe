package test;

import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

public class Startseite extends Basis {

	// ------------------------------------------------------------------------------------------

	
	// Linie

	Line line = new Line();

	// Label Lebensretter
	Label lebensretter = new Label("Lebensretter");

	// Erste Hilfe Symbol
	Image erstehilfe = new Image("file:images/Startseite Logo.png");
	ImageView erstehilfe_view = new ImageView("file:images/Startseite Logo.png");

	// Progress Bar
	ProgressBar progressBar = new ProgressBar();
	
	Button weiter = new Button("Start");

	// ------------------------------------------------------------------------------------------

	public Startseite() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		//TAB BAR ausblenden
		menu.setVisible(false);
		home_view.setVisible(false);
		krankenhaus.setVisible(false);
		krankenhaus_view.setVisible(false);
		notruf.setVisible(false);
		notruf_view.setVisible(false);

		// Erste Hilfe Symbol
		getChildren().add(erstehilfe_view);
		erstehilfe_view.setFitHeight(300);
		erstehilfe_view.setFitWidth(300);
		erstehilfe_view.setTranslateX(0);
		erstehilfe_view.setTranslateY(-71);

		// Progress Bar
		getChildren().add(progressBar);
		progressBar.setTranslateX(0);
		progressBar.setTranslateY(180);
		progressBar.getStyleClass().add("Ladebalken");
		
		getChildren().add(weiter);
		weiter.getStyleClass().add("button_weiter");
		weiter.setTranslateX(0);
		weiter.setTranslateY(220);
		weiter.setVisible(false);

		Task<Void> sleeper = new Task<Void>() {
			@Override
			protected Void call() throws Exception {

				final int zähler = 130;
				for (int i = 0; i < zähler; i++) {
					updateProgress(i, zähler);
					try {
						Thread.sleep(30);
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
                weiter.setVisible(true);
            }
        });

		new Thread(sleeper).start();
		
		

		// ------------------------------------------------------------------------------------------

	
	}

	
	
	Button getButton_weiter() {
		return weiter;
	}

}
