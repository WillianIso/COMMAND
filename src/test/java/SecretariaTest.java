import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecretariaTest {

    Secretaria secretaria;
    Consultorio consultorio;

    @BeforeEach
    void setUp() {
        secretaria = new Secretaria();
        consultorio = new Consultorio(0700, "Aberto");
    }

    @Test
    void deveAbrirConsultorio() {
        Tarefa aberturaConsultorio = new AberturaConsultorioTarefa(consultorio);
        secretaria.executarTarefa(aberturaConsultorio);

        assertEquals("Consultorio Aberto", consultorio.getSituacao());
    }

    @Test
    void deveFecharConsultorio() {
        Tarefa fechamentoConsultorio = new FecharConsultorioTarefa(consultorio);
        secretaria.executarTarefa(fechamentoConsultorio);

        assertEquals("Consultorio Fechado", consultorio.getSituacao());
    }

    @Test
    void deveCancelarFechamentoConsultorio() {
        Tarefa aberturaConsultorio = new AberturaConsultorioTarefa(consultorio);
        Tarefa fechamentoConsultorio = new FecharConsultorioTarefa(consultorio);

        secretaria.executarTarefa(aberturaConsultorio);
        secretaria.executarTarefa(fechamentoConsultorio);

        secretaria.cancelarUltimaTarefa();

        assertEquals("Consultorio Aberto", consultorio.getSituacao());
    }

}