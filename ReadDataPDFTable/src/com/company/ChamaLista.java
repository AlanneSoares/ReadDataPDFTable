package com.company;

import java.util.ArrayList;
import java.util.List;

public class ChamaLista {

    public static List<String> removePalavras(List<String> palavras) {

        List<String> words = new ArrayList<>(palavras);

                for (String otherWords : Palavras.REMOVER) {

                    if (otherWords.equals(palavras)) {

                        words.remove(otherWords);

            }
        }
        return words;
    }
}