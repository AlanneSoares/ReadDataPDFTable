package com.company;

import java.util.Spliterator;

public class Remove {

    public static String numbers(String pdf) {

        pdf = pdf.replaceAll("[0-9]", "");

        return pdf;
    }

    public static String months(String pdf) {

        pdf = pdf.replace("Janeiro", "")
                .replace("Fevereiro", "")
                .replace("Março", "")
                .replace("Abril", "")
                .replace("Maio", "")
                .replace("Junho", "")
                .replace("Julho", "")
                .replace("Agosto", "")
                .replace("Setembro", "")
                .replace("Outubro", "")
                .replace("Novembro", "")
                .replace("Dezembro", "");

        return pdf;
    }

    public static String specialCharacteres(String pdf) {

        pdf = pdf.replace(".", "")
                .replace(",", "")
                .replace(";", "")
                .replace("ª", "")
                .replace("/", "")
                .replace("|", "")
                .replace("(", "")
                .replace(")", "")
                .replace("-", " ")
                .replace(":", "")
                .replace("%", "")
                .replace("'", "")
                .replace("[", "")
                .replace("  ", "")
                .replace("´", "")
                .replace("!", "")
                .replace("^", "");

        return pdf;
    }

    public static String words(String pdf) {

        pdf = pdf
                .replace("Produtividade", "")
                .replace("de", "")
                .replace("Juízes", "")
                .replace("Nome", "")
                .replace("Realizadas", "")
                .replace("Outras", "")
                .replace("Terminativas", "")
                .replace("Júri", "")
                .replace("Sentenças", "")
                .replace("PODER", "")
                .replace("JUDICIÁRIO", "")
                .replace("DO", "")
                .replace("ESTADO", "")
                .replace("RIO", "")
                .replace("DE", "")
                .replace("JANEIRO", "")
                .replace("DGJUR DEIGE", "")
                .replace("Audiências", "")
                .replace("Decisões", "")
                .replace("Processo", "")
                .replace("Conclusões", "")
                .replace("Depoimentos", "")
                .replace("Despachos", "")
                .replace("Homologação", "")
                .replace("Decididos", "")
                .replace("Méritos", "")
                .replace("Acordo", "")
                .replace("sem", "")
                .replace("com", "")
                ;

            return pdf;
    }
}
