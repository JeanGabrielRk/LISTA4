package controles;

import java.util.ArrayList;
import java.util.List;

import modelos.Evento;
import modelos.Reserva;

public class EventoController {

    private List<Evento> eventos;
    private List<Reserva> reservas;

    public EventoController() {
        eventos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    public void removerReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public void realizarReserva(Evento evento, String responsavel, int quantidadePessoas, double precoIngresso) {
        // Verifica se há vagas disponíveis no evento
        int vagasDisponiveis = evento.ingressosDisponiveis();
        if (vagasDisponiveis >= quantidadePessoas) {
            // Calcula o valor total da reserva
            double valorTotal = quantidadePessoas * precoIngresso;
            // Cria a reserva
            Reserva novaReserva = new Reserva(responsavel, quantidadePessoas, evento.getData(), valorTotal);
            // Adiciona a reserva à lista de reservas
            reservas.add(novaReserva);
            // Atualiza a quantidade de ingressos vendidos para o evento
            evento.venderIngressos(quantidadePessoas);
            System.out.println("Reserva realizada com sucesso para o evento: " + evento.getNome());
        } else {
            System.out.println("Não há vagas disponíveis para realizar esta reserva.");
        }
    }
}
