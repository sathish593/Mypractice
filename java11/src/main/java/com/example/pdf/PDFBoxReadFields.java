package com.example.pdf;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class PDFBoxReadFields {

	public static void main(String[] args)  {

		String filename= "src/main/resources/reviewFilled.pdf";
		
		try(PDDocument doc = PDDocument.load(new File(filename))){
			PDAcroForm form = doc.getDocumentCatalog().getAcroForm();
			Iterator<PDField> fields = form.getFieldIterator();
			AtomicInteger index = new AtomicInteger();
			fields.forEachRemaining(pdField->{
				System.out.println(index.addAndGet(1)+" - Field type - \t"+pdField.getFieldType()+"\tField Name - \t"+pdField.getFullyQualifiedName()+"\tValue - \t"+pdField.getValueAsString());
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
