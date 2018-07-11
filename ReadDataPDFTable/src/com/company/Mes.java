package com.company;

public class Mes {

    public static String deletePalavra(String pdf) {

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
}
