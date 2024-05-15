package modelos;

import java.util.List;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<Competencia> competenciasNecessarias;
    private List<Competencia> competenciasComplementares;
    private Professor professor;
    private List<Aluno> alunosMatriculados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public List<Competencia> getCompetenciasNecessarias() {
        return competenciasNecessarias;
    }

    public void setCompetenciasNecessarias(List<Competencia> competenciasNecessarias) {
        this.competenciasNecessarias = competenciasNecessarias;
    }

    public List<Competencia> getCompetenciasComplementares() {
        return competenciasComplementares;
    }

    public void setCompetenciasComplementares(List<Competencia> competenciasComplementares) {
        this.competenciasComplementares = competenciasComplementares;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
