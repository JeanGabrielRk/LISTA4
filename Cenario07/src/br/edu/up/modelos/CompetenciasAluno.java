import java.util.ArrayList;
import java.util.List;

public class CompetenciasAluno {

    private String aluno;
    private List<String> competenciaporaluno = new ArrayList<>();
    private List<String> situacaoporcomp = new ArrayList<>();


    public CompetenciasAluno(String aluno, List<String> competenciaporaluno, List<String> situacaoporcomp) {
        this.aluno = aluno;
        this.competenciaporaluno = competenciaporaluno;
        this.situacaoporcomp = situacaoporcomp;
    }


    public String getAluno() {
        return aluno;
    }


    public void setAluno(String aluno) {
        this.aluno = aluno;
    }


    public List<String> getCompetenciaporaluno() {
        return competenciaporaluno;
    }


    public void setCompetenciaporaluno(List<String> competenciaporaluno) {
        this.competenciaporaluno = competenciaporaluno;
    }


    public List<String> getSituacaoporcomp() {
        return situacaoporcomp;
    }


    public void setSituacaoporcomp(List<String> situacaoporcomp) {
        this.situacaoporcomp = situacaoporcomp;
    }

    

    


}
