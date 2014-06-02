package hr.tvz.programiranje.java.vizitke.glavni;

import javax.swing.JFrame;

import hr.tvz.programiranje.java.vizitke.layout.Pocetna;

public class Glavna {

	private static int brojac=1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pocetna ekran1=new Pocetna(brojac);
		ekran1.pokreni();
		ekran1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}
