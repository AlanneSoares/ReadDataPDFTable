package com.company;

// Ler pdf com iText

import java.io.*;
import java.sql.*;
import java.util.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.*;

public class ReadDataPDFTable {

    public static void getText() throws IOException, SQLException, ClassNotFoundException {

        String file;
        String pages;
        String driver;
        String url;
        String username;
        String password;

        List<String> linhas;

        int i;

        file = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        //file = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";

        PdfReader reader = new PdfReader(file);

        String atualizaMagistrado = "{ CALL tjrj.tjrj_pa_portal.pr_atualiza_magistrado(?) }";
        driver = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(ADDRESS = (PROTOCOL=TCP)(HOST=exa-scan.pgj.rj.gov.br)(PORT=1521))(CONNECT_DATA = (SERVICE_NAME=CORR)))";
        username = "TJRJ_WEBSERVICE_CON";
        password = "TJRJ_WEBSERVICE_CON";

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(atualizaMagistrado);
        Class.forName(driver);

        for (i = 1; i < 1000; i++) {

            pages = PdfTextExtractor.getTextFromPage(reader, i);
            linhas = Arrays.asList(pages.replace("\n", ""));

            String conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas.toString().replaceAll("\\s+", " ")))));
            String vazio = "";

            if (conteudo.toString() == vazio) {

                for (int j = 1; j < conteudo.length(); j++) {

                    System.out.println(conteudo);

                }

                ps.setString(1, conteudo);
                ps.execute();

            }
        }
    }
}
