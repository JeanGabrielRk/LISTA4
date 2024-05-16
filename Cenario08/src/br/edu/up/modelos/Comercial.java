package modelos;

public class Comercial extends Contato {

    public Comercial(int codigo, String nome, String telefone) {
        super(codigo, nome, telefone);
    }

    @Override
    public void validarContato() {
        if (getTelefone().length() != 11) {
            throw new IllegalArgumentException("Telefone comercial deve ter 11 dígitos.");
        }
    }
}
