package modelos;

public class Comandante extends Tripulacao {

    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo, Aeronave aeronave) {
        super(nome, rg, identificacaoAeronautica, matriculaFuncionario, aeronave); // Chamada ao construtor da superclasse Tripulacao
        this.totalHorasVoo = totalHorasVoo;
    }

    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }

}
