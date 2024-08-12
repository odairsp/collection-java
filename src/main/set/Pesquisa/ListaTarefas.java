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


}
