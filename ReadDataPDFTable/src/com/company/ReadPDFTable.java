package com.company;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class ReadPDFTable {

    public static String getText() {

        PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;

        String textoPdf;
        String fileName = "C:\\Users\\alann\\Documents\\produtividade-juizes-mai-18.pdf";
        File file = new File(fileName);

        try {

            parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            textoPdf = pdfStripper.getText(pdDoc);

            textoPdf.contains((CharSequence) ChamaLista.removePalavras(Arrays.asList(CaracterEspecial.deleteCaracter(textoPdf).split(" "))));
            //List<String> map = ChamaLista.removePalavras(Arrays.asList(CaracterEspecial.deleteCaracter(textoPdf).split(" ")));

            /*for (int i = 1; i < map.size(); i++) {

                String palavra = map.get(i);
                System.out.println(palavra);
            }*/

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Tente novamente!");

        }

        return null;
    }
}




