package hr.tvz.programiranje.java.vizitke.layout;




import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;

import javax.swing.JTextField;


public class EkranZaUnos extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JFrame okvir;
	private JLabel labelIme;
	private JLabel labelPrezime;
	private JLabel labelMob; 
	private JLabel labelTel;
	private JLabel labelFax;
	private JLabel labelWeb;
	private JLabel labelNazivTvrtke;
	private JLabel labelUlica;
	private JLabel labelPostanskiBroj;
	private JLabel labelGrad;
	private JLabel labelDrzava;
	private JLabel labelEmail;
	private JLabel labelSlova;
	private JLabel labelBojaPozadine;
	private JLabel labelBojaSlova;
	private JLabel labelPrazno;
	private JLabel labelBrojPosjetnica;
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;
	private JTextField textFieldMob;
	private JTextField textFieldTel;
	private JTextField textFieldFax;
	private JTextField textFieldWeb;
	private JTextField textFieldNazivTvrtke;
	private JTextField textFieldUlica;
	private JTextField textFieldPostanskiBroj;
	private JTextField textFieldGrad;
	private JTextField textFieldDrzava;
	private JTextField textFieldEmail;
	private JComboBox meniImePrezime;
	private JComboBox meniMob;
	private JComboBox meniTel;
	private JComboBox meniFax;
	private JComboBox meniWeb;
	private JComboBox meniNazivTvrtke;
	private JComboBox meniUlica;
	private JComboBox meniPostanskiBrojGrad;
	private JComboBox meniDrzava;
	private JComboBox meniEmail;
	private JComboBox meniBrojPosjetnica;
	private JColorChooser bojaSlova;
	private JColorChooser bojaPozadine;
	private JButton buttonPrikazi;
	private JButton buttonKreiraj;
	private JButton buttonVratiSe;
	private boolean brojPosjetnice;
	private JFrame pocetniOkvir;
	private int brojac;
	
	public EkranZaUnos(final boolean brPosjetnice,final JFrame pocetniOkv,final int bro){
		
		brojPosjetnice=brPosjetnice;
		pocetniOkvir=pocetniOkv;
		brojac=bro;
	}
	
	public void napraviEkran(){
		okvir = new JFrame("Unos podataka");
		okvir.getContentPane().setLayout(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
	
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		// LABELI---------------------------------
		
		labelIme =new JLabel("ime: ");  
		constraints.gridx = 0; constraints.gridy = 2;
		okvir.getContentPane().add(labelIme, constraints);
		
		labelPrezime =new JLabel("prezime:   ");
		constraints.gridx = 0; constraints.gridy = 4;
		okvir.getContentPane().add(labelPrezime, constraints);
		
		labelMob =new JLabel("broj mobitela: ");
		constraints.gridx = 0; constraints.gridy = 6;
		okvir.getContentPane().add(labelMob, constraints);
		
		labelTel =new JLabel("tel: ");
		constraints.gridx = 0; constraints.gridy = 8;
		okvir.getContentPane().add(labelTel, constraints);
		
		labelFax =new JLabel("fax: ");
		constraints.gridx = 0; constraints.gridy = 10;
		okvir.getContentPane().add(labelFax, constraints);
		
		labelWeb =new JLabel("web: ");
		constraints.gridx = 0; constraints.gridy = 12;
		okvir.getContentPane().add(labelWeb, constraints);
		
		labelNazivTvrtke =new JLabel("  naziv tvrtke: ");
		constraints.gridx = 4; constraints.gridy = 2;
		okvir.getContentPane().add(labelNazivTvrtke, constraints);
		
		labelUlica =new JLabel("  ulica: ");
		constraints.gridx = 4; constraints.gridy = 4;
		okvir.getContentPane().add(labelUlica, constraints);
		
		labelPostanskiBroj =new JLabel("  poštanski broj: ");
		constraints.gridx = 4; constraints.gridy = 6;
		okvir.getContentPane().add(labelPostanskiBroj, constraints);
		
		labelGrad =new JLabel("  grad: ");
		constraints.gridx = 4; constraints.gridy = 8;
		okvir.getContentPane().add(labelGrad, constraints);
		
		labelDrzava =new JLabel("  država: ");
		constraints.gridx = 4; constraints.gridy = 10;
		okvir.getContentPane().add(labelDrzava, constraints);
		
		labelEmail =new JLabel("  e-mail adresa: ");
		constraints.gridx = 4; constraints.gridy = 12;
		okvir.getContentPane().add(labelEmail, constraints);
		
		labelSlova = new JLabel(" Velièina slova");
		constraints.gridx = 2; constraints.gridy = 0;
		okvir.getContentPane().add(labelSlova, constraints);
		
		labelSlova = new JLabel(" Velièina slova");
		constraints.gridx = 6; constraints.gridy = 0;
		okvir.getContentPane().add(labelSlova, constraints);
		
		labelBojaSlova =new JLabel("Izaberite boju slova :");
		constraints.gridx = 0; constraints.gridy = 18;constraints.gridheight =1;constraints.gridwidth =1;
		okvir.getContentPane().add(labelBojaSlova, constraints);
		
		labelBojaPozadine =new JLabel("  Izaberite boju pozadine :");
		constraints.gridx = 4; constraints.gridy = 18;
		okvir.getContentPane().add(labelBojaPozadine, constraints);
		
		labelPrazno = new JLabel(" ");
		constraints.gridx = 3; constraints.gridy = 0;
		okvir.getContentPane().add(labelPrazno, constraints);
		
		labelBrojPosjetnica = new JLabel("Broj posjetnica za printanje: ");
		constraints.gridx = 0; constraints.gridy = 22;
		okvir.getContentPane().add(labelBrojPosjetnica, constraints);
		
		// SEPARATORI-------------------------------------
		
		JSeparator sep1 = new JSeparator(JSeparator.HORIZONTAL);
		constraints.gridx = 0; constraints.gridy = 1;constraints.gridwidth =8;
		sep1.setPreferredSize(new Dimension(215,1));
		okvir.getContentPane().add(sep1, constraints);
		
		JSeparator sep2 = new JSeparator(JSeparator.HORIZONTAL);
		constraints.gridx = 0; constraints.gridy = 15;constraints.gridwidth =8;
		sep2.setPreferredSize(new Dimension(65,1));
		okvir.getContentPane().add(sep2, constraints);
		
		JSeparator sep3 = new JSeparator(JSeparator.VERTICAL);
		constraints.gridx = 4; constraints.gridy = 1;constraints.gridheight =15;
		sep3.setPreferredSize(new Dimension(1,220));
		okvir.getContentPane().add(sep3, constraints);
		
		//TEXT FIELDOVI-----------------------------------
		
		textFieldIme = new JTextField();
		constraints.gridx = 1; constraints.gridy = 2;constraints.ipadx=150;constraints.gridheight =1;constraints.gridwidth =1;
		okvir.getContentPane().add(textFieldIme, constraints);
		
		textFieldPrezime = new JTextField();
		constraints.gridx = 1; constraints.gridy = 4;
		okvir.getContentPane().add(textFieldPrezime, constraints);
		
		textFieldMob = new JTextField();
		constraints.gridx = 1; constraints.gridy = 6;
		okvir.getContentPane().add(textFieldMob, constraints);
		
		textFieldTel = new JTextField();
		constraints.gridx = 1; constraints.gridy = 8;
		okvir.getContentPane().add(textFieldTel, constraints);
		
		textFieldFax = new JTextField();
		constraints.gridx = 1; constraints.gridy = 10;
		okvir.getContentPane().add(textFieldFax, constraints);
		
		textFieldWeb = new JTextField();
		constraints.gridx = 1; constraints.gridy = 12;
		okvir.getContentPane().add(textFieldWeb, constraints);
		
		textFieldNazivTvrtke = new JTextField();
		constraints.gridx = 5; constraints.gridy = 2;
		okvir.getContentPane().add(textFieldNazivTvrtke, constraints);
		
		textFieldUlica = new JTextField();
		constraints.gridx = 5; constraints.gridy = 4;
		okvir.getContentPane().add(textFieldUlica, constraints);
		
		textFieldPostanskiBroj = new JTextField();
		constraints.gridx = 5; constraints.gridy = 6;
		okvir.getContentPane().add(textFieldPostanskiBroj, constraints);
		
		textFieldGrad = new JTextField();
		constraints.gridx = 5; constraints.gridy = 8;
		okvir.getContentPane().add(textFieldGrad, constraints);
		
		textFieldDrzava = new JTextField();
		constraints.gridx = 5; constraints.gridy = 10;
		okvir.getContentPane().add(textFieldDrzava, constraints);
		
		textFieldEmail = new JTextField();
		constraints.gridx = 5; constraints.gridy = 12;
		okvir.getContentPane().add(textFieldEmail, constraints);
		
		// COMBO BOX----------------------------------------
		
		meniImePrezime = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 10;i<27;i=i+2)
			{
				meniImePrezime.addItem(i);
			}
		}
		else
		{
			for(int i = 8;i<17;i++)
			{
				meniImePrezime.addItem(i);
			}
		}
		constraints.gridx = 2; constraints.gridy = 2;constraints.ipadx=20;
		okvir.getContentPane().add(meniImePrezime, constraints);
		
		meniMob = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniMob.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<8;i++)
			{
				meniMob.addItem(i);
			}
		}
		constraints.gridx = 2; constraints.gridy = 6;
		okvir.getContentPane().add(meniMob, constraints);
		
		meniTel = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniTel.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<8;i++)
			{
				meniTel.addItem(i);
			}
		}
		constraints.gridx = 2; constraints.gridy = 8;
		okvir.getContentPane().add(meniTel, constraints);
		
		meniFax = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniFax.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<8;i++)
			{
				meniFax.addItem(i);
			}
		}
		constraints.gridx = 2; constraints.gridy = 10;
		okvir.getContentPane().add(meniFax, constraints);
		
		meniWeb = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniWeb.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<8;i++)
			{
				meniWeb.addItem(i);
			}
		}
		constraints.gridx = 2; constraints.gridy = 12;
		okvir.getContentPane().add(meniWeb, constraints);
		
		meniNazivTvrtke = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 10;i<27;i=i+2)
			{
				meniNazivTvrtke.addItem(i);
			}
		}
		else
		{
			for(int i = 8;i<17;i++)
			{
				meniNazivTvrtke.addItem(i);
			}
		}
		constraints.gridx = 6; constraints.gridy = 2;
		okvir.getContentPane().add(meniNazivTvrtke, constraints);
		
		meniUlica = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniUlica.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<10;i++)
			{
				meniUlica.addItem(i);
			}
		}
		constraints.gridx = 6; constraints.gridy = 4;
		okvir.getContentPane().add(meniUlica, constraints);
		
		meniPostanskiBrojGrad = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniPostanskiBrojGrad.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<10;i++)
			{
				meniPostanskiBrojGrad.addItem(i);
			}
		}
		constraints.gridx = 6; constraints.gridy = 6;
		okvir.getContentPane().add(meniPostanskiBrojGrad, constraints);
		
		meniDrzava = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniDrzava.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<10;i++)
			{
				meniDrzava.addItem(i);
			}
		}
		constraints.gridx = 6; constraints.gridy = 10;
		okvir.getContentPane().add(meniDrzava, constraints);
		
		meniEmail = new JComboBox();
		if(brojPosjetnice)
		{
			for(int i = 6;i<12;i++)
			{
				meniEmail.addItem(i);
			}
		}
		else
		{
			for(int i = 6;i<8;i++)
			{
				meniEmail.addItem(i);
			}
		}
		constraints.gridx = 6; constraints.gridy = 12;
		okvir.getContentPane().add(meniEmail, constraints);
		
		meniBrojPosjetnica = new JComboBox();
		meniBrojPosjetnica.addItem(10);
		meniBrojPosjetnica.addItem(20);
		meniBrojPosjetnica.addItem(50);
		meniBrojPosjetnica.addItem(100);
		constraints.gridx = 1; constraints.gridy = 22;
		okvir.getContentPane().add(meniBrojPosjetnica, constraints);
		
		// BUTTONI------------------------------------------
		
		buttonPrikazi = new JButton("Prikaži");
		constraints.gridx = 0; constraints.gridy = 24;constraints.ipadx=0;
		okvir.getContentPane().add(buttonPrikazi, constraints);
		
		buttonKreiraj = new JButton("Napravi PDF");
		constraints.gridx = 0; constraints.gridy = 26;constraints.ipady=0;
		okvir.getContentPane().add(buttonKreiraj, constraints);
		
		buttonVratiSe = new JButton("Poèetna");
		constraints.gridx = 4; constraints.gridy = 26;constraints.ipady=0;
		okvir.getContentPane().add(buttonVratiSe, constraints);
		
		// BOJE----------------------------------------------
		
		bojaSlova = new JColorChooser(Color.BLACK);
		constraints.gridx = 0; constraints.gridy = 20;constraints.gridwidth =4;
		okvir.getContentPane().add(bojaSlova, constraints);
		
		bojaPozadine = new JColorChooser();
		constraints.gridx = 4; constraints.gridy = 20;constraints.gridwidth =4;
		okvir.getContentPane().add(bojaPozadine, constraints);
		

		for(int y=1,x=1;y<29;y=y+2)
		{
			constraints.gridx = x; constraints.gridy = y;
			okvir.getContentPane().add(Box.createVerticalStrut(10),constraints);
		}
		
		okvir.setPreferredSize(new Dimension(1100,775));
		okvir.pack();
		okvir.setVisible(true);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PdfHandler handlerPdf = new PdfHandler(textFieldIme,textFieldPrezime,textFieldMob,textFieldTel,
				textFieldFax,textFieldWeb,textFieldNazivTvrtke,textFieldUlica,textFieldPostanskiBroj,textFieldGrad,
				textFieldDrzava,textFieldEmail,meniImePrezime,meniMob,meniTel,meniFax,meniWeb,meniNazivTvrtke,meniUlica,
				meniPostanskiBrojGrad,meniDrzava,meniEmail,meniBrojPosjetnica,bojaSlova,bojaPozadine,buttonKreiraj,okvir,brojPosjetnice);
		buttonKreiraj.addActionListener(handlerPdf);
		ButtonPrikaziHandler handlerPrikaz = new ButtonPrikaziHandler(textFieldIme,textFieldPrezime,textFieldMob,textFieldTel,
				textFieldFax,textFieldWeb,textFieldNazivTvrtke,textFieldUlica,textFieldPostanskiBroj,textFieldGrad,
				textFieldDrzava,textFieldEmail,meniImePrezime,meniMob,meniTel,meniFax,meniWeb,meniNazivTvrtke,meniUlica,
				meniPostanskiBrojGrad,meniDrzava,meniEmail,bojaSlova,bojaPozadine,buttonPrikazi,okvir,brojPosjetnice,brojac);
		buttonPrikazi.addActionListener(handlerPrikaz);
		ButtonVratiSeHandler handlerVratiSe = new ButtonVratiSeHandler(okvir,pocetniOkvir,buttonVratiSe,brojac);
		buttonVratiSe.addActionListener(handlerVratiSe);
		
	}
}
	
	

