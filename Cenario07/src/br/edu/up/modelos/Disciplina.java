import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private double identificador;
    private String professor;
    private List<String> alunos = new ArrayList<>();
    private List<String> competenciasd = new ArrayList<>();


    public Disciplina(String nome, double identificador, String professor, List<String> alunos,
            List<String> competenciasd) {
        this.nome = nome;
        this.identificador = identificador;
        this.professor = professor;
        this.alunos = alunos;
        this.competenciasd = competenciasd;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getIdentificador() {
        return identificador;
    }


    public void setIdentificador(double identificador) {
        this.identificador = identificador;
    }


    public String getProfessor() {
        return professor;
    }


    public void setProfessor(String professor) {
        this.professor = professor;
    }


    public List<String> getAlunos() {
        return alunos;
    }


    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }


    public List<String> getCompetenciasd() {
        return competenciasd;
    }


    public void setCompetenciasd(List<String> competenciasd) {
        this.competenciasd = competenciasd;
    }

    


    


}
