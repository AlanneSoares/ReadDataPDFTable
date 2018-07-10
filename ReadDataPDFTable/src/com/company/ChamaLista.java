package com.company;

import java.util.ArrayList;
import java.util.List;

public class ChamaLista {

    static List<String> removePalavrasInuteis(List<String> palavras) {

        List<String> palavraSemPreposicao = new ArrayList<>(palavras);

        for (String palavra : palavras) {

            for (String preposicao : Palavras.REMOVER) {

                if (palavra.equals(preposicao)) {

                    palavraSemPreposicao.remove(palavra);

                }
            }
        }

        return palavraSemPreposicao;

    }
}

    /*public static List<String> removePalavrasInuteis() {
    }
}*/

        /*List<String> words = new ArrayList<>(palavras);

                for (String otherWords : Palavras.REMOVER) {

                    if (otherWords.equals(palavras)) {

                        words.remove(otherWords);

            }
        }*/

        //return words;
    //}
//}