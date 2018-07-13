package com.company;

// Ler pdf com iText

import java.io.*;
import java.util.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.*;

public class ReadDataPDFTable {

    public static void getText() throws IOException {

        String file;
        String pages;

        List<String> linhas;

        int i;
        int j;

        //file = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        file = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";

        PdfReader reader = new PdfReader(file);

        try {

            for (i = 1; i < 1000; i++) {

                pages = PdfTextExtractor.getTextFromPage(reader, i);
                //linhas = Arrays.asList(pages.split("\n"));

                //for (j = 0; j < linhas.get(j).length(); j++) {

                    //String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas.get(i)))));
                    String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(pages))));
                    if (conteudo.equals(1)) {
                        conteudo.substring(1, 0);
                    }
                    if (!conteudo.isEmpty()) {
                        System.out.println(conteudo);
                    }
                }
            //}
        }

        catch (Exception e) {

            System.out.println("Tente novamente!");

        }
    }
}