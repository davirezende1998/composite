import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CatalogoTest {
    @Test
    void deveRetornarCatalogo() {
        Area area1 = new Area("Saúde Infantil");

        Area area2 = new Area("Saúde Esportiva");
        Especialidade especialidade21 = new Especialidade("Nutricionista esportivo", 100);
        area2.addDescricao(especialidade21);

        Area area3 = new Area("Saúde do Idoso");
        Especialidade especialidade31 = new Especialidade("Geriatra", 95);
        area3.addDescricao(especialidade31);

        Area catalogo = new Area("Tabela de Médicos");
        catalogo.addDescricao(area1);
        catalogo.addDescricao(area2);
        catalogo.addDescricao(area3);

        Catalogo catalogoDefinitivo = new Catalogo();
        catalogoDefinitivo.setCatalogo(catalogo);

        assertEquals("Área: Tabela de Médicos\n" +
                "Área: Saúde Infantil\n" +
                "Área: Saúde Esportiva\n" +
                "Especialidade: Nutricionista esportivo - valor da consulta: 100\n" +
                "Área: Saúde do Idoso\n" +
                "Especialidade: Geriatra - valor da consulta: 95\n", catalogoDefinitivo.getCatalogo());
    }

    @Test
    void deveRetornarExecacaoCatalogoVazio() {
        try {
            Catalogo catalogo = new Catalogo();
            catalogo.getCatalogo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Catálogo vazio", e.getMessage());
        }
    }
}