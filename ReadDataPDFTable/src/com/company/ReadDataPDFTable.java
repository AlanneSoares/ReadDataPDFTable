package com.company;
/*
erro encontrado:

PdfReader reader = new PdfReader("c:/users/alann/documents/produtividade-juizes-mai-18.pdf");
        String page = PdfTextExtractor.getTextFromPage(reader, 24);
        System.out.println(page);

        deverá mudar a API para iText, pois receberá todos os dados
 */
import java.io.*;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.apache.pdfbox.cos.*;
import org.apache.pdfbox.pdfparser.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.util.*;

public class ReadDataPDFTable {

    public static void getText() throws IOException {

        PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;
        String text;
        String fileName;
        String[] linhas;
        File file;

        //fileName = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        fileName = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";
        file = new File(fileName);

        try {
            parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            text = pdfStripper.getText(pdDoc);
            linhas = text.split("\\r?\\n");


            for (int i = 0; i < linhas.length;i++) {

                if (Character.isDigit(linhas[i].charAt(linhas[i].length() - 1))) {

                    String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas[i]))));

                    if (!conteudo.trim().equals("")) {
                        System.out.println(String.format(conteudo));
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Tente novamente!");
        }
    }
}