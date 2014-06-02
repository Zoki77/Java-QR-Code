package hr.tvz.programiranje.java.vizitke.layout;



import hr.tvz.programiranje.java.vizitke.pdf.Pdf;
import hr.tvz.programiranje.java.vizitke.qr.QR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PdfHandler implements ActionListener{

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
	private JButton buttonKreiraj;
	private JFrame okvir;
	private boolean brojPosjetnice;
	
	public PdfHandler( final JTextField txtFieldIme, final JTextField txtFieldPrezime,final JTextField txtFieldMob,
			final JTextField txtFieldTel,final JTextField txtFieldFax,final JTextField txtFieldWeb,
			final JTextField txtFieldNazivTvrtke,final JTextField txtFieldUlica,final JTextField txtFieldPostanskiBroj,
			final JTextField txtFieldGrad,final JTextField txtFieldDrzava,final JTextField txtFieldEmail,
			final JComboBox comboBoxImePrezime, final JComboBox comboBoxMob,final JComboBox comboBoxTel,
			final JComboBox comboBoxFax,final JComboBox comboBoxWeb,final JComboBox comboBoxNazivTvrtke,
			final JComboBox comboBoxUlica,final JComboBox comboBoxPostanskiBrojGrad,final JComboBox comboBoxDrzava,
			final JComboBox comboBoxEmail,final JComboBox comboBoxBrojPosjetnica,final JColorChooser colorSlova,final JColorChooser colorPozadine,
			final JButton butKreiraj,final JFrame okv,final boolean brPosjetnice){
		
		textFieldIme=txtFieldIme;
		textFieldPrezime=txtFieldPrezime;
		textFieldMob=txtFieldMob;
		textFieldTel=txtFieldTel;
		textFieldFax=txtFieldFax;
		textFieldWeb=txtFieldWeb;
		textFieldNazivTvrtke=txtFieldNazivTvrtke;
		textFieldUlica=txtFieldUlica;
		textFieldPostanskiBroj=txtFieldPostanskiBroj;
		textFieldGrad=txtFieldGrad;
		textFieldDrzava=txtFieldDrzava;	
		textFieldEmail=txtFieldEmail;
		meniImePrezime=comboBoxImePrezime;
		meniMob=comboBoxMob;
		meniTel=comboBoxTel;
		meniFax=comboBoxFax;
		meniWeb=comboBoxWeb;
		meniNazivTvrtke=comboBoxNazivTvrtke;
		meniUlica=comboBoxUlica;
		meniPostanskiBrojGrad=comboBoxPostanskiBrojGrad;
		meniDrzava=comboBoxDrzava;	
		meniEmail=comboBoxEmail;
		meniBrojPosjetnica=comboBoxBrojPosjetnica;
		bojaSlova=colorSlova;
		bojaPozadine=colorPozadine;
		buttonKreiraj=butKreiraj;
		okvir=okv;
		brojPosjetnice=brPosjetnice;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == buttonKreiraj)
		{
			QR slika = new QR(textFieldIme,textFieldPrezime,textFieldMob,textFieldTel,
					textFieldFax,textFieldWeb,textFieldNazivTvrtke,textFieldUlica,textFieldPostanskiBroj,textFieldGrad,
					textFieldDrzava,textFieldEmail);
			slika.generirajQR();
			
			Pdf document = new Pdf(textFieldIme,textFieldPrezime,textFieldMob,textFieldTel,
					textFieldFax,textFieldWeb,textFieldNazivTvrtke,textFieldUlica,textFieldPostanskiBroj,textFieldGrad,
					textFieldDrzava,textFieldEmail,meniImePrezime,meniMob,meniTel,meniFax,meniWeb,meniNazivTvrtke,meniUlica,
					meniPostanskiBrojGrad,meniDrzava,meniEmail,meniBrojPosjetnica,bojaSlova,bojaPozadine);
			if(brojPosjetnice)
			{
				document.prvaPosjetnica();
			}
			else
			{
				document.drugaPosjetnica();
			}
			
			JOptionPane.showMessageDialog(okvir,"Pdf kreiran");
			
		
		}
		
	}

}

