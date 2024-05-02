package controles;

import modelos.Estacionamento;
import modelos.Veiculo;
import telas.Menu;

public class Controlador {

    private Estacionamento estacionamento = new Estacionamento();
    private Menu menu = new Menu();

    public void iniciar() {
        boolean executando = true;
        while (executando) {
            int opcao = menu.mostrarOpcoes();
            switch (opcao) {
                case 1:
                    Veiculo veiculo = menu.capturarDadosVeiculo();
                    if (estacionamento.entrarVeiculo(veiculo)) {
                        System.out.println("Veículo estacionado com sucesso.");
                    } else {
                        System.out.println("Estacionamento cheio.");
                    }
                    break;
                case 2:
                    String placa = menu.capturarPlaca();
                    Veiculo veiculoSaida = estacionamento.sairVeiculo(placa);
                    if (veiculoSaida != null) {
                        estacionamento.registrarPagamento(5.00);
                        System.out.println("Veículo retirado com sucesso.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                    case 3:
                    System.out.print("Informe o período (manhã, tarde, noite): ");
                    String periodo = menu.capturarPeriodo();
                    estacionamento.emitirRelatorio(periodo);
                    break;
                case 4:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}