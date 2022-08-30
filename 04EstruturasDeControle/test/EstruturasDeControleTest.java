import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstruturasDeControleTest {
    @Test
    void ifElse() {
        int j = 10;
        String resultadoFinalIf;

        if (j == 10) {
            resultadoFinalIf = "É igual a 10";
        } else if (j > 10) {
            resultadoFinalIf = "É maior que 10";
        } else {
            resultadoFinalIf = "É menor que 10";
        }

        Assertions.assertEquals("É igual a 10", resultadoFinalIf);
    }

    @Test
    void whileLoop() {
        int i = 0;
        int resultadoFinal = 0;

        while (i < 100) {
            System.out.println(i);

            //Incrementa o contador
            //Percorrendo 100 vezes, i 0,1,2...99
            i++;

            resultadoFinal = i;
        }

        Assertions.assertEquals(100, resultadoFinal);
    }

    @Test
    void doWhileLoop() {
        int i = 0;
        int resultadoFinal = 0;

        do {
            System.out.println("Executando algo:");
            System.out.println(i);

            i++;
        } while(i < 5);
        resultadoFinal = i;

        Assertions.assertEquals(5, resultadoFinal);
    }

    @Test
    void forLoop() {
        int resultadoFinal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            //Percorrendo 4 vezes, i 0->4
            resultadoFinal = i;
        }

        Assertions.assertEquals(4, resultadoFinal);
    }

    @Test
    void forEachLoop() {
        int[] iList = {1, 2, 3, 4, 5};
        int resultadoFinal = 0;

        for (int i : iList) {
            System.out.println(i);
            //Percorre 5 vezes, i 1->5
            resultadoFinal = i;
        }

        Assertions.assertEquals(5, resultadoFinal);
    }

    @Test
    void switchCase() {
        int mes = 3;
        String mesFinal;

        switch (mes) {
            case 1:
                mesFinal = "Janeiro";
                break;
            case 2:
                mesFinal = "Fevereiro";
                break;
            case 3:
                mesFinal = "Março";
                break;
            default:
                mesFinal = "Algum outro mês";
                break;
        }

        Assertions.assertEquals("Março", mesFinal);
    }
}
