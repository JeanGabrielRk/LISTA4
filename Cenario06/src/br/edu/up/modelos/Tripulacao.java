package modelos;

import java.util.List;

public class Tripulacao extends Pessoa {

    private String identificacaoAeronautica;
    private String matriculaFuncionario;
    private Aeronave aeronave; // Adicionando referência para a aeronave

    public Tripulacao(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, Aeronave aeronave) {
        super(nome, rg, aeronave); // Passando aeronave para o construtor da classe mãe Pessoa
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
        this.aeronave = aeronave;
    }

    public String getIdentificacaoAeronautica() {
        return identificacaoAeronautica;
    }

    public void setIdentificacaoAeronautica(String identificacaoAeronautica) {
        this.identificacaoAeronautica = identificacaoAeronautica;
    }

    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
}
