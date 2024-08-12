package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

  public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
  }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato contato: contatoSet){
                if(contato.getNome().startsWith(nome)){
                   contatosPorNome.add(contato);
                }
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContato();
        System.out.println();
        agenda.adicionarContato("Odair", 28374657);
        agenda.adicionarContato("Jonas", 45627812);
        agenda.adicionarContato("José", 96542387);
        agenda.adicionarContato("João", 75124896);
        agenda.adicionarContato("João Silva", 75124896);
        agenda.exibirContato();
        System.out.println();
        System.out.println(agenda.pesquisaPorNome("João"));
        System.out.println(agenda.atualizarNumeroContato("João Silva", 12345678));
        System.out.println();
        agenda.exibirContato();

    }

}
