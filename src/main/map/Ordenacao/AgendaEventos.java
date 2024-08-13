package main.map.Ordenacao;

import main.map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventoTreeMap);

    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("Próximo evento " + entry.getValue().getNomeEvento() + ", será " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.now().plusDays(7L), "Encontro no Bar", "Cachaças");
        agendaEventos.adicionarEvento(LocalDate.now().plusDays(15L), "Show de Sabado", "Jorge e Matheus");
        agendaEventos.adicionarEvento(LocalDate.now().minusDays(7L), "Snooker", "Pingas");
        agendaEventos.adicionarEvento(LocalDate.now().plusDays(2L), "Demonstração BI", "Open Bar");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}
