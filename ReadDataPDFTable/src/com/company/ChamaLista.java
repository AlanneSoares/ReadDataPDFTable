package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChamaLista {

    static List<String> removePalavrasInuteis(List<String> palavras) {

        List<String> palavraSemPreposicao = new ArrayList<>(palavras);

        for (String otherWords : Palavras.REMOVER) {

            if (otherWords.equals(palavras)) {

                palavraSemPreposicao.remove(otherWords);

            }

            for (String palavra : palavras) {

                if (palavra.contains("PODER")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("JUDICIÁRIO")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("DO")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("RIO")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("DE")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("JANEIRO")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("DGJUR")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("DEIGE")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Produtividade")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Juízes")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("de")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Maio")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Nome")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Audiências")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Realizadas")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Conclusões")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Decisões")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Outras")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Terminativas")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Depoimentos")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Despachos")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Júri")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Processos")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Decididos")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Sentenças")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("com")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("sem")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Mérito")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Homologação")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains("Acordo")) {

                    palavraSemPreposicao.remove(palavra);

                } else if (palavra.contains(", ")) {
                    palavraSemPreposicao.remove(palavra);
                }

            }

        }
        return palavraSemPreposicao;
    }
}


        /*List<String> palavraSemPreposicao = new ArrayList<>(palavras);

        for (String palavra : palavras) {

            if (palavra.contains("PODER")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("JUDICIÁRIO")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("DO")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("RIO")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("DE")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("JANEIRO")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("DGJUR")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("DEIGE")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Produtividade")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Juízes")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("de")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Maio")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Nome")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Audiências")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Realizadas")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Conclusões")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Decisões")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Outras")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Terminativas")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Depoimentos")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Despachos")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Júri")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Processos")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Decididos")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Sentenças")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("com")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("sem")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Mérito")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Homologação")) {

                palavraSemPreposicao.remove(palavra);

            } else if (palavra.contains("Acordo")) {

                palavraSemPreposicao.remove(palavra);

            }

        }

        return palavraSemPreposicao;

    }

}*/