package com.company;

public class Words {

    public static String removeWords(String pdf) {

        pdf = pdf.replace("PODER", "")
                .replace("JUDICIÁRIO", "")
                .replace("ESTADO", "")
                .replace("RIO", "")
                .replace("JANEIRO", "")
                .replace("DGJUR", "")
                .replace("DEIGE", "")
                .replace("Produtividade", "")
                .replace("Juízes", "")
                .replace("Maio", "") //2018\n" +
                .replace("Nome", "")
                .replace("Audiências Realizadas", "")
                .replace("Conclusões", "")
                .replace("Decisões Outras", "")
                .replace("Decisões", "")
                .replace("Terminativas", "")
                .replace("Depoimentos", "")
                .replace("Despachos" , "")
                .replace("Júri", "")
                .replace("Processos", "")
                .replace("Decididos", "")
                .replace("Sentenças", "")
                .replace("outras", "")
                .replace("com", "")
                .replace("sem", "")
                //.replace("de", "")
                //.replace("do", "")
                .replace("Mérito", "")
                .replace("Homologação", "")
                .replace("Acordo", "");


        return pdf;
    }
}

