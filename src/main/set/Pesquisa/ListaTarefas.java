package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        if(!tarefasSet.isEmpty()){
            for(Tarefa tarefa : tarefasSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasSet.remove(tarefa);
                    break;
                }
            }

        }else {
            throw new RuntimeException("Sem tarefas!");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa tarefa : tarefasSet){
                if(tarefa.isConcluido()){
                    tarefasConcluidas.add(tarefa);
                }
            }
            return tarefasConcluidas;
        }else{
            throw new RuntimeException("Sem tarefas!");
        }


    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa tarefa : tarefasSet){
                if(!tarefa.isConcluido()){
                    tarefasPendentes.add(tarefa);
                }
            }
        }else{
            throw new RuntimeException("Sem tarefas!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!tarefasSet.isEmpty()){
            for(Tarefa tarefa : tarefasSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setConcluido(true);
                    break;
                }
            }
        }else{
            throw new RuntimeException("Sem tarefas!");
        }

    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefasSet.isEmpty()){
            for(Tarefa tarefa : tarefasSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setConcluido(false);
                    break;
                }
            }

        }else{
            throw new RuntimeException("Sem tarefas!");
        }
    }

    public void limparListaTarefas(){
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");
        System.out.println();
        listaTarefas.exibirTarefas();
        System.out.println();
        System.out.println(listaTarefas.contarTarefas());
        System.out.println();

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 3");
        listaTarefas.marcarTarefaConcluida("Tarefa 5");
        System.out.println();
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.removerTarefa("Tarefa 5");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
