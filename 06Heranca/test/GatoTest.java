import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GatoTest {
    @Test
    void emitirSom() {
        Gato gato = new Gato();

        Assertions.assertEquals("miau", gato.emitirSom());
    }

    @Test
    void movimentar() {
        Gato gato = new Gato();

        Assertions.assertEquals("Andando..", gato.movimentar());
    }
}