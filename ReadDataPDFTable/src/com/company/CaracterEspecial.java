package com.company;

public class CaracterEspecial {

    public static String deleteCaracter(String pdf) {

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
                .trim();

        return pdf;
    }
}