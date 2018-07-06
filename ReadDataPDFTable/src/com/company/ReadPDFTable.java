package com.company;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import java.io.File;
import java.io.FileInputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ReadPDFTable {

    public static String getText() {

        // ler o pdf primeiro e depois alterá-lo

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

            System.out.println(textoPdf);

        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Tente novamente!");
        }

        return null;
    }

    public static void main(String[] args) {

        // criação do documento
        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream("C://Users//alanne.soares//Documents//arquivoTabelaAlterada.pdf"));
            document.open();

            // adicionando um parágrafo no documento
            document.add(new Paragraph());

            //List<String> map = ChamaLista.removePalavrasInuteis(Arrays.asList(CaracterEspecial.deleteCaracter(textoPdf).split(" ")));
            //System.out.println(map + CaracterEspecial.deleteCaracter(textoPdf));

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (DocumentException e) {

            e.printStackTrace();

        }
    }
}