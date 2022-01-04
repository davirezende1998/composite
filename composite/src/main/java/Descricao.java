public abstract class Descricao {
    private String explicacao;

    public Descricao(String explicacao) {
        this.explicacao = explicacao;
    }

    public String getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(String explicacao) {
        this.explicacao = explicacao;
    }

    public abstract String getDescricao();
}