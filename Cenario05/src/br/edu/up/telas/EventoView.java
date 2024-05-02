package telas;

import java.time.LocalDate;
import java.util.Scanner;

import controles.EventoController;
import modelos.Evento;

public class EventoView {
    private EventoController controller;
    private Scanner scanner;

    public EventoView(EventoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\nMenu de Gerenciamento de Eventos:");
            System.out.println("1. Incluir evento");
            System.out.println("2. Alterar evento");
            System.out.println("3. Listar eventos");
            System.out.println("4. Excluir evento");
            System.out.println("5. Incluir reserva");
            System.out.println("6. Alterar reserva");
            System.out.println("7. Listar reservas");
            System.out.println("8. Excluir reserva");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirEvento();
                    break;
                case 2:
                    alterarEvento();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    private void incluirEvento() {
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();

        System.out.print("Data do evento (formato YYYY-MM-DD): ");
        String dataEvento = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataEvento);

        System.out.print("Local do evento: ");
        String local = scanner.nextLine();

        System.out.print("Lotação máxima do evento: ");
        int lotacaoMaxima = scanner.nextInt();

        System.out.print("Preço do ingresso: ");
        double precoIngresso = scanner.nextDouble();

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, lotacaoMaxima, precoIngresso);
        controller.adicionarEvento(evento);
        System.out.println("Evento incluído com sucesso!");
    }

    private void alterarEvento() {
        System.out.print("Digite o ID do evento a ser alterado: ");
        int idEvento = scanner.nextInt();
        scanner.nextLine(); 

        Evento evento = controller.adicionarEvento(idEvento);
        if (evento == null) {
            System.out.println("Evento não encontrado!");
            return;
        }

        System.out.print("Novo nome do evento (deixe em branco para não alterar): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) {
            evento.setNome(nome);
        }

        System.out.print("Nova data do evento (formato YYYY-MM-DD, deixe em branco para não alterar): ");
        String dataEvento = scanner.nextLine();
        if (!dataEvento.isEmpty()) {
            LocalDate data = LocalDate.parse(dataEvento);
            evento.setData(data);
        }

        System.out.print("Novo local do evento (deixe em branco para não alterar): ");
        String local = scanner.nextLine();
        if (!local.isEmpty()) {
            evento.setLocal(local);
        }

        System.out.print("Nova lotação máxima do evento (digite 0 para não alterar): ");
        int lotacaoMaxima = scanner.nextInt();
        if (lotacaoMaxima > 0) {
            evento.setLotacaoMaxima(lotacaoMaxima);
        }

        System.out.print("Novo preço do ingresso (digite 0 para não alterar): ");
        double precoIngresso = scanner.nextDouble();
        if (precoIngresso > 0) {
            evento.setPrecoIngresso(precoIngresso);
        }

        controller.atualizarEvento(evento);
        System.out.println("Evento alterado com sucesso!");
    }
}