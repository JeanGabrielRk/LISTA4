package br.edu.up.modelos;

public class Ano {

    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        for (int i = 0; i < meses.length; i++) {
            meses[i] = new Mes(i + 1, 31); 
        }
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isBissexto() {
        return bissexto;
    }

    public void setBissexto(boolean bissexto) {
        this.bissexto = bissexto;
    }

    public Mes[] getMeses() {
        return meses;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }

    public void adicionarMes(Mes mes) {
        meses[mes.getNome() - 1] = mes;
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora) {
        for (Mes mes : meses) {
            if (mes != null && String.valueOf(mes.getNome()).equals(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                return;
            }
        }
        System.out.println("Mês não encontrado.");
    }

    public String listarCompromissos(int numeroMes) {
        for (Mes mes : meses) {
            if (mes != null && String.valueOf(mes.getNome()).equals(numeroMes)) {
                return mes.listarCompromissos();
            }
        }
        return "Mês não encontrado.";
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses) {
            if (mes != null) {
                sb.append("Compromissos para o mês ").append(mes.getNome()).append(":\n");
                sb.append(mes.listarCompromissos()).append("\n");
            }
        }
        return sb.toString();
    }

    public void adicionarCompromisso(int nomeMes, Compromisso compromisso, int diaMes) {
        if (nomeMes >= 1 && nomeMes <= meses.length) {
            meses[nomeMes - 1].adicionarCompromisso(compromisso, diaMes);
        } else {
            System.out.println("Mês não encontrado.");
        }
    }
    
    
}

