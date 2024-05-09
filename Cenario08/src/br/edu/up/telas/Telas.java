package telas;

import java.util.Scanner;

public class Telas {

    private static Scanner leitor = new Scanner(System.in);

    public static int exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public static void limparBuffer() {
        leitor.nextLine(); 
    }
}
