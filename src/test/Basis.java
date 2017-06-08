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
	
	Image notruf2 = new Image ("file:images/Notruf.png");
	ImageView notruf2_view = new ImageView("file:images/Notruf.png");
	
	Image home = new Image ("file:images/Home.png");
	ImageView home_view = new ImageView("file:images/Home.png");
	
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
		
		stack.getChildren().add(notruf2_view);
		notruf2_view.setFitHeight(20);
		notruf2_view.setFitWidth(19);
		notruf2_view.setTranslateX(130);
		notruf2_view.setTranslateY(255);
	
		stack.getChildren().add(home_view);
		home_view.setFitHeight(19);
		home_view.setFitWidth(20);
		home_view.setTranslateX(-75);
		home_view.setTranslateY(255);
	
		
		
	
		
		
		
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
		
		menü.getStyleClass().add("button_menu");
		krankenhaus.getStyleClass().add("button_hospital");
		notruf.getStyleClass().add("button_notruf");
		
		
	primaryStage.setScene(szene);
	primaryStage.setTitle("Basis");
	primaryStage.show();
		
	}
	
	public static void main(String [] args) {
		launch();
	}
	
}
