package controles;

import modelos.Contato;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public Contato getContato(int codigo) {
        return contatos.stream()
                .filter(contato -> contato.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public void excluirContato(int codigo) {
        contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public List<Contato> listarContatos() {
        return new ArrayList<>(contatos);
    }
}