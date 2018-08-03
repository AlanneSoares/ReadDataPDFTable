package com.company;


/*

 foi utilizado o itext para leitura do pdf


 */
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.*;

import java.io.IOException;
import java.sql.SQLException;

// Ler pdf com iText
// Está retirando das palavras "de", no qual não deveria

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

            // contando páginas
            for (page = 1; page < reader.getNumberOfPages() + 1; page++) {

                // imprimiu as 24 páginas
                //System.out.println(page);


                // COM O CÓDIGO ABAIXO FUNCIONA E RETIRA OS ESPAÇAMENTOS PORÉM REMOVE O QUE NÃO DEVERIA REMOVER
                /*Rectangle rect = new Rectangle(0, 50, 490, 600);
                RenderFilter filter = new RegionTextRenderFilter(rect);
                TextExtractionStrategy strategy = new FilteredTextRenderListener(new LocationTextExtractionStrategy(), filter);
                pages = PdfTextExtractor.getTextFromPage(reader, page, strategy);*/


                // ASSIM FUNCIONA PEGANDO TUDO PORÉM NÃO FAZ O QUE FAZ O CÓDIGO ACIMA
                pages = PdfTextExtractor.getTextFromPage(reader, page);

                //PageSize.A4;
                //int linhas = jTable1.getRowCount()-1;

                // transformando conteúdo de linha página em array de strings
                String[] row = pages.split("\\r\\n\\t");

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
                    String content = letters.trim();

                    while (content.contains(" ")) {
                        String b = content.replace("-", "\n");
                        String c = b.replace("\n\n", "\n");
                        String d = c.replace("\n\n\n", "\n");
                        
                        System.out.println(d);

                            break;
                        }


                        //if (content.equals("-")){


                        /*System.out.println(content.replace("-", "\n" +
                        //content.replace("--", "\n")) +
                        content.replace("---", "\n")));*/
                    }
                }


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
