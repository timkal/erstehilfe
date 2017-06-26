package test;

import java.time.LocalTime;

import javafx.animation.AnimationTimer;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Basis extends StackPane {

	// ------------------------------------------------------------------------------------------

	// Pane und Scene
	StackPane stack = new StackPane();
	Scene szene = new Scene(stack, 300, 550);

	// =================================
	// Basis-Elemente TAB Bar
	// =================================

	// Rectangle
	Rectangle top = new Rectangle(300, 60);
	Label title = new Label("Lebensretter");

	// Menu Button und Symbol
	Button menu = new Button("\nMenu");
	Image home_image = new Image("file:images/Home.png");
	ImageView home_view = new ImageView("file:images/Home.png");

	// Krankenhaus Button und Symbol
	Button krankenhaus = new Button("\nHospital");
	Image krankenhaus_image = new Image("file:images/Hospital.png");
	ImageView krankenhaus_view = new ImageView("file:images/Hospital.png");

	// Notruf Button und Symbol
	Button notruf = new Button("\nNotruf");
	Image notruf_image = new Image("file:images/Notruf.png");
	ImageView notruf_view = new ImageView("file:images/Notruf.png");

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
	// Button back = new Button("Zurueck");
	// Image back_image = new Image("file:images/back_symbol.png");
	// ImageView back_view = new ImageView("file:images/back_symbol.png");

	// Linie

	Line line = new Line();

	// ------------------------------------------------------------------------------------------

	public Basis() {

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
		// back.setTranslateX(-100);
		// back.setTranslateY(-240);
		// back.getStyleClass().add("button_back");
		// stack.getChildren().add(back_view);
		// back_view.setFitHeight(15);
		// back_view.setFitWidth(10);
		// back_view.setTranslateX(-135);
		// back_view.setTranslateY(-240);

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

		// Krankenhaus
		getChildren().add(krankenhaus);
		getChildren().add(krankenhaus_view);
		krankenhaus_view.setFitHeight(20);
		krankenhaus_view.setFitWidth(20);
		krankenhaus_view.setTranslateX(0);
		krankenhaus_view.setTranslateY(235);
		setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		krankenhaus.getStyleClass().add("button_tapbar");
		krankenhaus.getStyleClass().add("button_hospital");

		// Notruf
		getChildren().add(notruf);
		getChildren().add(notruf_view);
		notruf_view.setFitHeight(20);
		notruf_view.setFitWidth(19);
		notruf_view.setTranslateX(100);
		notruf_view.setTranslateY(235);
		setAlignment(notruf, Pos.BOTTOM_RIGHT);
		notruf.getStyleClass().add("button_tapbar");
		notruf.getStyleClass().add("button_notruf");

		// Menu
		getChildren().add(menu);
		getChildren().add(home_view);
		home_view.setFitHeight(19);
		home_view.setFitWidth(20);
		home_view.setTranslateX(-100);
		home_view.setTranslateY(235);
		setAlignment(menu, Pos.BOTTOM_LEFT);
		menu.getStyleClass().add("button_tapbar");
		menu.getStyleClass().add("button_menu");

		// Linie
		getChildren().add(line);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);
		line.setStrokeWidth(0.5);
		line.setTranslateY(-222);

		// ------------------------------------------------------------------------------------------

	}

}
