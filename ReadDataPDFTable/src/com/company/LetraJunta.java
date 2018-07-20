package com.company;

public class LetraJunta {
    static String letraJunta(String conteudo) {
        String letra = "aA";
        conteudo = letra.replaceAll("(\\w+?)([A-Z])(\\w+?)", "$1 $2$3");
        return conteudo;
    }
}
