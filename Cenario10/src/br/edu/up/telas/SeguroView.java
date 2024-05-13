package br.edu.up.telas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.up.controles.SeguroController;
import br.edu.up.modelos.*;

public class SeguroView {
    private SeguroController controller;
    private Scanner scanner;

    public SeguroView() {
        this.controller = new SeguroController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    System.out.println("Quantidade de seguros: " + controller.quantidadeSeguros());
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguro() {
        Seguro seguro = coletarDadosSeguro();
        controller.incluirSeguro(seguro);
    }

    private void localizarSeguro() {
        System.out.print("Digite o número da apólice do seguro a ser localizado: ");
        String numeroApolice = scanner.nextLine();
        Seguro seguro = controller.localizarSeguro(numeroApolice);
        if (seguro != null) {
            System.out.println("Seguro encontrado:");
            System.out.println(seguro.getDados());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        System.out.print("Digite o número da apólice do seguro a ser excluído: ");
        String numeroApolice = scanner.nextLine();
        if (controller.excluirSeguro(numeroApolice)) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (S/N): ");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("S")) {
            controller.excluirTodosSeguros();
            System.out.println("Todos os seguros foram excluídos.");
        } else {
            System.out.println("Operação de exclusão cancelada.");
        }
    }

    private void listarTodosSeguros() {
        ArrayList<Seguro> seguros = controller.listarTodosSeguros();
        if (seguros.isEmpty()) {
            System.out.println("Não há seguros cadastrados.");
        } else {
            System.out.println("Lista de Seguros:");
            for (Seguro seguro : seguros) {
                System.out.println(seguro.getDados());
                System.out.println("---------------------------");
            }
        }
    }

    private Seguro coletarDadosSeguro() {
        System.out.println("Incluir novo seguro:");
        System.out.println("Escolha o tipo de seguro:");
        System.out.println("1. Seguro de Vida");
        System.out.println("2. Seguro de Veículo");
        System.out.print("Opção: ");
        int tipoSeguro = scanner.nextInt();
        scanner.nextLine(); 
    
        Seguro seguro;
        
        switch (tipoSeguro) {
            case 1:
                seguro = new SeguroVida();
                break;
            case 2:
                seguro = new SeguroVeiculo();
                break;
            default:
                System.out.println("Opção inválida. Criando seguro de vida por padrão.");
                seguro = new SeguroVida();
                break;
        }
    
        System.out.print("Número da apólice: ");
        String apolice = scanner.nextLine();
        seguro.setApolice(apolice);
    
        Segurado segurado = new Segurado();
        System.out.print("Nome do segurado: ");
        String nomeSegurado = scanner.nextLine();
        segurado.setNome(nomeSegurado);
        seguro.setSegurado(segurado);
        
        System.out.print("Valor da apólice: ");
        double valorApolice = scanner.nextDouble();
        scanner.nextLine(); 
        seguro.setVlrApolice(valorApolice);
        
        System.out.print("Data de início (AAAA-MM-DD): ");
        String dataInicioStr = scanner.nextLine();
        LocalDate dataInicio = LocalDate.parse(dataInicioStr);
        seguro.setDataInicio(dataInicio);
        
        System.out.print("Data de fim (AAAA-MM-DD): ");
        String dataFimStr = scanner.nextLine();
        LocalDate dataFim = LocalDate.parse(dataFimStr);
        seguro.setDataFim(dataFim);
        
        if (seguro instanceof SeguroVida) {
            SeguroVida seguroVida = (SeguroVida) seguro;
            System.out.print("Cobre doença? (S/N): ");
            boolean cobreDoenca = scanner.nextLine().equalsIgnoreCase("S");
            seguroVida.setCobreDoenca(cobreDoenca);
    
            System.out.print("Cobre acidente? (S/N): ");
            boolean cobreAcidente = scanner.nextLine().equalsIgnoreCase("S");
            seguroVida.setCobreAcidente(cobreAcidente);
        }
        
        if (seguro instanceof SeguroVeiculo) {
            SeguroVeiculo seguroVeiculo = (SeguroVeiculo) seguro;
            System.out.print("Valor da franquia: ");
            double valorFranquia = scanner.nextDouble();
            seguroVeiculo.setVlrFranquia(valorFranquia);
    
            System.out.print("Tem carro reserva? (S/N): ");
            boolean temCarroReserva = scanner.nextLine().equalsIgnoreCase("S");
            seguroVeiculo.setTemCarroReserva(temCarroReserva);
    
            System.out.print("Cobre vidros? (S/N): ");
            boolean cobreVidros = scanner.nextLine().equalsIgnoreCase("S");
            seguroVeiculo.setCobreVidros(cobreVidros);
        }
    
        return seguro;
    }
}    