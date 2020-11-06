package com.example.pdf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.color.PDColor;
import org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;
import org.apache.pdfbox.pdmodel.interactive.form.PDTextField;

public class PDFBoxImpl {

	public static void main(String[] args) throws IOException {
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);
		PDPageContentStream contents = new PDPageContentStream(document, page);
		contents.beginText();
		PDFont font = PDType1Font.HELVETICA_BOLD;
		contents.setFont(font, 30);
		contents.newLineAtOffset(50, 700);
		contents.showText("Hello this is a PDF box text");
		contents.endText();
		contents.close();

		PDAcroForm finalForm = new PDAcroForm(document);
		// document.getDocumentCatalog().setAcroForm(finalForm);
		List<PDField> fields = new ArrayList<>();

		PDTextField textBox = new PDTextField(finalForm);
		textBox.setPartialName("SampleField");

		String defaultAppearanceString = "/Helv 12 Tf 0 0 1 rg";
		textBox.setDefaultAppearance(defaultAppearanceString);
		textBox.setValue("Sample field");
		// add the field to the acroform
		fields.add(textBox);

		finalForm.setFields(fields);

		/*
		 * addTextToLayer(document, 0, "MyLayer", 30, 600,
		 * "Text in new layer 'MyLayer'"); addTextToLayer(document, 0, "MyOtherLayer",
		 * 230, 550, "Text in new layer 'MyOtherLayer'"); addTextToLayer(document, 0,
		 * "MyLayer", 30, 500, "Text in existing layer 'MyLayer'");
		 * addTextToLayer(document, 0, "MyOtherLayer", 230, 450,
		 * "Text in existing layer 'MyOtherLayer'");
		 */
		// Specify the widget annotation associated with the field
		PDAnnotationWidget widget = textBox.getWidgets().get(0);
		PDRectangle rect = new PDRectangle(50, 750, 200, 50);
		widget.setRectangle(rect);
		widget.setPage(page);

		// set green border and yellow background
		// if you prefer defaults, just delete this code block
		PDAppearanceCharacteristicsDictionary fieldAppearance = new PDAppearanceCharacteristicsDictionary(
				new COSDictionary());
		fieldAppearance.setBorderColour(new PDColor(new float[] { 0, 1, 0 }, PDDeviceRGB.INSTANCE));
		fieldAppearance.setBackground(new PDColor(new float[] { 1, 1, 0 }, PDDeviceRGB.INSTANCE));
		widget.setAppearanceCharacteristics(fieldAppearance);

		// make sure the widget annotation is visible on screen and paper
		widget.setPrinted(true);

		// Add the widget annotation to the page
		page.getAnnotations().add(widget);

		// set the field value
	//	textBox.setValue("Sample field");

		document.getDocumentCatalog().setAcroForm(finalForm);
		document.save(new File("results/PDFbox.pdf"));
		document.close();
	}
}
