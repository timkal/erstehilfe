package test;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Basis extends Application{

	StackPane stack = new StackPane();
	Scene szene = new Scene (stack, 300, 550);

	Button menü = new Button ("Menü");
	Button krankenhaus = new Button ("Hospital");
	Button notruf = new Button ("Notruf");
	
	Image akku = new Image ("file:images/Akku.png");
	ImageView akku_view = new ImageView("file:images/Akku.png");
	
	Image empfang = new Image ("file:images/Empfang3.png");
	ImageView empfang_view = new ImageView("file:images/Empfang3.png");
	
	Label zeit = new Label("09:41 AM");
	
	
	public void start(Stage primaryStage) throws Exception {
		
		stack.getStylesheets().add("test/styles.css");
		
		
		//Top Bar importieren
		stack.getChildren().add(akku_view);
		akku_view.setFitHeight(10);
		akku_view.setFitWidth(32);
		stack.setAlignment(akku_view, Pos.TOP_RIGHT);
		
		stack.getChildren().add(zeit);
		zeit.getStyleClass().add("topbar_label");
		stack.setAlignment(zeit, Pos.TOP_CENTER);
		
		stack.getChildren().add(empfang_view);
		empfang_view.setFitHeight(10);
		empfang_view.setFitWidth(75);
		stack.setAlignment(empfang_view, Pos.TOP_LEFT);
		
	
		
		//Tap Bar importieren
		
		stack.getChildren().add(menü);
		stack.getChildren().add(krankenhaus);
		stack.getChildren().add(notruf);
	
		
		
		
		//menü.setTranslateX(-105);
		//menü.setTranslateY(248);
		//krankenhaus.setTranslateX(-4);
		//krankenhaus.setTranslateY(247);
		//notruf.setTranslateX(101);
		//notruf.setTranslateY(248);
		
		
		stack.setAlignment(notruf, Pos.BOTTOM_RIGHT);
		stack.setAlignment(menü, Pos.BOTTOM_LEFT);
		stack.setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		
		
		
		stack.getStyleClass().add("custom-stack");
		
		menü.getStyleClass().add("button_tapbar");
		krankenhaus.getStyleClass().add("button_tapbar");
		notruf.getStyleClass().add("button_tapbar");
		
		
	primaryStage.setScene(szene);
	primaryStage.setTitle("Basis");
	primaryStage.show();
		
	}
	
	public static void main(String [] args) {
		launch();
	}
	
}
