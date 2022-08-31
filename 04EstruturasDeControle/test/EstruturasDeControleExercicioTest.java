import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    String mesPorInt(int mes){
        if (mes == 1) {
            return "Jan";
        } else if (mes == 2) {
            return "Fev";
        } else if (mes == 3) {
            return "Mar";
        } else if (mes == 4) {
            return "Abr";
        } else if (mes == 5) {
            return "Mai";
        } else if (mes == 6) {
            return "Jun";
        } else if (mes == 7) {
            return "Jul";
        } else if (mes == 8) {
            return "Ago";
        } else if (mes == 9) {
            return "Set";
        } else if (mes == 10) {
            return "Out";
        } else if (mes == 11) {
            return "Nov";
        } else if (mes == 12) {
            return "Dez";
        } else
        return "Mês Inválido";
    }

    @Test
    void mesValido(){
        Assertions.assertEquals("Jan", mesPorInt(1));
        Assertions.assertEquals("Fev", mesPorInt(2));
        Assertions.assertEquals("Mar", mesPorInt(3));
        Assertions.assertEquals("Abr", mesPorInt(4));
        Assertions.assertEquals("Mai", mesPorInt(5));
        Assertions.assertEquals("Jun", mesPorInt(6));
        Assertions.assertEquals("Jul", mesPorInt(7));
        Assertions.assertEquals("Ago", mesPorInt(8));
        Assertions.assertEquals("Set", mesPorInt(9));
        Assertions.assertEquals("Out", mesPorInt(10));
        Assertions.assertEquals("Nov", mesPorInt(11));
        Assertions.assertEquals("Dez", mesPorInt(12));
    }

    @Test
    void mesInvalido(){
        Assertions.assertEquals("Mês Inválido", mesPorInt(0));
        Assertions.assertEquals("Mês Inválido", mesPorInt(13));
    }
}