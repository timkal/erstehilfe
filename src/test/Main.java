package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	/*------------------------------------
    Panes und Szenen aller Klassen definieren Panes abgekürzt mit pZAHL, Scenes mit sZAHL
    ------------------------------------*/

	int x= 300;
	int y= 550;

	Startseite p0 = new Startseite();
	Scene s0 = new Scene(p0, x, y);

	Notruf_gewählt p1 = new Notruf_gewählt();
	Scene s1 = new Scene(p1, x, y);

	Menu p2 = new Menu();
	Scene s2 = new Scene(p2, x, y);

	Notruf_absetzen p3 = new Notruf_absetzen();
	Scene s3 = new Scene(p3, x, y);

	Telefonnummern p4 = new Telefonnummern();
	Scene s4 = new Scene(p4, x, y);

	Unfallstelle_abgesichert p5 = new Unfallstelle_abgesichert();
	Scene s5 = new Scene(p5, x, y);

	Absicherung p6 = new Absicherung();
	Scene s6 = new Scene(p6, x, y);

	Person_entfernt p7 = new Person_entfernt();
	Scene s7 = new Scene(p7, x, y);

	Rettungsgriff p8 = new Rettungsgriff();
	Scene s8 = new Scene(p8, x, y);

	Person_Bewusstsein p9 = new Person_Bewusstsein();
	Scene s9 = new Scene(p9, x, y);

	Person_Bewusstsein p10 = new Person_Bewusstsein();
	Scene s10 = new Scene(p10, x, y);

	Person_Atmung p11 = new Person_Atmung();
	Scene s11 = new Scene(p11, x, y);

	Person_Atmung p12 = new Person_Atmung();
	Scene s12 = new Scene(p12, x, y);

	Reanimation p13 = new Reanimation();
	Scene s13 = new Scene(p13, x, y);

	Reanimation p14 = new Reanimation();
	Scene s14 = new Scene(p14, x, y);

	Herzdruckmassage p15 = new Herzdruckmassage();
	Scene s15 = new Scene(p15, x, y);

	Herzdruckmassage p16 = new Herzdruckmassage();
	Scene s16 = new Scene(p16, x, y);

	Beatmung p17 = new Beatmung();
	Scene s17 = new Scene(p17, x, y);

	Beatmung p18 = new Beatmung();
	Scene s18 = new Scene(p18, x, y);

	Äussere_Verletzung p19 = new Äussere_Verletzung();
	Scene s19 = new Scene(p19, x, y);

	Äussere_Verletzung p20 = new Äussere_Verletzung();
	Scene s20 = new Scene(p20, x, y);

	Äussere_Verletzung p21 = new Äussere_Verletzung();
	Scene s21 = new Scene(p21, x, y);

	Äussere_Verletzung p22 = new Äussere_Verletzung();
	Scene s22 = new Scene(p22, x, y);

	Person_Schock p23 = new Person_Schock();
	Scene s23 = new Scene(p23, x, y);

	Person_Schock p24 = new Person_Schock();
	Scene s24 = new Scene(p24, x, y);

	Stabile_Seitenlage p25 = new Stabile_Seitenlage();
	Scene s25 = new Scene(p25, x, y);

	Stabile_Seitenlage p26 = new Stabile_Seitenlage();
	Scene s26 = new Scene(p26, x, y);

	Bedürfnisse_Person p27 = new Bedürfnisse_Person();
	Scene s27 = new Scene(p27, x, y);

	Bedürfnisse_Person p28 = new Bedürfnisse_Person();
	Scene s28 = new Scene(p28, x, y);

	Bedürfnisse_Person p29 = new Bedürfnisse_Person();
	Scene s29 = new Scene(p29, x, y);

	Bedürfnisse_Person p30 = new Bedürfnisse_Person();
	Scene s30 = new Scene(p30, x, y);
	
	Bedürfnisse_Person p31 = new Bedürfnisse_Person();
	Scene s31 = new Scene(p31, x, y);

	Bedürfnisse_Person p32 = new Bedürfnisse_Person();
	Scene s32 = new Scene(p32, x, y);
	
	Schocklage p33 = new Schocklage();
	Scene s33 = new Scene(p33, x, y);

	Schocklage p34 = new Schocklage();
	Scene s34 = new Scene(p34, x, y);

	Blutet_Person p35 = new Blutet_Person();
	Scene s35 = new Scene(p35, x, y);

	Blutet_Person p36 = new Blutet_Person();
	Scene s36 = new Scene(p36, x, y);

	Blutet_Person p37 = new Blutet_Person();
	Scene s37 = new Scene(p37, x, y);

	Blutet_Person p38 = new Blutet_Person();
	Scene s38 = new Scene(p38, x, y);

	Druckverband p39 = new Druckverband();
	Scene s39 = new Scene(p39, x, y);

	Druckverband p40 = new Druckverband();
	Scene s40 = new Scene(p40, x, y);

	Druckverband p41 = new Druckverband();
	Scene s41 = new Scene(p41, x, y);

	Druckverband p42 = new Druckverband();
	Scene s42 = new Scene(p42, x, y);

	Knochen_verletzt p43 = new Knochen_verletzt();
	Scene s43 = new Scene(p43, x, y);

	Knochen_verletzt p44 = new Knochen_verletzt();
	Scene s44 = new Scene(p44, x, y);

	Knochen_verletzt p45 = new Knochen_verletzt();
	Scene s45 = new Scene(p45, x, y);

	Knochen_verletzt p46 = new Knochen_verletzt();
	Scene s46 = new Scene(p46, x, y);
	
	Knochen_verletzt p47 = new Knochen_verletzt();
	Scene s47 = new Scene(p47, x, y);

	Knochen_verletzt p48 = new Knochen_verletzt();
	Scene s48 = new Scene(p48, x, y);

	Knochen_verletzt p49 = new Knochen_verletzt();
	Scene s49 = new Scene(p49, x, y);

	Knochen_verletzt p50 = new Knochen_verletzt();
	Scene s50 = new Scene(p50, x, y);

	Knochenbrüche p51 = new Knochenbrüche();
	Scene s51 = new Scene(p51, x, y);
	
	Knochenbrüche p52 = new Knochenbrüche();
	Scene s52 = new Scene(p52, x, y);
	
	Knochenbrüche p53 = new Knochenbrüche();
	Scene s53 = new Scene(p53, x, y);
	
	Knochenbrüche p54 = new Knochenbrüche();
	Scene s54 = new Scene(p54, x, y);
	
	Knochenbrüche p55 = new Knochenbrüche();
	Scene s55 = new Scene(p55, x, y);
	
	Knochenbrüche p56 = new Knochenbrüche();
	Scene s56 = new Scene(p56, x, y);
	
	Knochenbrüche p57 = new Knochenbrüche();
	Scene s57 = new Scene(p57, x, y);
	
	Knochenbrüche p58 = new Knochenbrüche();
	Scene s58 = new Scene(p58, x, y);

	Krankenhaus p59 = new Krankenhaus();
	Scene s59 = new Scene(p59, x, y);
	
	public void start(Stage primaryStage) throws Exception {

		/*------------------------------------
		Verknüpfung der Klassen mit Lambda-Ausdruck. Dies ist eine alternative Schreibweise des klassischen
		Event-Handlers und wird verwendet, um den Code möglichst komprimiert darzustellen.
		------------------------------------*/
		
		// Verlinkungen der Screens
		p0.getButton_start().setOnAction(e -> primaryStage.setScene(s1));
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
		p9.getButton_ja().setOnAction(e -> primaryStage.setScene(s20));
		p20.getButton_back().setOnAction(e -> primaryStage.setScene(s9));
		p19.getButton_nein().setOnAction(e -> primaryStage.setScene(s25));
		p19.getButton_back().setOnAction(e -> primaryStage.setScene(s11));
		p25.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
		p25.getButton_weiter().setOnAction(e -> primaryStage.setScene(s27));
		p27.getButton_back().setOnAction(e -> primaryStage.setScene(s25));
		p19.getButton_ja().setOnAction(e -> primaryStage.setScene(s35));
		p35.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
		p35.getButton_nein().setOnAction(e -> primaryStage.setScene(s43));
		p35.getButton_ja().setOnAction(e -> primaryStage.setScene(s39));
		p39.getButton_weiter().setOnAction(e -> primaryStage.setScene(s44));
		p43.getButton_back().setOnAction(e -> primaryStage.setScene(s35));
		p44.getButton_back().setOnAction(e -> primaryStage.setScene(s39));
		p43.getButton_nein().setOnAction(e -> primaryStage.setScene(s25));
		p44.getButton_nein().setOnAction(e -> primaryStage.setScene(s25));
		p43.getButton_ja().setOnAction(e -> primaryStage.setScene(s51));
		p44.getButton_ja().setOnAction(e -> primaryStage.setScene(s52));
		p51.getButton_weiter().setOnAction(e -> primaryStage.setScene(s25));
		p52.getButton_weiter().setOnAction(e -> primaryStage.setScene(s25));
		p51.getButton_back().setOnAction(e -> primaryStage.setScene(s43));
		p52.getButton_back().setOnAction(e -> primaryStage.setScene(s44));
		p20.getButton_ja().setOnAction(e -> primaryStage.setScene(s36));
		p36.getButton_back().setOnAction(e -> primaryStage.setScene(s20));
		p36.getButton_ja().setOnAction(e -> primaryStage.setScene(s40));
		p40.getButton_back().setOnAction(e -> primaryStage.setScene(s36));
		p40.getButton_weiter().setOnAction(e -> primaryStage.setScene(s46));
		p46.getButton_back().setOnAction(e -> primaryStage.setScene(s40));
		p36.getButton_nein().setOnAction(e -> primaryStage.setScene(s45));
		p45.getButton_back().setOnAction(e -> primaryStage.setScene(s36));
		p45.getButton_ja().setOnAction(e -> primaryStage.setScene(s53));
		p46.getButton_ja().setOnAction(e -> primaryStage.setScene(s54));
		p53.getButton_back().setOnAction(e -> primaryStage.setScene(s45));
		p54.getButton_back().setOnAction(e -> primaryStage.setScene(s46));
		p53.getButton_weiter().setOnAction(e -> primaryStage.setScene(s23));
		p54.getButton_weiter().setOnAction(e -> primaryStage.setScene(s23));
		p23.getButton_back().setOnAction(e -> primaryStage.setScene(s45));
		p45.getButton_nein().setOnAction(e -> primaryStage.setScene(s23));
		p46.getButton_nein().setOnAction(e -> primaryStage.setScene(s23));
		p23.getButton_back().setOnAction(e -> primaryStage.setScene(s20));
		p20.getButton_nein().setOnAction(e -> primaryStage.setScene(s23));
		p23.getButton_nein().setOnAction(e -> primaryStage.setScene(s28));
		p23.getButton_ja().setOnAction(e -> primaryStage.setScene(s33));
		p33.getButton_back().setOnAction(e -> primaryStage.setScene(s23));
		p33.getButton_weiter().setOnAction(e -> primaryStage.setScene(s29));
		p29.getButton_back().setOnAction(e -> primaryStage.setScene(s33));
		p28.getButton_back().setOnAction(e -> primaryStage.setScene(s23));
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
		p12.getButton_ja().setOnAction(e -> primaryStage.setScene(s21));
		p21.getButton_back().setOnAction(e -> primaryStage.setScene(s12));
		p21.getButton_ja().setOnAction(e -> primaryStage.setScene(s37));
		p37.getButton_back().setOnAction(e -> primaryStage.setScene(s21));
		p37.getButton_ja().setOnAction(e -> primaryStage.setScene(s41));
		p41.getButton_back().setOnAction(e -> primaryStage.setScene(s37));
		p41.getButton_weiter().setOnAction(e -> primaryStage.setScene(s48));
		p48.getButton_back().setOnAction(e -> primaryStage.setScene(s41));
		p37.getButton_nein().setOnAction(e -> primaryStage.setScene(s47));
		p47.getButton_back().setOnAction(e -> primaryStage.setScene(s37));
		p21.getButton_nein().setOnAction(e -> primaryStage.setScene(s26));
		p26.getButton_back().setOnAction(e -> primaryStage.setScene(s21));
		p26.getButton_weiter().setOnAction(e -> primaryStage.setScene(s30));
		p30.getButton_back().setOnAction(e -> primaryStage.setScene(s26));
		p47.getButton_ja().setOnAction(e -> primaryStage.setScene(s55));
		p48.getButton_ja().setOnAction(e -> primaryStage.setScene(s56));
		p47.getButton_nein().setOnAction(e -> primaryStage.setScene(s26));
		p48.getButton_nein().setOnAction(e -> primaryStage.setScene(s26));
		p55.getButton_back().setOnAction(e -> primaryStage.setScene(s47));
		p56.getButton_back().setOnAction(e -> primaryStage.setScene(s48));
		p55.getButton_weiter().setOnAction(e -> primaryStage.setScene(s26));
		p56.getButton_weiter().setOnAction(e -> primaryStage.setScene(s26));
		p10.getButton_ja().setOnAction(e -> primaryStage.setScene(s22));
		p22.getButton_back().setOnAction(e -> primaryStage.setScene(s10));
		p22.getButton_ja().setOnAction(e -> primaryStage.setScene(s38));
		p38.getButton_back().setOnAction(e -> primaryStage.setScene(s22));
		p38.getButton_ja().setOnAction(e -> primaryStage.setScene(s42));
		p42.getButton_back().setOnAction(e -> primaryStage.setScene(s38));
		p42.getButton_weiter().setOnAction(e -> primaryStage.setScene(s50));
		p50.getButton_back().setOnAction(e -> primaryStage.setScene(s42));
		p38.getButton_nein().setOnAction(e -> primaryStage.setScene(s49));
		p49.getButton_back().setOnAction(e -> primaryStage.setScene(s38));
		p22.getButton_nein().setOnAction(e -> primaryStage.setScene(s24));
		p49.getButton_nein().setOnAction(e -> primaryStage.setScene(s24));
		p50.getButton_nein().setOnAction(e -> primaryStage.setScene(s24));
		p49.getButton_ja().setOnAction(e -> primaryStage.setScene(s57));
		p50.getButton_ja().setOnAction(e -> primaryStage.setScene(s58));
		p57.getButton_back().setOnAction(e -> primaryStage.setScene(s49));
		p58.getButton_back().setOnAction(e -> primaryStage.setScene(s50));
		p57.getButton_weiter().setOnAction(e -> primaryStage.setScene(s24));
		p58.getButton_weiter().setOnAction(e -> primaryStage.setScene(s24));
		p24.getButton_back().setOnAction(e -> primaryStage.setScene(s22));
		p24.getButton_ja().setOnAction(e -> primaryStage.setScene(s34));
		p34.getButton_back().setOnAction(e -> primaryStage.setScene(s24));
		p24.getButton_nein().setOnAction(e -> primaryStage.setScene(s31));
		p31.getButton_back().setOnAction(e -> primaryStage.setScene(s24));
		p34.getButton_weiter().setOnAction(e -> primaryStage.setScene(s32));
		p32.getButton_back().setOnAction(e -> primaryStage.setScene(s34));

		// Verlinkungen der Screens mit der Tab Bar, hier mit dem Menü
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
		p46.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p47.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p48.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p49.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p50.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p51.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p52.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p53.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p54.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p55.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p56.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p57.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p58.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p59.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));

		// Verlinkungen der Screens mit der Tab Bar, hier mit dem Notruf
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
		p46.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p47.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p48.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p49.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p50.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p51.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p52.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p53.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p54.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p55.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p56.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p57.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p58.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p59.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		
		// Verlinkungen der Screens mit der Tab Bar, hier mit dem Krankenhaus
		p1.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p2.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p3.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p4.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p5.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p6.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p7.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p8.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p9.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p10.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p11.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p12.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p13.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p14.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p15.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p16.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p17.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p18.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p19.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p20.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p21.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p22.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p23.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p24.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p25.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p26.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p27.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p28.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p29.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p30.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p31.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p32.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p33.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p34.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p35.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p36.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p37.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p38.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p39.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p40.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p41.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p42.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p43.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p44.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p45.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p46.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p47.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p48.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p49.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p50.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p51.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p52.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p53.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p54.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p55.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p56.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p57.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));
		p58.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s59));

		
		primaryStage.setScene(s0);
		primaryStage.setTitle("Erste Hilfe");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
