import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano
    // para qualquer número
    // do mês passado. Caso seja um número inválido,
    // retornar message de erro

    /* -----------------
     * TODO
     * ----------------- */

    String mesPorInt(int mes) {
        if (mes < 1 || mes > 12)
            return "Mes invalido";

        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        return meses[--mes];
    }

    @Test
    void mesValido() {
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int mesAtual = 0;

        for (String mes : meses) {
            Assertions.assertEquals(mes, mesPorInt(++mesAtual));
        }
    }

    @Test
    void mesInvalid() {
        Assertions.assertEquals("Mes invalido", mesPorInt(0));
        Assertions.assertEquals("Mes invalido", mesPorInt(13));
    }
}
