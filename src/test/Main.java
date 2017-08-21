package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hier werden alle Klassen (Objekte) erzeugt. Panes und Scenes werden
 * definiert. Alle "Verlinkungen" zwischen den Klassen über die Buttons werden
 * erstellt.
 * 
 * @author Tim
 *
 */
public class Main extends Application {

	/*------------------------------------
	Panes und Szenen aller Klassen erzeugen: Panes abgekürzt mit pZAHL, Scenes mit sZAHL
	------------------------------------*/

	// Diese Variablen geben die Größe der Scene an.
	int x = 300;
	int y = 550;

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

	Person_Schock p25 = new Person_Schock();
	Scene s25 = new Scene(p25, x, y);

	Person_Schock p26 = new Person_Schock();
	Scene s26 = new Scene(p26, x, y);

	Person_Schock p27 = new Person_Schock();
	Scene s27 = new Scene(p27, x, y);

	Person_Schock p28 = new Person_Schock();
	Scene s28 = new Scene(p28, x, y);

	Person_Schock p29 = new Person_Schock();
	Scene s29 = new Scene(p29, x, y);

	Person_Schock p30 = new Person_Schock();
	Scene s30 = new Scene(p30, x, y);

	Person_Schock p31 = new Person_Schock();
	Scene s31 = new Scene(p31, x, y);

	Person_Schock p32 = new Person_Schock();
	Scene s32 = new Scene(p32, x, y);

	Stabile_Seitenlage p33 = new Stabile_Seitenlage();
	Scene s33 = new Scene(p33, x, y);

	Stabile_Seitenlage p34 = new Stabile_Seitenlage();
	Scene s34 = new Scene(p34, x, y);

	Bedürfnisse_Person p35 = new Bedürfnisse_Person();
	Scene s35 = new Scene(p35, x, y);

	Bedürfnisse_Person p36 = new Bedürfnisse_Person();
	Scene s36 = new Scene(p36, x, y);

	Bedürfnisse_Person p37 = new Bedürfnisse_Person();
	Scene s37 = new Scene(p37, x, y);

	Bedürfnisse_Person p38 = new Bedürfnisse_Person();
	Scene s38 = new Scene(p38, x, y);

	Bedürfnisse_Person p39 = new Bedürfnisse_Person();
	Scene s39 = new Scene(p39, x, y);

	Bedürfnisse_Person p40 = new Bedürfnisse_Person();
	Scene s40 = new Scene(p40, x, y);

	Bedürfnisse_Person p41 = new Bedürfnisse_Person();
	Scene s41 = new Scene(p41, x, y);

	Bedürfnisse_Person p42 = new Bedürfnisse_Person();
	Scene s42 = new Scene(p42, x, y);

	Bedürfnisse_Person p43 = new Bedürfnisse_Person();
	Scene s43 = new Scene(p43, x, y);

	Bedürfnisse_Person p44 = new Bedürfnisse_Person();
	Scene s44 = new Scene(p44, x, y);

	Bedürfnisse_Person p45 = new Bedürfnisse_Person();
	Scene s45 = new Scene(p45, x, y);

	Bedürfnisse_Person p46 = new Bedürfnisse_Person();
	Scene s46 = new Scene(p46, x, y);

	Bedürfnisse_Person p47 = new Bedürfnisse_Person();
	Scene s47 = new Scene(p47, x, y);

	Bedürfnisse_Person p48 = new Bedürfnisse_Person();
	Scene s48 = new Scene(p48, x, y);

	Bedürfnisse_Person p49 = new Bedürfnisse_Person();
	Scene s49 = new Scene(p49, x, y);

	Bedürfnisse_Person p50 = new Bedürfnisse_Person();
	Scene s50 = new Scene(p50, x, y);

	Bedürfnisse_Person p51 = new Bedürfnisse_Person();
	Scene s51 = new Scene(p51, x, y);

	Bedürfnisse_Person p52 = new Bedürfnisse_Person();
	Scene s52 = new Scene(p52, x, y);

