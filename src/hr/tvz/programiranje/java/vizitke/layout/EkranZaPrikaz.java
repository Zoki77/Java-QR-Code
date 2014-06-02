package hr.tvz.programiranje.java.vizitke.layout;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EkranZaPrikaz extends JDialog{

	
	private static final long serialVersionUID = 6710358552242337574L;
	private JLabel image;
	private JFrame okvir;
	private int i;
	private int brojac;

	public EkranZaPrikaz(final JFrame okv, final int i,final int bro){
		
		okvir=okv;
		this.i=i;
		brojac=bro;
	}
	
	public void napraviEkran(){
		JDialog dialog = new JDialog(okvir,"Izgled posjetnice");
		dialog.getContentPane().setLayout(new GridBagLayout());
		
		dialog.getContentPane().setBackground(Color.WHITE);
		
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.fill = GridBagConstraints.VERTICAL;
		
		image = new JLabel();
		image.setIcon(new ImageIcon(brojac + "page_"+ i +".png"));

		constraints.gridx = 0; constraints.gridy = 11;constraints.anchor=GridBagConstraints.CENTER;
		constraints.gridheight=2;constraints.gridwidth=3;
		dialog.getContentPane().add(image, constraints);
		
		dialog.setPreferredSize(new Dimension(590, 400));
		dialog.pack();
		dialog.setVisible(true);
		

	}


}
