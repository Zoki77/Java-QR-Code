package hr.tvz.programiranje.java.vizitke.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonVratiSeHandler implements ActionListener {

	private JFrame okvir;
	private JFrame pocetniOkvir;
	private JButton buttonVratiSe;
	private int brojac;
	
	public ButtonVratiSeHandler(final JFrame okv,final JFrame pocetniOkv,final JButton butVratiSe,final int bro){
		
		okvir=okv;
		pocetniOkvir=pocetniOkv;
		buttonVratiSe=butVratiSe;
		brojac=bro;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == buttonVratiSe)
		{
			pocetniOkvir.dispose();
			okvir.setVisible(false);
			brojac++;
			Pocetna ekran1=new Pocetna(brojac,pocetniOkvir);
			ekran1.pokreni();
			ekran1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	}

}
