package controles;

import java.util.ArrayList;
import java.util.List;

public class AcademicoController {
    private final List<Professor> professores;

    public AcademicoController() {
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public boolean removerProfessor(String rg) {
        for (Professor professor : professores) {
            if (professor.getRg().equals(rg)) {
                professores.remove(professor);
                return true;
            }
        }
        return false;
    }

    public List<Professor> listarProfessores() {
        return new ArrayList<>(professores);
    }
}
