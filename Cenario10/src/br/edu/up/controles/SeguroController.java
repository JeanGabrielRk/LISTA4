package br.edu.up.controles;

import java.util.ArrayList;

import br.edu.up.modelos.Seguro;

public class SeguroController {
    private ArrayList<Seguro> listaSeguros;

    public SeguroController() {
        this.listaSeguros = new ArrayList<>();
    }

    public void incluirSeguro(Seguro seguro) {
        listaSeguros.add(seguro);
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro seguro : listaSeguros) {
            if (seguro.getApolice().equals(numeroApolice)) {
                return seguro;
            }
        }
        return null;
    }

    public boolean excluirSeguro(String numeroApolice) {
        Seguro seguro = localizarSeguro(numeroApolice);
        if (seguro != null) {
            listaSeguros.remove(seguro);
            return true;
        }
        return false;
    }

    public void excluirTodosSeguros() {
        listaSeguros.clear();
    }

    public ArrayList<Seguro> listarTodosSeguros() {
        return listaSeguros;
    }

    public int quantidadeSeguros() {
        return listaSeguros.size();
    }
}
