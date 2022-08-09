import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest {
    @Test
    void primeiroTesteSucesso() {
        // primeiro é a expectativa
        // segundo é o resultado
        Assertions.assertEquals(true, 1 == 1);
    }

    @Test
    void segundoTesteFalha() {
        Assertions.assertEquals(true, 1 == 2);
    }
}
