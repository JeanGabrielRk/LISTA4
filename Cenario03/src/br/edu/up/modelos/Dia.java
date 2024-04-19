package br.edu.up.modelos;

public class Dia {

    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[0]; 
    }

    public int getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(int diaMes) {
        this.diaMes = diaMes;
    }

    public Compromisso[] getCompromissos() {
        return compromissos;
    }

    public void setCompromissos(Compromisso[] compromissos) {
        this.compromissos = compromissos;
    }

    public void adicionarCompromisso(Compromisso compromisso) {

        Compromisso[] novoArray = new Compromisso[compromissos.length + 1];
        
        for (int i = 0; i < compromissos.length; i++) {
            novoArray[i] = compromissos[i];
        }
        
        novoArray[compromissos.length] = compromisso;
        
        compromissos = novoArray;
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getHora() == hora) {
                return compromisso;
            }
        }
        return null; 
    }

    public void excluirCompromisso(int hora) {
        Compromisso compromissoParaExcluir = null;
        for (Compromisso compromisso : compromissos) {
            if (compromisso.getHora() == hora) {
                compromissoParaExcluir = compromisso;
                break;
            }
        }
        if (compromissoParaExcluir != null) {

            Compromisso[] novoArray = new Compromisso[compromissos.length - 1];
            int idx = 0;

            for (Compromisso compromisso : compromissos) {
                if (compromisso != compromissoParaExcluir) {
                    novoArray[idx++] = compromisso;
                }
            }

            compromissos = novoArray;
        }
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Compromisso compromisso : compromissos) {
            sb.append(compromisso.toString()).append("\n");
        }
        return sb.toString();
    }
}
