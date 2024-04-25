package br.edu.up;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia do compromisso: ");
        int dia = leitor.nextInt();

        Dia diaCompromisso = new Dia(dia);

        while (true) {
            System.out.println("\n------ Menu ------");
            System.out.println("1. Adicionar compromisso");
            System.out.println("2. Listar compromissos do dia");
            System.out.println("3. Consultar compromisso");
            System.out.println("4. Excluir compromisso");
            System.out.println("5. Sair");
            System.out.println("------------------");
            System.out.println("Escolha uma opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    diaCompromisso.adicionarCompromisso(leitor);
                    break;
                case 2:
                    diaCompromisso.listarCompromissos();
                    break;
                case 3:
                    System.out.println("Digite o índice do compromisso a ser consultado: ");
                    int indiceConsulta = leitor.nextInt();
                    diaCompromisso.consultarCompromisso(indiceConsulta);
                    break;
                case 4:
                    System.out.println("Digite o índice do compromisso a ser excluído: ");
                    int indiceExclusao = leitor.nextInt();
                    diaCompromisso.excluirCompromisso(indiceExclusao);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    leitor.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}