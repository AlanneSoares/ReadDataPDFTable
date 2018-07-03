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
                .replace("  ", "")
                .replaceAll("[0-9]", "")
                .trim();

        return pdf;
    }
}