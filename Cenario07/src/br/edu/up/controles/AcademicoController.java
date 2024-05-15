package br.edu.up.controles;

import br.edu.up.modelos.*;

import java.util.ArrayList;
import java.util.List;

public class AcademicoController {
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public AcademicoController() {
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public boolean removerProfessor(String rg) {
        return this.professores.removeIf(professor -> professor.getRg().equals(rg));
    }

    public List<Professor> listarProfessores() {
        return this.professores;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public boolean removerAluno(String rg) {
        return this.alunos.removeIf(aluno -> aluno.getRg().equals(rg));
    }

    public List<Aluno> listarAlunos() {
        return this.alunos;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public boolean removerDisciplina(String codigo) {
        return this.disciplinas.removeIf(disciplina -> disciplina.getCodigo().equals(codigo));
    }

    public List<Disciplina> listarDisciplinas() {
        return this.disciplinas;
    }
}
