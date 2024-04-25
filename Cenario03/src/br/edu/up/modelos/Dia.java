package br.edu.up.modelos;

import java.util.Scanner;

public class Dia {

    private int diaMes;
    private Compromisso[] compromissos;
    private int numCompromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[10]; 
        this.numCompromissos = 0;
    }

    public void adicionarCompromisso(Scanner leitor) {
        if (numCompromissos < compromissos.length) {
            System.out.println("Digite a pessoa do compromisso: ");
            String pessoa = leitor.next();

            System.out.println("Digite o local: ");
            String local = leitor.next();

            System.out.println("Digite o assunto: ");
            String assunto = leitor.next();

            System.out.println("Digite a hora: ");
            int hora = leitor.nextInt();

            Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);
            compromissos[numCompromissos] = compromisso;
            numCompromissos++;
        } else {
            System.out.println("Não é possível adicionar mais compromissos.");
        }
    }

    public void listarCompromissos() {
        if (numCompromissos == 0) {
            System.out.println("Não há compromissos para este dia.");
        } else {
            for (int i = 0; i < numCompromissos; i++) {
                System.out.println((i + 1) + " - " + compromissos[i]);
            }
        }
    }

    public void consultarCompromisso(int indice) {
        if (indice >= 0 && indice < numCompromissos) {
            System.out.println(compromissos[indice]);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void excluirCompromisso(int indice) {
        if (indice >= 0 && indice < numCompromissos) {
            for (int i = indice; i < numCompromissos - 1; i++) {
                compromissos[i] = compromissos[i + 1];
            }
            compromissos[numCompromissos - 1] = null;
            numCompromissos--;
            System.out.println("Compromisso excluído com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
