import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleExercicioTest {
    // - Funcionalidade - Retornar nome do mês do ano para qualquer número
    // do mês passado. Caso seja um número inválido, retornar message de erro

    /* -----------------
     * TODO
     * ----------------- */

    String mes(int m){
        String mes;

        if (m == 1) {
            mes = "janeiro";
        }else if (m == 2) {
            mes = "fevereiro";
        }else if (m == 3) {
            mes = "março";
        }else if (m == 4) {
            mes = "abril";
        }else if (m == 5) {
            mes = "maio";
        }else if (m == 6) {
            mes = "junho";
        }else if (m == 7) {
            mes = "julho";
        }else if (m == 8) {
            mes = "agosto";
        }else if (m == 9) {
            mes = "setembro";
        }else if (m == 10) {
            mes = "outubro";
        }else if (m == 11) {
            mes = "novembro";
        }else if (m == 12) {
            mes = "dezembro";
        }
        else {
            mes = "mes invalido";
        }
        return mes;

    }
    @Test
    void meses(){


        Assertions.assertEquals("janeiro", mes(1));
        Assertions.assertEquals("fevereiro", mes(2));
        Assertions.assertEquals("março", mes(3));
        Assertions.assertEquals("abril", mes(4));
        Assertions.assertEquals("maio", mes(5));
        Assertions.assertEquals("junho", mes(6));
        Assertions.assertEquals("julho", mes(7));
        Assertions.assertEquals("agosto", mes(8));
        Assertions.assertEquals("setembro", mes(9));
        Assertions.assertEquals("outubro", mes(10));
        Assertions.assertEquals("novembro", mes(11));
        Assertions.assertEquals("dezembro", mes(12));
        Assertions.assertEquals("mes invalido", mes(15));
        Assertions.assertEquals("mes invalido", mes(17));
        Assertions.assertEquals("mes invalido", mes(19));



    }

}