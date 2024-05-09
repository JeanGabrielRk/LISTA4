package telas;

import java.util.List;

import modelos.Contato;

public class Visualizar {

    public void exibirContato(Contato contato) {
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void exibirTodosContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Lista de contatos está vazia.");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}
