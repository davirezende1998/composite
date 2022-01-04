public class Especialidade extends Descricao{
    private int valorConsulta;

    public Especialidade(String explicacao, int valorConsulta) {
        super(explicacao);
        this.valorConsulta = valorConsulta;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getDescricao() {
        return "Especialidade: " + this.getExplicacao() + " - valor da consulta: " + this.valorConsulta + "\n";
    }
}