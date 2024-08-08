package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItems;

    public CarrinhoDeCompras(){
        this.listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItems.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itens = new ArrayList<>();
        for (Item item : listaItems){
            if(item.getNome().equals(nome)){
                itens.add(item);
            }
        }
        listaItems.removeAll(itens);
    }
    public double calcularValorTotal(){
        double total=0;
        for(Item item : listaItems){
            total += item.getPreco()*item.getQuantidade();
        }
        return total;
    }
    public void exibirItens(){
        System.out.println(listaItems);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Play5",3000.0,2);
        carrinho.adicionarItem("Controle Play5",300.0,4);
        carrinho.adicionarItem("Jogos Play5",225.0,10);
        carrinho.exibirItens();
        System.out.printf("Total no carrinho - R$ %.2f",carrinho.calcularValorTotal());
        carrinho.removerItem("Jogos Play5");
        System.out.println();
        System.out.printf("Total no carrinho - R$ %.2f",carrinho.calcularValorTotal());
        System.out.println();

    }

}
