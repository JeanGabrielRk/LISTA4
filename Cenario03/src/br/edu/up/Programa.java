package br.edu.up;

import java.util.Scanner;
import br.edu.up.modelos.*;

public class Programa {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = leitor.nextInt();

        System.out.println("O ano é bissexto? (true/false):");
        boolean bissexto = leitor.nextBoolean();

        Ano calendario = new Ano(ano, bissexto);

        while (true) {
            System.out.println("Digite o nome do mês:");
            String nomeMes = leitor.next();

            System.out.println("Digite o dia do mês:");
            int dia = leitor.nextInt();

            System.out.println("Digite a hora do compromisso:");
            int hora = leitor.nextInt();
            leitor.nextLine(); 

            System.out.println("Digite o nome da pessoa:");
            String pessoa = leitor.nextLine();

            System.out.println("Digite o local do compromisso:");
            String local = leitor.nextLine();

            System.out.println("Digite o assunto do compromisso:");
            String assunto = leitor.nextLine();

            Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);

            calendario.adicionarCompromisso(2, compromisso, dia);

            System.out.println("Deseja adicionar outro compromisso? (s/n):"); 
            String resposta = leitor.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

    System.out.println("Digite o número do mês que deseja listar os compromissos:");
    int numeroMes = leitor.nextInt();

    System.out.println("Compromissos para o mês " + numeroMes + ":");
    System.out.println(calendario.listarCompromissos(numeroMes));

    System.out.println("Todos os compromissos do ano:");
    System.out.println(calendario.listarCompromissos());
    }
}
