package com.company;

// Ler pdf com iText

import java.io.*;
import java.sql.*;
import java.util.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.*;

public class ReadDataPDFTable {

    public static void getText() throws IOException {

        String file;
        String pages;
        String driver;
        String url;
        String username;
        String password;

        List<String> linhas;

        int i;
        //int j;

        file = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        //file = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";

        PdfReader reader = new PdfReader(file);

        try {

            /*for (i = 1; i < 1000; i++) {

                pages = PdfTextExtractor.getTextFromPage(reader, i);
                linhas = Arrays.asList(pages);//.split("\n"));

                //for (j = 0; j < linhas.get(j).length(); j++) {

                    //String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas.get(i)))));
                    String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas.toString().trim()))));
*/
            String atualizaMagistrado = "{ CALL tjrj.tjrj_pa_portal.pr_atualiza_magistrado(?) }";
            driver = "oracle.jdbc.driver.OracleDriver";
            url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(ADDRESS = (PROTOCOL=TCP)(HOST=exa-scan.pgj.rj.gov.br)(PORT=1521))(CONNECT_DATA = (SERVICE_NAME=CORR)))";
            username = "TJRJ_WEBSERVICE_CON";
            password = "TJRJ_WEBSERVICE_CON";

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = connection.prepareStatement(atualizaMagistrado);
            //ResultSet rs = atualizaMagistrado.executeQuery();

            System.out.println("Conectado!");

                    /*if (!conteudo.isEmpty()) {
                        if (conteudo.equals("\n")){

                            System.out.println(conteudo.replace("\n", ""));

                        }

                    }*/


        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}