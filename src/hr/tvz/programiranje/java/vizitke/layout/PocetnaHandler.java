package hr.tvz.programiranje.java.vizitke.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PocetnaHandler implements ActionListener{
	

	private JFrame pocetniOkvir;
	private JButton button1;
	private JButton button2;
	private boolean brojPosjetnice;
	private int brojac;
	
	
	public PocetnaHandler(final JFrame okv,final JButton but1,final JButton but2,final int bro) {
		
		pocetniOkvir=okv;
		button1=but1;
		button2=but2;
		brojac=bro;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == button1)
		{
			brojPosjetnice=true;
			pocetniOkvir.setVisible(false);
			EkranZaUnos ekran1=new EkranZaUnos(brojPosjetnice,pocetniOkvir,brojac);
			ekran1.napraviEkran();
			ekran1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
		else if (event.getSource() == button2)
		{
			brojPosjetnice=false;
			pocetniOkvir.setVisible(false);
			EkranZaUnos ekran1=new EkranZaUnos(brojPosjetnice,pocetniOkvir,brojac);
			ekran1.napraviEkran();
			ekran1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	}

}
