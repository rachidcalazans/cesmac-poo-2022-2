import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    /* -----------------
     * TODO
     * ----------------- */
    String mes (int mes) {
        switch (mes) {
            case 1:
                return "Jan";

            case 2:
                return "Fev";

            case 3:
                return "Mar";

            case 4:
                return "Abr";

            case 5:
                return "Mai";

            case 6:
                return "Jun";

            case 7:
                return "Jul";

            case 8:
                return "Ago";

            case 9:
                return "Set";

            case 10:
                return "Out";

            case 11:
                return "Nov";

            case 12:
                return "Dez";

            default:
                return "Mes inválido!!!";
        }
    }

    @Test
    void resultado() {

        Assertions.assertEquals("Jan", mes(1));
        Assertions.assertEquals("Fev", mes(2));
        Assertions.assertEquals("Mar", mes(3));
        Assertions.assertEquals("Abr", mes(4));
        Assertions.assertEquals("Mai", mes(5));
        Assertions.assertEquals("Jun", mes(6));
        Assertions.assertEquals("Jul", mes(7));
        Assertions.assertEquals("Ago", mes(8));
        Assertions.assertEquals("Set", mes(9));
        Assertions.assertEquals("Out", mes(10));
        Assertions.assertEquals("Nov", mes(11));
        Assertions.assertEquals("Dez", mes(12));

        Assertions.assertEquals("Mes inválido!!!", mes(-2));
        Assertions.assertEquals("Mes inválido!!!", mes(0));
        Assertions.assertEquals("Mes inválido!!!", mes(13));
    }
}