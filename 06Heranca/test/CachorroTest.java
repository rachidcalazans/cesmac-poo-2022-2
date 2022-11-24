import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CachorroTest {
    @Test
    void emitirSom() {
        Cachorro cachorro = new Cachorro();

        Assertions.assertEquals("Au au", cachorro.emitirSom());
    }

    @Test
    void movimentar() {
        Cachorro cachorro = new Cachorro();

        Assertions.assertEquals("Correndo...", cachorro.movimentar());
    }
}