package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> inteirosList;

    public SomaNumeros() {
        this.inteirosList = new ArrayList<>();
    }

    public List<Integer> getInteirosList() {
        return inteirosList;
    }

    public void adicionarNumero(int numero){
        inteirosList.add(numero);
    }
    public Integer calcularSoma(){
        Integer soma = 0;
        if (!inteirosList.isEmpty()){
            for(Integer numero : inteirosList){
                soma += numero;
            }
        }
        return soma;}
    public Integer encontrarMaiorNumero(){
        Integer maior = Integer.MIN_VALUE;
        if (!inteirosList.isEmpty()){

            for(Integer numero : inteirosList){
                maior = numero > maior ? numero : maior ;
            }
        }
        return maior;
    }
    public Integer encontrarMenorNumero(){
        Integer menor = Integer.MAX_VALUE;
        if (!inteirosList.isEmpty()){

            for(Integer numero : inteirosList){
                menor = numero < menor ? numero : menor;
            }
        }
        return menor;
    }
    public List<Integer> exibirNumeros(){
        return inteirosList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(25);

        somaNumeros.adicionarNumero(75);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(60);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(50);

        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());

    }
}
