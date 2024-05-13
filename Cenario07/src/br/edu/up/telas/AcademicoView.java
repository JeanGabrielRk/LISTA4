package telas;

import controles.AcademicoController;
import java.util.List;
import java.util.Scanner;

public class AcademicoView {
    private final AcademicoController controller;
    private final Scanner scanner;

    public AcademicoView(AcademicoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Gerenciar Professores");
            System.out.println("2. Gerenciar Alunos");
            System.out.println("3. Gerenciar Disciplinas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciarProfessores();
                    break;
                case 2:
                    gerenciarAlunos();
                    break;
                case 3:
                    gerenciarDisciplinas();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void gerenciarProfessores() {
        int opcao;
        do {
            System.out.println("\nMenu de Professores:");
            System.out.println("1. Adicionar Professor");
            System.out.println("2. Remover Professor");
            System.out.println("3. Listar Professores");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProfessor();
                    break;
                case 2:
                    removerProfessor();
                    break;
                case 3:
                    listarProfessores();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void adicionarProfessor() {
        // Implemente a lógica para adicionar um professor
    }

    private void removerProfessor() {
        // Implemente a lógica para remover um professor
    }

    private void listarProfessores() {
        // Implemente a lógica para listar os professores
    }

    private void gerenciarAlunos() {
        // Implemente a lógica para gerenciar alunos
    }

    private void gerenciarDisciplinas() {
        // Implemente a lógica para gerenciar disciplinas
    }
}
