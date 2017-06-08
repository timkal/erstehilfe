package test;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * Description: Pane1 ist ein GridPane, auf dem schon zwei Controls plaziert sind
 */
public class Notruf_Absetzen extends StackPane {
	
	
	//Basis Elemente
	StackPane stack = new StackPane();
	Scene szene = new Scene (stack, 300, 550);

	Button menu = new Button ("Menu");
	Button krankenhaus = new Button ("Hospital");
	Button notruf = new Button ("Notruf");
	
	
	Image akku = new Image ("file:images/Akku.png");
	ImageView akku_view = new ImageView("file:images/Akku.png");
	
	Image empfang = new Image ("file:images/Empfang3.png");
	ImageView empfang_view = new ImageView("file:images/Empfang3.png");
	
	Label zeit = new Label("09:41 AM");
	
	//Weitere Elemente
	Button land = new Button ("Anderes Land?");
	Button weiter = new Button ("Weiter");

  /**
   * Konstruktor von Pane1. Da Pane1 selbst ein GridPane ist, bezeihen sich die Aufrufe von add auf
   * Pane1 selbst.
   */
  public Notruf_Absetzen() {
    
	  	getStylesheets().add("test/styles.css");
		
		
		//Top Bar importieren
		getChildren().add(akku_view);
		akku_view.setFitHeight(10);
		akku_view.setFitWidth(32);
		setAlignment(akku_view, Pos.TOP_RIGHT);
		
		getChildren().add(zeit);
		zeit.getStyleClass().add("topbar_label");
		setAlignment(zeit, Pos.TOP_CENTER);
		
		getChildren().add(empfang_view);
		empfang_view.setFitHeight(10);
		empfang_view.setFitWidth(75);
		setAlignment(empfang_view, Pos.TOP_LEFT);
		
	
		
		//Tap Bar importieren
		
		getChildren().add(menu);
		getChildren().add(krankenhaus);
		getChildren().add(notruf);
	
		
		
		
		//Weitere Elemente hinzufügen
		getChildren().add(land);
		
		
		setAlignment(notruf, Pos.BOTTOM_RIGHT);
		setAlignment(menu, Pos.BOTTOM_LEFT);
		setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		
		
		stack.getStyleClass().add("custom-stack");
		menu.getStyleClass().add("button_tapbar");
		krankenhaus.getStyleClass().add("button_tapbar");
		notruf.getStyleClass().add("button_tapbar");
    
  }

  /**
   * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
   * @return Der weiter-Button
   */
  Button getButton() {
    return land;
  }

}