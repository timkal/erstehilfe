package test;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
 
 
public class ABC extends JFrame implements ActionListener {
 
 
	private JLabel frage;
	private JButton antwort1;
	private JButton antwort2;
	private JButton leiste1;
	private JButton leiste2;
	private JButton leiste3;
	private JButton verkehrsunfall;
	private JButton verletzt;
	private JButton absetzen;
	private JButton land;
	private JButton möglichefragen;
	
	
	public static void main(String[] args) {
		
		ABC frame = new ABC ("Erste Hilfe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,800);
		frame.getContentPane().setBackground(Color.PINK);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public ABC(String title){
		super(title);
		
		frage = new JLabel("Notruf gewählt?");
		frage.setBounds(110,200,200,100)
		;
		frage.setFont(new Font("Arial", Font.BOLD, 20));
		add(frage);
		
		antwort1 = new JButton ("Ja");
		antwort1.setBounds(80,300,100,100);
		antwort1.setBackground(Color.GREEN);
		antwort1.addActionListener(this);
		add(antwort1);
		
		antwort2 = new JButton ("Nein");
		antwort2.setBounds(180,300,100,100);
		antwort2.setBackground(Color.RED);
		antwort2.addActionListener(this);
		add(antwort2);
		
		leiste1 = new JButton ("Menü");
		leiste1.setBounds(0,670,130,80);
		leiste1.setBackground(Color.lightGray);
		leiste1.setForeground(Color.RED);
		leiste1.addActionListener(this);
		add(leiste1);
		
		leiste2 = new JButton ("Nächstes Krankenhaus");
		leiste2.setBounds(130,670,130,80);
		leiste2.setBackground(Color.lightGray);
		leiste2.setForeground(Color.RED);
		leiste2.addActionListener(this);
		add(leiste2);
		
		leiste3 = new JButton ("Notruf");
		leiste3.setBounds(260,670,130,80);
		leiste3.setBackground(Color.lightGray);
		leiste3.setForeground(Color.RED);
		leiste3.addActionListener(this);
		add(leiste3);
	}
 
 
 
 
		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == antwort1) {
				fenster();
				
				antwort1.setVisible(false);
				antwort2.setVisible(false);
				frage.setVisible(false); {
				
				verkehrsunfall = new JButton("Verkehrsunfall");
				verkehrsunfall.setBounds(100,100,200,100);
				verkehrsunfall.setBackground(Color.lightGray);
				verkehrsunfall.setForeground(Color.blue);
				verkehrsunfall.addActionListener(this);
				add(verkehrsunfall);
				
				verletzt = new JButton("Verletzte Person");
				verletzt.setBounds(100,250,200,100);
				verletzt.setBackground(Color.lightGray);
				verletzt.setForeground(Color.green);
				verletzt.addActionListener(this);
				add(verletzt);
				
				absetzen.setVisible(false);
				land.setVisible(false);
				möglichefragen.setVisible(false);
				}
 
			}
			
			
				else if (e.getSource() == antwort2)
				fenster();
				
				antwort1.setVisible(false);
				antwort2.setVisible(false);
				frage.setVisible(false);
				
				absetzen = new JButton("Notruf absetzen");
				absetzen.setBounds(100,50,200,100);
				absetzen.setBackground(Color.lightGray);
				absetzen.setForeground(Color.red);
				absetzen.addActionListener(this);
				add(absetzen);
				
				land = new JButton("Anderes Land?");
				land.setBounds(140,200,120,100);
				land.setBackground(Color.CYAN);
				land.addActionListener(this);
				add(land);
				
				möglichefragen = new JButton("Wo geschah es? "
						+ "Was geschah?"
						+ "Wie viele Personen sind betroffen?"
						+ "Welche Art von Erkrankung/Verletzung liegt vor?"
						+ "Warten auf Rückfragen");
				möglichefragen.setBounds(50,300,200,100);
				möglichefragen.addActionListener(this);
				add(möglichefragen);
				
				
				
				
				
				
			}
		
		private void fenster() {
		
			
		
			
		
		}	
		
		}
	
		
 
			
 
 
