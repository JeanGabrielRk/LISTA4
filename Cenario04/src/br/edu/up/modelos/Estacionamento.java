package modelos;

import java.util.HashMap;
import java.util.Map;

public class Estacionamento {
    private Map<String, Veiculo> vagasOcupadas = new HashMap<>();
    private double[] caixa = new double[3];
    private int[] veiculosEntraram = new int[3];
    private int[] veiculosSairam = new int[3];
    private int periodoAtual;
    private Map<String, Integer> veiculoPeriodoEntrada = new HashMap<>();

    public void definirPeriodoAtual(String periodo) {
        switch (periodo.toLowerCase().trim()) {
            case "manhã":
            case "manha":
                periodoAtual = 0;
                break;
            case "tarde":
                periodoAtual = 1;
                break;
            case "noite":
                periodoAtual = 2;
                break;
            default:
                throw new IllegalArgumentException("Período inválido");
        }
    }

    public void emitirRelatorio(String periodo) {
        definirPeriodoAtual(periodo);
        System.out.println("Relatório do período: " + periodo);
        System.out.println("Veículos que entraram: " + veiculosEntraram[periodoAtual]);
        System.out.println("Veículos que saíram: " + veiculosSairam[periodoAtual]);
        System.out.println("Total arrecadado: R$ " + caixa[periodoAtual]);
        veiculosEntraram[periodoAtual] = 0;
        veiculosSairam[periodoAtual] = 0;
        caixa[periodoAtual] = 0;
    }

    public boolean entrarVeiculo(Veiculo veiculo, String periodo) {
        definirPeriodoAtual(periodo);
        if (vagasOcupadas.size() < 10) {
            vagasOcupadas.put(veiculo.getPlaca(), veiculo);
            veiculoPeriodoEntrada.put(veiculo.getPlaca(), periodoAtual);
            veiculosEntraram[periodoAtual]++;
            return true;
        }
        return false;
    }

    public Veiculo sairVeiculo(String placa, String periodoSaida) {
        definirPeriodoAtual(periodoSaida);
        Veiculo veiculo = vagasOcupadas.remove(placa);
        if (veiculo != null) {
            int periodoEntrada = veiculoPeriodoEntrada.remove(placa);
            veiculosSairam[periodoAtual]++;
            int numPeriodos = periodoAtual - periodoEntrada + 1;
            caixa[periodoAtual] += numPeriodos * 5.00;
        }
        return veiculo;
    }

    public int contarVeiculos() {
        return vagasOcupadas.size();
    }

    public double getCaixa(int periodo) {
        return caixa[periodo];
    }
}
