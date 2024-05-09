package modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;

    public ClienteEmpresa() {
        this.vlrMaxCredito = 25000.00;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    @Override
    public String toString() {
        return "Cliente Empresa: " + nome + ", CNPJ: " + cnpj;
    }
}
