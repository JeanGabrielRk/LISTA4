package br.edu.up.modelos;

public class Mes {

    private int nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(int nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {

        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].adicionarCompromisso(comp);
        } 
        else {
            System.out.println("Dia não existe");
        }
    }

    public void adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {

        Compromisso comp = new Compromisso(pessoa, local, assunto, hora);

        adicionarCompromisso(comp, diaMes);
    }

    public void excluirCompromisso(int diaMes, int hora) {

        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].excluirCompromisso(hora);
        } 
        else {
            System.out.println("Dia inválido.");
        }
    }

    public String listarCompromissos(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            return dias[diaMes - 1].listarCompromissos();
        } else {
            return "Dia inválido.";
        }
    }

    public String listarCompromissos() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qtdeDias; i++) {
            sb.append("Dia ").append(i + 1).append(": ").append(dias[i].listarCompromissos()).append("\n");
        }
        return sb.toString();
    }
}

