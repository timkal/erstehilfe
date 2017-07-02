package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	/*Panes und Szenen aller Klassen definieren
	Panes abgekürzt mit pZAHL, Scenes mit sZAHL*/
	
	Startseite p0 = new Startseite();
	Scene s0 = new Scene(p0, 300, 550);

	Notruf_gewählt p1 = new Notruf_gewählt();
	Scene s1 = new Scene(p1, 300, 550);

	Menu p2 = new Menu();
	Scene s2 = new Scene(p2, 300, 550);

	Notruf_absetzen p3 = new Notruf_absetzen();
	Scene s3 = new Scene(p3, 300, 550);

	Telefonnummern p4 = new Telefonnummern();
	Scene s4 = new Scene(p4, 300, 550);

	Unfallstelle_abgesichert p5 = new Unfallstelle_abgesichert();
	Scene s5 = new Scene(p5, 300, 550);

	Absicherung p6 = new Absicherung();
	Scene s6 = new Scene(p6, 300, 550);

	Person_entfernt p7 = new Person_entfernt();
	Scene s7 = new Scene(p7, 300, 550);

	Rettungsgriff p8 = new Rettungsgriff();
	Scene s8 = new Scene(p8, 300, 550);

	Person_Bewusstsein p9 = new Person_Bewusstsein();
	Scene s9 = new Scene(p9, 300, 550);

	Person_Bewusstsein p10 = new Person_Bewusstsein();
	Scene s10 = new Scene(p10, 300, 550);

	Person_Atmung p11 = new Person_Atmung();
	Scene s11 = new Scene(p11, 300, 550);

	Person_Atmung p12 = new Person_Atmung();
	Scene s12 = new Scene(p12, 300, 550);

	Reanimation p13 = new Reanimation();
	Scene s13 = new Scene(p13, 300, 550);

	Reanimation p14 = new Reanimation();
	Scene s14 = new Scene(p14, 300, 550);

	Herzdruckmassage p15 = new Herzdruckmassage();
	Scene s15 = new Scene(p15, 300, 550);

	Herzdruckmassage p16 = new Herzdruckmassage();
	Scene s16 = new Scene(p16, 300, 550);

	Beatmung p17 = new Beatmung();
	Scene s17 = new Scene(p17, 300, 550);

	Beatmung p18 = new Beatmung();
	Scene s18 = new Scene(p18, 300, 550);

	Äussere_Verletzung p19 = new Äussere_Verletzung();
	Scene s19 = new Scene(p19, 300, 550);

	Äussere_Verletzung p20 = new Äussere_Verletzung();
	Scene s20 = new Scene(p20, 300, 550);

	Innere_Verletzung p21 = new Innere_Verletzung();
	Scene s21 = new Scene(p21, 300, 550);

	Innere_Verletzung p22 = new Innere_Verletzung();
	Scene s22 = new Scene(p22, 300, 550);

	Stabile_Seitenlage p23 = new Stabile_Seitenlage();
	Scene s23 = new Scene(p23, 300, 550);

	Stabile_Seitenlage p24 = new Stabile_Seitenlage();
	Scene s24 = new Scene(p24, 300, 550);

	Stabile_Seitenlage p25 = new Stabile_Seitenlage();
	Scene s25 = new Scene(p25, 300, 550);

	Stabile_Seitenlage p26 = new Stabile_Seitenlage();
	Scene s26 = new Scene(p26, 300, 550);

	Bedürfnisse_Person p27 = new Bedürfnisse_Person();
	Scene s27 = new Scene(p27, 300, 550);

	Bedürfnisse_Person p28 = new Bedürfnisse_Person();
	Scene s28 = new Scene(p28, 300, 550);

	Bedürfnisse_Person p29 = new Bedürfnisse_Person();
	Scene s29 = new Scene(p29, 300, 550);

	Bedürfnisse_Person p30 = new Bedürfnisse_Person();
	Scene s30 = new Scene(p30, 300, 550);

	Bedürfnisse_Person p31 = new Bedürfnisse_Person();
	Scene s31 = new Scene(p31, 300, 550);

	Bedürfnisse_Person p32 = new Bedürfnisse_Person();
	Scene s32 = new Scene(p32, 300, 550);

	Bedürfnisse_Person p33 = new Bedürfnisse_Person();
	Scene s33 = new Scene(p33, 300, 550);

	Bedürfnisse_Person p34 = new Bedürfnisse_Person();
	Scene s34 = new Scene(p34, 300, 550);
	
	Schocklage p35 = new Schocklage();
	Scene s35 = new Scene(p35, 300, 550);

	Schocklage p36 = new Schocklage();
	Scene s36 = new Scene(p36, 300, 550);

	Blutet_Person p37 = new Blutet_Person();
	Scene s37 = new Scene(p37, 300, 550);

	Blutet_Person p38 = new Blutet_Person();
	Scene s38 = new Scene(p38, 300, 550);

	Druckverband p39 = new Druckverband();
	Scene s39 = new Scene(p39, 300, 550);

	Druckverband p40 = new Druckverband();
	Scene s40 = new Scene(p40, 300, 550);

	Knochen_verletzt p41 = new Knochen_verletzt();
	Scene s41 = new Scene(p41, 300, 550);

	Knochen_verletzt p42 = new Knochen_verletzt();
	Scene s42 = new Scene(p42, 300, 550);

	Knochenbrüche p43 = new Knochenbrüche();
	Scene s43 = new Scene(p43, 300, 550);

	Knochenbrüche p44 = new Knochenbrüche();
	Scene s44 = new Scene(p44, 300, 550);

	Krankenhaus p45 = new Krankenhaus();
	Scene s45 = new Scene(p45, 300, 550);

	public void start(Stage primaryStage) throws Exception {

		// Aktion des Buttons in der Szene 0
		
		p0.getButton_weiter().setOnAction(e -> primaryStage.setScene(s1));
		p1.getButton_ja().setOnAction(e -> primaryStage.setScene(s2));
		p1.getButton_nein().setOnAction(e -> primaryStage.setScene(s3));
		p3.getButton_land().setOnAction(e -> primaryStage.setScene(s4));
		p3.getButton_weiter().setOnAction(e -> primaryStage.setScene(s2));
		p3.getButton_back().setOnAction(e -> primaryStage.setScene(s1));
		p4.getButton_back().setOnAction(e -> primaryStage.setScene(s3));
		p2.getButton_back().setOnAction(e -> primaryStage.setScene(s1));
		p2.getButton_unfall().setOnAction(e -> primaryStage.setScene(s5));
		p5.getButton_back().setOnAction(e -> primaryStage.setScene(s2));
		p6.getButton_back().setOnAction(e -> primaryStage.setScene(s5));
		p5.getButton_nein().setOnAction(e -> primaryStage.setScene(s6));
		p5.getButton_ja().setOnAction(e -> primaryStage.setScene(s7));
		p6.getButton_weiter().setOnAction(e -> primaryStage.setScene(s7));
		p7.getButton_back().setOnAction(e -> primaryStage.setScene(s5));
		p7.getButton_nein().setOnAction(e -> primaryStage.setScene(s8));
		p7.getButton_ja().setOnAction(e -> primaryStage.setScene(s9));
		p8.getButton_back().setOnAction(e -> primaryStage.setScene(s7));
		p8.getButton_weiter().setOnAction(e -> primaryStage.setScene(s9));
		p9.getButton_back().setOnAction(e -> primaryStage.setScene(s7));
		p9.getButton_nein().setOnAction(e -> primaryStage.setScene(s11));
		p11.getButton_back().setOnAction(e -> primaryStage.setScene(s9));
		p11.getButton_nein().setOnAction(e -> primaryStage.setScene(s13));
		p11.getButton_ja().setOnAction(e -> primaryStage.setScene(s19));
		p13.getButton_back().setOnAction(e -> primaryStage.setScene(s11));
		p13.getButton_anleitung().setOnAction(e -> primaryStage.setScene(s15));
		p15.getButton_back().setOnAction(e -> primaryStage.setScene(s13));
		p15.getButton_schritt2().setOnAction(e -> primaryStage.setScene(s17));
		p17.getButton_back().setOnAction(e -> primaryStage.setScene(s15));
		p17.getButton_back_reanimation().setOnAction(e -> primaryStage.setScene(s13));
		p9.getButton_ja().setOnAction(e -> primaryStage.setScene(s19));
		p19.getButton_back().setOnAction(e -> primaryStage.setScene(s9));
		p19.getButton_nein().setOnAction(e -> primaryStage.setScene(s21));
		p21.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
		p21.getButton_nein().setOnAction(e -> primaryStage.setScene(s23));
		p23.getButton_back().setOnAction(e -> primaryStage.setScene(s21));
		p23.getButton_weiter().setOnAction(e -> primaryStage.setScene(s27));
		p27.getButton_back().setOnAction(e -> primaryStage.setScene(s23));
		p21.getButton_ja().setOnAction(e -> primaryStage.setScene(s35));
		p35.getButton_back().setOnAction(e -> primaryStage.setScene(s21));
		p35.getButton_weiter().setOnAction(e -> primaryStage.setScene(s31));
		p31.getButton_back().setOnAction(e -> primaryStage.setScene(s35));
		p19.getButton_ja().setOnAction(e -> primaryStage.setScene(s37));
		p37.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
		p37.getButton_nein().setOnAction(e -> primaryStage.setScene(s41));
		p41.getButton_back().setOnAction(e -> primaryStage.setScene(s37));
		p41.getButton_nein().setOnAction(e -> primaryStage.setScene(s24));
		p24.getButton_back().setOnAction(e -> primaryStage.setScene(s41));
		p24.getButton_weiter().setOnAction(e -> primaryStage.setScene(s28));
		p28.getButton_back().setOnAction(e -> primaryStage.setScene(s24));
		p41.getButton_ja().setOnAction(e -> primaryStage.setScene(s43));
		p43.getButton_back().setOnAction(e -> primaryStage.setScene(s41));
		p43.getButton_weiter().setOnAction(e -> primaryStage.setScene(s32));
		p32.getButton_back().setOnAction(e -> primaryStage.setScene(s43));
		p37.getButton_ja().setOnAction(e -> primaryStage.setScene(s39));
		p39.getButton_back().setOnAction(e -> primaryStage.setScene(s37));
		p39.getButton_weiter().setOnAction(e -> primaryStage.setScene(s41));
		p2.getButton_verletzt().setOnAction(e -> primaryStage.setScene(s10));
		p10.getButton_back().setOnAction(e -> primaryStage.setScene(s2));
		p10.getButton_nein().setOnAction(e -> primaryStage.setScene(s12));
		p12.getButton_back().setOnAction(e -> primaryStage.setScene(s10));
		p12.getButton_nein().setOnAction(e -> primaryStage.setScene(s14));
		p14.getButton_back().setOnAction(e -> primaryStage.setScene(s12));
		p14.getButton_anleitung().setOnAction(e -> primaryStage.setScene(s16));
		p16.getButton_back().setOnAction(e -> primaryStage.setScene(s14));
		p16.getButton_schritt2().setOnAction(e -> primaryStage.setScene(s18));
		p18.getButton_back().setOnAction(e -> primaryStage.setScene(s16));
		p18.getButton_back_reanimation().setOnAction(e -> primaryStage.setScene(s14));
		p10.getButton_ja().setOnAction(e -> primaryStage.setScene(s20));
		p20.getButton_back().setOnAction(e -> primaryStage.setScene(s10));
		p12.getButton_ja().setOnAction(e -> primaryStage.setScene(s20));
		p20.getButton_nein().setOnAction(e -> primaryStage.setScene(s22));
		p22.getButton_back().setOnAction(e -> primaryStage.setScene(s20));
		p22.getButton_nein().setOnAction(e -> primaryStage.setScene(s25));
		p25.getButton_back().setOnAction(e -> primaryStage.setScene(s22));
		p25.getButton_weiter().setOnAction(e -> primaryStage.setScene(s29));
		p29.getButton_back().setOnAction(e -> primaryStage.setScene(s25));
		p22.getButton_ja().setOnAction(e -> primaryStage.setScene(s36));
		p36.getButton_back().setOnAction(e -> primaryStage.setScene(s22));
		p36.getButton_weiter().setOnAction(e -> primaryStage.setScene(s33));
		p33.getButton_back().setOnAction(e -> primaryStage.setScene(s36));
		p20.getButton_ja().setOnAction(e -> primaryStage.setScene(s38));
		p38.getButton_back().setOnAction(e -> primaryStage.setScene(s20));
		p38.getButton_nein().setOnAction(e -> primaryStage.setScene(s42));
		p42.getButton_back().setOnAction(e -> primaryStage.setScene(s38));
		p42.getButton_nein().setOnAction(e -> primaryStage.setScene(s26));
		p26.getButton_back().setOnAction(e -> primaryStage.setScene(s42));
		p26.getButton_weiter().setOnAction(e -> primaryStage.setScene(s30));
		p30.getButton_back().setOnAction(e -> primaryStage.setScene(s26));
		p42.getButton_ja().setOnAction(e -> primaryStage.setScene(s44));
		p44.getButton_back().setOnAction(e -> primaryStage.setScene(s42));
		p44.getButton_weiter().setOnAction(e -> primaryStage.setScene(s34));
		p34.getButton_back().setOnAction(e -> primaryStage.setScene(s44));
		p38.getButton_ja().setOnAction(e -> primaryStage.setScene(s40));
		p40.getButton_back().setOnAction(e -> primaryStage.setScene(s38));
		p40.getButton_weiter().setOnAction(e -> primaryStage.setScene(s42));
		p45.getButton_back().setOnAction(e -> primaryStage.setScene(s1));

		p1.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p3.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p4.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p5.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p6.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p7.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p8.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p9.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p10.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p11.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p12.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p13.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p14.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p15.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p16.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p17.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p18.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p19.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p20.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p21.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p22.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p23.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p24.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p25.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p26.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p27.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p28.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p29.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p30.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p31.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p32.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p33.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p34.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p35.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p36.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p37.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p38.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p39.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p40.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p41.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p42.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p43.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p44.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p45.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));

		p1.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p2.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p4.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p5.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p6.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p7.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p8.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p9.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p10.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p11.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p12.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p13.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p14.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p15.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p16.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p17.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p18.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p19.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p20.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p21.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p22.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p23.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p24.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p25.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p26.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p27.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p28.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p29.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p30.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p31.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p32.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p33.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p34.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p35.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p36.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p37.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p38.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p39.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p40.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p41.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p42.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p43.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p44.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p45.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));

		p1.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p2.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p3.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p4.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p5.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p6.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p7.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p8.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p9.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p10.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p11.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p12.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p13.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p14.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p15.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p16.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p17.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p18.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p19.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p20.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p21.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p22.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p23.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p24.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p25.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p26.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p27.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p28.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p29.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p30.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p31.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p32.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p33.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p34.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p35.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p36.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p37.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p38.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p39.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p40.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p41.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p42.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p43.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));
		p44.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s45));

		// Testbereich für Media-Player
		// p11.getButton_druckfrequenz().setOnAction(e1);

		primaryStage.setScene(s0);
		primaryStage.setTitle("Startscreen");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
