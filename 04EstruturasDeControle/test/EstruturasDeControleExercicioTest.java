import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    String mesPorString(int mes) {
        if (mes == 1) {
            return "Janeiro";
        } else if (mes == 2) {
            return "Fevereiro";
        } else if (mes ==3) {
            return "Março";
        } else if (mes == 4) {
            return "Abril";
        } else if (mes == 5) {
            return "Maio";
        } else if (mes == 6) {
            return "Junho";
        } else if (mes == 7) {
            return "Julho";
        } else if (mes == 8) {
            return "Agosto";
        } else if (mes == 9) {
            return "Setembro";
        } else if (mes == 10) {
            return "Outubro";
        } else if (mes == 11) {
            return "Novembro";
        } else if (mes == 12) {
            return "Dezembro";
        } else {
            return "Número não corresponde a nenhum mês";
        }
    }

    @Test
    void mesesAno(){
        Assertions.assertEquals("Janeiro", mesPorString(1));
        Assertions.assertEquals("Fevereiro", mesPorString(2));
        Assertions.assertEquals("Março", mesPorString(3));
        Assertions.assertEquals("Abril", mesPorString(4));
        Assertions.assertEquals("Maio", mesPorString(5));
        Assertions.assertEquals("Junho", mesPorString(6));
        Assertions.assertEquals("Julho", mesPorString(7));
        Assertions.assertEquals("Agosto", mesPorString(8));
        Assertions.assertEquals("Setembro", mesPorString(9));
        Assertions.assertEquals("Outubro", mesPorString(10));
        Assertions.assertEquals("Novembro", mesPorString(11));
        Assertions.assertEquals("Dezembro", mesPorString(12));

        Assertions.assertEquals("Número não corresponde a nenhum mês", mesPorString(0));
        Assertions.assertEquals("Número não corresponde a nenhum mês", mesPorString(13));
        Assertions.assertEquals("Número não corresponde a nenhum mês", mesPorString(99));
    }
}
