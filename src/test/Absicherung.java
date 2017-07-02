package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Absicherung extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
	
		// Button Zurück und Image Zurück
		Button back = new Button("Zurück");
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

		// Label Infos
		Label infos2 = new Label("1. Wenn möglich, Fahrzeug\n" + "     an den Fahrbahnrand\n" + "2. Warnweste anlegen \n"
			+ "3. Warndreieck aufstellen\n" + "        Innerorts: 50 m\n" + 
			"        Landstrasse: 100 m\n" + "        Autobahn: 150 m\n");
	
		// Button Weiter
		Button weiter = new Button("Weiter");
	
		// Label Absicherung und Image Absicherung
		Label absicherung = new Label("Absicherung der\nUnfallstelle");
		Image absicherung_image = new Image("file:images/Absicherung Unfallstelle.png");
		ImageView absicherung_view = new ImageView("file:images/Absicherung Unfallstelle.png");

	
		public Absicherung() {

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

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Label Absicherung
		getChildren().add(absicherung);
		absicherung.setTranslateX(0);
		absicherung.setTranslateY(-165);
		absicherung.getStyleClass().add("button_ueberschrift");

		// Image Absicherung
		getChildren().add(absicherung_view);
		absicherung_view.setFitHeight(120);
		absicherung_view.setFitWidth(120);
		absicherung_view.setTranslateX(0);
		absicherung_view.setTranslateY(-55);

		// Label Infos
		getChildren().add(infos2);
		infos2.setTranslateX(0);
		infos2.setTranslateY(88);
		infos2.getStyleClass().add("infos_label2");

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
