/**
 * 
 */
package com.example.pdf;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;

/**
 * @author UyyalaSK
 *
 */
public class PDFBoxWriteFields {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String filename = "src/main/resources/Review.pdf";

		try (PDDocument doc = PDDocument.load(new File(filename))) {
			PDAcroForm form = doc.getDocumentCatalog().getAcroForm();
			if (form != null) {
				form.getField("companyaddress1").setValue("ADP1PB");
				form.getField("companyaddress2").setValue("ADP2PB");
				form.getField("companycity").setValue("HYDPB");
				form.getField("companystate").setValue("TG");
				form.getField("companyzip").setValue("500045");
				form.getField("EIN").setValue("ASADFWEFRPB");
				form.getField("companyname").setValue("ADPPB");
				form.getField("contacttelephone").setValue("124343556PB");
				form.getField("soleprop").setValue("Yes");
				form.getField("ccorp").setValue("Yes");
				form.getField("taxexempt").setValue("Yes");
				form.getField("LLC").setValue("Yes");
			}
			doc.save("results/reviewFilledPB.pdf");
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
