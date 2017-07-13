package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Notruf_absetzen extends Basis {

	/*------------------------------------
	Seitenspezifische Elemente erzeugen
	------------------------------------*/

	// Label Notruf absetzen
	Label notrufabsetzen = new Label("Notruf\nabsetzen");

	// Image Telefon
	Image phone = new Image("file:images/Phone.png");
	ImageView phone_view = new ImageView("file:images/Phone.png");

	// Button Anderes Land
	Button anderesland = new Button("Anderes Land?");

	// Button Weiter
	Button weiter = new Button("Weiter");

	// Label Notruf absetzen Info
	Label notrufabsetzeninfo = new Label("- Wo geschah es?\n" + "- Was geschah?\n" + "- Wie viele Personen sind\n"
			+ "  betroffen?\n" + "- Welche Art von Erkrankung/\n" + "  Verletzung liegt vor?\n");

	public Notruf_absetzen() {

		getStylesheets().add("test/styles.css");

		/*------------------------------------
		Seitenspezifische Elemente formatieren
		------------------------------------*/

		// Label Notruf absetzen
		getChildren().add(notrufabsetzen);
		notrufabsetzen.setTranslateX(0);
		notrufabsetzen.setTranslateY(-150);
		notrufabsetzen.getStyleClass().add("notrufabsetzen_label");

		// Image Telefon
		getChildren().add(phone_view);
		phone_view.setTranslateX(-70);
		phone_view.setTranslateY(-150);
		phone_view.setFitHeight(50);
		phone_view.setFitWidth(50);

		// Button Anderes Land
		getChildren().add(anderesland);
		anderesland.setTranslateX(0);
		anderesland.setTranslateY(-55);
		anderesland.getStyleClass().add("button_zusatzinfos");

		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Label Notruf absetzen Info
		getChildren().add(notrufabsetzeninfo);
		notrufabsetzeninfo.setTranslateX(0);
		notrufabsetzeninfo.setTranslateY(64);
		notrufabsetzeninfo.getStyleClass().add("infos_label");
	}

	Button getButton_land() {
		return anderesland;
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

	Button getButton_krankenhaus() {
		return krankenhaus;
	}
}