	Bedürfnisse_Person p53 = new Bedürfnisse_Person();
	Scene s53 = new Scene(p53, x, y);

	Bedürfnisse_Person p54 = new Bedürfnisse_Person();
	Scene s54 = new Scene(p54, x, y);

	Bedürfnisse_Person p55 = new Bedürfnisse_Person();
	Scene s55 = new Scene(p55, x, y);

	Bedürfnisse_Person p56 = new Bedürfnisse_Person();
	Scene s56 = new Scene(p56, x, y);

	Schocklage p57 = new Schocklage();
	Scene s57 = new Scene(p57, x, y);

	Schocklage p58 = new Schocklage();
	Scene s58 = new Scene(p58, x, y);

	Schocklage p59 = new Schocklage();
	Scene s59 = new Scene(p59, x, y);

	Schocklage p60 = new Schocklage();
	Scene s60 = new Scene(p60, x, y);

	Schocklage p61 = new Schocklage();
	Scene s61 = new Scene(p61, x, y);

	Schocklage p62 = new Schocklage();
	Scene s62 = new Scene(p62, x, y);

	Schocklage p63 = new Schocklage();
	Scene s63 = new Scene(p63, x, y);

	Schocklage p64 = new Schocklage();
	Scene s64 = new Scene(p64, x, y);

	Schocklage p65 = new Schocklage();
	Scene s65 = new Scene(p65, x, y);

	Schocklage p66 = new Schocklage();
	Scene s66 = new Scene(p66, x, y);

	Blutet_Person p67 = new Blutet_Person();
	Scene s67 = new Scene(p67, x, y);

	Blutet_Person p68 = new Blutet_Person();
	Scene s68 = new Scene(p68, x, y);

	Blutet_Person p69 = new Blutet_Person();
	Scene s69 = new Scene(p69, x, y);

	Blutet_Person p70 = new Blutet_Person();
	Scene s70 = new Scene(p70, x, y);

	Druckverband p71 = new Druckverband();
	Scene s71 = new Scene(p71, x, y);

	Druckverband p72 = new Druckverband();
	Scene s72 = new Scene(p72, x, y);

	Druckverband p73 = new Druckverband();
	Scene s73 = new Scene(p73, x, y);

	Druckverband p74 = new Druckverband();
	Scene s74 = new Scene(p74, x, y);

	Knochen_verletzt p75 = new Knochen_verletzt();
	Scene s75 = new Scene(p75, x, y);

	Knochen_verletzt p76 = new Knochen_verletzt();
	Scene s76 = new Scene(p76, x, y);

	Knochen_verletzt p77 = new Knochen_verletzt();
	Scene s77 = new Scene(p77, x, y);

	Knochen_verletzt p78 = new Knochen_verletzt();
	Scene s78 = new Scene(p78, x, y);

	Knochen_verletzt p79 = new Knochen_verletzt();
	Scene s79 = new Scene(p79, x, y);

	Knochen_verletzt p80 = new Knochen_verletzt();
	Scene s80 = new Scene(p80, x, y);

	Knochen_verletzt p81 = new Knochen_verletzt();
	Scene s81 = new Scene(p81, x, y);

	Knochen_verletzt p82 = new Knochen_verletzt();
	Scene s82 = new Scene(p82, x, y);

	Knochenbrüche p83 = new Knochenbrüche();
	Scene s83 = new Scene(p83, x, y);

	Knochenbrüche p84 = new Knochenbrüche();
	Scene s84 = new Scene(p84, x, y);

	Knochenbrüche p85 = new Knochenbrüche();
	Scene s85 = new Scene(p85, x, y);

	Knochenbrüche p86 = new Knochenbrüche();
	Scene s86 = new Scene(p86, x, y);

	Knochenbrüche p87 = new Knochenbrüche();
	Scene s87 = new Scene(p87, x, y);

	Knochenbrüche p88 = new Knochenbrüche();
	Scene s88 = new Scene(p88, x, y);

	Knochenbrüche p89 = new Knochenbrüche();
	Scene s89 = new Scene(p89, x, y);

