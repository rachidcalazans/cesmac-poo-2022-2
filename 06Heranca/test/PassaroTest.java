import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassaroTest {
    @Test
    void emitirSom() {
        Passaro passaro = new Passaro();

        Assertions.assertEquals("airl", passaro.emitirSom());
    }

    @Test
    void movimentar() {
        Passaro passaro = new Passaro();

        Assertions.assertEquals("voando..", passaro.movimentar());
    }
}