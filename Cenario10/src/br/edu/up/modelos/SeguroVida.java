package br.edu.up.modelos;

public class SeguroVida extends Seguro {
    
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        String dados = "Apólice: " + getApolice() +
                "\nSegurado: " + getSegurado().getNome() +
                "\nValor da Apólice: " + getVlrApolice() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nCobre Doença: " + (isCobreDoenca() ? "Sim" : "Não") +
                "\nCobre Acidente: " + (isCobreAcidente() ? "Sim" : "Não");
        return dados;
    }
}
