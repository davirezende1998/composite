import java.util.ArrayList;
import java.util.List;

public class Area extends Descricao{
    private List<Descricao> descricoes;

    public Area(String explicacao) {
        super(explicacao);
        this.descricoes = new ArrayList<Descricao>();
    }

    public void addDescricao(Descricao descricao) {
        this.descricoes.add(descricao);
    }

    public String getDescricao() {
        String saida = "";
        saida = "Área: " + this.getExplicacao() + "\n";
        for (Descricao descricao : descricoes) {
            saida += descricao.getDescricao();
        }
        return saida;
    }
}