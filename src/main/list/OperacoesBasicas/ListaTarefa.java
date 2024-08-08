package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : this.tarefaList){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        this.tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalDeTarefas(){
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Total de tarefas: "+ listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("Total de tarefas: "+ listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Total de tarefas: "+ listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
