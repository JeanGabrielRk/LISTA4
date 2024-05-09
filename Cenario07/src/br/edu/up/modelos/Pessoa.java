public class Pessoa {

    private String nome;
    private double rg;
    private double matricula;


    public Pessoa(String nome, double rg, double matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getRg() {
        return rg;
    }


    public void setRg(double rg) {
        this.rg = rg;
    }


    public double getMatricula() {
        return matricula;
    }


    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    

    



}