	Knochenbrüche p90 = new Knochenbrüche();
	Scene s90 = new Scene(p90, x, y);

	Krankenhaus p91 = new Krankenhaus();
	Scene s91 = new Scene(p91, x, y);

	Notruf_wählen p92 = new Notruf_wählen();
	Scene s92 = new Scene(p92, x, y);

	public void start(Stage primaryStage) throws Exception {

		/*
		 * Verknüpfung der Klassen mit dem Lambda-Ausdruck. Dies ist eine
		 * alternative Schreibweise des klassischen EventHandlers und wird
		 * verwendet, um den Code möglichst komprimiert darzustellen. Die
		 * Struktur des Lambda-Ausdrucks wurde von der Webseite
		 * https://javabeginners.de/Klassen_und_Interfaces/Lambda_Ausdruecke.php
		 * übernommen, auf welcher der Ausdruck anhand des ActionListeners
		 * erklärt wird.
		 */

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
		p19.getButton_nein().setOnAction(e -> primaryStage.setScene(s33));
		p19.getButton_back().setOnAction(e -> primaryStage.setScene(s11));
		p33.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
		p33.getButton_weiter().setOnAction(e -> primaryStage.setScene(s35));
		p35.getButton_back().setOnAction(e -> primaryStage.setScene(s33));
		p19.getButton_ja().setOnAction(e -> primaryStage.setScene(s67));
		p67.getButton_back().setOnAction(e -> primaryStage.setScene(s19));
		p67.getButton_nein().setOnAction(e -> primaryStage.setScene(s75));
		p67.getButton_ja().setOnAction(e -> primaryStage.setScene(s71));
		p71.getButton_back().setOnAction(e -> primaryStage.setScene(s67));
		p71.getButton_weiter().setOnAction(e -> primaryStage.setScene(s76));
		p75.getButton_back().setOnAction(e -> primaryStage.setScene(s67));
		p76.getButton_back().setOnAction(e -> primaryStage.setScene(s71));
		p75.getButton_nein().setOnAction(e -> primaryStage.setScene(s33));
		p76.getButton_nein().setOnAction(e -> primaryStage.setScene(s33));
		p75.getButton_ja().setOnAction(e -> primaryStage.setScene(s83));
		p76.getButton_ja().setOnAction(e -> primaryStage.setScene(s84));
		p83.getButton_weiter().setOnAction(e -> primaryStage.setScene(s33));
		p84.getButton_weiter().setOnAction(e -> primaryStage.setScene(s33));
		p83.getButton_back().setOnAction(e -> primaryStage.setScene(s75));
		p84.getButton_back().setOnAction(e -> primaryStage.setScene(s76));
		p20.getButton_ja().setOnAction(e -> primaryStage.setScene(s68));
		p68.getButton_back().setOnAction(e -> primaryStage.setScene(s20));
		p68.getButton_ja().setOnAction(e -> primaryStage.setScene(s72));
		p72.getButton_back().setOnAction(e -> primaryStage.setScene(s68));
		p72.getButton_weiter().setOnAction(e -> primaryStage.setScene(s78));
		p78.getButton_back().setOnAction(e -> primaryStage.setScene(s72));
		p68.getButton_nein().setOnAction(e -> primaryStage.setScene(s77));
		p77.getButton_back().setOnAction(e -> primaryStage.setScene(s68));
		p77.getButton_ja().setOnAction(e -> primaryStage.setScene(s85));
		p78.getButton_ja().setOnAction(e -> primaryStage.setScene(s86));
		p85.getButton_back().setOnAction(e -> primaryStage.setScene(s77));
		p86.getButton_back().setOnAction(e -> primaryStage.setScene(s78));
		p85.getButton_weiter().setOnAction(e -> primaryStage.setScene(s26));
		p86.getButton_weiter().setOnAction(e -> primaryStage.setScene(s27));
		p26.getButton_back().setOnAction(e -> primaryStage.setScene(s85));
		p27.getButton_back().setOnAction(e -> primaryStage.setScene(s86));
		p26.getButton_nein().setOnAction(e -> primaryStage.setScene(s42));
		p42.getButton_back().setOnAction(e -> primaryStage.setScene(s26));
		p26.getButton_ja().setOnAction(e -> primaryStage.setScene(s60));
		p60.getButton_back().setOnAction(e -> primaryStage.setScene(s26));
		p60.getButton_weiter().setOnAction(e -> primaryStage.setScene(s43));
		p43.getButton_back().setOnAction(e -> primaryStage.setScene(s60));
		p27.getButton_nein().setOnAction(e -> primaryStage.setScene(s44));
		p44.getButton_back().setOnAction(e -> primaryStage.setScene(s27));
		p27.getButton_ja().setOnAction(e -> primaryStage.setScene(s61));
		p61.getButton_back().setOnAction(e -> primaryStage.setScene(s27));
		p61.getButton_weiter().setOnAction(e -> primaryStage.setScene(s45));
		p45.getButton_back().setOnAction(e -> primaryStage.setScene(s61));
		p23.getButton_back().setOnAction(e -> primaryStage.setScene(s77));
		p77.getButton_nein().setOnAction(e -> primaryStage.setScene(s24));
		p24.getButton_back().setOnAction(e -> primaryStage.setScene(s77));
		p24.getButton_nein().setOnAction(e -> primaryStage.setScene(s38));
		p38.getButton_back().setOnAction(e -> primaryStage.setScene(s24));
		p24.getButton_ja().setOnAction(e -> primaryStage.setScene(s58));
		p58.getButton_back().setOnAction(e -> primaryStage.setScene(s24));
		p58.getButton_weiter().setOnAction(e -> primaryStage.setScene(s39));
		p39.getButton_back().setOnAction(e -> primaryStage.setScene(s58));
		p78.getButton_nein().setOnAction(e -> primaryStage.setScene(s25));
		p25.getButton_back().setOnAction(e -> primaryStage.setScene(s78));
		p25.getButton_nein().setOnAction(e -> primaryStage.setScene(s40));
		p25.getButton_ja().setOnAction(e -> primaryStage.setScene(s59));
		p40.getButton_back().setOnAction(e -> primaryStage.setScene(s25));
		p59.getButton_back().setOnAction(e -> primaryStage.setScene(s25));
		p59.getButton_weiter().setOnAction(e -> primaryStage.setScene(s41));
		p41.getButton_back().setOnAction(e -> primaryStage.setScene(s59));
		p23.getButton_back().setOnAction(e -> primaryStage.setScene(s20));
		p20.getButton_nein().setOnAction(e -> primaryStage.setScene(s23));
		p23.getButton_nein().setOnAction(e -> primaryStage.setScene(s36));
		p23.getButton_ja().setOnAction(e -> primaryStage.setScene(s57));
		p57.getButton_back().setOnAction(e -> primaryStage.setScene(s23));
		p57.getButton_weiter().setOnAction(e -> primaryStage.setScene(s37));
		p37.getButton_back().setOnAction(e -> primaryStage.setScene(s57));
		p36.getButton_back().setOnAction(e -> primaryStage.setScene(s23));
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
		p21.getButton_ja().setOnAction(e -> primaryStage.setScene(s69));
		p69.getButton_back().setOnAction(e -> primaryStage.setScene(s21));
		p69.getButton_ja().setOnAction(e -> primaryStage.setScene(s73));
		p73.getButton_back().setOnAction(e -> primaryStage.setScene(s69));
		p73.getButton_weiter().setOnAction(e -> primaryStage.setScene(s80));
		p80.getButton_back().setOnAction(e -> primaryStage.setScene(s73));
		p69.getButton_nein().setOnAction(e -> primaryStage.setScene(s79));
		p79.getButton_back().setOnAction(e -> primaryStage.setScene(s69));
		p21.getButton_nein().setOnAction(e -> primaryStage.setScene(s34));
		p34.getButton_back().setOnAction(e -> primaryStage.setScene(s21));
		p34.getButton_weiter().setOnAction(e -> primaryStage.setScene(s38));
		p38.getButton_back().setOnAction(e -> primaryStage.setScene(s34));
		p79.getButton_ja().setOnAction(e -> primaryStage.setScene(s87));
		p80.getButton_ja().setOnAction(e -> primaryStage.setScene(s88));
		p79.getButton_nein().setOnAction(e -> primaryStage.setScene(s34));
		p80.getButton_nein().setOnAction(e -> primaryStage.setScene(s34));
		p87.getButton_back().setOnAction(e -> primaryStage.setScene(s79));
		p88.getButton_back().setOnAction(e -> primaryStage.setScene(s80));
		p87.getButton_weiter().setOnAction(e -> primaryStage.setScene(s34));
		p88.getButton_weiter().setOnAction(e -> primaryStage.setScene(s34));
		p10.getButton_ja().setOnAction(e -> primaryStage.setScene(s22));
		p22.getButton_back().setOnAction(e -> primaryStage.setScene(s10));
		p22.getButton_ja().setOnAction(e -> primaryStage.setScene(s70));
		p70.getButton_back().setOnAction(e -> primaryStage.setScene(s22));
		p70.getButton_ja().setOnAction(e -> primaryStage.setScene(s74));
		p74.getButton_back().setOnAction(e -> primaryStage.setScene(s70));
		p74.getButton_weiter().setOnAction(e -> primaryStage.setScene(s82));
		p82.getButton_back().setOnAction(e -> primaryStage.setScene(s74));
		p70.getButton_nein().setOnAction(e -> primaryStage.setScene(s81));
		p81.getButton_back().setOnAction(e -> primaryStage.setScene(s70));
		p22.getButton_nein().setOnAction(e -> primaryStage.setScene(s28));
		p81.getButton_nein().setOnAction(e -> primaryStage.setScene(s29));
		p29.getButton_ja().setOnAction(e -> primaryStage.setScene(s63));
		p29.getButton_nein().setOnAction(e -> primaryStage.setScene(s49));
		p63.getButton_back().setOnAction(e -> primaryStage.setScene(s29));
		p49.getButton_back().setOnAction(e -> primaryStage.setScene(s29));
		p63.getButton_weiter().setOnAction(e -> primaryStage.setScene(s50));
		p50.getButton_back().setOnAction(e -> primaryStage.setScene(s63));
		p29.getButton_back().setOnAction(e -> primaryStage.setScene(s81));
		p82.getButton_nein().setOnAction(e -> primaryStage.setScene(s30));
		p30.getButton_back().setOnAction(e -> primaryStage.setScene(s82));
		p30.getButton_ja().setOnAction(e -> primaryStage.setScene(s64));
		p30.getButton_nein().setOnAction(e -> primaryStage.setScene(s51));
		p64.getButton_back().setOnAction(e -> primaryStage.setScene(s30));
		p51.getButton_back().setOnAction(e -> primaryStage.setScene(s30));
		p64.getButton_weiter().setOnAction(e -> primaryStage.setScene(s52));
		p52.getButton_back().setOnAction(e -> primaryStage.setScene(s64));
		p81.getButton_ja().setOnAction(e -> primaryStage.setScene(s89));
		p82.getButton_ja().setOnAction(e -> primaryStage.setScene(s90));
		p89.getButton_back().setOnAction(e -> primaryStage.setScene(s81));
		p90.getButton_back().setOnAction(e -> primaryStage.setScene(s82));
		p89.getButton_weiter().setOnAction(e -> primaryStage.setScene(s31));
		p31.getButton_back().setOnAction(e -> primaryStage.setScene(s89));
		p32.getButton_back().setOnAction(e -> primaryStage.setScene(s90));
		p90.getButton_weiter().setOnAction(e -> primaryStage.setScene(s32));
		p31.getButton_ja().setOnAction(e -> primaryStage.setScene(s65));
		p31.getButton_nein().setOnAction(e -> primaryStage.setScene(s53));
		p65.getButton_back().setOnAction(e -> primaryStage.setScene(s31));
		p53.getButton_back().setOnAction(e -> primaryStage.setScene(s31));
		p65.getButton_weiter().setOnAction(e -> primaryStage.setScene(s54));
		p54.getButton_back().setOnAction(e -> primaryStage.setScene(s65));
		p32.getButton_ja().setOnAction(e -> primaryStage.setScene(s66));
		p32.getButton_nein().setOnAction(e -> primaryStage.setScene(s55));
		p55.getButton_back().setOnAction(e -> primaryStage.setScene(s32));
		p66.getButton_back().setOnAction(e -> primaryStage.setScene(s32));
		p66.getButton_weiter().setOnAction(e -> primaryStage.setScene(s56));
		p56.getButton_back().setOnAction(e -> primaryStage.setScene(s66));
		p28.getButton_back().setOnAction(e -> primaryStage.setScene(s22));
		p28.getButton_ja().setOnAction(e -> primaryStage.setScene(s62));
		p62.getButton_back().setOnAction(e -> primaryStage.setScene(s28));
		p28.getButton_nein().setOnAction(e -> primaryStage.setScene(s47));
		p47.getButton_back().setOnAction(e -> primaryStage.setScene(s28));
		p62.getButton_weiter().setOnAction(e -> primaryStage.setScene(s48));
		p48.getButton_back().setOnAction(e -> primaryStage.setScene(s62));
		p3.getButton_notrufwählen().setOnAction(e -> primaryStage.setScene(s92));
		p92.getButton_back().setOnAction(e -> primaryStage.setScene(s3));

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
		p60.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p61.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p62.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p63.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p64.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p65.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p66.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p67.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p68.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p69.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p70.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p71.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p72.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p73.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p74.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p75.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p76.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p77.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p78.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p79.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p80.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p81.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p82.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p83.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p84.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p85.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p86.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p87.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p88.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p89.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p90.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p91.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));
		p92.getButton_menu().setOnAction(e -> primaryStage.setScene(s2));

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
		p60.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p61.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p62.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p63.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p64.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p65.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p66.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p67.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p68.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p69.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p70.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p71.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p72.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p73.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p74.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p75.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p76.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p77.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p78.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p79.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p80.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p81.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p82.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p83.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p84.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p85.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p86.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p87.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p88.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p89.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p90.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p91.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));
		p92.getButton_notruf().setOnAction(e -> primaryStage.setScene(s3));

		// Verlinkungen der Screens mit der Tab Bar, hier mit dem Krankenhaus
		p1.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p2.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p3.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p4.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p5.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p6.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p7.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p8.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p9.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p10.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p11.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p12.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p13.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p14.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p15.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p16.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p17.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p18.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p19.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p20.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p21.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p22.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p23.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p24.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p25.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p26.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p27.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p28.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p29.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p30.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p31.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p32.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p33.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p34.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p35.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p36.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p37.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p38.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p39.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p40.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p41.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p42.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p43.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p44.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p45.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p46.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p47.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p48.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p49.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p50.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p51.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p52.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p53.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p54.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p55.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p56.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p57.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p58.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p59.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p60.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p61.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p62.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p63.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p64.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p65.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p66.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p67.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p68.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p69.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p70.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p71.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p72.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p73.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p74.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p75.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p76.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p77.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p78.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p79.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p80.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p81.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p82.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p83.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p84.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p85.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p86.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p87.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p88.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p89.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p90.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));
		p92.getButton_krankenhaus().setOnAction(e -> primaryStage.setScene(s91));

		/*
		 * Unsere Scene 0 wird auf die Stage gesetzt. Der Titel wird erstellt.
		 * Wir haben die Größe aller Elemente genau festgelegt, weshalb wir die
		 * Stage auf setResizable(false) gesetzt haben, da sich sonst alle
		 * Elemente "verschieben" würden bzw. in einer nicht nutzerfreundlichen
		 * Anordnung und Größe dargestellt werden würden.
		 */
		primaryStage.setScene(s0);
		primaryStage.setTitle("Erste Hilfe");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
