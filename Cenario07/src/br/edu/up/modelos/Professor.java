public class Professor extends Pessoa{

    private double idLattes;
    private Titulacao titulacao;


    public Professor(String nome, double rg, double matricula, double idLattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.idLattes = idLattes;
        this.titulacao = titulacao;
    }


    public double getIdLattes() {
        return idLattes;
    }


    public void setIdLattes(double idLattes) {
        this.idLattes = idLattes;
    }


    public Titulacao getTitulacao() {
        return titulacao;
    }


    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    

    


}
