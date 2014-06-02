package hr.tvz.programiranje.java.vizitke.pdf;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;

public class PdfuSliku {
	
	private int i;
	private int brojac;
	
	public PdfuSliku(final int i,final int bro){
		
		this.i=i;
		brojac=bro;
	}

	public void setup() throws IOException {


	    File file = new File(brojac + "VizitkaZaPrikaz_" + i + ".pdf");
	    RandomAccessFile raf = new RandomAccessFile(file, "r");
	    
	    FileChannel channel = raf.getChannel();
	    ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
	    PDFFile pdffile = new PDFFile(buf);



	     PDFPage page = pdffile.getPage(0);

	     Rectangle rect = new Rectangle(0,0,
	             (int)page.getBBox().getWidth(),
	             (int)page.getBBox().getHeight());


	     Image img = page.getImage(
	             rect.width, rect.height, rect, null, true, true );


	     BufferedImage bImg = toBufferedImage( img );
	     File yourImageFile = new File(brojac + "page_" + i + ".png");
	     ImageIO.write( bImg,"png",yourImageFile);
	    
	}
	

	public static BufferedImage toBufferedImage(Image image) {
	    if (image instanceof BufferedImage) {
	        return (BufferedImage)image;
	    }

	    image = new ImageIcon(image).getImage();

	    BufferedImage bimage = null;
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    try {

	        int transparency = Transparency.OPAQUE;

	        GraphicsDevice gs = ge.getDefaultScreenDevice();
	        GraphicsConfiguration gc = gs.getDefaultConfiguration();
	        bimage = gc.createCompatibleImage(
	            image.getWidth(null), image.getHeight(null), transparency);
	    } catch (HeadlessException e) {
	        
	    }

	    if (bimage == null) {
	        
	        int type = BufferedImage.TYPE_INT_RGB;

	        bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
	    }

	    Graphics g = bimage.createGraphics();

	    g.drawImage(image, 0, 0, null);
	    g.dispose();

	    return bimage;
	}
	
}
