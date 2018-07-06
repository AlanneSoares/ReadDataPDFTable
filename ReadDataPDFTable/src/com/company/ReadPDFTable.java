package com.company;

/*


            link de referência
            https://www.devmedia.com.br/gerando-pdf-itext/18843


 */
/*import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ReadPDFTable {

    //public static String getText() {

        /*PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;*/

        //String textoPdf;
        //String fileName = "C://Users//alanne.soares//Documents//produtividade-juizes-mai-18.pdf";
        //String fileName = "C://Users//alann//Documents//produtividade-juizes-mai-18.pdf";
        //File file = new File(fileName);

        //try {

            /*parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            textoPdf = pdfStripper.getText(pdDoc);*/


            //retirar palavras anteriores da tabela

            //System.out.println(Words.removeWords(CaracterEspecial.deleteCaracter(textoPdf)));


           // System.out.println(CaracterEspecial.deleteCaracter(textoPdf));


        //} catch (Exception e) {
          //  e.printStackTrace();

           // System.out.println("Tente novamente!");

      //  }

       // return null;


    //}
//}


    public static void main(String[] args) {

    }// criação do documento
    Document document = new Document();
          try {

        PdfWriter.getInstance(document, new FileOutputStream("C:\\PDF_DevMedia.pdf"));
        document.open();

        // adicionando um parágrafo no documento
        document.add(new Paragraph("Gerando PDF - Java"));
    }
          catch(DocumentException de) {
        System.err.println(de.getMessage());
    }
          catch(IOException ioe) {
        System.err.println(ioe.getMessage());
    }
          document.close();
}


