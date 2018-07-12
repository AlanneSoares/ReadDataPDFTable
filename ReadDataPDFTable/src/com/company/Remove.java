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
                .replace("Juízes", "");

            return pdf;
    }
}
