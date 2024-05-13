package br.edu.up.modelos;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        String dados = "Apólice: " + getApolice() +
                "\nSegurado: " + getSegurado().getNome() +
                "\nValor da Franquia: " + getVlrFranquia() +
                "\nTem Carro Reserva: " + (isTemCarroReserva() ? "Sim" : "Não") +
                "\nCobre Vidros: " + (isCobreVidros() ? "Sim" : "Não") +
                "\nValor da Apólice: " + getVlrApolice() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim();
        return dados;
    }
}
