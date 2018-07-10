package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

            parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            text = pdfStripper.getText(pdDoc);

            String conteudo = CaracterEspecial.deleteCaracter(Remove.numbers(text));

            /*List<String> map = Arrays.asList(conteudo.split(" "));

            for (int i = 0; i < map.size(); i++) {

                String palavra = map.get(i).replace("\n", "");

                if (palavra.contains("JANEIRO")) {

                    String p = palavra.replace("JANEIRO", "JANEIRO\n");
                    System.out.println("Índice: " + i + " - Palavra: " + p);
                }

                System.out.println();

            }*/



            /*for (int i = 1; i < conteudo.length(); i++){
                System.out.println(i);
            }*/

            //List<String> list = new ArrayList<String>(Arrays.asList(conteudo));

            //int palavra1 = 1;

            //int [] = new int[0];

            List<String> map = Arrays.asList(conteudo.split(" "));

            for (int i = 0; i < map.size(); i++) {

                String palavra = map.get(i).replace("\n", "");
                
        } catch (Exception e) {

            System.out.println("Tente novamente!");
        }
    }
}

