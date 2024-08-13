package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.palavrasMap.put(palavra, contagem);
    }
    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public void removerPalavra(String palavra){
        if(palavrasMap.containsKey(palavra) && palavrasMap.get(palavra) > 1){
            palavrasMap.put(palavra, palavrasMap.get(palavra) - 1);
        }else{
            palavrasMap.remove(palavra);
        }
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaiorFrequencia = "";
        Integer maiorFrequencia = Integer.MIN_VALUE;
        if(!palavrasMap.isEmpty()){
            for(String palavra : palavrasMap.keySet()){
                if(palavrasMap.get(palavra) > maiorFrequencia){
                    maiorFrequencia = palavrasMap.get(palavra);
                    palavraMaiorFrequencia = palavra;
                }
            }
        }
        return palavraMaiorFrequencia;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("abrir", 12);
        contagemPalavras.adicionarPalavra("outra", 2);
        contagemPalavras.adicionarPalavra("ser", 3);
        contagemPalavras.adicionarPalavra("amor", 102);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("ser");
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("ser");
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("ser");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());

    }
}
