package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * In dieser Klasse wird ein Tastenfeld erzeugt, welches veranschaulicht, wie
 * ein Notruf direkt aus der App ablaufen könnte.
 * 
 * @author marleneschlorf
 *
 */
public class Notruf_wählen extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	Button Null = new Button("0");
	Button Eins = new Button("1");
	Button Zwei = new Button("2");
	Button Drei = new Button("3");
	Button Vier = new Button("4");
	Button Fünf = new Button("5");
	Button Sechs = new Button("6");
	Button Sieben = new Button("7");
	Button Acht = new Button("8");
	Button Neun = new Button("9");
	Button anrufen = new Button("_");
	Button auflegen = new Button("_");
	Button delete = new Button("X");

	Label anruf_läuft = new Label("Wähle Rufnummer...");

	Image pickup = new Image("file:images/Pickup.png");
	ImageView pickup_view = new ImageView("file:images/Pickup.png");

	Image hangup = new Image("file:images/Hangup.png");
	ImageView hangup_view = new ImageView("file:images/Hangup.png");

	TextField feld = new TextField();

	public Notruf_wählen() {

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Um mehrere Elemente in einem Ausdruck hinzuzufügen, wird addAll
		// verwendet

		getChildren().addAll(Null, Eins, Zwei, Drei, Vier, Fünf, Sechs, Sieben, Acht, Neun, anrufen, auflegen, delete);
		getChildren().addAll(feld, anruf_läuft);

		feld.setTranslateX(-30);
		feld.setTranslateY(-100);
		feld.setMaxSize(110, 60);
		feld.setDisable(false);

		anruf_läuft.setTranslateY(-185);
		anruf_läuft.setVisible(false);

		delete.setTranslateX(40);

		Null.setTranslateX(0);
		Null.setTranslateY(180);
		Null.getStyleClass().add("button_feld");

		Eins.setTranslateX(-60);
		Eins.setTranslateY(0);
		Eins.getStyleClass().add("button_feld");

		Zwei.setTranslateX(0);
		Zwei.setTranslateY(0);
		Zwei.getStyleClass().add("button_feld");

		Drei.setTranslateX(60);
		Drei.setTranslateY(0);
		Drei.getStyleClass().add("button_feld");

		Vier.setTranslateX(-60);
		Vier.setTranslateY(60);
		Vier.getStyleClass().add("button_feld");

		Fünf.setTranslateX(0);
		Fünf.setTranslateY(60);
		Fünf.getStyleClass().add("button_feld");

		Sechs.setTranslateX(60);
		Sechs.setTranslateY(60);
		Sechs.getStyleClass().add("button_feld");

		Sieben.setTranslateX(-60);
		Sieben.setTranslateY(120);
		Sieben.getStyleClass().add("button_feld");

		Acht.setTranslateX(0);
		Acht.setTranslateY(120);
		Acht.getStyleClass().add("button_feld");

		Neun.setTranslateX(60);
		Neun.setTranslateY(120);
		Neun.getStyleClass().add("button_feld");

		auflegen.setTranslateX(-60);
		auflegen.setTranslateY(180);
		auflegen.getStyleClass().add("button_auflegen");

		anrufen.setTranslateX(60);
		anrufen.setTranslateY(180);
		anrufen.getStyleClass().add("button_anrufen");

		delete.setTranslateX(60);
		delete.setTranslateY(-100);
		delete.getStyleClass().add("button_feld");

		getChildren().add(pickup_view);
		pickup_view.setTranslateX(60);
		pickup_view.setTranslateY(180);
		pickup_view.setFitHeight(45);
		pickup_view.setFitWidth(45);

		getChildren().add(hangup_view);
		hangup_view.setTranslateX(-60);
		hangup_view.setTranslateY(180);
		hangup_view.setFitHeight(25);
		hangup_view.setFitWidth(50);
		
		// Lambda-Ausdruck wird verwendet, um die Zahlen in das Textfeld anzufügen.
 
		getButton_Null().setOnAction(e -> feld.appendText("0"));
		getButton_Eins().setOnAction(e -> feld.appendText("1"));
		getButton_Zwei().setOnAction(e -> feld.appendText("2"));
		getButton_Drei().setOnAction(e -> feld.appendText("3"));
		getButton_Vier().setOnAction(e -> feld.appendText("4"));
		getButton_Fünf().setOnAction(e -> feld.appendText("5"));
		getButton_Sechs().setOnAction(e -> feld.appendText("6"));
		getButton_Sieben().setOnAction(e -> feld.appendText("7"));
		getButton_Acht().setOnAction(e -> feld.appendText("8"));
		getButton_Neun().setOnAction(e -> feld.appendText("9"));
		getButton_delete().setOnAction(e -> feld.clear());
		getButton_Anrufen().setOnAction(e -> anruf_läuft.setVisible(true));
		getButton_Auflegen().setOnAction(e -> anruf_läuft.setVisible(false));
	}

	/*
	 * getButton Methode gibt den unter return angegebenen Button zurück, um als
	 * Referenz für die ActionEvents zu dienen und damit die Verlinkung der
	 * Seiten in der @Main Klasse ermöglichen. Die EventHandler greifen dann auf
	 * die getButton Methode zu und "finden" darin den entsprechenden Button.
	 */

	Button getButton_Null() {
		return Null;
	}

	Button getButton_Eins() {
		return Eins;
	}

	Button getButton_Zwei() {
		return Zwei;
	}

	Button getButton_Drei() {
		return Drei;
	}

	Button getButton_Vier() {
		return Vier;
	}

	Button getButton_Fünf() {
		return Fünf;
	}

	Button getButton_Sechs() {
		return Sechs;
	}

	Button getButton_Sieben() {
		return Sieben;
	}

	Button getButton_Acht() {
		return Acht;
	}

	Button getButton_Neun() {
		return Neun;
	}

	Button getButton_delete() {
		return delete;
	}

	Button getButton_Anrufen() {
		return anrufen;
	}

	Button getButton_Auflegen() {
		return auflegen;
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

	Button getButton_back() {
		return back;
	}

}