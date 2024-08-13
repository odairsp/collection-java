package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatoMap.isEmpty()){
            this.agendaContatoMap.remove(nome);
        }else{
            throw new RuntimeException("Agenda vazia!");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = this.agendaContatoMap.get(nome);
        }else{
            throw new RuntimeException("Agenda vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Jonas", 4561378);
        agendaContatos.adicionarContato("Luiz", 78945623);
        agendaContatos.adicionarContato("Otavio", 36985214);
        agendaContatos.adicionarContato("Cintia", 89754862);
        agendaContatos.adicionarContato("Julia", 15486239);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Jonas");
        agendaContatos.exibirContatos();

        System.out.println("Telefone de Luiz: "+agendaContatos.pesquisarPorNome("Luiz"));
    }
}
