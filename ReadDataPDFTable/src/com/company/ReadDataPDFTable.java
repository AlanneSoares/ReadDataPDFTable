package com.company;

// Ler pdf com iText
// Está retirando das palavras "de", no qual não deveria

import java.io.*;
import java.sql.*;
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


        file = "c:/users/alanne.soares/documents/produtividade-juizes-mai-18.pdf";
        //file = "c:/users/alann/documents/produtividade-juizes-mai-18.pdf";

        PdfReader reader = new PdfReader(file);

//        String atualizaMagistrado = "{ CALL tjrj.tjrj_pa_portal.pr_atualiza_magistrado(?) }";
//        driver = "oracle.jdbc.driver.OracleDriver";
//        url = "jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(ADDRESS = (PROTOCOL=TCP)(HOST=exa-scan.pgj.rj.gov.br)(PORT=1521))(CONNECT_DATA = (SERVICE_NAME=CORR)))";
//        username = "TJRJ_WEBSERVICE_CON";
//        password = "TJRJ_WEBSERVICE_CON";

//        Connection con = DriverManager.getConnection(url, username, password);
//        PreparedStatement ps = con.prepareStatement(atualizaMagistrado);

//        Class.forName(driver);

        try {
            String pronto = null;
            // contando páginas
            for (page = 1; page < reader.getNumberOfPages(); page++) {
                System.out.println(page + 1);

                pages = PdfTextExtractor.getTextFromPage(reader, page);

                // transformando conteúdo de linha página em array de strings
                String[] row = pages.split("\\r\\n\\t", 1);

                // contando palavras
                for (int i = 0; i < row.length; i++) {

                    String deleteNumbers = Remove.numbers(row[i]);

                    String deleteWords = Remove.words(deleteNumbers);
                    String deleteMonths = Remove.months(deleteWords);
                    String deleteSpecialCharacter = Remove.specialCharacteres(deleteMonths);
                    String deleteSpaces = Remove.deleteSpaces(deleteSpecialCharacter);

                    String deleteSpaceBreak = Remove.deleteSpaceBreak(deleteSpaces);
                    String deleteBreak = Remove.deleteBreak(deleteSpaceBreak);
                    String letters = Remove.deleteLetters(deleteBreak);
                    String content = letters;

                    pronto += content;
                }
            }
            System.out.println(pronto);
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
}
        /*lendo texto de cada página
                pages = PdfTextExtractor.getTextFromPage(reader, page);

                // transformando conteúdo de linha página em array de strings
                String[] row = pages.split("\\r\\n\\t", 1);

                // contando palavras
                for (int i = 0; i < row.length; i++) {

                    String deleteNumbers = Remove.numbers(row[i]);

                    String deleteWords = Remove.words(deleteNumbers);
                    String deleteMonths = Remove.months(deleteWords);
                    String deleteSpecialCharacter = Remove.specialCharacteres(deleteMonths);
                    String deleteSpaces = Remove.deleteSpaces(deleteSpecialCharacter);

                    String deleteSpaceBreak = Remove.deleteSpaceBreak(deleteSpaces);
                    String deleteBreak = Remove.deleteBreak(deleteSpaceBreak);
                    String letters = Remove.deleteLetters(deleteBreak);
                    String content = letters;




                        if (content.contains("-")) {

                            content.replace("-", "\n");
                            System.out.println(content);

                        }
                    }



                        //} else {
                          //  System.out.println("Nada encontrado!");

                        //}

                        //break;
                    //}

                    /*String[] espaco = content.split("-");
                    int array[] = new int[0];

                    for (int e = 0; e < array.length; e++) {

                        if (espaco[e].length() > 0) {

                            System.out.println(content.replace(espaco[e], "\n"));

                        } else {

                            System.out.println("Erro!");

                            //System.out.println(content);*/





                            //ps.setString(1, conteudo);
                            //ps.execute();
