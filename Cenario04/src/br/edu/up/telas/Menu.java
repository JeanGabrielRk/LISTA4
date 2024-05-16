package telas;

import java.util.Scanner;
import modelos.Veiculo;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public int mostrarOpcoes() {
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public Veiculo capturarDadosVeiculo() {
        System.out.print("Informe o modelo do veículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Informe a placa do veículo: ");
        String placa = scanner.nextLine();
        System.out.print("Informe a cor do veículo: ");
        String cor = scanner.nextLine();
        return new Veiculo(modelo, placa, cor);
    }

    public String capturarPlaca() {
        System.out.print("Informe a placa do veículo: ");
        return scanner.nextLine();
    }

    public String capturarPeriodo() {
        System.out.print("Informe o período (manhã, tarde, noite): ");
        return scanner.nextLine();
    }
}
