import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    String meses(int numeroMes) {
        String meses;

        if (numeroMes == 1) {
            meses = "Janeiro";
        } else if (numeroMes == 2) {
            meses = "Fevereiro";
        } else if (numeroMes == 3) {
            meses = "Março";
        } else if (numeroMes == 4) {
            meses = "Abril";
        } else if (numeroMes == 5) {
            meses = "Maio";
        } else if (numeroMes == 6) {
            meses = "Junho";
        } else if (numeroMes == 7) {
            meses = "Julho";
        } else if (numeroMes == 8) {
            meses = "Agosto";
        } else if (numeroMes == 9) {
            meses = "Setembro";
        } else if (numeroMes == 10) {
            meses = "Outubro";
        } else if (numeroMes == 11) {
            meses = "Novembro";
        } else if (numeroMes == 12) {
            meses = "Dezembro";
        } else {
            meses = "O número não corresponde ao código.";
        }
        return meses;

    }

    @Test
    void resultado() {

        Assertions.assertEquals("Janeiro", meses(1));
        Assertions.assertEquals("Fevereiro", meses(2));
        Assertions.assertEquals("Março", meses(3));
        Assertions.assertEquals("Abril", meses(4));
        Assertions.assertEquals("Maio", meses(5));
        Assertions.assertEquals("Junho", meses(6));
        Assertions.assertEquals("Julho", meses(7));
        Assertions.assertEquals("Agosto", meses(8));
        Assertions.assertEquals("Setembro", meses(9));
        Assertions.assertEquals("Outubro", meses(10));
        Assertions.assertEquals("Novembro", meses(11));
        Assertions.assertEquals("Dezembro", meses(12));
        Assertions.assertEquals("O número não corresponde ao código.", meses(13));
        Assertions.assertEquals("O número não corresponde ao código.", meses(14));
        Assertions.assertEquals("O número não corresponde ao código.", meses(15));
    }

}