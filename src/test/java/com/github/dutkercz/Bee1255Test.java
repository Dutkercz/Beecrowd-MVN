package com.github.dutkercz;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bee1255Test{

    @Test
    public void testExtracted() {

        StringBuilder result = new StringBuilder();
        int linhas = 2; //mock do scanner.nextLine();
        String[] frases = {"Alllllo", "AAaa bbb"}; //mock do for() que lê as frases

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
        //no Beecrowd a saide deve ter uma linha em branco no final,
        // a saida é impressa com nova linha para o resultado de cada frase
        assertEquals("l\na\n", result.toString());
    }
}