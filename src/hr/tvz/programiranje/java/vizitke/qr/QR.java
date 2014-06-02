package hr.tvz.programiranje.java.vizitke.qr;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;


import javax.imageio.ImageIO;
import javax.swing.JTextField;

import com.google.zxing.BarcodeFormat;

import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;


public class QR {
	
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
	
	public QR(final JTextField txtFieldIme, final JTextField txtFieldPrezime,final JTextField txtFieldMob,
			final JTextField txtFieldTel,final JTextField txtFieldFax,final JTextField txtFieldWeb,
			final JTextField txtFieldNazivTvrtke,final JTextField txtFieldUlica,final JTextField txtFieldPostanskiBroj,
			final JTextField txtFieldGrad,final JTextField txtFieldDrzava,final JTextField txtFieldEmail){
		
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
	}

	
	public void generirajQRzaPrikaz() {
		
		
		
		String data = new String (textFieldIme.getText()+ " " + textFieldPrezime.getText()+ "\nMob: " + textFieldMob.getText()
	    		+ "\nTel: " + textFieldTel.getText()+ "\nFax: " + textFieldFax.getText()+ "\n" + textFieldWeb.getText()
	    		+ "\n" + textFieldNazivTvrtke.getText()+ "\n" + textFieldUlica.getText()+ "\n" + textFieldPostanskiBroj.getText()
	    		+ ", " + textFieldGrad.getText()+ ", " + textFieldDrzava.getText()+ "\n" + textFieldEmail.getText());
		
		BitMatrix matrix;
		
		com.google.zxing.Writer writer = new QRCodeWriter();
		try {
		int width=100;
		int height=100;
		matrix = writer.encode(data, BarcodeFormat.QR_CODE, width, height);
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		

		bufferedImage=MatrixToImageWriter.toBufferedImage(matrix);
		
		
		try {
			ImageIO.write(bufferedImage, "PNG", new File("pdf.png"));

			   			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		catch (WriterException e) {
		 //exit the method
		 return;
		}	
	}
	

public void generirajQR(){
			
	Charset charset = Charset.forName("ISO-8859-2");
    CharsetEncoder encoder = charset.newEncoder();
    byte[] b = null;
    try {
       
    	ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(textFieldIme.getText()+ " " + textFieldPrezime.getText()+ "\nMob: " + textFieldMob.getText()
        		+ "\nTel: " + textFieldTel.getText()+ "\nFax: " + textFieldFax.getText()+ "\n" + textFieldWeb.getText()
        		+ "\n" + textFieldNazivTvrtke.getText()+ "\n" + textFieldUlica.getText()+ "\n" + textFieldPostanskiBroj.getText()
        		+ ", " + textFieldGrad.getText()+ ", " + textFieldDrzava.getText()+ "\n" + textFieldEmail.getText()));
        b = bbuf.array();
        for(int a=0;a<b.length;a++)
        {
        	if(b[a]==-56 || b[a]==-58){b[a]=67;}
        	else if(b[a]==-24 || b[a]==-26){b[a]=99;}
        	else if(b[a]==-87){b[a]=83;}
        	else if(b[a]==-71){b[a]=115;}
        	else if(b[a]==-82){b[a]=90;}
        	else if(b[a]==-66){b[a]=122;}
        	else if(b[a]==-48){b[a]=68;}
        	else if(b[a]==-16){b[a]=100;}

        }
        	
    } catch (CharacterCodingException e) {
        System.out.println(e.getMessage());
    }

    String data = null;
    try {
        data = new String(b, "ISO-8859-2");
    } catch (UnsupportedEncodingException e) {
        System.out.println(e.getMessage());
    }

    BitMatrix matrix = null;
    int h = 100;
    int w = 100;
    com.google.zxing.Writer writer = new QRCodeWriter();
    try {
        matrix = writer.encode(data, com.google.zxing.BarcodeFormat.QR_CODE, w, h);
    } catch (com.google.zxing.WriterException e) {
        System.out.println(e.getMessage());
    }

    String filePath = "pdf.png";
    File file = new File(filePath);
    try {
        MatrixToImageWriter.writeToFile(matrix, "PNG", file);
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

	}
}
