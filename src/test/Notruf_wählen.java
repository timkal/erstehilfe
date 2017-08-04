package test;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
	Button Anrufen = new Button("Anrufen");
	Button Auflegen = new Button("Auflegen");
	Button delete = new Button("Löschen");

	TextField feld = new TextField();

	public Notruf_wählen() {

		getStylesheets().add("test/styles.css");


		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		getChildren().addAll(Null, Eins, Zwei, Drei, Vier, Fünf, Sechs, Sieben, Acht, Neun, Anrufen, Auflegen, delete);
		getChildren().add(feld);

		feld.setTranslateX(-70);
		feld.setTranslateY(-130);
		feld.setMaxSize(140, 50);
		feld.setDisable(false);

		delete.setTranslateX(40);

		Null.setTranslateX(0);
		Null.setTranslateY(160);

		Eins.setTranslateX(-50);
		Eins.setTranslateY(10);

		Zwei.setTranslateX(0);
		Zwei.setTranslateY(10);

		Drei.setTranslateX(50);
		Drei.setTranslateY(10);

		Vier.setTranslateX(-50);
		Vier.setTranslateY(60);

		Fünf.setTranslateX(0);
		Fünf.setTranslateY(60);

		Sechs.setTranslateX(50);
		Sechs.setTranslateY(60);

		Sieben.setTranslateX(-50);
		Sieben.setTranslateY(110);

		Acht.setTranslateX(0);
		Acht.setTranslateY(110);

		Neun.setTranslateX(50);
		Neun.setTranslateY(110);

		Auflegen.setTranslateX(-80);
		Auflegen.setTranslateY(-50);

		Anrufen.setTranslateX(80);
		Anrufen.setTranslateY(-50);
		
		delete.setTranslateX(80);
		delete.setTranslateY(-130);

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

	}

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