package com.company;

/*


            link de referência

            https://www.devmedia.com.br/gerando-pdf-itext/18843


 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ReadPDFTable {

    public static final String RESULT = "C:/Users/alann/Documents/produtividade-juizes-mai-18.pdf";

    public static void main(String[] args) throws DocumentException, IOException {

        PdfReader pdfReader = new PdfReader(RESULT);


        for (int i = 1; i < 1000; i++) {

            //pegando pdf
            String text = PdfTextExtractor.getTextFromPage(pdfReader, i);

            /*List<String> lineOne = Collections.singletonList(text.replace("NomeRealizadasOutrasTerminativasJúriSentenças", ""));
            List<String> lineTwo = Collections.singletonList(lineOne.toString().replace("PODER JUDICIÁRIO DO ESTADO DO RIO DE JANEIRO", ""));
            List<String> lineThree = Collections.singletonList(lineTwo.toString().replace("Produtividade", ""));
            List<String> lineFor = Collections.singletonList(lineThree.toString().replace("de", ""));
            List<String> lineFive = Collections.singletonList(lineFor.toString().replace("Juízes -\t", ""));
            List<String> lineSix = Collections.singletonList(lineFive.toString().replace("Maio", ""));
            List<String> lineSeven = Collections.singletonList(lineSix.toString().replace("Nome", ""));
            List<String> lineEigth = Collections.singletonList(lineSeven.toString().replace("Audiências", ""));
            List<String> lineNine = Collections.singletonList(lineEigth.toString().replace("DGJUR - DEIGE", ""));
            /*String deleteCaracterEspecialText = CaracterEspecial.deleteCaracter(text).replaceAll("\\s+", " ");
            List<String> deleteWords = ChamaLista.removePalavras(Collections.singletonList(Arrays.asList(deleteCaracterEspecialText.split("\n")).toString().replaceAll("", "")));
            String conteudo = deleteWords.toString();
            System.out.println(conteudo);
        }*/
            /*String deleteCaracterEspecialText = CaracterEspecial.deleteCaracter(lineNine.toString());
            String conteudo = deleteCaracterEspecialText;*/
            //System.out.println(lineNine);
        }

    /*private static String removePalavrasInuteis(String texto) {

        String textoLimpo = null;

        for (String deleteWords : Remove.Words) {

            if (texto.contains(deleteWords)) {
                textoLimpo = texto.replaceAll(deleteWords, "");
            }
        }
        return textoLimpo;
    }*/
    }
}
