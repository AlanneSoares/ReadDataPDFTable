package com.company;

import java.util.ArrayList;
import java.util.List;

public class ChamaLista {

    public static List<String> removePalavras(List<String> palavras) {

        List<String> words = new ArrayList<>(palavras);

        for (String palavra : palavras) {

            if (palavra.length() > 0) {

                words.remove(palavra);

            /*} else {

                for (String outrasPalavras : Palavras.REMOVER) {

                    if (palavra.equals(outrasPalavras)) {

                        words.remove(outrasPalavras);

                    }
                }
            }
        }*/

            }
        }
        return words;
    }
}