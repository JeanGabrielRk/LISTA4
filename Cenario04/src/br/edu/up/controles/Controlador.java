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
                    String periodoEntrada = menu.capturarPeriodo();
                    if (estacionamento.entrarVeiculo(veiculo, periodoEntrada)) {
                        System.out.println("Veículo estacionado com sucesso.");
                    } else {
                        System.out.println("Estacionamento cheio.");
                    }
                    break;
                case 2:
                    String placa = menu.capturarPlaca();
                    String periodoSaida = menu.capturarPeriodo();
                    Veiculo veiculoSaida = estacionamento.sairVeiculo(placa, periodoSaida);
                    if (veiculoSaida != null) {
                        System.out.println("Veículo retirado com sucesso.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 3:
                    String periodoRelatorio = menu.capturarPeriodo();
                    estacionamento.emitirRelatorio(periodoRelatorio);
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
