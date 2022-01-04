public class Catalogo {

    private Descricao catalogo;

    public void setCatalogo(Descricao catalogo) {
        this.catalogo = catalogo;
    }

    public String getCatalogo() {
        if (this.catalogo == null) {
            throw new NullPointerException("Catálogo vazio");
        }
        return this.catalogo.getDescricao();
    }

}