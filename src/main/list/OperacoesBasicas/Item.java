package main.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return  "\nnome= '" + nome + '\'' +
                ",\npreco= R$" + preco +
                ",\nquantidade= " + quantidade+"\n";
    }
}
