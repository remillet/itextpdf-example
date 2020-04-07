import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.*;

class HelloWorldPDF {
	public static final String DEST = System.getProperty("user.dir") + "/target/hello.pdf";

	public static void main(String args[]) {
		PdfDocument pdf = null;
		try {
			pdf = new PdfDocument(new PdfWriter(DEST));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document document = new Document(pdf);
		String line = "Hello! Welcome to iTextPdf";
		document.add(new Paragraph(line));
		document.close();

		System.out.println("Awesome PDF just got created.");
	}
}
