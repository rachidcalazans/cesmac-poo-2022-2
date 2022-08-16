import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperadoresTest {
    @Test
    void aritmetica() {
        int i1 = 1, i2 = 2;

        Assertions.assertEquals(3, i1 + i2);
        Assertions.assertEquals(1, i2 - i1);
        Assertions.assertEquals(2, i2 * i1);
        Assertions.assertEquals(0, i1 / i2, "int/int retorna int");
        Assertions.assertEquals(0.5, i1 / (double)i2, "1/2.0");
    }

    @Test
    void modulo() {
        Assertions.assertEquals(2, 11 % 3);
    }

    @Test
    void comparacao() {
        Assertions.assertEquals(false, 3 == 2);
        Assertions.assertEquals(true, 3 != 2);
        Assertions.assertEquals(true, 3 > 2);
        Assertions.assertEquals(false, 3 < 2);
        Assertions.assertEquals(true, 2 <= 2);
        Assertions.assertEquals(true, 2 >= 2);
    }

    @Test
    void booleanos() {
        Assertions.assertEquals(false, (3 > 2) && (2 > 3));
        Assertions.assertEquals(true, (3 > 2) || (2 > 3));
        Assertions.assertEquals(true, !(3 == 2));
    }

    @Test
    void incremental() {
        int i = 0;
        Assertions.assertEquals(0, i++, "post-increment");
        Assertions.assertEquals(2, ++i, "pre-increment");
        Assertions.assertEquals(2, i--, "post-decrement");
        Assertions.assertEquals(0, --i, "pre-decrement");
    }
}
