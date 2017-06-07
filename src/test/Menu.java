package test;



import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Menu extends Application{

	StackPane stack = new StackPane();
	Scene szene = new Scene (stack, 300, 550);
	Button taste = new Button ("Notruf");
	Button menü = new Button ("Menü");
	Button krankenhaus = new Button ("Hospital");
	Button notruf = new Button ("Notruf");
	Button verkehrsunfall = new Button ("Verkehrsunfall");
	Button verletzt = new Button ("Verletzte Person");
	
	public void start(Stage primaryStage) throws Exception {
		
		stack.getStylesheets().add("test/styles.css");
		
		stack.getChildren().add(taste);
		stack.getChildren().add(menü);
		stack.getChildren().add(krankenhaus);
		stack.getChildren().add(notruf);
		stack.getChildren().add(verkehrsunfall);
		stack.getChildren().add(verletzt);
		
		taste.setTranslateX(0);
		taste.setTranslateY(-100);
		//menü.setTranslateX(-105);
		//menü.setTranslateY(248);
		//krankenhaus.setTranslateX(-4);
		//krankenhaus.setTranslateY(247);
		//notruf.setTranslateX(101);
		//notruf.setTranslateY(248);
		verkehrsunfall.setTranslateX(0);
		verkehrsunfall.setTranslateY(0);
		verletzt.setTranslateX(0);
		verletzt.setTranslateY(100);
		
		stack.setAlignment(notruf, Pos.BOTTOM_RIGHT);
		stack.setAlignment(menü, Pos.BOTTOM_LEFT);
		stack.setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		
		
		
		stack.getStyleClass().add("custom-stack");
		taste.getStyleClass().add("custom-button");
		menü.getStyleClass().add("button_tapbar");
		krankenhaus.getStyleClass().add("button_tapbar");
		notruf.getStyleClass().add("button_tapbar");
		verkehrsunfall.getStyleClass().add("button_verkehrsunfall");
		verletzt.getStyleClass().add("button_verletzt");
		
	primaryStage.setScene(szene);
	primaryStage.setTitle("Basis");
	primaryStage.show();
		
	}
	
	public static void main(String [] args) {
		launch();
	}
	
}
