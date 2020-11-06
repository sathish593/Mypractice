package com.example.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.parsers.ParserConfigurationException;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfButtonFormField;
import com.itextpdf.forms.fields.PdfChoiceFormField;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.forms.fields.PdfTextFormField;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfArray;
import com.itextpdf.kernel.pdf.PdfCatalog;
import com.itextpdf.kernel.pdf.PdfDictionary;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfName;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfString;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.kernel.pdf.annot.PdfAnnotation;
import com.itextpdf.kernel.pdf.annot.PdfTextAnnotation;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class PDF {

	private static void generatePDFFromHTML() throws ParserConfigurationException, IOException {

		ConverterProperties properties = new ConverterProperties();

		File dest = new File("results/html.pdf");
		properties.setBaseUri(dest.getParent());
		PdfWriter writer = new PdfWriter(dest);
		PdfDocument pdf = new PdfDocument(writer);
		pdf.setTagged();
		HtmlConverter.convertToPdf(new FileInputStream("src/main/resources/html.html"), pdf, properties);

	}

	public static void readFields2() throws IOException {
		PdfReader reader = new PdfReader("src/main/resources/AA.pdf");

		PdfDocument pdfDoc = new PdfDocument(reader);
		PdfCatalog root = pdfDoc.getCatalog();
		PdfDictionary form = root.getPdfObject().getAsDictionary(PdfName.AcroForm);
		PdfArray fields = form.getAsArray(PdfName.Fields);
		PdfPage page;
		java.util.List<PdfAnnotation> annots;
		for (int i = 1; i <= pdfDoc.getNumberOfPages(); i++) {
			page = pdfDoc.getPage(i);
			annots = page.getAnnotations();
			for (int j = 0; j < annots.size(); j++) {
				fields.add(annots.get(j).getPdfObject());
			}
		}
		// pdfDoc.close();

		// PdfDocument pdf = new PdfDocument(reader);
		PdfAcroForm form1 = PdfAcroForm.getAcroForm(pdfDoc, true);
		Map<String, PdfFormField> fields1 = form1.getFormFields();
		AtomicInteger index = new AtomicInteger();
		fields1.forEach((k, v) -> {
			System.out.println(index.addAndGet(1) + " key - " + k + "\tvalue - " + v.getValueAsString());

		});

		pdfDoc.close();
	}

	@SuppressWarnings("unchecked")
	public static void setFilelds() throws FileNotFoundException, IOException {
		// PdfDocument pdf = new PdfDocument(new PdfReader("src/main/resources/review.pdf"), new
		// PdfWriter("src/main/resources/review2.pdf"));
		PdfReader reader = new PdfReader("src/main/resources/review.pdf");
		PdfWriter writer = new PdfWriter("results/reviewFilled.pdf");
		PdfDocument pdf = new PdfDocument(reader,writer);
		PdfAcroForm form = PdfAcroForm.getAcroForm(pdf, true);
		Map<String, PdfFormField> fields = form.getFormFields();
		fields.get("companyaddress1").setValue("ADP1");
		fields.get("companyaddress2").setValue("ADP2");
		fields.get("companycity").setValue("HYD");
		fields.get("companystate").setValue("TG");
		fields.get("companyzip").setValue("500045");
		fields.get("EIN").setValue("ASADFWEFR");
		fields.get("companyname").setValue("ADP");
		fields.get("contacttelephone").setValue("124343556");
		fields.get("soleprop").setValue("Yes");
		fields.get("ccorp").setValue("Yes");
		fields.get("taxexempt").setValue("Yes");
		fields.get("LLC").setValue("Yes");
		
		

		pdf.close();
	}

	@SuppressWarnings("unchecked")
	public static void readFilelds() throws FileNotFoundException, IOException {
		// PdfDocument pdf = new PdfDocument(new PdfReader("src/main/resources/review.pdf"), new
		// PdfWriter("src/main/resources/review2.pdf"));
		PdfReader reader = new PdfReader("src/main/resources/demo.pdf");
		PdfWriter writer = new PdfWriter("results/reviewFilled.pdf");
		PdfDocument pdf = new PdfDocument(reader,writer);
		PdfAcroForm form = PdfAcroForm.getAcroForm(pdf, true);
		Map<String, PdfFormField> fields = form.getFormFields();
		AtomicInteger index = new AtomicInteger();
		fields.forEach((k, v) -> {
			PdfName temp=v.getFormType();
			if(PdfName.Ch.compareTo(temp)==0)
				System.out.println(index.addAndGet(1) + "\t checkbox button form field - " + k + "\tvalue - " + v.getValueAsString());
			else if(PdfName.Tx.compareTo(temp)==0)
				System.out.println(index.addAndGet(1) + "\t text form field - " + k + "\tvalue - " + v.getValueAsString());
			else if(PdfName.Btn.compareTo(temp)==0)
				System.out.println(index.addAndGet(1) + "\t checkbox/button field - " + k + "\tvalue - " + v.getValueAsString());
			else
				System.out.println(index.addAndGet(1) + "\tkey--"+temp.getValue()+" - " + k + "\tvalue - " + v.getValueAsString());

		});

		pdf.close();
		System.out.println("done");
	}

	public static void main(String[] args) {
		try {
			readFilelds();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main2(String[] args) {
		try {
			generatePDFFromHTML();
		} catch (ParserConfigurationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) throws FileNotFoundException {
		final String DEST = "results/demo.pdf";
		PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));

		// Initialize document
		Document doc = new Document(pdf);
		doc.add(new Paragraph("The example of text annotation."));

		// Create text annotation
		PdfAnnotation ann = new PdfTextAnnotation(new Rectangle(20, 800, 0, 0)).setOpen(true).setColor(ColorConstants.GREEN).setTitle(new PdfString("iText"))
		    .setContents("With iText, you can truly take your documentation needs to the next level.");
		pdf.getFirstPage().addAnnotation(ann);

		PdfAcroForm form = PdfAcroForm.getAcroForm(doc.getPdfDocument(), true);

		// text box
		PdfTextFormField nameField = PdfTextFormField.createText(doc.getPdfDocument(), new Rectangle(99, 753, 425, 15), "name", "");
		form.addField(nameField);

		// radio button
		PdfButtonFormField group = PdfFormField.createRadioGroup(doc.getPdfDocument(), "language", "");
		PdfFormField.createRadioButton(doc.getPdfDocument(), new Rectangle(130, 728, 15, 15), group, "English");
		PdfFormField.createRadioButton(doc.getPdfDocument(), new Rectangle(200, 728, 15, 15), group, "French");
		PdfFormField.createRadioButton(doc.getPdfDocument(), new Rectangle(260, 728, 15, 15), group, "German");
		PdfFormField.createRadioButton(doc.getPdfDocument(), new Rectangle(330, 728, 15, 15), group, "Russian");
		PdfFormField.createRadioButton(doc.getPdfDocument(), new Rectangle(400, 728, 15, 15), group, "Spanish");
		form.addField(group);

		// checkboxes

		for (int i = 0; i < 3; i++) {
			PdfButtonFormField checkField = PdfFormField.createCheckBox(doc.getPdfDocument(), new Rectangle(119 + i * 69, 701, 15, 15), "experience".concat(String.valueOf(i + 1)), "Off",
			    PdfFormField.TYPE_CHECK);
			form.addField(checkField);
		}

		// choice fields

		String[] options = { "Any", "6.30 am - 2.30 pm", "1.30 pm - 9.30 pm" };
		PdfChoiceFormField choiceField = PdfFormField.createComboBox(doc.getPdfDocument(), new Rectangle(163, 676, 115, 15), "shift", "Any", options);
		form.addField(choiceField);

		// multiline text
		PdfTextFormField infoField = PdfTextFormField.createMultilineText(doc.getPdfDocument(), new Rectangle(158, 625, 366, 40), "info", "");
		form.addField(infoField);

		// button

		PdfButtonFormField button = PdfFormField.createPushButton(doc.getPdfDocument(), new Rectangle(479, 594, 45, 15), "reset", "RESET");
		button.setAction(PdfAction.createResetForm(new String[] { "name", "language", "experience1", "experience2", "experience3", "shift", "info" }, 0));
		form.addField(button);

		Map<String, PdfFormField> fields = form.getFormFields();
		fields.get("name").setValue("James Bond");
		fields.get("language").setValue("English");
		fields.get("experience1").setValue("Off");
		fields.get("experience2").setValue("Yes");
		fields.get("experience3").setValue("Yes");
		fields.get("shift").setValue("Any");
		fields.get("info").setValue("I was 38 years old when I became an MI6 agent.");

		// Close document
		doc.close();
	}
}
