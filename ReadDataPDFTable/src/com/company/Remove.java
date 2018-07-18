package com.company;

import java.util.Spliterator;

public class Remove {

    public static String numbers(String pdf) {

        pdf = pdf.replaceAll("[0-9]", "");

        return pdf;
    }

    public static String months(String pdf) {

        pdf = pdf.replace("Janeiro de", "")
                .replace("Fevereiro de", "")
                .replace("Março de", "")
                .replace("Abril de", "")
                .replace("Maio de", "")
                .replace("Junho de", "")
                .replace("Julho de", "")
                .replace("Agosto de", "")
                .replace("Setembro de", "")
                .replace("Outubro de", "")
                .replace("Novembro de", "")
                .replace("Dezembro de", "");

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
                .replace("'", "");

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
