package com.company;

public class RemoveWords {

    public static String deleteWord() {

        String pjerj = "PODER JUDICIÁRIO DO ESTADO DO RIO DE JANEIRO";
        String dgjurDeige = "DGJUR DEIGE";
        String pjmd = "Produtividade de Juízes Maio de";
        String name = "Nome";
        String ar = "Audiências Realizadas";
        String c= "Conclusões";
        String d = "Decisões Outras";
        String dt = "Decisões Terminativas";
        String depoimentos = "Depoimentos";
        String despachos = "Despachos";
        String j = "Júri";
        String pd = "Processos Decididos";
        String scm = "Sentenças com Mérito";
        String ssm = "Sentenças sem Méritos";
        String h = "Sentenças de Homologação de Acordo";


        if (pjerj.length() == 44) {

            pjerj.replace(pjerj, "");

        } else if (dgjurDeige.length() == 11) {

            dgjurDeige.replace(dgjurDeige, "");

        } else if (pjmd.length() == 31) {

            pjmd.replace(pjmd, "");

        } else {

            System.out.println("Nada encontrado!!!");
        }


        return null;
    }
}
