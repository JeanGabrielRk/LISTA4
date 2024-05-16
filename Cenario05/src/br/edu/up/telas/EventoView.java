package telas;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import modelos.Evento;
import modelos.Reserva;
import controles.EventoController;

public class EventoView {

    private EventoController controller;
    private Scanner scanner;

    public EventoView(EventoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcao = 0;
        do {
            System.out.println("Bem-vindo ao sistema de gerenciamento de eventos!");
            System.out.println("1 - Listar eventos");
            System.out.println("2 - Listar reservas");
            System.out.println("3 - Adicionar evento");
            System.out.println("4 - Fazer reserva");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    listarEventos();
                    break;
                case 2:
                    listarReservas();
                    break;
                case 3:
                    adicionarNovoEvento();
                    break;
                case 4:
                    fazerReserva();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);
    }

    public void listarEventos() {
        List<Evento> eventos = controller.listarEventos();
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            System.out.println("Eventos disponíveis:");
            for (Evento evento : eventos) {
                System.out.println("Nome: " + evento.getNome());
                System.out.println("Data: " + evento.getData());
                System.out.println("Local: " + evento.getLocal());
                System.out.println("Lotação máxima: " + evento.getLotacaoMaxima());
                System.out.println("Ingressos vendidos: " + evento.getIngressosVendidos());
                System.out.println("Preço do ingresso: " + evento.getPrecoIngresso());
                System.out.println("--------------------------");
            }
        }
    }

    public void listarReservas() {
        List<Reserva> reservas = controller.listarReservas();
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            System.out.println("Reservas realizadas:");
            for (Reserva reserva : reservas) {
                System.out.println("Responsável: " + reserva.getResponsavel());
                System.out.println("Quantidade de pessoas: " + reserva.getQuantidadePessoas());
                System.out.println("Data da reserva: " + reserva.getDataReserva());
                System.out.println("Valor total: " + reserva.getValorTotal());
                System.out.println("--------------------------");
            }
        }
    }

    public void adicionarNovoEvento() {
        System.out.println("Informe os dados do novo evento:");
        System.out.println("Nome:");
        String nome = scanner.next();
        System.out.println("Data (no formato YYYY-MM-DD):");
        String dataStr = scanner.next();
        System.out.println("Local:");
        String local = scanner.next();
        System.out.println("Lotação máxima:");
        int lotacaoMaxima = scanner.nextInt();
        System.out.println("Preço do ingresso:");
        double precoIngresso = scanner.nextDouble();
        Evento novoEvento = new Evento(nome, Date.valueOf(dataStr), local, lotacaoMaxima, 0, precoIngresso);
        controller.adicionarEvento(novoEvento);
        System.out.println("Novo evento adicionado com sucesso!");
    }

    public void fazerReserva() {
        System.out.println("Informe os dados para a reserva:");
        System.out.println("Nome do evento:");
        String nomeEvento = scanner.next();
        Evento evento = null;
        for (Evento e : controller.listarEventos()) {
            if (e.getNome().equals(nomeEvento)) {
                evento = e;
                break;
            }
        }
        if (evento != null) {
            System.out.println("Nome do responsável pela reserva:");
            String responsavel = scanner.next();
            System.out.println("Quantidade de pessoas:");
            int quantidadePessoas = scanner.nextInt();
            controller.realizarReserva(evento, responsavel, quantidadePessoas, evento.getPrecoIngresso());
        } else {
            System.out.println("Evento não encontrado.");
        }
    }
}
