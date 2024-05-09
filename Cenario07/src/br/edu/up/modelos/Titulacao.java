public class Titulacao {

    private String instituicao;
    private int anoConclusao;
    private String nomeTitulo;
    private String tituloTcc;


    public Titulacao(String instituicao, int anoConclusao, String nomeTitulo, String tituloTcc) {
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTcc = tituloTcc;
    }


    public String getInstituicao() {
        return instituicao;
    }


    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }


    public int getAnoConclusao() {
        return anoConclusao;
    }


    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }


    public String getNomeTitulo() {
        return nomeTitulo;
    }


    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }


    public String getTituloTcc() {
        return tituloTcc;
    }


    public void setTituloTcc(String tituloTcc) {
        this.tituloTcc = tituloTcc;
    }

    

    


}
