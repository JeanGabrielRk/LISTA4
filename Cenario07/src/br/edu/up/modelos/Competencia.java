package br.edu.up.modelos;

public class Competencia {
    private String nome;
    private String descricao;
    private int nivelProficiência;

    public Competencia(String nome, String descricao, int nivelProficiência) {
        this.nome = nome;
        this.descricao = descricao;
        this.nivelProficiência = nivelProficiência;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNivelProficiência() {
        return nivelProficiência;
    }

    public void setNivelProficiência(int nivelProficiência) {
        if (nivelProficiência < 1 || nivelProficiência > 5) {
            throw new IllegalArgumentException("O nível de proficiência deve ser entre 1 e 5.");
        }
        this.nivelProficiência = nivelProficiência;
    }

    @Override
    public String toString() {
        return "Competencia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", nivelProficiência=" + nivelProficiência +
                '}';
    }
}
