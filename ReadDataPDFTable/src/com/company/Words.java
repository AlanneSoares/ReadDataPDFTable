package com.company;

public class Words {

    public static String removeWords(String pdf) {

        pdf = pdf.replace("Produtividade", "")
                .replace("de", "")
                .replace("Juízes", "");

        return pdf;
    }
}

