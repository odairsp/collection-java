package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        this.estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        for (Long key : estoqueProdutoMap.keySet()) {
            System.out.println("Cod. " + key + " - " + estoqueProdutoMap.get(key));
        }
    }

    public double calcularValorTotalEstoque() {
        double totalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                totalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisCaro = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisCaro = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorQuantidade = null;
        double maiorValorQuantidade = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco()*p.getQuantidade() > maiorValorQuantidade) {
                    produtoMaiorValorQuantidade = p;
                    maiorValorQuantidade = p.getPreco()*p.getQuantidade();
                }
            }
        }
        return produtoMaiorValorQuantidade;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1001L, "PlayStation 5", 4, 3565.25);
        estoqueProdutos.adicionarProduto(1002L, "Xbox ONE", 2, 3895.58);
        estoqueProdutos.adicionarProduto(1003L, "Controle Xbox ONE", 5, 295.58);
        estoqueProdutos.adicionarProduto(1004L, "Controle PlayStation 5", 8, 235.68);
        estoqueProdutos.adicionarProduto(1005L, "Caneta", 200, 25.69);

        estoqueProdutos.exibirProdutos();
        System.out.println("Total estoque = R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Mais caro = " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Maior valor quantidade = " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
