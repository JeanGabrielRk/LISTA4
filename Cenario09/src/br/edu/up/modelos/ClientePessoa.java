package modelos;

public class ClientePessoa extends Cliente {
    private String cpf;
    private double pec;
    private double altura;

    public ClientePessoa() {
        this.vlrMaxCredito = 10000.00;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPec() {
        return pec;
    }

    public void setPec(double pec) {
        this.pec = pec;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cliente Pessoa: " + nome + ", CPF: " + cpf;
    }
}
