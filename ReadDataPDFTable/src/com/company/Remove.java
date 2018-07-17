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
                .replace("PODER", "")
                .replace("JUDICIÁRIO", "")
                .replace("DO", "")
                .replace("ESTADO", "")
                .replace("RIO", "")
                .replace("DE", "")
                .replace("JANEIRO", "")
                .replace("DGJUR DEIGE", "")
                .replace("Nome", "")
                .replace("Audiências", "")
                .replace("Realizadas", "")
                .replace("Conclusões", "")
                .replace("Decisões", "")
                .replace("Outras", "")
                .replace("Terminativas", "")
                .replace("Depoimentos", "")
                .replace("Despachos", "")
                .replace("Júri", "")
                .replace("Processos", "")
                .replace("Decididos", "")
                .replace("Sentenças", "")
                .replace("sem", "")
                .replace("com", "")
                .replace("de", "")
                .replace("Mérito", "")
                .replace("Homologação", "")
                .replace("Acordo", "")
                .replace("Produtividade", "")
                .replace("Juízes", "");

            return pdf;
    }
}
