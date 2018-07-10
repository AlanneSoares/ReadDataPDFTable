package com.company;

public class Insert {
    public static String words() {

        String lineOne = "PODER JUDICIÁRIO DO ESTADO DO RIO DE JANEIRO";
        String lineTwo = "\nDGJUR - DEIGE";
        String lineThree = "\nProdutividade de Juízes - Maio de 2018";
        String lineFor = "\nNome\t" +
                "Audiências Realizadas\t" +
                "Conclusões\t" +
                "Decisões Outras\t" +
                "Decisões Terminativas\t" +
                "Depoimentos\t" +
                "Despachos" +
                "Júri\t" +
                "Processos Decididos\t" +
                "Sentenças\t" +
                "Setenças com Mérito\t" +
                "Sentença sem Mérito\t" +
                "Sentenças de Homologação de Acordo\t";

        return lineOne + lineTwo + lineThree + lineFor;
    }
}


