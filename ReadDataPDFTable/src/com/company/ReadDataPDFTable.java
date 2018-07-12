package com.company;
/*
erro encontrado:

PdfReader reader = new PdfReader("c:/users/alann/documents/produtividade-juizes-mai-18.pdf");
        String page = PdfTextExtractor.getTextFromPage(reader, 24);
        System.out.println(page);

        deverá mudar a API para iText, pois receberá todos os dados
 */
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

        //PDFParser parser;
        //PDDocument pdDoc;
        //COSDocument cosDoc;
        //PDFTextStripper pdfStripper;
        String text;
        String fileName;
        String[] linhas = null;
        String conteudo;
        File file;
        String driver;
        String url;
        String username;
        String password;

        fileName = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        //fileName = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";
        file = new File(fileName);

        PdfReader reader = new PdfReader(String.valueOf(file));

        try {

            /*parser = new PDFParser(new FileInputStream(file));
            parser.parse();
            cosDoc = parser.getDocument();
            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);
            text = pdfStripper.getText(pdDoc);
            linhas = text.split("\\r?\\n");*/

            // callablestatement
            String sp = "{ CALL tjrj.tjrj_pa_portal.pr_atualiza_magistrado(?) }";
            driver = "oracle.jdbc.driver.OracleDriver";
            url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(ADDRESS = (PROTOCOL=TCP)(HOST=exa-scan.pgj.rj.gov.br)(PORT=1521))(CONNECT_DATA = (SERVICE_NAME=CORR)))";
            username = "TJRJ_WEBSERVICE_CON";
            password = "TJRJ_WEBSERVICE_CON";

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = connection.prepareStatement(sp);
//            ResultSet rsIds = ps.executeQuery();

            System.out.println("Conectado!");

            //for (int i = 1; i < 1000; i++) {

                //String page = PdfTextExtractor.getTextFromPage(reader, i);
                //conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas[page]))));
                //linhas = page.split("\\r?\\n");




                //System.out.println(page);


            //}

            //for (int j = 0; j < linhas.length; j++) {

                //if (Character.isDigit(linhas[i].charAt(linhas[i].length()) - 1)) {

                    //conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas[j]))));

                    //if (!conteudo.trim().equals("")) {
                        //System.out.println(String.format(conteudo));
                    //}
                //}
            //}

        } catch (Exception e) {

            System.out.println("Tente novamente!");

        }
    }
}