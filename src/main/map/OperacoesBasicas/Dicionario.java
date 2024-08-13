package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {

            this.palavrasMap.put(palavra, definicao);

    }

    public void removerPalavra(String palavra) {
        if (!this.palavrasMap.isEmpty()) {
            this.palavrasMap.remove(palavra);
        } else {
            throw new RuntimeException("Dicionário vazio!");
        }
    }

    public void exibirPalavras(){
        System.out.println(this.palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = null;

        if (!this.palavrasMap.isEmpty()) {
            definicao = this.palavrasMap.remove(palavra);
        } else {
            throw new RuntimeException("Dicionário vazio!");
        }
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();
        dicionario.adicionarPalavra("Caixa", "Recipiente retangular de madeira, de cartão, de metal, de matéria plástica, ou feita em outro material apropriado.");
        dicionario.adicionarPalavra("Lápis", "Objeto cilíndrico fabricado geralmente em madeira, revestido ou não por uma capa, cujo interior com grafite torna possível riscar, desenhar ou escrever.");
        dicionario.adicionarPalavra("Giz", "Calcário branco, mole e de grãos finos. O giz existente na terra se formou como uma espécie de lama no fundo de um antigo mar.");

        dicionario.exibirPalavras();
        dicionario.removerPalavra("Giz");
        dicionario.exibirPalavras();

        System.out.println("Caixa -> "+dicionario.pesquisarPorPalavra("Caixa"));
    }

}
