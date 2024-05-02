package controles;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import modelos.Evento;
import modelos.Reserva;

public class EventoController {

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

    public void alterarEvento(int idEvento, Evento eventoAtualizado) {
        Optional<Evento> eventoExistente = eventos.stream()
            .filter(e -> e.getId() == idEvento)
            .findFirst();

        if (eventoExistente.isPresent()) {
            int indice = eventos.indexOf(eventoExistente.get());
            eventos.set(indice, eventoAtualizado);
            System.out.println("Evento alterado com sucesso!");
        } else {
            System.out.println("Evento com ID " + idEvento + " não encontrado!");
        }
    }

    public void listarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }

    public void excluirEvento(int idEvento) {
        eventos.removeIf(e -> e.getId() == idEvento);
    }
    }

    public void adicionarEvento(Evento evento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarEvento'");
    }
}
