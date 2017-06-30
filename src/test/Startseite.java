package test;

import java.time.LocalTime;

import javafx.animation.AnimationTimer;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Startseite extends StackPane {

	// ------------------------------------------------------------------------------------------

	// Pane und Scene
	StackPane stack = new StackPane();
	Scene szene = new Scene(stack, 300, 550);

	// =================================
	// Basis-Elemente TAB Bar
	// =================================

	// Rectangle
	Rectangle top = new Rectangle(300, 60);
	Label title = new Label("Erste Hilfe");

	// =================================
	// Basis-Elemente TOP Bar
	// =================================

	// Akku Symbol
	Image akku = new Image("file:images/Akku.png");
	ImageView akku_view = new ImageView("file:images/Akku.png");
	Label prozent = new Label("100%");

	// Empfang Symbol
	Image empfang = new Image("file:images/Empfang3.png");
	ImageView empfang_view = new ImageView("file:images/Empfang3.png");

	// Uhrzeit
	Label zeit = new Label(LocalTime.now().toString().substring(0, 5));

	// Zurück Button und Symbol
	Button back = new Button("Zurueck");
	Image back_image = new Image("file:images/back_symbol.png");
	ImageView back_view = new ImageView("file:images/back_symbol.png");

	// Linie

	Line line = new Line();

	// Label Lebensretter
	Label lebensretter = new Label("Lebensretter");

	// Erste Hilfe Symbol
	Image erstehilfe = new Image("file:images/Startseite Logo.png");
	ImageView erstehilfe_view = new ImageView("file:images/Startseite Logo.png");

	// Progress Bar
	ProgressBar progressBar = new ProgressBar();

	// ------------------------------------------------------------------------------------------

	public Startseite() {

		getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// =================================
		// TOP Bar importieren und anordnen
		// =================================

		// Rechteck Abgrenzung oben
		top.setFill(Color.web("#F9F9F9"));
		getChildren().add(top);
		top.setTranslateX(0);
		top.setTranslateY(-250);

		// Titel
		getChildren().add(title);
		title.setTranslateX(0);
		title.setTranslateY(-240);
		title.getStyleClass().add("title_label");

		// Zuruck Button und Symbol
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Akku-Symbol und Text
		getChildren().add(akku_view);
		akku_view.setFitHeight(10);
		akku_view.setFitWidth(32);
		setAlignment(akku_view, Pos.TOP_RIGHT);
		getChildren().add(prozent);
		prozent.getStyleClass().add("topbar_label");
		prozent.setTranslateX(103);
		prozent.setTranslateY(-270);

		// Zeit hinzufügen und Echtzeit einbauen
		getChildren().add(zeit);
		zeit.getStyleClass().add("topbar_label");
		setAlignment(zeit, Pos.TOP_CENTER);

		new AnimationTimer() {
			@Override
			public void handle(long now) {
				zeit.setText(LocalTime.now().toString().substring(0, 5));
			}
		}.start();

		// Empfang
		getChildren().add(empfang_view);
		empfang_view.setFitHeight(10);
		empfang_view.setFitWidth(75);
		setAlignment(empfang_view, Pos.TOP_LEFT);

		// =================================
		// TAB Bar importieren und anordnen
		// =================================

		// Linie
		getChildren().add(line);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);

		line.setStrokeWidth(0.5);
		line.setTranslateY(-222);

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

		Task<Void> sleeper = new Task<Void>() {
			@Override
			protected Void call() throws Exception {

				final int zähler = 130;
				for (int i = 0; i < zähler; i++) {
					updateProgress(i, zähler);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				updateProgress(zähler, zähler);
				return null;
			}
		};

		progressBar.progressProperty().bind(sleeper.progressProperty());

		new Thread(sleeper).start();

		// ------------------------------------------------------------------------------------------

	}

	Button getButton_back() {
		return back;
	}

}
