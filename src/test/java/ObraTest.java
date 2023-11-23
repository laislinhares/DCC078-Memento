import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ObraTest {

    @Test
    public void deveArmazenarEstados() {
        Obra obra = new Obra();
        obra.setEstado(ObraEstadoSupraestrutura.getInstance());
        obra.setEstado(ObraEstadoAcabamento.getInstance());
        assertEquals(2, obra.getEstados().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        Obra obra = new Obra();
        obra.setEstado(ObraEstadoPreparacao.getInstance());
        obra.setEstado(ObraEstadoInfraestrutura.getInstance());
        obra.restauraEstado(0);
        assertEquals(ObraEstadoPreparacao.getInstance(), obra.getEstado());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        Obra obra = new Obra();
        obra.setEstado(ObraEstadoPreparacao.getInstance());
        obra.setEstado(ObraEstadoInfraestrutura.getInstance());
        obra.setEstado(ObraEstadoSupraestrutura.getInstance());
        obra.setEstado(ObraEstadoAcabamento.getInstance());
        obra.restauraEstado(2);
        assertEquals(ObraEstadoSupraestrutura.getInstance(), obra.getEstado());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        try {
            Obra obra = new Obra();
            obra.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
