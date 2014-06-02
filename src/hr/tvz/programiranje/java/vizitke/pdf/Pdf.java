package hr.tvz.programiranje.java.vizitke.pdf;

import java.awt.Color;
import java.io.FileOutputStream;

import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class Pdf {

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
	private JColorChooser bojaPozadine;
	private JColorChooser bojaSlova;
	
public Pdf( final JTextField txtFieldIme, final JTextField txtFieldPrezime,final JTextField txtFieldMob,
		final JTextField txtFieldTel,final JTextField txtFieldFax,final JTextField txtFieldWeb,
		final JTextField txtFieldNazivTvrtke,final JTextField txtFieldUlica,final JTextField txtFieldPostanskiBroj,
		final JTextField txtFieldGrad,final JTextField txtFieldDrzava,final JTextField txtFieldEmail,
		final JComboBox comboBoxImePrezime, final JComboBox comboBoxMob,final JComboBox comboBoxTel,
		final JComboBox comboBoxFax,final JComboBox comboBoxWeb,final JComboBox comboBoxNazivTvrtke,
		final JComboBox comboBoxUlica,final JComboBox comboBoxPostanskiBrojGrad,final JComboBox comboBoxDrzava,
		final JComboBox comboBoxEmail,final JComboBox comboBoxBrojPosjetnica,final JColorChooser colorSlova,
		final JColorChooser colorPozadine){
		
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
	
		
	}
	



	//PRVA POSJETNICA -----------------------------------------------------------------


	public void prvaPosjetnica(){
		
		try {
			Rectangle pagesize = new Rectangle(PageSize.A4);
			BaseColor bojaPoz = new BaseColor(bojaPozadine.getColor());
			BaseColor bojaSlov = new BaseColor(bojaSlova.getColor());
	        BaseFont baseFont = BaseFont.createFont(BaseFont.HELVETICA,BaseFont.CP1250,BaseFont.EMBEDDED);
	        
			Document document = new Document(pagesize);
	        PdfWriter.getInstance(document, new FileOutputStream("Vizitka.pdf"));
	        document.open();
	      
	        Image image = Image.getInstance("pdf.png") ;
	        
	        PdfPTable table = new PdfPTable(11);
	        PdfPTable table2 = new PdfPTable(2);
			
	        PdfPTable nestedZero = new PdfPTable(1);
			Paragraph paragraphZero = new Paragraph("");
			
			PdfPCell cellZero = new PdfPCell(paragraphZero);
			cellZero.setBorder(0);
			nestedZero.addCell(cellZero);
			
			PdfPTable nested1 = new PdfPTable(1);
			
			//mob
			
			Paragraph mobitel= new Paragraph("  Mob:" + textFieldMob.getText(),
					new Font(baseFont,(Integer) meniMob.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellMobitel =
				new PdfPCell(new Paragraph(mobitel));
			cellMobitel.setNoWrap(true);
			cellMobitel.setFixedHeight(15);
			cellMobitel.setBorder(0);
			nested1.addCell(cellMobitel);
			
			//tel
			Paragraph telefon= new Paragraph("  Tel:"+textFieldTel.getText(),
					new Font(baseFont,(Integer) meniTel.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellTelefon =
				new PdfPCell(new Paragraph(telefon));
			cellTelefon.setNoWrap(true);
			cellTelefon.setFixedHeight(15);
			cellTelefon.setBorder(0);
			nested1.addCell(cellTelefon);
			
			//fax
			Paragraph fax= new Paragraph("  Fax:"+textFieldFax.getText(),
					new Font(baseFont,(Integer) meniFax.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellFax =
				new PdfPCell(new Paragraph(fax));
			cellFax.setNoWrap(true);
			cellFax.setFixedHeight(15);
			cellFax.setBorder(0);
			nested1.addCell(cellFax);
			
			//Web
			Paragraph web= new Paragraph("  "+textFieldWeb.getText(),
					new Font(baseFont,(Integer) meniWeb.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellWeb =
				new PdfPCell(new Paragraph(web));
			cellWeb.setNoWrap(true);
			cellWeb.setFixedHeight(15);
			cellWeb.setBorder(0);
			nested1.addCell(cellWeb);
			
			PdfPTable nested2 = new PdfPTable(1);
			
			//ulica
			Paragraph ulica= new Paragraph(textFieldUlica.getText(),
					new Font(baseFont,(Integer) meniUlica.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellUlica =
				new PdfPCell(new Paragraph(ulica));
			cellUlica.setFixedHeight(15);
			cellUlica.setBorder(0);
			nested2.addCell(cellUlica);
			
			//pbr + grad
			Paragraph pbrGrad= new Paragraph(textFieldPostanskiBroj.getText()+", "+textFieldGrad.getText(),
					new Font(baseFont,(Integer) meniPostanskiBrojGrad.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellPbrGrad =
				new PdfPCell(new Paragraph(pbrGrad));
			cellPbrGrad.setFixedHeight(15);
			cellPbrGrad.setBorder(0);
			nested2.addCell(cellPbrGrad);
			
			//Drzava
			Paragraph drzava= new Paragraph(textFieldDrzava.getText(),
					new Font(baseFont,(Integer) meniDrzava.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellDrzava =
				new PdfPCell(new Paragraph(drzava));
			cellDrzava.setFixedHeight(15);
			cellDrzava.setBorder(0);
			nested2.addCell(cellDrzava);
			
			//Email
			Paragraph email= new Paragraph(textFieldEmail.getText(),
					new Font(baseFont,(Integer) meniEmail.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellEmail =
				new PdfPCell(new Paragraph(email));
			cellEmail.setFixedHeight(15);
			cellEmail.setBorder(0);
			nested2.addCell(cellEmail);
			
			//Tvrtka
			Paragraph paragraphNazivTvrtke= new Paragraph(textFieldNazivTvrtke.getText(),
					new Font(baseFont,(Integer) meniNazivTvrtke.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellNazivTvrtke =
			new PdfPCell(new Paragraph(paragraphNazivTvrtke));
			cellNazivTvrtke.setColspan(11);
			cellNazivTvrtke.setFixedHeight(40);
			cellNazivTvrtke.setHorizontalAlignment(Element.ALIGN_CENTER);
			cellNazivTvrtke.setBorder(0);
			table.addCell(cellNazivTvrtke);
			
			//ime i prezime
			Paragraph paragraphImePrezime= new Paragraph(textFieldIme.getText()+ " " + textFieldPrezime.getText(),
					new Font(baseFont,(Integer) meniImePrezime.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellImePrezime =
				new PdfPCell(new Paragraph(paragraphImePrezime));
				cellImePrezime.setColspan(11);
				cellImePrezime.setFixedHeight(40);
				cellImePrezime.setHorizontalAlignment(Element.ALIGN_CENTER);
				cellImePrezime.setBorder(0);
				cellImePrezime.setBorderWidthBottom(2);
				cellImePrezime.setBorderColor(bojaSlov);
				table.addCell(cellImePrezime);
			
			PdfPCell cell4 =
					new PdfPCell(nested1);
					cell4.setColspan(5);
					cell4.setBorder(0);
					table.addCell(cell4);
			
			PdfPCell cell5 =
						new PdfPCell(nestedZero);
						cell5.setBorder(0);
						table.addCell(cell5);
			
			PdfPCell cell6 =
				new PdfPCell(nested2);
				cell6.setColspan(5);
				cell6.setBorder(0);
				table.addCell(cell6);

				
				
				PdfPCell tabl=new PdfPCell(table);
				
				tabl.setBorderWidth(2);
				
				
				tabl.setBackgroundColor(bojaPoz);
				
			
				if(bojaPoz.getBlue()<40 && bojaPoz.getRed() <40 && bojaPoz.getGreen()<40)
					
				{
					tabl.setBorderColor(new BaseColor(Color.WHITE));
				}
	
			table2.setWidthPercentage(85);
			table2.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));

			
	        PdfPTable tableQR = new PdfPTable(5);
	        PdfPTable tableQR2 = new PdfPTable(2);
			
			PdfPCell cellQR =
				new PdfPCell(image);
				cellQR.setColspan(5);
				cellQR.setFixedHeight(700/5);
				cellQR.setHorizontalAlignment(Element.ALIGN_CENTER);
				cellQR.setPaddingTop(20);
				cellQR.setBorder(0);
				tableQR.addCell(cellQR);
				
	PdfPCell tablQR=new PdfPCell(tableQR);
				
				tablQR.setBorderWidth(2);
				
				
				tablQR.setBackgroundColor(bojaPoz);
				
			
				if(bojaPoz.getBlue()<40 && bojaPoz.getRed() <40 && bojaPoz.getGreen()<40)
					
				{
					tablQR.setBorderColor(new BaseColor(Color.WHITE));
				}
	
			tableQR2.setWidthPercentage(85);
			tableQR2.setHorizontalAlignment(Element.ALIGN_CENTER);
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			tableQR2.addCell(new PdfPCell(tablQR));
			
			
			
			int brojStranica = 0;
			brojStranica = (Integer) meniBrojPosjetnica.getSelectedItem()/10;
			for (int x=0;x<brojStranica;x++)
			{
				document.add(table2);
				document.add(tableQR2);	
			}

	        
			document.close();
			} 
		catch (Exception e1) {
	          System.out.println(e1);
	       }
	
	}
	

	
	
	
	// DRUGA POSJETNICA -----------------------------------------------------------------
	
	
	
public void drugaPosjetnica(){
		
		try {
			Rectangle pagesize = new Rectangle(PageSize.A4);
			BaseColor bojaPoz = new BaseColor(bojaPozadine.getColor());
			BaseColor bojaSlov = new BaseColor(bojaSlova.getColor());
			BaseFont baseFont = BaseFont.createFont(BaseFont.HELVETICA,BaseFont.CP1250,BaseFont.EMBEDDED);
			
			Document document = new Document(pagesize);
	        PdfWriter.getInstance(document, new FileOutputStream("Vizitka.pdf"));
	        document.open();
	      
	        Image image = Image.getInstance("pdf.png") ;
	        
	        PdfPTable table = new PdfPTable(9);
	        PdfPTable table2 = new PdfPTable(2);
			
	        PdfPTable nestedZero = new PdfPTable(1);
			Paragraph paragraphZero = new Paragraph("");
			
			PdfPCell cellZero = new PdfPCell(paragraphZero);
			cellZero.setBorder(0);
			nestedZero.addCell(cellZero);
			
			PdfPTable nested1 = new PdfPTable(1);
			
			
			//Tvrtka
			Paragraph paragraphNazivTvrtke= new Paragraph(textFieldNazivTvrtke.getText(),
					new Font(baseFont,(Integer) meniNazivTvrtke.getSelectedItem(),Font.BOLD,bojaSlov));
			PdfPCell cellNazivTvrtke =
			new PdfPCell(new Paragraph(paragraphNazivTvrtke));
			cellNazivTvrtke.setNoWrap(true);
			cellNazivTvrtke.setFixedHeight(20);
			cellNazivTvrtke.setBorder(0);
			nested1.addCell(cellNazivTvrtke);
			
			
			//ulica
			Paragraph ulica= new Paragraph("  "+textFieldUlica.getText(),
					new Font(baseFont,(Integer) meniUlica.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellUlica =
				new PdfPCell(new Paragraph(ulica));
			cellUlica.setNoWrap(true);
			cellUlica.setFixedHeight(13);
			cellUlica.setBorder(0);
			nested1.addCell(cellUlica);
			
			//pbr + grad
			Paragraph pbrGrad= new Paragraph("  "+textFieldPostanskiBroj.getText()+", "+textFieldGrad.getText(),
					new Font(baseFont,(Integer) meniPostanskiBrojGrad.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellPbrGrad =
				new PdfPCell(new Paragraph(pbrGrad));
			cellPbrGrad.setNoWrap(true);
			cellPbrGrad.setFixedHeight(13);
			cellPbrGrad.setBorder(0);
			nested1.addCell(cellPbrGrad);
			
			//Drzava
			Paragraph drzava= new Paragraph("  "+textFieldDrzava.getText(),
					new Font(baseFont,(Integer) meniDrzava.getSelectedItem(),Font.NORMAL,bojaSlov));
			PdfPCell cellDrzava =
				new PdfPCell(new Paragraph(drzava));
			cellDrzava.setNoWrap(true);
			cellDrzava.setFixedHeight(13);
			cellDrzava.setBorder(0);
			nested1.addCell(cellDrzava);
			
			
			//ime i prezime
			Paragraph paragraphImePrezime= new Paragraph(textFieldIme.getText()+ " " + textFieldPrezime.getText(),
					new Font(baseFont,(Integer) meniImePrezime.getSelectedItem(),Font.BOLD,bojaSlov));
			PdfPCell cellImePrezime =
				new PdfPCell(new Paragraph(paragraphImePrezime));
			    cellImePrezime.setNoWrap(true);
				cellImePrezime.setFixedHeight(20);
				cellImePrezime.setBorder(0);
				nested1.addCell(cellImePrezime);
			
			
			//mob
			Paragraph mobitel= new Paragraph("  Mob:" + textFieldMob.getText(),
					new Font(baseFont,(Integer) meniMob.getSelectedItem(),Font.ITALIC,bojaSlov));
			PdfPCell cellMobitel =
				new PdfPCell(new Paragraph(mobitel));
			cellMobitel.setNoWrap(true);
			cellMobitel.setFixedHeight(11);
			cellMobitel.setBorder(0);
			nested1.addCell(cellMobitel);
			
			//tel
			Paragraph telefon= new Paragraph("  Tel:"+textFieldTel.getText(),
					new Font(baseFont,(Integer) meniTel.getSelectedItem(),Font.ITALIC,bojaSlov));
			PdfPCell cellTelefon =
				new PdfPCell(new Paragraph(telefon));
			cellTelefon.setNoWrap(true);
			cellTelefon.setFixedHeight(11);
			cellTelefon.setBorder(0);
			nested1.addCell(cellTelefon);
			
			//fax
			Paragraph fax= new Paragraph("  Fax:"+textFieldFax.getText(),
					new Font(baseFont,(Integer) meniFax.getSelectedItem(),Font.ITALIC,bojaSlov));
			PdfPCell cellFax =
				new PdfPCell(new Paragraph(fax));
			cellFax.setNoWrap(true);
			cellFax.setFixedHeight(11);
			cellFax.setBorder(0);
			nested1.addCell(cellFax);
			
			
			
			//Web
			Paragraph web= new Paragraph("  "+textFieldWeb.getText(),
					new Font(baseFont,(Integer) meniWeb.getSelectedItem(),Font.ITALIC,bojaSlov));
			PdfPCell cellWeb =
				new PdfPCell(new Paragraph(web));
			cellWeb.setNoWrap(true);
			cellWeb.setFixedHeight(11);
			cellWeb.setBorder(0);
			nested1.addCell(cellWeb);


			//Email
			Paragraph email= new Paragraph("  "+textFieldEmail.getText(),
					new Font(baseFont,(Integer) meniEmail.getSelectedItem(),Font.ITALIC,bojaSlov));
			PdfPCell cellEmail =
				new PdfPCell(new Paragraph(email));
			cellEmail.setNoWrap(true);
			cellEmail.setFixedHeight(11);
			cellEmail.setBorder(0);
			nested1.addCell(cellEmail);
			
			
	
			PdfPCell cell4 =
					new PdfPCell(nested1);
					cell4.setColspan(3);
					cell4.setFixedHeight(700/5);
					cell4.setBorder(0);
					table.addCell(cell4);
			
			
			PdfPCell cellQR =
				new PdfPCell(image);
				cellQR.setColspan(6);
				cellQR.setFixedHeight(700/5);
				cellQR.setHorizontalAlignment(Element.ALIGN_RIGHT);
				cellQR.setPaddingTop(20);
				cellQR.setPaddingRight(10);
				cellQR.setBorder(0);
				table.addCell(cellQR);
			
				
				
				PdfPCell tabl=new PdfPCell(table);
				
				tabl.setBorderWidth(2);
				
				
				tabl.setBackgroundColor(bojaPoz);
				
			
				if(bojaPoz.getBlue()<40 && bojaPoz.getRed() <40 && bojaPoz.getGreen()<40)
					
				{
					tabl.setBorderColor(new BaseColor(Color.WHITE));
				}
	
			table2.setWidthPercentage(85);
			table2.setHorizontalAlignment(Element.ALIGN_CENTER);
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			table2.addCell(new PdfPCell(tabl));
			
			
			
			
			int brojStranica = 0;
			brojStranica = (Integer) meniBrojPosjetnica.getSelectedItem()/10;
			for (int x=0;x<brojStranica;x++)
			{
				document.add(table2);
					
			}

	        
			document.close();
			} 
		catch (Exception e1) {
	          System.out.println(e1);
	       }
	
	}
}
