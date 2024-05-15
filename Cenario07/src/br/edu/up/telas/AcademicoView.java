package br.edu.up.telas;

import br.edu.up.controles.AcademicoController;
import br.edu.up.modelos.*;

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
        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do professor: ");
        String rg = scanner.nextLine();
        System.out.print("Digite a matrícula do professor: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o ID Lattes do professor: ");
        String idLattes = scanner.nextLine();
        
        Titulacao titulacao = new Titulacao();
        System.out.print("Digite o nome da instituição da titulação: ");
        titulacao.setNomeInstituicao(scanner.nextLine());
        System.out.print("Digite o ano de conclusão da titulação: ");
        titulacao.setAnoConclusao(scanner.nextInt());
        scanner.nextLine();  
        System.out.print("Digite o nome do título: ");
        titulacao.setNomeTitulo(scanner.nextLine());
        System.out.print("Digite o título do trabalho de conclusão: ");
        titulacao.setTituloTrabalhoConclusao(scanner.nextLine());

        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setRg(rg);
        professor.setMatricula(matricula);
        professor.setIdLattes(idLattes);
        professor.setTitulacao(titulacao);

        controller.adicionarProfessor(professor);
        System.out.println("Professor adicionado com sucesso!");
    }

    private void removerProfessor() {
        System.out.print("Digite o RG do professor a ser removido: ");
        String rg = scanner.nextLine();
        boolean removido = controller.removerProfessor(rg);
        if (removido) {
            System.out.println("Professor removido com sucesso!");
        } else {
            System.out.println("Professor não encontrado!");
        }
    }

    private void listarProfessores() {
        List<Professor> professores = controller.listarProfessores();
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
        } else {
            for (Professor professor : professores) {
                System.out.println("Nome: " + professor.getNome());
                System.out.println("RG: " + professor.getRg());
                System.out.println("Matrícula: " + professor.getMatricula());
                System.out.println("ID Lattes: " + professor.getIdLattes());
                System.out.println("Titulação: " + professor.getTitulacao().getNomeTitulo() +
                        " - " + professor.getTitulacao().getNomeInstituicao() +
                        " (" + professor.getTitulacao().getAnoConclusao() + ")");
                System.out.println("Título do Trabalho de Conclusão: " + professor.getTitulacao().getTituloTrabalhoConclusao());
                System.out.println();
            }
        }
    }

    private void gerenciarAlunos() {
        int opcao;
        do {
            System.out.println("\nMenu de Alunos:");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    removerAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    private void adicionarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do aluno: ");
        String rg = scanner.nextLine();
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite o ano de ingresso do aluno: ");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Digite o nome do curso do aluno: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Digite o turno do aluno: ");
        String turno = scanner.nextLine();

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setRg(rg);
        aluno.setMatricula(matricula);
        aluno.setAnoIngresso(anoIngresso);
        aluno.setNomeCurso(nomeCurso);
        aluno.setTurno(turno);

        controller.adicionarAluno(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    private void removerAluno() {
        System.out.print("Digite o RG do aluno a ser removido: ");
        String rg = scanner.nextLine();
        boolean removido = controller.removerAluno(rg);
        if (removido) {
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    private void listarAlunos() {
        List<Aluno> alunos = controller.listarAlunos();
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("RG: " + aluno.getRg());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
                System.out.println("Curso: " + aluno.getNomeCurso());
                System.out.println("Turno: " + aluno.getTurno());
                System.out.println();
            }
        }
    }
    private void adicionarDisciplina() {
        System.out.print("Digite o nome da disciplina: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código da disciplina: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite a carga horária da disciplina (em horas): ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine();  
    
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setCodigo(codigo);
        disciplina.setCargaHoraria(cargaHoraria);
    
        controller.adicionarDisciplina(disciplina);
        System.out.println("Disciplina adicionada com sucesso!");
    }
    
    private void removerDisciplina() {
        System.out.print("Digite o código da disciplina a ser removida: ");
        String codigo = scanner.nextLine();
        boolean removida = controller.removerDisciplina(codigo);
        if (removida) {
            System.out.println("Disciplina removida com sucesso!");
        } else {
            System.out.println("Disciplina não encontrada!");
        }
    }
    
    private void gerenciarDisciplinas() {
        int opcao;
        do {
            System.out.println("\nMenu de Disciplinas:");
            System.out.println("1. Adicionar Disciplina");
            System.out.println("2. Remover Disciplina");
            System.out.println("3. Listar Disciplinas");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
    
            switch (opcao) {
                case 1:
                    adicionarDisciplina();
                    break;
                case 2:
                    removerDisciplina();
                    break;
                case 3:
                    listarDisciplinas();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }
    
    private void listarDisciplinas() {
        List<Disciplina> disciplinas = controller.listarDisciplinas();
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            for (Disciplina disciplina : disciplinas) {
                System.out.println("Nome: " + disciplina.getNome());
                System.out.println("Código: " + disciplina.getCodigo());
                System.out.println("Carga Horária: " + disciplina.getCargaHoraria() + " horas");
                System.out.println();
            }
        }
    }    
        
}
