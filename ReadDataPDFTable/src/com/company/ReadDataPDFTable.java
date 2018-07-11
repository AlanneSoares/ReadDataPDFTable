package com.company;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;


public class ReadDataPDFTable {

    public static void getText() {

        PDFParser parser;
        PDDocument pdDoc;
        COSDocument cosDoc;
        PDFTextStripper pdfStripper;

        String text = null;
        String fileName = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        File file = new File(fileName);


        try {

            /*

            Uma forma melhor de extrair texto


                PdfReader arquivo = new PdfReader("Arquivo.pdf");

                for (int i = 1; i < 1000; i++ {

	            String texto = PdfTextExtractor.getTextFromPage(arquivo, i++);

             */

            parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdfStripper.setLineSeparator("\n");
            pdDoc = new PDDocument(cosDoc);
            text = pdfStripper.getText(pdDoc);

            String[] linhas = text.split("\\r?\\n");

            for (int i = 0; i < linhas.length; i++) {

                if (Character.isDigit(linhas[i].charAt(linhas[i].length() - 1))) {

                    String removeCaracterEspecial = CaracterEspecial.deleteCaracter(linhas[i]).replaceAll("[0-9]", "");
                    String removeNumbers = Remove.numbers(removeCaracterEspecial);
                    String removePalavras = Words.removeWords(removeNumbers).replace("  ", "");
                    String removeMes = Mes.deletePalavra(removePalavras.trim());

                    if (!removeMes.isEmpty()) {

                        System.out.println(String.format("%d: %s", i + 1, removeMes));
                    }


                }

            }
                pdDoc.close();


        } catch (Exception e) {

            System.out.println("Tente novamente!");
        }

    }
}
