import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    String meses(int Mes) {

        if (Mes == 1) {
            return  "Jan";
        } else if (Mes == 2) {
            return  "Fev";
        } else if (Mes == 3) {
            return  "Mar";
        } else if (Mes == 4) {
            return  "Abr";
        } else if (Mes == 5) {
            return  "Mai";
        } else if (Mes == 6) {
            return  "Jun";
        } else if (Mes == 7) {
            return "Jul";
        } else if (Mes == 8) {
            return "Ago";
        } else if (Mes == 9) {
            return "Set";
        } else if (Mes == 10) {
            return "Out";
        } else if (Mes == 11) {
            return "Nov";
        } else if (Mes == 12) {
            return "Dez";
        } else {
            return "O número não corresponde a nenhum mês.";
        }

    }

    @Test
    void resultado() {

        Assertions.assertEquals("Jan", meses(1));
        Assertions.assertEquals("Fev", meses(2));
        Assertions.assertEquals("Mar", meses(3));
        Assertions.assertEquals("Abr", meses(4));
        Assertions.assertEquals("Mai", meses(5));
        Assertions.assertEquals("Jun", meses(6));
        Assertions.assertEquals("Jul", meses(7));
        Assertions.assertEquals("Ago", meses(8));
        Assertions.assertEquals("Set", meses(9));
        Assertions.assertEquals("Out", meses(10));
        Assertions.assertEquals("Nov", meses(11));
        Assertions.assertEquals("Dez", meses(12));

        Assertions.assertEquals("O número não corresponde a nenhum mês.", meses(20));
        Assertions.assertEquals("O número não corresponde a nenhum mês.", meses(13));
        Assertions.assertEquals("O número não corresponde a nenhum mês.", meses(0));
    }

}

