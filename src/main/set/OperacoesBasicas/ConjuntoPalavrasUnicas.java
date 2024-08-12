package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if(!this.palavrasUnicasSet.isEmpty()){
            if (verificarPalavra(palavra)) {
            this.palavrasUnicasSet.remove(palavra);
            }else{
                System.out.println("Palavra inexistente!");
            }
        }else{
            throw new RuntimeException("Set vazio!");
        }
    }
    public boolean verificarPalavra(String palavra) {
       return this.palavrasUnicasSet.contains(palavra);

    }

    public void exibirPalavrasUnicas() {

        System.out.printf(this.palavrasUnicasSet.toString());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra(""));

        conjuntoPalavrasUnicas.adicionarPalavra("outro");
        conjuntoPalavrasUnicas.adicionarPalavra("meia");
        conjuntoPalavrasUnicas.adicionarPalavra("chinelo");
        conjuntoPalavrasUnicas.adicionarPalavra("panela");
        conjuntoPalavrasUnicas.adicionarPalavra("vasilha");
        conjuntoPalavrasUnicas.adicionarPalavra("caneca");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("joao");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("panela");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
