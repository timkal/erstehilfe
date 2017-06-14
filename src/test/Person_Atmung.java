package test;

	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.StackPane;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Line;
	import javafx.scene.shape.Rectangle;

	public class Person_Atmung extends StackPane {

		// Pane und Scene
		StackPane stack = new StackPane();
		Scene szene = new Scene(stack, 300, 550);
		

		// =================================
		// Basis-Elemente TAP Bar
		// =================================
		
		// Rectangle
		Rectangle top = new Rectangle(300, 60);
		Label title = new Label("Erste-Hilfe");

		// Menu Button und Symbol
		Button menu = new Button("\nMenu");
		Image home_image = new Image("file:images/Home.png");
		ImageView home_view = new ImageView("file:images/Home.png");

		// Krankenhaus Button und Symbol
		Button krankenhaus = new Button("\nHospital");
		Image krankenhaus_image = new Image("file:images/Hospital.png");
		ImageView krankenhaus_view = new ImageView("file:images/Hospital.png");

		// Notruf Button und Symbol
		Button notruf = new Button("\nNotruf");
		Image notruf_image = new Image("file:images/Notruf.png");
		ImageView notruf_view = new ImageView("file:images/Notruf.png");

		// =================================
		// Basis-Elemente TOP Bar
		// =================================

		// Akku Symbol
		Image akku = new Image("file:images/Akku.png");
		ImageView akku_view = new ImageView("file:images/Akku.png");
		Label prozent = new Label("100%");

		// Empfang Symbol
		Image empfang = new Image("file:images/Empfang3.png");
		ImageView empfang_view = new ImageView("file:images/Empfang3.png");

		// Uhrzeit
		Label zeit = new Label("09:41 AM");
		
		//Zur�ck Button und Symbol
		Button back = new Button("Zur�ck");
		Image back_image = new Image("file:images/back_symbol.png");
		ImageView back_view = new ImageView("file:images/back_symbol.png");

		//Linie 1
		Line line = new Line();
				
		// Atmet Person Label
		Label atmetpersonfrage = new Label("Atmet die Person?");
		
		// Linie darunter
		Line line2 = new Line();
		
		// Linie darunter 2
		Line line3 = new Line();
		
		//Button Ja
		Button ja = new Button("Ja");
		
		//Button Nein
		Button nein = new Button("Nein");
		
		//Label Atmung Info
		Label atmunginfo = new Label("Sehen (Brustbewegung, Hautfarbe)\n"
				+ "Hoeren (Atemgeraeusche)\n"
				+ "Fuehlen (Atemhauch)");
		
		//Atem-Check Symbol
		Image atemcheck_image = new Image("file:images/Atem-Check.png");
		ImageView atemcheck_view = new ImageView("file:images/Atem-Check.png");
		
		//Label Atmung Info2
		Label atmunginfo2 = new Label("Atemwege\nfreimachen!");
		
		//Atemwege Symbol
		Image atemwege_image = new Image("file:images/Atemwege.png");
		ImageView atemwege_view = new ImageView("file:images/Atemwege.png");
				
	public Person_Atmung() {
		

	  	getStylesheets().add("test/styles.css");

		// ------------------------------------------------------------------------------------------

		getStyleClass().add("custom-stack");

		// =================================
		// TOP Bar importieren und anordnen
		// =================================
		
		// Rechteck Abgrenzung oben
		top.setFill(Color.web("#F9F9F9"));
		getChildren().add(top);
		top.setTranslateX(0);
		top.setTranslateY(-250);
		
		//Titel
		getChildren().add(title);
		title.setTranslateX(0);
		title.setTranslateY(-240);
		title.getStyleClass().add("title_label");
		
		
		//Zuruck Button und Symbol
		getChildren().add(back);
		back.setTranslateX(-100);
		back.setTranslateY(-240);
		back.getStyleClass().add("button_back");
		getChildren().add(back_view);
		back_view.setFitHeight(15);
		back_view.setFitWidth(10);
		back_view.setTranslateX(-135);
		back_view.setTranslateY(-240);

		// Akku-Symbol und Text
		getChildren().add(akku_view);
		akku_view.setFitHeight(10);
		akku_view.setFitWidth(32);
		setAlignment(akku_view, Pos.TOP_RIGHT);
		getChildren().add(prozent);
		prozent.getStyleClass().add("topbar_label");
		prozent.setTranslateX(103);
		prozent.setTranslateY(-270);

		getChildren().add(zeit);
		zeit.getStyleClass().add("topbar_label");
		setAlignment(zeit, Pos.TOP_CENTER);

		getChildren().add(empfang_view);
		empfang_view.setFitHeight(10);
		empfang_view.setFitWidth(75);
		setAlignment(empfang_view, Pos.TOP_LEFT);

		// =================================
		// TAP Bar importieren und anordnen
		// =================================

		// Krankenhaus
		getChildren().add(krankenhaus);
		getChildren().add(krankenhaus_view);
		krankenhaus_view.setFitHeight(20);
		krankenhaus_view.setFitWidth(20);
		krankenhaus_view.setTranslateX(0);
		krankenhaus_view.setTranslateY(235);
		setAlignment(krankenhaus, Pos.BOTTOM_CENTER);
		krankenhaus.getStyleClass().add("button_hospital");

		// Notruf
		getChildren().add(notruf);
		getChildren().add(notruf_view);
		notruf_view.setFitHeight(20);
		notruf_view.setFitWidth(19);
		notruf_view.setTranslateX(100);
		notruf_view.setTranslateY(235);
		setAlignment(notruf, Pos.BOTTOM_RIGHT);
		notruf.getStyleClass().add("button_notruf");

		// Menu
		getChildren().add(menu);
		getChildren().add(home_view);
		home_view.setFitHeight(19);
		home_view.setFitWidth(20);
		home_view.setTranslateX(-100);
		home_view.setTranslateY(235);
		setAlignment(menu, Pos.BOTTOM_LEFT);
		menu.getStyleClass().add("button_menu");
		
		// Linie 
		getChildren().add(line);
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(300);
		line.setEndY(0);
		line.setStrokeWidth(0.5);
		line.setTranslateY(-222);
		
		// Label Notruf gew�hlt
		getChildren().add(atmetpersonfrage);
		atmetpersonfrage.setTranslateX(0);
		atmetpersonfrage.setTranslateY(-175);
		
		// Label Atmung Info
		getChildren().add(atmunginfo);
		atmunginfo.setTranslateX(0);
		atmunginfo.setTranslateY(50);
		atmunginfo.getStyleClass().add("atmunginfo_label");
		
		// Label Atmung Info 2
		getChildren().add(atmunginfo2);
		atmunginfo2.setTranslateX(87);
		atmunginfo2.setTranslateY(-100);
		atmunginfo2.getStyleClass().add("infos2_label");
		
		
		// Linie 2 
		getChildren().add(line2);
		line2.setStartX(0);
		line2.setStartY(0);
		line2.setEndX(240);
		line2.setEndY(0);
		line2.setStrokeWidth(1.5);
		line2.setTranslateY(-130);
		
		// Linie 3
		getChildren().add(line3);
		line3.setStartX(0);
		line3.setStartY(0);
		line3.setEndX(240);
		line3.setEndY(0);
		line3.setStrokeWidth(1.5);
		line3.setTranslateY(105);
		
		// Button ja
		getChildren().add(ja);
		ja.setTranslateX(62.5);
		ja.setTranslateY(150);
		ja.getStyleClass().add("button_ja");
		
		//Button nein
		getChildren().add(nein);
		nein.setTranslateX(-62.5);
		nein.setTranslateY(150);
		nein.getStyleClass().add("button_nein");
		
		//Atem-Check Symbol
		getChildren().add(atemcheck_view);
		atemcheck_view.setFitHeight(114);
		atemcheck_view.setFitWidth(150);
		atemcheck_view.setTranslateX(-50);
		atemcheck_view.setTranslateY(-60);
		
		//Atemwege Symbol
		getChildren().add(atemwege_view);
		atemwege_view.setFitHeight(70);
		atemwege_view.setFitWidth(80);
		atemwege_view.setTranslateX(87);
		atemwege_view.setTranslateY(-38);
		}
	
	

	/**
	 * Diese Methode gibt eine Referenz auf den weiter-Button zur�ck
	 * @return Der weiter-Button
	 */
	Button getButton_ja() {
	  return ja;
	}

	Button getButton_nein() {
		    return nein;
		  }
	Button getButton_back() {
	    return back;
	  }
	 }