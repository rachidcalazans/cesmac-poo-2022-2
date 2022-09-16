import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    /* -----------------
     * TODO
     * ----------------- */

    @Test
    void mesesAno(){
        int mes = 1;
        String mesDigitado;

        switch (mes) {
            case 1:
                mesDigitado = "Janeiro";
                break;

            case 2:
                mesDigitado = "Fevereiro";
                break;

            case 3:
                mesDigitado = "Março";
                break;

            case 4:
                mesDigitado = "Abril";
                break;

            case 5:
                mesDigitado = "Maio";
                break;

            case 6:
                mesDigitado = "Junho";
                break;

            case 7:
                mesDigitado = "Julho";
                break;

            case 8:
                mesDigitado = "Agosto";
                break;

            case 9:
                mesDigitado = "Setembro";
                break;

            case 10:
                mesDigitado = "Outubro";
                break;

            case 11:
                mesDigitado = "Novembro";
                break;

            case 12:
                mesDigitado = "Dezembro";
                break;

            default:
                mesDigitado = "Mês inválido";
                break;
        }

        System.out.println(mesDigitado);
    }
}
