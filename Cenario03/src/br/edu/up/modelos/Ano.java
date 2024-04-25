package br.edu.up.modelos;

public class Ano {

    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12]; 
    }

    public void adicionarMes(Mes mes, int nomeMes) {
        if (nomeMes >= 1 && nomeMes <= 12) {
            meses[nomeMes - 1] = mes;
        }
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int indice) {
        int indiceMes = getIndiceMes(nomeMes);
        if (indiceMes != -1) {
            meses[indiceMes].excluirCompromisso(diaMes, indice);
        } else {
            System.out.println("Mês inválido.");
        }
    }    

    public void listarCompromissos(String nomeMes, int diaMes) {
        int indiceMes = getIndiceMes(nomeMes);
        if (indiceMes != -1) {
            meses[indiceMes].listarCompromissos(diaMes);
        } else {
            System.out.println("Mês inválido.");
        }
    }
    
    public void listarCompromissos() {
        for (Mes mes : meses) {
            if (mes != null) {
                mes.listarTodosCompromissos();
            }
        }
    }
    

    private int getIndiceMes(String nomeMes) {
        String[] nomes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeMes)) {
                return i;
            }
        }
        return -1; 
    }
}
