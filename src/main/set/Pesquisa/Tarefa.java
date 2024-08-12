package main.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                "}\n";
    }
}
