package modelos;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected Endereco endereco;
    protected double vlrMaxCredito;
    protected double vlrEmprestado;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }

    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emprestar(double valor) {
        if ((vlrEmprestado + valor) <= vlrMaxCredito && valor > 0) {
            vlrEmprestado += valor;
        } else {
            System.out.println("Valor de empréstimo excede o limite de crédito ou é inválido.");
        }
    }

    public void devolver(double valor) {
        if (valor <= vlrEmprestado && valor > 0) {
            vlrEmprestado -= valor;
        } else {
            System.out.println("Valor de devolução inválido.");
        }
    }

    public double getSaldo() {
        return vlrMaxCredito - vlrEmprestado;
    }
}
