/*  ESTRUTURA DE DADOS - TABELA HASH
Conhecida como dicionário, ou mapa. Essa estrutura permite armazenar dados mapeando uma chave ao seu valor.
Semelhante ao acesso a dados de um array a partir do seu indice, a tabela hash possuirá a mesma velodidade de acesso
de um array, acessando seu dado a partir da chave, retornando o valor.
Sua implementação original se baseia ema um array de linkedList. Onde cada posição do array é uma linkedList
*
* */
package Capitulo5TabelaHash;

import java.util.HashMap;

public class TabelaHash {

    public static void main(String[] args) {
        /* criando e instanciando */
        HashMap<String, Integer> meuAno = new HashMap<>();

        /* PUT: metodo para inserir valores no final da tabela */
        meuAno.put("Jan", 1);
        meuAno.put("Fev", 2);

        /* GET: acessando os valores pela chave */
        System.out.println(meuAno.get("Jan"));
        System.out.println(meuAno.get("Fev"));

        /* CONTAINSKEY: verifica se contem a chave  */
        System.out.println(meuAno.containsKey("Ago"));

        meuAno.remove("Mar");

        for (String a: meuAno.keySet()){
            int valor = meuAno.get(a);
            System.out.println(a + " = " + valor);
        }
    }
}
