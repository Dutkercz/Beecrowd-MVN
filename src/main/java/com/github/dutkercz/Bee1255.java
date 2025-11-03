package com.github.dutkercz;

import java.util.*;

/**
 * Neste problema estamos interessados na frequência das letras em uma dada linha de texto.
 * Especificamente,
 * deseja-se saber qual(is) a(s) letra(s) de maior frequência do texto,
 * ignorando o “case sensitive”,
 * ou seja maiúsculas ou minúsculas
 * (sendo mais claro, “letras” referem-se precisamente às 26 letras do alfabeto).
 * -
 * Entrada
 * A entrada contém vários casos de teste.
 * A primeira linha contém um inteiro N que indica a quantidade de casos de teste.
 * Cada caso de teste consiste de uma única linha de texto. A linha pode conter caracteres “não letras”,
 * mas é garantido que tenha ao menos uma letra e que tenha no máximo 200 caracteres no total.
 *-
 * Saída
 * Para cada caso de teste,
 * imprima uma linha contendo a(s) letra(s) que mais ocorreu(ocorreram)
 * no texto em minúsculas (se houver empate, imprima as letras em ordem alfabética).
 */

public class Bee1255 {
    public static void main(String[] args) {
        Bee1255 be = new Bee1255();
        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        scanner.nextLine();
        String[] frases = new String[linhas];
        for (int i = 0; i < linhas; i++) {
            frases[i] = scanner.nextLine();
        }
        be.extracted(linhas, frases);
    }

    public void extracted(int linhas, String[] frases) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < linhas; i++) {
            Map<Character, Integer> letrasRep = new TreeMap<>();
            int maxNumb = 0;
            for(Character c : frases[i].toLowerCase().replace(" ", "").toCharArray()){
                letrasRep.put(c, letrasRep.getOrDefault(c, 0)+1);
                if(letrasRep.get(c) > maxNumb){
                    maxNumb = letrasRep.get(c);
                }
            }


            for(Map.Entry<Character, Integer> x : letrasRep.entrySet()){
                if (x.getValue() == maxNumb){
                    result.append(x.getKey());
                }
            }
            result.append("\n");

        }
        System.out.print(result);
    }
}
