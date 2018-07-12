package com.company;

import java.io.*;
import org.apache.pdfbox.cos.*;
import org.apache.pdfbox.pdfparser.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.util.*;

public class ReadDataPDFTable {

    public static void getText() {

        PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;
        String text;
        String fileName;
        String[] linhas;
        File file;

        //String fileName = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
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

            for (int j = 0; j < linhas.length; j++) {

                if (Character.isDigit(linhas[j].charAt(linhas[j].length() - 1))) {

                    String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas[j]))));

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