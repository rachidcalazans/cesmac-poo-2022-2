import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperadoresExercicioTest {
    // Regras
    // 1. Não pode alterar os valores das expectativas (primeiro valor do assert_equal)
    // 2. Não pode alterar nos valores das variáveis definidas

    @Test
    void exercicio01() {
        int i1 = 1, i2 = 2;

        Assertions.assertEquals(4, i1 + i1 + i2);
        Assertions.assertEquals(0.5, i1 / (double)i2);
        Assertions.assertEquals(-2, -i2 * i1);
        Assertions.assertEquals(5, i1 + i2 + i2);
        Assertions.assertEquals(0.5, i1 / (double)i2);
    }

    @Test
    void exercicio02() {
        Assertions.assertEquals(0, 10 * 0);
    }

    @Test
    void exercicio03() {
        int i1 = 3, i2 = 5;

        Assertions.assertEquals(true, i1 == 3);
        Assertions.assertEquals(true, i2 != i1);
        Assertions.assertEquals(true, i1 >= 3);
        Assertions.assertEquals(false, i2 < i1);
        Assertions.assertEquals(false, i1 >= 4);
        Assertions.assertEquals(false, i2 == 4);
    }

    @Test
    void exercicio04() {
        int i1 = 3, i2 = 5;

        Assertions.assertEquals(true, (i1 > 2) && (i2 < 6));
        Assertions.assertEquals(true, (i1 < 4) || (i1 > i2));
        Assertions.assertEquals(true, i1 != i2);
    }

    @Test
    void exercicio05() {
        int i = 0;

        Assertions.assertEquals(0, i++);
        Assertions.assertEquals(2, ++i);
        Assertions.assertEquals(1, --i);
        Assertions.assertEquals(1, i);
    }
}
