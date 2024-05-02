package controles;

import java.util.ArrayList;
import java.util.List;

import modelos.Evento;
import modelos.Reserva;

public class EventoController {

    private List<Evento> eventos;
    private List<Reserva> reservas;

    public EventoController() {
        this.eventos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

     public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void alterarEvento(int indice, Evento evento) {
        if (indice >= 0 && indice < eventos.size()) {
            eventos.set(indice, evento);
        } else {
            System.out.println("Índice de evento inválido!");
        }
    }

    public void listarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void excluirEvento(int indice) {
        if (indice >= 0 && indice < eventos.size()) {
            eventos.remove(indice);
        } else {
            System.out.println("Índice de evento inválido!");
        }
    }

}
