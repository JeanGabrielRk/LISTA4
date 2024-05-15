package br.edu.up;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = leitor.nextInt();

        System.out.println("Digite o mês (1 para Janeiro, 2 para Fevereiro, etc.): ");
        int mes = leitor.nextInt();

        System.out.println("Digite o dia: ");
        int dia = leitor.nextInt();

        Ano anoAgenda = new Ano(ano, isBissexto(ano));
        Mes mesAgenda = new Mes(getNomeMes(mes), getQtdeDiasMes(mes, isBissexto(ano)));
        anoAgenda.adicionarMes(mesAgenda, mes);
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

    public static boolean isBissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    public static String getNomeMes(int mes) {
        String[] nomes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return nomes[mes - 1];
    }

    public static int getQtdeDiasMes(int mes, boolean bissexto) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bissexto) {
            return 29;
        }
        return diasPorMes[mes - 1];
    }
}
