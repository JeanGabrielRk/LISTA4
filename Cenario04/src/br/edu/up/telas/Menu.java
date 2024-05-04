package telas;

import java.util.Scanner;

import modelos.Veiculo;

public class Menu {

    private Scanner leitor = new Scanner(System.in);

    public int mostrarOpcoes() {
        System.out.println("1 - Entrar veículo");
        System.out.println("2 - Sair veículo");
        System.out.println("3 - Relatório");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        return leitor.nextInt();
    }

    public Veiculo capturarDadosVeiculo() {
        System.out.print("Modelo: ");
        String modelo = leitor.next();
        System.out.print("Placa: ");
        String placa = leitor.next();
        System.out.print("Cor: ");
        String cor = leitor.next();
        return new Veiculo(modelo, placa, cor);
    }

    public String capturarPlaca() {
        System.out.print("Placa do veículo para saída: ");
        return leitor.next();
    }

    public String capturarPeriodo() {
        return leitor.next();
    }
    ///
}
