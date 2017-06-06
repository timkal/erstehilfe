package test;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Basis extends Application{

	StackPane stack = new StackPane();
	Scene szene = new Scene (stack, 300, 550);
	Button taste = new Button ("Notruf");
	Button menü = new Button ("Menü");
	Button krankenhaus = new Button ("Nächstes \nKrankenhaus ");
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
		menü.setTranslateX(-105);
		menü.setTranslateY(248);
		krankenhaus.setTranslateX(-4);
		krankenhaus.setTranslateY(247);
		notruf.setTranslateX(101);
		notruf.setTranslateY(248);
		verkehrsunfall.setTranslateX(0);
		verkehrsunfall.setTranslateY(0);
		verletzt.setTranslateX(0);
		verletzt.setTranslateY(100);
		
		
		
		stack.getStyleClass().add("custom-stack");
		taste.getStyleClass().add("custom-button");
		menü.getStyleClass().add("custom-button2");
		krankenhaus.getStyleClass().add("custom-button3");
		notruf.getStyleClass().add("custom-button2");
		verkehrsunfall.getStyleClass().add("custom-button4");
		verletzt.getStyleClass().add("custom-button5");
		
	primaryStage.setScene(szene);
	primaryStage.setTitle("Basis");
	primaryStage.show();
		
	}
	
	public static void main(String [] args) {
		launch();
	}
	
}
