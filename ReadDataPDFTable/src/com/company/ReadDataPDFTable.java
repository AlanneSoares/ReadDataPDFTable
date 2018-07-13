package com.company;

// Ler pdf com PDFBox
// Modificado

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        String conteudo;
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

            for (int i = 0; i < linhas.length; i++) {

                //if (Character.isDigit(linhas[i].charAt(linhas[i].length()) - 1)) {

                    conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas[i]))));

                    if (!conteudo.trim().equals("")) {
                        System.out.println(String.format(conteudo));
                    }
                }
            //}

        } catch (Exception e) {

            System.out.println("Tente novamente!");

        }
    }
}