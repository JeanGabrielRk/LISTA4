import controles.Agenda;
import modelos.Comercial;
import modelos.Pessoal;
import telas.Telas;
import telas.Visualizar;

import java.util.Scanner;

public class Programa {

    static Scanner leitor = new Scanner(System.in);

    private static Agenda agenda = new Agenda();
    private static Visualizar visao = new Visualizar();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = Telas.exibirMenu();
            switch (opcao) {
                case 1:
                    incluirPessoal();
                    break;
                case 2:
                    incluirComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            Telas.limparBuffer();
        } while (opcao != 6);
    }

    private static void incluirPessoal() {
        System.out.print("Digite o código do contato pessoal: ");
        int codigo = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o nome do contato pessoal: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o telefone do contato pessoal: ");
        String telefone = leitor.nextLine();
        System.out.print("Digite o aniversário do contato pessoal: ");
        String aniversario = leitor.nextLine();

        Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
        agenda.adicionar(pessoal);
        System.out.println("Contato pessoal adicionado com sucesso!");
    }

    private static void incluirComercial() {
        System.out.print("Digite o código do contato comercial: ");
        int codigo = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o nome do contato comercial: ");
        String nome = leitor.nextLine();
        System.out.print("Digite o telefone do contato comercial: ");
        String telefone = leitor.nextLine();

        Comercial comercial = new Comercial(codigo, nome, telefone);
        agenda.adicionar(comercial);
        System.out.println("Contato comercial adicionado com sucesso!");
    }

    private static void excluirContato() {
        System.out.print("Digite o código do contato a ser excluído: ");
        int codigo = leitor.nextInt();
        agenda.excluirContato(codigo);
        System.out.println("Contato excluído com sucesso!");
    }

    private static void consultarContato() {
        System.out.print("Digite o código do contato a ser consultado: ");
        int codigo = leitor.nextInt();
        visao.exibirContato(agenda.getContato(codigo));
    }

    private static void listarContatos() {
        visao.exibirTodosContatos(agenda.listarContatos());
    }
}
