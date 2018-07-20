package com.company;

// Ler pdf com iText
// Está retirando das palavras "de", no qual não deveria

import java.io.*;
import java.sql.*;
import java.util.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.*;

public class ReadDataPDFTable {

    public static void getText() throws IOException, SQLException, ClassNotFoundException {

        String file;
        String pages;
        String conteudo;
        String driver;
        String url;
        String username;
        String password;

        int page;


        //file = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        file = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";

        PdfReader reader = new PdfReader(file);

//        String atualizaMagistrado = "{ CALL tjrj.tjrj_pa_portal.pr_atualiza_magistrado(?) }";
//        driver = "oracle.jdbc.driver.OracleDriver";
//        url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(ADDRESS = (PROTOCOL=TCP)(HOST=exa-scan.pgj.rj.gov.br)(PORT=1521))(CONNECT_DATA = (SERVICE_NAME=CORR)))";
//        username = "TJRJ_WEBSERVICE_CON";
//        password = "TJRJ_WEBSERVICE_CON";

//        Connection con = DriverManager.getConnection(url, username, password);
//        PreparedStatement ps = con.prepareStatement(atualizaMagistrado);

//        Class.forName(driver);

        // contando páginas
        for (page = 1; page < 100; page++) {

            //lendo texto de cada página
            pages = PdfTextExtractor.getTextFromPage(reader, page);

                //transformando conteúdo de linha em array
                String[] row = pages.split(",");//, -1);

                for (int i = 0; i < row.length; i++) {

                    if (row[i].contains("\n")){
                        String deleteLineBreak = row[i].replaceAll("\n", " ");
                        String deleteNumbers = Remove.numbers(deleteLineBreak);
                        String deleteWords = Remove.words(deleteNumbers);
                        String deleteSpecialCharacter = Remove.specialCharacteres(deleteWords);
                        conteudo = deleteSpecialCharacter;


                            System.out.println((!row[i].equals(LetraJunta.letraJunta(trimAll(conteudo)))));


                    } else {
                        System.out.println("Erro");
                    }

                //ps.setString(1, conteudo);
                //ps.execute();
            }
        }
    }

    public static String trimAll(String text){

        String string = text.trim();

        while (string.contains("  ")) {

                string = string.replaceAll("  ", "");
                //string = string.replaceAll("\\s+$", "");
                //String texto_filtrado = str.replaceAll("\\s+$", "");

        }
        return string;
    }



}
