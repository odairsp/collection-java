package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaInteiros;

    public OrdenacaoNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaInteiros.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> ordenadoAscendente = new ArrayList<>(this.listaInteiros);
        if(!this.listaInteiros.isEmpty()){
        Collections.sort(ordenadoAscendente);
        return ordenadoAscendente;

        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }
    public List<Integer>ordenarDescendente() {
        List<Integer> ordenadoDescendente = new ArrayList<>(this.listaInteiros);
        if(!listaInteiros.isEmpty()){
            ordenadoDescendente.sort(Collections.reverseOrder());
            return ordenadoDescendente;
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirNumeros(){
        if(!listaInteiros.isEmpty()){
            System.out.println(listaInteiros);
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }

}
