package main.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> prosutosSet;

    public CadastroProdutos() {
        this.prosutosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        this.prosutosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome  = new TreeSet<>(prosutosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(prosutosSet);
        return produtosPorPreco;
    }
    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorQuantidade());
        produtosPorPreco.addAll(prosutosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println(cadastroProdutos.prosutosSet);
        cadastroProdutos.adicionarProduto(1,"Produto 1", 23.56, 5);
        cadastroProdutos.adicionarProduto(2,"Produto 2", 45.78, 2);
        cadastroProdutos.adicionarProduto(3,"Este Produto 3", 123.98, 1);
        cadastroProdutos.adicionarProduto(4,"Produto 4", 14.33, 7);
        cadastroProdutos.adicionarProduto(5,"Produto 5", 2345.67, 1);
        cadastroProdutos.adicionarProduto(6,"Outro Produto 6", 100.0, 6);
        System.out.println(cadastroProdutos.prosutosSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());
    }
}
