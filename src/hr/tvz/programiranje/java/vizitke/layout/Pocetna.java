package hr.tvz.programiranje.java.vizitke.layout;



import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pocetna extends JFrame {
	
	

	private static final long serialVersionUID = 1L;

	private JFrame pocetniOkvir;
	private JLabel ispis;
	private JLabel ispis2;
	private JLabel slika1;
	private JLabel slika2;
	private JLabel slika3;
	private JButton buttonPrvi;
	private JButton buttonDrugi;
	private int brojac;
	
	public Pocetna (final int bro){
		
		brojac=bro;
	}
	
public Pocetna (final int bro,final JFrame pocetniOkv){
		
		brojac=bro;
		pocetniOkvir=pocetniOkv;
	}
	
	public void pokreni() {
		
		
		pocetniOkvir = new JFrame("Poèetna");
		pocetniOkvir.getContentPane().setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
	
		constraints.fill = GridBagConstraints.HORIZONTAL;
		

		
		
		ispis = new JLabel("Aplikacija za izradu posjetnica s QR kodom");
		Font dzava = new Font(Font.SERIF,Font.BOLD,40);
		ispis.setFont(dzava);
		constraints.gridx = 5; constraints.gridy = 2; constraints.gridwidth = 10;
		pocetniOkvir.getContentPane().add(ispis, constraints);

		
		constraints.gridx = 1; constraints.gridy = 3; constraints.gridwidth = 1;
		pocetniOkvir.getContentPane().add(Box.createVerticalStrut(70),constraints);
		
		ispis2 = new JLabel("Izaberite tip posjetnice:");
		Font dzava2 = new Font(Font.SERIF,Font.PLAIN,25);
		ispis2.setFont(dzava2);
		constraints.gridx = 2; constraints.gridy = 4; constraints.gridwidth = 2;
		pocetniOkvir.getContentPane().add(ispis2, constraints);
		
		
		constraints.gridx = 4; constraints.gridy = 1; constraints.gridwidth = 1;
		pocetniOkvir.getContentPane().add(Box.createHorizontalStrut(15),constraints);
		
		constraints.gridx = 7; constraints.gridy = 1; constraints.gridwidth = 1;
		pocetniOkvir.getContentPane().add(Box.createHorizontalStrut(70),constraints);
		
		
		constraints.gridx = 1; constraints.gridy = 5; constraints.gridwidth = 1;
		pocetniOkvir.getContentPane().add(Box.createVerticalStrut(20),constraints);
		
		slika1 =new JLabel();  
		slika1.setIcon(new ImageIcon("slika 1.PNG"));
		constraints.gridx = 2; constraints.gridy = 6;constraints.gridwidth = 2;
		pocetniOkvir.getContentPane().add(slika1, constraints);
		
		
		slika2 =new JLabel();
		slika2.setIcon(new ImageIcon("slika 2.PNG"));constraints.gridwidth = 2;
		constraints.gridx = 5; constraints.gridy = 6;
		pocetniOkvir.getContentPane().add(slika2, constraints);
		
		
		slika3 =new JLabel();
		slika3.setIcon(new ImageIcon("slika 3.PNG"));constraints.gridwidth = 2;
		constraints.gridx = 8; constraints.gridy = 6;
		pocetniOkvir.getContentPane().add(slika3, constraints);
		
		
		constraints.gridx = 1; constraints.gridy = 7; constraints.gridwidth = 1;
		pocetniOkvir.getContentPane().add(Box.createVerticalStrut(40),constraints);

		
		
		buttonPrvi = new JButton("1");
		constraints.gridx = 2; constraints.gridy = 8;constraints.ipadx=80;constraints.ipady=20;
		pocetniOkvir.getContentPane().add(buttonPrvi, constraints);
		
		
		buttonDrugi = new JButton("2");
		constraints.gridx = 8; constraints.gridy = 8;
		pocetniOkvir.getContentPane().add(buttonDrugi, constraints);
		

			
		
		pocetniOkvir.setPreferredSize(new Dimension(1350,570));
		pocetniOkvir.pack();
		pocetniOkvir.setVisible(true);
		pocetniOkvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		PocetnaHandler handlerPocetna1 = new PocetnaHandler(pocetniOkvir,buttonPrvi,buttonDrugi,brojac);
		buttonPrvi.addActionListener(handlerPocetna1);
		
		PocetnaHandler handlerPocetna2 = new PocetnaHandler(pocetniOkvir,buttonPrvi,buttonDrugi,brojac);
		buttonDrugi.addActionListener(handlerPocetna2);
	
	}

}
