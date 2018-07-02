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

            List<String> conteudoAlterado = ChamaLista.removePalavrasInuteis(Arrays.asList(textoPdf.split(" ")));

            System.out.println(conteudoAlterado);

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Tente novamente!");

        }

        return null;
    }
}
