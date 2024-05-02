package modelos;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
    private Map<String, Veiculo> vagasOcupadas = new HashMap<>();
    private double caixa;
    private int veiculosEntraram = 0;
    private int veiculosSairam = 0;

    public void emitirRelatorio(String periodo) {
        System.out.println("Relatório do período: " + periodo);
        System.out.println("Veículos que entraram: " + veiculosEntraram);
        System.out.println("Veículos que saíram: " + veiculosSairam);
        System.out.println("Total arrecadado: R$ " + caixa);
        veiculosEntraram = 0;
        veiculosSairam = 0;
        caixa = 0;
    }

    public boolean entrarVeiculo(Veiculo veiculo) {
        if (vagasOcupadas.size() < 10) {
            vagasOcupadas.put(veiculo.getPlaca(), veiculo);
            veiculosEntraram++;
            return true;
        }
        return false;
    }

    public Veiculo sairVeiculo(String placa) {
        Veiculo veiculo = vagasOcupadas.remove(placa);
        if (veiculo != null) {
            veiculosSairam++;
            registrarPagamento(5.00); 
        }
        return veiculo;
    }

    public void registrarPagamento(double valor) {
        caixa += valor;
    }

    public int contarVeiculos() {
        return vagasOcupadas.size();
    }

    public double getCaixa() {
        return caixa;
    }
}
