package modelos;

public class Pessoal extends Contato {

    private String aniversario;

    public Pessoal(int codigo, String nome, String telefone, String aniversario) {
        super(codigo, nome, telefone);
        this.aniversario = aniversario;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return super.toString() + ", aniversario='" + aniversario + '\'';
    }

    @Override
    public void validarContato() {
        if (getTelefone().length() != 10) {
            throw new IllegalArgumentException("Telefone pessoal deve ter 10 dígitos.");
        }
        if (aniversario == null || aniversario.isEmpty()) {
            throw new IllegalArgumentException("Aniversário não pode ser vazio.");
        }
    }
}
