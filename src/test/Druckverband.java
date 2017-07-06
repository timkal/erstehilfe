package test;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

public class Druckverband extends Basis {

/*------------------------------------
Seitenspezifische Elemente erzeugen
------------------------------------*/
	
		// Button Weiter 
		Button weiter = new Button("Weiter");
		
		// Linie
		Line line2 = new Line();

		// Label Druckverband 
		Label druckverband = new Label("Druckverband");

		// Label 2 Druckverband 
		Label druckverband2 = new Label("1. Betroffenes Körperteil hochhalten\n" + "2. Wunde mit steriler Wundauflage\n"
			+ "    bedecken\n" + "   (Alternative = sauberes Taschentuch)\n"
			+ "3. Nicht saugfähigen Druckkörper auf der\n" + "    bereits abgedeckten Wunde fixieren");

		// Image Druckverband 
		Image druckverbandbild = new Image("file:images/Druckverband.png");
		ImageView druckverbandbild_view = new ImageView("file:images/Druckverband.png");

		public Druckverband() {

		getStylesheets().add("test/styles.css");

// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

/*------------------------------------
Seitenspezifische Elemente formatieren
------------------------------------*/
		
		// Button Weiter
		getChildren().add(weiter);
		weiter.setTranslateX(0);
		weiter.setTranslateY(185);
		weiter.getStyleClass().add("button_weiter");

		// Linie 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-10);

		// Label Druckverband
		getChildren().add(druckverband);
		druckverband.setTranslateX(0);
		druckverband.setTranslateY(-185);
		druckverband.getStyleClass().add("button_ueberschrift");

		// Label 2 Druckverband 
		getChildren().add(druckverband2);
		druckverband2.setTranslateX(0);
		druckverband2.setTranslateY(50);
		druckverband2.getStyleClass().add("anweisungen_label");

		// Image Druckverband
		getChildren().add(druckverbandbild_view);
		druckverbandbild_view.setFitHeight(123);
		druckverbandbild_view.setFitWidth(150);
		druckverbandbild_view.setTranslateX(0);
		druckverbandbild_view.setTranslateY(-85);
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
