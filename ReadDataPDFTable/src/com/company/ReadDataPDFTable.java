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

        for (i = 1; i < 100; i++) {

            pages = PdfTextExtractor.getTextFromPage(reader, i);

            conteudo = Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(pages))));

            if (conteudo.contains(" ")) {

                String texto = conteudo.replace("\n", ",");
                //String espacos = texto.;
                System.out.println(trimAll(texto));
            }
        }



            //String removeNumero = Remove.numbers(Remove.specialCharacteres(conteudo));

                //System.out.println(trimAll(conteudo) + "\npágina " + i + "\n");

            }


            //for (i = 0; i < )
            //linhas.add(pages.replaceAll("\n", ""));


            //String conteudo = null;

            //for(i = 0; i < linhas.size(); i++){

            //  System.out.println(conteudo += Remove.words(Remove.months(Remove.numbers(Remove.specialCharacteres(linhas.get(i))))));

            //}


            //String nome = trimAll(conteudo);

            //if (!nome.isEmpty()) {

            //  System.out.println(nome);

            //}
        /*String[] nomesArray = nome.split("  ");

        List<String> nomes =  Arrays.asList(nomesArray);

        List<String> nomesLimpos = new ArrayList<>();
        for (String nomeLimpo : nomes) {
            if(!nomeLimpo.equals("")){
                nomesLimpos.add(nomeLimpo);
            }
        }*/


            //ps.setString(1, conteudo);
            //ps.execute();




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
