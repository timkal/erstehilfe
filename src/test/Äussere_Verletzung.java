package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.text.TextAlignment;

public class Äussere_Verletzung extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
	
		// Button Zurück und Image Zurück
		Button back = new Button("Zurück");
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

		// Label Äussere Verletzung 
		Label aeussereverletzung = new Label("Hat die Person äussere\nVerletzungen?");

		// Linie 
		Line line2 = new Line();

		// Button Ja
		Button ja = new Button("Ja");

		// Button Nein
		Button nein = new Button("Nein");

		public Äussere_Verletzung() {

		getStylesheets().add("test/styles.css");
		
// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");
		
/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/
		
		// Button Zurück und Image Zurück
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Label Äussere Verletzung 
		getChildren().add(aeussereverletzung);
		aeussereverletzung.setTranslateX(0);
		aeussereverletzung.setTranslateY(-175);
		aeussereverletzung.setTextAlignment(TextAlignment.CENTER);

		// Linie 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-130);

		// Button Ja
		getChildren().add(ja);
		ja.setTranslateX(62.5);
		ja.setTranslateY(50);
		ja.getStyleClass().add("button_ja");

		// Button Nein
		getChildren().add(nein);
		nein.setTranslateX(-62.5);
		nein.setTranslateY(50);
		nein.getStyleClass().add("button_nein");
	}

		Button getButton_ja() {
		return ja;
	}

		Button getButton_nein() {
		return nein;
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
