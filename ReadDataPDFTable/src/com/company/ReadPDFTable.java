package com.company;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ReadPDFTable {

    public static String getText() {

        PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;

        String textoPdf;
        String fileName = "C://Users//alanne.soares//Documents//produtividade-juizes-mai-18.pdf";
        File file = new File(fileName);

        try {

            parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            textoPdf = pdfStripper.getText(pdDoc);


            //retirar palavras anteriores da tabela

            //System.out.println(Words.removeWords(CaracterEspecial.deleteCaracter(textoPdf)));


            //System.out.println(CaracterEspecial.deleteCaracter(textoPdf));


        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Tente novamente!");

        }

        return null;
    }
}




