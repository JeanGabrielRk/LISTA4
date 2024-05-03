package modelos;

import java.util.List;

public class Comissario extends Tripulacao {

    private List<String> idiomasFluencia;

    public Comissario(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, List<String> idiomasFluencia, Aeronave aeronave) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario, aeronave); 
        this.idiomasFluencia = idiomasFluencia;
    }

    public List<String> getIdiomasFluencia() {
        return idiomasFluencia;
    }

    public void setIdiomasFluencia(List<String> idiomasFluencia) {
        this.idiomasFluencia = idiomasFluencia;
    }

}
