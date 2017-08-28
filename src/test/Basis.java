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

	/*------------------------------------ 
	Stack Pane in der Basis erstellen. Diese wird gewählt, weil sie die unkomplizierte Überlagerung von Objekten ermöglicht.
	------------------------------------*/

	StackPane stack = new StackPane();
	Scene szene = new Scene(stack, 300, 550);

	/*------------------------------------ 
	Basis-Elemente Top Bar erzeugen	
	------------------------------------*/

	Rectangle top = new Rectangle(300, 60);

	Button back = new Button("Zurück");

	Image back_image = new Image("file:images/Back-Symbol.png");
	ImageView back_view = new ImageView("file:images/Back-Symbol.png");

	Label title = new Label("Lebensretter");

	Image akku = new Image("file:images/Akku.png");
	ImageView akku_view = new ImageView("file:images/Akku.png");

	Label prozent = new Label("100%");

	Image empfang = new Image("file:images/Empfang.png");
	ImageView empfang_view = new ImageView("file:images/Empfang.png");

	Line line = new Line();

	Label zeit = new Label(LocalTime.now().toString().substring(0, 5));

	/*------------------------------------ 
	Basis-Elemente Tab Bar erzeugen	
	------------------------------------*/

	Button menu = new Button("\nMenü");

	Image home_image = new Image("file:images/Home.png");
	ImageView home_view = new ImageView("file:images/Home.png");

	Button krankenhaus = new Button("\nHospital");

	Image krankenhaus_image = new Image("file:images/Hospital.png");
	ImageView krankenhaus_view = new ImageView("file:images/Hospital.png");

	Button notruf = new Button("\nNotruf");

	Image notruf_image = new Image("file:images/Notruf.png");
	ImageView notruf_view = new ImageView("file:images/Notruf.png");

	public Basis() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------ 
		Stack Pane formatieren (via CSS). Wir halten uns an die im Seminar besprochene Einbindung von CSS zur Gestaltung der einzelnen Objekte.	
		------------------------------------*/

		getStyleClass().add("custom-stack");

		/*------------------------------------ 
		Elemente der Top Bar formatieren	
		------------------------------------*/

		// Dem Rechteck top wird eine Farbe zugeordnet.
		top.setFill(Color.web("#F9F9F9"));
		// Mit getChildren().add() wird das Element top auf der Pane abgebildet.
		getChildren().add(top);
		// setTransalteX/Y gibt die Koordinaten des Objekts auf der StackPane
		// an.
		top.setTranslateX(0);
		top.setTranslateY(-250);

		getChildren().add(back);
		getChildren().add(back_view);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		// setFitWidth/Height gibt eine feste Größe für ein Objekt an.
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);
		back.getStyleClass().add("button_back");

		getChildren().add(title);
		title.setTranslateX(0);
		title.setTranslateY(-240);
		title.getStyleClass().add("title_label");

		getChildren().add(akku_view);
		akku_view.setFitHeight(10);
		akku_view.setFitWidth(32);

		/*
		 * setAlignment ist praktisch um nicht XY-Werte angeben zu müssen,
		 * funktioniert allerdings nur bei "festgelegten" Positionen, wie
		 * "oben rechts".
		 */

		setAlignment(akku_view, Pos.TOP_RIGHT);

		getChildren().add(prozent);
		prozent.getStyleClass().add("topbar_label");
		prozent.setTranslateX(103);
		prozent.setTranslateY(-270);

		getChildren().add(empfang_view);
		empfang_view.setFitHeight(10);
		empfang_view.setFitWidth(75);
		setAlignment(empfang_view, Pos.TOP_LEFT);

		getChildren().add(line);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);
		line.setStrokeWidth(0.5);
		line.setTranslateY(-222);

		getChildren().add(zeit);
		zeit.getStyleClass().add("topbar_label");
		setAlignment(zeit, Pos.TOP_CENTER);

		/*
		 * Die Klasse @AnimationTimer erzeugt einen Timer, welcher die Uhrzeit
		 * anzeigen soll. Damit die Zeit durchgehend, also "live" abgerufen
		 * wird, ist eine "handle" Methode notwendig. Der Ausdruck mit (long
		 * now) sorgt dafür, dass die Methode in jedem Frame aufgerufen wird und
		 * sich die Uhrzeit so ständig aktualisiert. Die Uhrzeit wird durch
		 * LocalTime.now von der Systemzeit des Computers abgefragt und dann in
		 * das oben definierte Label zeit "gesettet". "toString" verpackt die
		 * LocalTime in einen String. Der Substring 0-5 (HH:mm) wird genutzt,
		 * damit die Uhrzeit nicht auf die Nanosekunde angezeigt wird. .start()
		 * startet diese Methode - Ein Stopp ist nicht notwendig, da sich die
		 * Uhrzeit durchgehend aktualisieren soll.
		 */

		new AnimationTimer() {
			@Override
			public void handle(long now) {
				zeit.setText(LocalTime.now().toString().substring(0, 5));
			}
		}.start();

		/*------------------------------------ 
		Elemente der Tab Bar formatieren
		------------------------------------*/

		getChildren().add(menu);
		getChildren().add(home_view);
		home_view.setFitHeight(19);
		home_view.setFitWidth(20);
		home_view.setTranslateX(-100);
		home_view.setTranslateY(235);
		setAlignment(menu, Pos.BOTTOM_LEFT);
		menu.getStyleClass().add("button_tapbar");
		menu.getStyleClass().add("button_menu");

		getChildren().add(krankenhaus);
		getChildren().add(krankenhaus_view);
		krankenhaus_view.setFitHeight(20);
		krankenhaus_view.setFitWidth(20);
		krankenhaus_view.setTranslateX(0);
		krankenhaus_view.setTranslateY(235);
		setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		krankenhaus.getStyleClass().add("button_tapbar");
		krankenhaus.getStyleClass().add("button_hospital");

		getChildren().add(notruf);
		getChildren().add(notruf_view);
		notruf_view.setFitHeight(20);
		notruf_view.setFitWidth(19);
		notruf_view.setTranslateX(100);
		notruf_view.setTranslateY(235);
		setAlignment(notruf, Pos.BOTTOM_RIGHT);
		notruf.getStyleClass().add("button_tapbar");
		notruf.getStyleClass().add("button_notruf");
	}

}
