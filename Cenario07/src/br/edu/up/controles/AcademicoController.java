package controles;

import modelos.Aluno;
import modelos.Disciplina;
import modelos.Professor;

import java.util.ArrayList;
import java.util.List;

public class AcademicoController {
    private final List<Professor> professores;
    private final List<Aluno> alunos;
    private final List<Disciplina> disciplinas;

    public AcademicoController() {
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }

    // Métodos para gerenciar professores
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public boolean removerProfessor(String rg) {
        return professores.removeIf(professor -> professor.getRg().equals(rg));
    }

    public List<Professor> listarProfessores() {
        return new ArrayList<>(professores);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public boolean removerAluno(String rg) {
        return alunos.removeIf(aluno -> aluno.getRg().equals(rg));
    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public boolean removerDisciplina(String identificador) {
        return disciplinas.removeIf(disciplina -> disciplina.getIdentificador().equals(identificador));
    }

    public List<Disciplina> listarDisciplinas() {
        return new ArrayList<>(disciplinas);
    }
}
