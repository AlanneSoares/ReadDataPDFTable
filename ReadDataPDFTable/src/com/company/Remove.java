package com.company;

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
                .replace("  ", "");

        return pdf;
    }

    public static String words(String pdf) {

        pdf = pdf
                .replace("Produtividade", "")
                .replace("de", "")
                .replace("Juízes", "")
                .replace("Audiências", "")
                .replace("Processos", "")
                .replace("Conclusões", "")
                .replace("Acordo", "")
                .replace("Depoimentos", "")
                .replace("Conclusões", "")
                .replace("Despachos", "")
                .replace("sem", "")
                .replace("com", "")
                .replace("Mérito", "")
                .replace("PODER JUDICIÁRIO DO ESTADO DO RIO DE JANEIRO", "")
                .replace("DGJUR DEIGE", "")
                .replace("Nome", "")
                .replace("Realizadas", "")
                .replace("Sentenças", "")
                .replace("Méritos", "")
                .replace("Homologação", "")
                .replace("Outras", "")
                .replace("Decisões", "")
                .replace("Terminativas", "")
                .replace("Júri", "")
                .replace("Decididos", "")
                .trim()
                .replace("\\s", "");

            return pdf;
    }
}
