package com.company;

/*


            link de referência

            https://www.devmedia.com.br/gerando-pdf-itext/18843


 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class ReadPDFTable {

    //public static final String RESULT = "C:/Users/alann/Documents/produtividade-juizes-mai-18.pdf";

    public static void main(String[] args) throws IOException {

        PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;

        String text = null;
        String fileName;
        File file;

        fileName = "C:/Users/alann/Documents/produtividade-juizes-mai-18.pdf";
        file = new File(fileName);

        try {

            parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdfStripper.setLineSeparator("\n");

            pdDoc = new PDDocument(cosDoc);
//            pdfStripper.getText();setStartPage(Integer.parseInt(text));
  //          pdfStripper.setEndPage(Integer.parseInt(text));
            text = pdfStripper.getText(pdDoc);

            String[] linhas = text.split("\\r?\\n");

            for (int i = 0; i < linhas.length; i++) {

                //String palavras = String.valueOf(linhas.equals(ChamaLista.removePalavras(Arrays.asList(text))));
                List<String> palavras = ChamaLista.removePalavras(Arrays.asList(linhas));
                System.out.println(String.format("%d: %s", i + 1, palavras));

            }
                /*if (linhas.equals(ChamaLista.removePalavras(Arrays.asList(text)))) {
                    List<String> map = ChamaLista.removePalavras(Arrays.asList(CaracterEspecial.deleteCaracter(text).split(" ")));


                    for (int j = 0; j < map.size(); j++) {
                        if (map.contains(linhas)) {

                            map.remove(i);
                            //System.out.println(linhas);

                        }
                    }

                }*/


                pdDoc.close();
            /*PdfReader pdfReader = new PdfReader("C:/Users/alann/Documents/produtividade-juizes-mai-18.pdf");

            for (int i = 1; i < pdfReader.hashCode(); i++) {

                //pegando pdf por página
                String text = PdfTextExtractor.getTextFromPage(pdfReader, i);
                System.out.println(text + "\n\n=========== Página: " + i + " =======================" + "\n");
            }*/


        } catch (Exception e) {
            e.printStackTrace();
        }

       // List<String> map = ChamaLista.removePalavras(Arrays.asList(CaracterEspecial.deleteCaracter(text).split(" ")));

        //for (int i = 0; i < map.size(); i++) {

            //int array[] = new int[0];

            //for (int j = 0; j <= array.length; j++) {


                //String palavra = map.get(i);
                //String q = "\r\n";

                //if (palavra.contains(q)) {

                   // map.remove(i);
                    //System.out.println(palavra);

               // }
           // }
        }
    }

