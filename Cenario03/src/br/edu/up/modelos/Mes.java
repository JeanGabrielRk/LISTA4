package br.edu.up.modelos;

import java.util.Scanner;

public class Mes {

    private String nome; 
    private int qtdeDias;
    private Dia[] dias;

    public Mes(String nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Scanner leitor, int diaMes) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1].adicionarCompromisso(leitor);
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void listarCompromissos(int diaMes) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1].listarCompromissos();
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void listarTodosCompromissos() {
        for (int i = 0; i < qtdeDias; i++) {
            System.out.println("Dia " + (i + 1) + ":");
            dias[i].listarCompromissos();
        }
    }

    public void consultarCompromisso(int diaMes, int indice) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1].consultarCompromisso(indice);
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void excluirCompromisso(int diaMes, int indice) {
        if (diaMes > 0 && diaMes <= qtdeDias) {
            dias[diaMes - 1].excluirCompromisso(indice);
        } else {
            System.out.println("Dia inválido.");
        }
    }
}
